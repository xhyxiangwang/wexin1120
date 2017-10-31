package com.tencent.mm.plugin.g.a.b;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.input.InputManager;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.HandlerThread;
import android.view.InputDevice;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bb;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import junit.framework.Assert;

@TargetApi(18)
public final class b
{
  private Runnable kL;
  public a kaO;
  public final HashMap<String, d> kaP;
  public volatile boolean kaQ;
  public c kaR;
  public g kaS;
  public final HashSet<Long> kaT;
  private c.a kaU;
  private g.a kaV;
  public BluetoothAdapter kai;
  public ae mHandler;
  public volatile boolean mIsInit;
  public Context sS;
  
  public b(af paramaf)
  {
    GMTrace.i(4816000516096L, 35882);
    this.kaO = null;
    this.sS = null;
    this.kaP = new HashMap();
    this.kai = null;
    this.mHandler = null;
    this.kL = null;
    this.kaQ = false;
    this.mIsInit = false;
    this.kaT = new HashSet();
    this.kaU = new c.a()
    {
      public final void agz()
      {
        GMTrace.i(4832240861184L, 36003);
        GMTrace.o(4832240861184L, 36003);
      }
      
      public final void c(final BluetoothDevice paramAnonymousBluetoothDevice, final int paramAnonymousInt, final byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(4832106643456L, 36002);
        w.d("MicroMsg.exdevice.BluetoothLEManager", "------onDiscover------ device Name = %s, mac = %s(%d)", new Object[] { paramAnonymousBluetoothDevice.getName(), paramAnonymousBluetoothDevice.getAddress(), Long.valueOf(com.tencent.mm.plugin.exdevice.j.b.wJ(paramAnonymousBluetoothDevice.getAddress())) });
        b.this.mHandler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(4831301337088L, 35996);
            b.this.b(paramAnonymousBluetoothDevice, paramAnonymousInt, paramAnonymousArrayOfByte);
            GMTrace.o(4831301337088L, 35996);
          }
        });
        GMTrace.o(4832106643456L, 36002);
      }
    };
    this.kaV = new g.a()
    {
      public final void c(final BluetoothDevice paramAnonymousBluetoothDevice, final int paramAnonymousInt, final byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(4819355959296L, 35907);
        w.d("MicroMsg.exdevice.BluetoothLEManager", "------onDiscover------ device Name = %s, mac = %s(%d)", new Object[] { paramAnonymousBluetoothDevice.getName(), paramAnonymousBluetoothDevice.getAddress(), Long.valueOf(com.tencent.mm.plugin.exdevice.j.b.wJ(paramAnonymousBluetoothDevice.getAddress())) });
        b.this.mHandler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(4832509296640L, 36005);
            b.this.b(paramAnonymousBluetoothDevice, paramAnonymousInt, paramAnonymousArrayOfByte);
            GMTrace.o(4832509296640L, 36005);
          }
        });
        GMTrace.o(4819355959296L, 35907);
      }
      
      public final void kQ(int paramAnonymousInt)
      {
        GMTrace.i(4819490177024L, 35908);
        w.i("MicroMsg.exdevice.BluetoothLEManager", "(API21)start ble scan failed, errorCode = %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        if (paramAnonymousInt != 1) {
          b.this.mHandler.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(4819087523840L, 35905);
              if (!b.this.kaT.isEmpty())
              {
                Iterator localIterator = b.this.kaT.iterator();
                while (localIterator.hasNext())
                {
                  Long localLong = (Long)localIterator.next();
                  w.e("MicroMsg.exdevice.BluetoothLEManager", "Cannot scan out Remote device(Mac = %d), Connect Failed!!!", new Object[] { localLong });
                  if (b.this.kaO != null) {
                    b.this.kaO.d(localLong.longValue(), false);
                  }
                }
                b.this.kaT.clear();
              }
              GMTrace.o(4819087523840L, 35905);
            }
          });
        }
        GMTrace.o(4819490177024L, 35908);
      }
    };
    this.kL = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(4839757053952L, 36059);
        b.this.kaQ = false;
        b.this.dn(false);
        w.i("MicroMsg.exdevice.BluetoothLEManager", "Time out for discovering. Stop it");
        b.this.agx();
        if (b.this.kaO != null) {
          b.this.kaO.agz();
        }
        GMTrace.o(4839757053952L, 36059);
      }
    };
    this.mHandler = new ae(paramaf.nTP.getLooper());
    GMTrace.o(4816000516096L, 35882);
  }
  
  private void agu()
  {
    GMTrace.i(4816403169280L, 35885);
    if (!this.kaQ)
    {
      GMTrace.o(4816403169280L, 35885);
      return;
    }
    this.mHandler.removeCallbacks(this.kL);
    this.kaQ = false;
    dn(false);
    agx();
    if (this.kaO != null) {
      this.kaO.agz();
    }
    GMTrace.o(4816403169280L, 35885);
  }
  
  public final boolean a(boolean paramBoolean, int... paramVarArgs)
  {
    GMTrace.i(4816537387008L, 35886);
    StringBuilder localStringBuilder = new StringBuilder("------scanLEDevice------");
    if (paramBoolean) {}
    for (Object localObject = "true";; localObject = "false")
    {
      w.i("MicroMsg.exdevice.BluetoothLEManager", (String)localObject);
      Assert.assertTrue(this.mIsInit);
      if (agy()) {
        break;
      }
      w.e("MicroMsg.exdevice.BluetoothLEManager", "BLE Unsupport");
      GMTrace.o(4816537387008L, 35886);
      return false;
    }
    if (paramBoolean)
    {
      if (this.kaQ)
      {
        GMTrace.o(4816537387008L, 35886);
        return true;
      }
      if (!dn(paramBoolean))
      {
        w.e("MicroMsg.exdevice.BluetoothLEManager", "mAdapter.startLeScan Failed!!!");
        if (!this.kaT.isEmpty())
        {
          paramVarArgs = this.kaT.iterator();
          while (paramVarArgs.hasNext())
          {
            localObject = (Long)paramVarArgs.next();
            w.e("MicroMsg.exdevice.BluetoothLEManager", "Cannot scan out Remote device(Mac = %d), Connect Failed!!!", new Object[] { localObject });
            if (this.kaO != null) {
              this.kaO.d(((Long)localObject).longValue(), false);
            }
          }
          this.kaT.clear();
        }
        GMTrace.o(4816537387008L, 35886);
        return false;
      }
      if ((paramVarArgs != null) && (paramVarArgs.length > 0) && (paramVarArgs[0] == 1)) {
        this.mHandler.removeCallbacks(this.kL);
      }
      for (;;)
      {
        this.kaQ = true;
        GMTrace.o(4816537387008L, 35886);
        return true;
        this.mHandler.postDelayed(this.kL, 10000L);
      }
    }
    agu();
    GMTrace.o(4816537387008L, 35886);
    return true;
  }
  
  public final void agx()
  {
    GMTrace.i(4816134733824L, 35883);
    w.i("MicroMsg.exdevice.BluetoothLEManager", "tryToCleanPreScanSet");
    if (!this.kaT.isEmpty())
    {
      Iterator localIterator = this.kaT.iterator();
      while (localIterator.hasNext())
      {
        Long localLong = (Long)localIterator.next();
        w.e("MicroMsg.exdevice.BluetoothLEManager", "Cannot scan out Remote device(Mac = %d), Connect Failed!!!", new Object[] { localLong });
        if (this.kaO != null) {
          this.kaO.d(localLong.longValue(), false);
        }
      }
      this.kaT.clear();
    }
    GMTrace.o(4816134733824L, 35883);
  }
  
  @TargetApi(18)
  public final boolean agy()
  {
    GMTrace.i(4816268951552L, 35884);
    Assert.assertTrue(this.mIsInit);
    boolean bool = this.sS.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    GMTrace.o(4816268951552L, 35884);
    return bool;
  }
  
  public final void b(BluetoothDevice paramBluetoothDevice, int paramInt, byte[] paramArrayOfByte)
  {
    GMTrace.i(16024120328192L, 119389);
    w.d("MicroMsg.exdevice.BluetoothLEManager", "onLeScanImp");
    long l;
    d locald;
    if (!this.kaT.isEmpty())
    {
      l = com.tencent.mm.plugin.exdevice.j.b.wJ(paramBluetoothDevice.getAddress());
      if (this.kaT.contains(Long.valueOf(l)))
      {
        w.i("MicroMsg.exdevice.BluetoothLEManager", "------onConnectPreScanFound------ sessionid = %d", new Object[] { Long.valueOf(l) });
        locald = (d)this.kaP.get(String.valueOf(l));
        if (locald != null) {
          break label181;
        }
        w.e("MicroMsg.exdevice.BluetoothLEManager", "null == les");
        if (this.kaO != null) {
          this.kaO.d(l, false);
        }
      }
    }
    for (;;)
    {
      this.kaT.remove(Long.valueOf(l));
      if (this.kaT.isEmpty()) {
        w.i("MicroMsg.exdevice.BluetoothLEManager", "Connect PreScan is done.");
      }
      if (this.kaO != null) {
        this.kaO.a(paramBluetoothDevice.getAddress(), paramBluetoothDevice.getName(), paramInt, paramArrayOfByte);
      }
      GMTrace.o(16024120328192L, 119389);
      return;
      label181:
      if (!locald.connect())
      {
        w.e("MicroMsg.exdevice.BluetoothLEManager", "les.connect() Failed!!!");
        if (this.kaO != null) {
          this.kaO.d(l, false);
        }
      }
    }
  }
  
  public final boolean connect(long paramLong)
  {
    GMTrace.i(4816805822464L, 35888);
    w.i("MicroMsg.exdevice.BluetoothLEManager", "------connect------ sessionId = %d ", new Object[] { Long.valueOf(paramLong) });
    Assert.assertTrue(this.mIsInit);
    if (!agy())
    {
      w.e("MicroMsg.exdevice.BluetoothLEManager", "BLE Unsupport");
      GMTrace.o(4816805822464L, 35888);
      return false;
    }
    d locald = (d)this.kaP.get(String.valueOf(paramLong));
    boolean bool;
    Object localObject1;
    if (locald != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      localObject1 = (BluetoothManager)this.sS.getSystemService("bluetooth");
      if (localObject1 != null) {
        break label157;
      }
      w.e("MicroMsg.exdevice.BluetoothLEManager", "null == bluetoothManager");
    }
    label157:
    label650:
    for (;;)
    {
      this.kaT.add(Long.valueOf(paramLong));
      bool = a(true, new int[0]);
      GMTrace.o(4816805822464L, 35888);
      return bool;
      bool = false;
      break;
      Object localObject2 = ((BluetoothManager)localObject1).getConnectedDevices(8);
      if (localObject2 == null)
      {
        w.i("MicroMsg.exdevice.BluetoothLEManager", "null == list, may be no device is connected phone now");
      }
      else
      {
        localObject2 = ((List)localObject2).iterator();
        Object localObject3;
        long l;
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (BluetoothDevice)((Iterator)localObject2).next();
          l = com.tencent.mm.plugin.exdevice.j.b.wJ(((BluetoothDevice)localObject3).getAddress());
          w.i("MicroMsg.exdevice.BluetoothLEManager", "get connected device: mac = %s, long of mac =%d, name = %s", new Object[] { ((BluetoothDevice)localObject3).getAddress(), Long.valueOf(l), ((BluetoothDevice)localObject3).getName() });
          if (paramLong == l)
          {
            w.i("MicroMsg.exdevice.BluetoothLEManager", "This device is connected to phone now, start connecting without scan...");
            bool = locald.connect();
            GMTrace.o(4816805822464L, 35888);
            return bool;
          }
        }
        w.i("MicroMsg.exdevice.BluetoothLEManager", "Android version realse code: %s", new Object[] { Build.VERSION.RELEASE });
        if ((f.et(23)) && (!((LocationManager)this.sS.getSystemService("location")).isProviderEnabled("gps")) && (!Build.VERSION.RELEASE.equalsIgnoreCase("6.0")) && (!Build.VERSION.RELEASE.equalsIgnoreCase("6.0.0")))
        {
          bool = locald.connect();
          GMTrace.o(4816805822464L, 35888);
          return bool;
        }
        localObject1 = ((BluetoothManager)localObject1).getAdapter().getBondedDevices();
        if (localObject1 == null)
        {
          w.i("MicroMsg.exdevice.BluetoothLEManager", "null == pairedDevices,get paired devices failed");
        }
        else
        {
          localObject1 = ((Set)localObject1).iterator();
          for (;;)
          {
            if (!((Iterator)localObject1).hasNext()) {
              break label650;
            }
            localObject2 = (BluetoothDevice)((Iterator)localObject1).next();
            l = com.tencent.mm.plugin.exdevice.j.b.wJ(((BluetoothDevice)localObject2).getAddress());
            w.i("MicroMsg.exdevice.BluetoothLEManager", "get paired device: mac = %s, long of mac =%d, name = %s", new Object[] { ((BluetoothDevice)localObject2).getAddress(), Long.valueOf(l), ((BluetoothDevice)localObject2).getName() });
            if (paramLong == l)
            {
              w.i("MicroMsg.exdevice.BluetoothLEManager", "This HID device is paired to phone now, check if it is connected...");
              localObject3 = (InputManager)this.sS.getSystemService("input");
              int[] arrayOfInt = ((InputManager)localObject3).getInputDeviceIds();
              if (arrayOfInt == null)
              {
                w.i("MicroMsg.exdevice.BluetoothLEManager", "get input devices failed");
                break;
              }
              int i = 0;
              while (i < arrayOfInt.length)
              {
                Object localObject4 = ((InputManager)localObject3).getInputDevice(arrayOfInt[i]);
                if (localObject4 != null)
                {
                  localObject4 = ((InputDevice)localObject4).getName();
                  w.d("MicroMsg.exdevice.BluetoothLEManager", "Input devices: %s", new Object[] { localObject4 });
                  if ((localObject4 != null) && (((String)localObject4).equals(((BluetoothDevice)localObject2).getName())))
                  {
                    w.i("MicroMsg.exdevice.BluetoothLEManager", "This HID deivce has connected to phone as a input device");
                    bool = locald.connect();
                    GMTrace.o(4816805822464L, 35888);
                    return bool;
                  }
                }
                i += 1;
              }
              w.i("MicroMsg.exdevice.BluetoothLEManager", "This HID device hasn't been connected...");
            }
          }
        }
      }
    }
  }
  
  public final boolean dn(boolean paramBoolean)
  {
    boolean bool2 = false;
    boolean bool1 = false;
    GMTrace.i(4816671604736L, 35887);
    if ((f.et(21)) && (this.kaS != null))
    {
      Object localObject = this.kaS;
      g.a locala = this.kaV;
      w.i("MicroMsg.exdevice.NewBluetoothLEScanner", "(API21)execute scan");
      localObject = (Boolean)new g.1((g)localObject, paramBoolean, locala).b(((g)localObject).mHandler);
      paramBoolean = bool1;
      if (localObject != null) {
        paramBoolean = true;
      }
      Assert.assertTrue(paramBoolean);
      paramBoolean = ((Boolean)localObject).booleanValue();
    }
    for (;;)
    {
      GMTrace.o(4816671604736L, 35887);
      return paramBoolean;
      if (this.kaR != null)
      {
        paramBoolean = this.kaR.a(paramBoolean, this.kaU);
      }
      else
      {
        w.e("MicroMsg.exdevice.BluetoothLEManager", "Scanner is null");
        paramBoolean = bool2;
      }
    }
  }
  
  public static abstract class a
  {
    public a()
    {
      GMTrace.i(4824456232960L, 35945);
      GMTrace.o(4824456232960L, 35945);
    }
    
    public void a(long paramLong1, long paramLong2, long paramLong3)
    {
      GMTrace.i(4824590450688L, 35946);
      GMTrace.o(4824590450688L, 35946);
    }
    
    public void a(String paramString1, String paramString2, int paramInt, byte[] paramArrayOfByte)
    {
      GMTrace.i(4825127321600L, 35950);
      GMTrace.o(4825127321600L, 35950);
    }
    
    public void agz()
    {
      GMTrace.i(4825261539328L, 35951);
      GMTrace.o(4825261539328L, 35951);
    }
    
    public void b(long paramLong, byte[] paramArrayOfByte)
    {
      GMTrace.i(4824858886144L, 35948);
      GMTrace.o(4824858886144L, 35948);
    }
    
    public void d(long paramLong, boolean paramBoolean)
    {
      GMTrace.i(4824724668416L, 35947);
      GMTrace.o(4824724668416L, 35947);
    }
    
    public void e(long paramLong, boolean paramBoolean)
    {
      GMTrace.i(4824993103872L, 35949);
      GMTrace.o(4824993103872L, 35949);
    }
  }
  
  private final class b
    implements Runnable
  {
    private long kba;
    private long kbb;
    
    public b(long paramLong1, long paramLong2)
    {
      GMTrace.i(4840159707136L, 36062);
      this.kba = 0L;
      this.kbb = 0L;
      this.kba = paramLong1;
      this.kbb = paramLong2;
      GMTrace.o(4840159707136L, 36062);
    }
    
    public final void run()
    {
      GMTrace.i(4840293924864L, 36063);
      b localb = b.this;
      long l = this.kba;
      d locald1 = new d(l, localb.sS, localb);
      String str = String.valueOf(locald1.kbh);
      w.i("MicroMsg.exdevice.BluetoothLEManager", "BluetoothLESession hashCode = %d, macAddr = %d, mapKey = %s", new Object[] { Integer.valueOf(locald1.hashCode()), Long.valueOf(l), str });
      d locald2 = (d)localb.kaP.remove(str);
      if (locald2 != null) {
        locald2.close();
      }
      localb.kaP.put(str, locald1);
      l = locald1.kbh;
      if (b.this.kaO != null) {
        b.this.kaO.a(l, this.kba, this.kbb);
      }
      GMTrace.o(4840293924864L, 36063);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/g/a/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */