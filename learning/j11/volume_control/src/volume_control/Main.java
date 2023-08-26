package volume_control;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		import com.sun.jna.Library;
		import com.sun.jna.Native;
		import com.sun.jna.Pointer;
		import com.sun.jna.Structure;

		public class WindowsAudioControl {
		    
		    public interface CoreAudio extends Library {
		        int DEVICE_STATE_ACTIVE = 0x00000001;
		        int DEVICE_STATE_UNPLUGGED = 0x00000002;
		        int DEVICE_STATE_NOTPRESENT = 0x00000004;
		        int DEVICE_STATEMASK_ALL = 0x00000007;

		        int CLSCTX_INPROC_SERVER = 0x1;

		        int ENDPOINT_VOLUME = 0x00000001;
		        int DEVICE_STATEMASK_CONNECTED = 0x00000008;

		        int E_NOTIMPL = 0x80004001;
		        int E_NOINTERFACE = 0x80004002;
		        int E_POINTER = 0x80004003;
		        int E_FAIL = 0x80004005;
		        int E_ACCESSDENIED = 0x80070005;

		        class GUID extends Structure {
		            public int data1;
		            public short data2;
		            public short data3;
		            public byte[] data4 = new byte[8];
		        }

		        class PROPERTYKEY extends Structure {
		            public GUID fmtid;
		            public int pid;
		            public int dwAlign;
		        }

		        class PROPVARIANT extends Structure {
		            public short vt;
		            public short wReserved1;
		            public short wReserved2;
		            public short wReserved3;
		            public Pointer pointer;
		            public int[] caux;
		        }

		        class IMMDevice extends Structure {
		            public Pointer pointer;

		            public int Activate(GUID iid, int dwClsCtx, Pointer pActivationParams, Pointer ppInterface) {
		                return Native.getFunction(this.pointer, "Activate").invokeInt(new Object[]{this.pointer, iid, dwClsCtx, pActivationParams, ppInterface});
		            }

		            public int OpenPropertyStore(int stgmAccess, Pointer ppProperties) {
		                return Native.getFunction(this.pointer, "OpenPropertyStore").invokeInt(new Object[]{this.pointer, stgmAccess, ppProperties});
		            }

		            public int GetId(Pointer ppstrId) {
		                return Native.getFunction(this.pointer, "GetId").invokeInt(new Object[]{this.pointer, ppstrId});
		            }
		        }

		        class IMMDeviceEnumerator extends Structure {
		            public Pointer pointer;

		            public int EnumAudioEndpoints(int dataFlow, int dwStateMask, Pointer ppDevices) {
		                return Native.getFunction(this.pointer, "EnumAudioEndpoints").invokeInt(new Object[]{this.pointer, dataFlow, dwStateMask, ppDevices});
		            }

		            public int GetDefaultAudioEndpoint(int dataFlow, int role, Pointer ppEndpoint) {
		                return Native.getFunction(this.pointer, "GetDefaultAudioEndpoint").invokeInt(new Object[]{this.pointer, dataFlow, role, ppEndpoint});
		            }
		        }

		        class IAudioEndpointVolume extends Structure {
		            public Pointer pointer;

		            public int SetMasterVolumeLevelScalar(float fLevel, Pointer pguidEventContext) {
		                return Native.getFunction(this.pointer, "SetMasterVolumeLevelScalar").invokeInt(new Object[]{this.pointer, fLevel, pguidEventContext});
		            }

		            public int GetMasterVolumeLevelScalar(Pointer pfLevel) {
		                return Native.getFunction(this.pointer, "GetMasterVolumeLevelScalar").invokeInt(new Object[]{this.pointer, pfLevel});
		            }
		        }

		        int CoCreateInstance(GUID rclsid, Pointer pUnkOuter,
		        int dwClsContext, GUID riid, PointerByReference ppv);

		    int CoInitialize(Pointer pvReserved);

		    int CoUninitialize();

		    int PropVariantClear(PROPVARIANT pvar);

		    int CLSIDFromString(String lpsz, GUID pclsid);

		    int InitPropVariantFromFloat(float flt, PROPVARIANT ppropvar);

		    int InitPropVariantFromInt32(int n, PROPVARIANT ppropvar);

		    int InitPropVariantFromString(String psz, PROPVARIANT ppropvar);

		    int InitPropVariantFromBoolean(boolean fVal, PROPVARIANT ppropvar);

		    int UnInitPropVariant(PROPVARIANT ppropvar);

		    int StringFromGUID2(GUID rguid, char[] lpsz, int cchMax);

		    int CoTaskMemFree(Pointer pv);

		    int CoSetProxyBlanket(Pointer pProxy, int dwAuthnSvc, int dwAuthzSvc, String pServerPrincName, int dwAuthnLevel, int dwImpLevel, Pointer pAuthInfo, int dwCapabilities);

		}

		public static void main(String[] args) {
		    CoreAudio coreAudio = (CoreAudio) Native.load("ole32", CoreAudio.class);

		    PointerByReference ppDevices = new PointerByReference();

		    int hResult = coreAudio.CoInitialize(null);

		    if (hResult != 0) {
		        System.err.println("CoInitialize returned " + hResult);
		        return;
		    }

		    hResult = coreAudio.CLSIDFromString("IID_IMMDeviceEnumerator", new CoreAudio.GUID());
		    if (hResult != 0) {
		        System.err.println("CLSIDFromString returned " + hResult);
		        return;
		    }

		    CoreAudio.IMMDeviceEnumerator deviceEnumerator = Native.load("mmdevapi", CoreAudio.IMMDeviceEnumerator.class);

		    hResult = deviceEnumerator.GetDefaultAudioEndpoint(CoreAudio.ENDPOINT_VOLUME, 0, ppDevices);
		    if (hResult != 0) {
		        System.err.println("GetDefaultAudioEndpoint returned " + hResult);
		        return;
		    }

		    CoreAudio.IMMDevice device = new CoreAudio.IMMDevice();
		    device.pointer = ppDevices.getValue();

		    PointerByReference ppInterface = new PointerByReference();

		    CoreAudio.GUID IID_IAudioEndpointVolume = new CoreAudio.GUID();
		    hResult = coreAudio.CLSIDFromString("{5CDF2C82-841E-4546-9722-0CF74078229A}", IID_IAudioEndpointVolume);
		    if (hResult != 0) {
		        System.err.println("CLSIDFromString returned " + hResult);
		        return;
		    }

		    hResult = device.Activate(IID_IAudioEndpointVolume, CoreAudio.CLSCTX_INPROC_SERVER, null, ppInterface);
		    if (hResult != 0) {
		        System.err.println("Activate returned " + hResult);
		        return;
		    }

		    CoreAudio.IAudioEndpointVolume endpointVolume = new CoreAudio.IAudioEndpointVolume();
		    endpointVolume.pointer = ppInterface.getValue();

		    float fLevel = 0.5f;
		    PointerByReference pguidEventContext = null;

		    hResult = endpointVolume.SetMasterVolumeLevelScalar(fLevel, pguidEventContext);
		    if (hResult != 0) {
		        System.err.println("SetMasterVolumeLevelScalar returned " + hResult);
		        return;
		    }

		    Pointer pfLevel = new Memory(4);
		    hResult = endpointVolume.GetMasterVolumeLevelScalar(pfLevel);
		    if (hResult != 0) {
		        System.err.println("GetMasterVolumeLevelScalar returned " + hResult);
		        return;
		    }

		   


		### //python 

		import win32com.client
		from pycaw.pycaw import AudioUtilities, ISimpleAudioVolume

		# Get default audio device
		devices = AudioUtilities.GetSpeakers()
		interface = devices.Activate(
		    ISimpleAudioVolume._iid_, 
		    comtypes.CLSCTX_ALL, 
		    None
		)

		# Set volume
		volume = win32com.client.Dispatch(interface)
		current_volume = volume.GetMasterVolume()
		new_volume = min(1.0, current_volume + 0.1)
		volume.SetMasterVolume(new_volume, None)
	}

}
