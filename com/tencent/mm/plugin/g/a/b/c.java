package com.tencent.mm.plugin.g.a.b;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothAdapter.LeScanCallback;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bb;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import junit.framework.Assert;

@TargetApi(18)
public final class c
  implements BluetoothAdapter.LeScanCallback
{
  private static c kbc;
  BluetoothAdapter kai;
  public ArrayList<a> kbd;
  boolean kbe;
  Context mContext;
  private ae mHandler;
  
  private c(Context paramContext)
  {
    GMTrace.i(4817208475648L, 35891);
    if (paramContext == null)
    {
      w.e("MicroMsg.exdevice.BluetoothLEScaner", "no context for scaner");
      GMTrace.o(4817208475648L, 35891);
      return;
    }
    this.mContext = paramContext;
    this.kbd = new ArrayList();
    this.kbe = false;
    this.kai = null;
    this.mHandler = null;
    this.kai = ((BluetoothManager)this.mContext.getSystemService("bluetooth")).getAdapter();
    this.mHandler = new ae(new af("BluetoothLEScanerThread").nTP.getLooper());
    GMTrace.o(4817208475648L, 35891);
  }
  
  public static c agA()
  {
    GMTrace.i(4817074257920L, 35890);
    if (kbc != null)
    {
      localc = kbc;
      GMTrace.o(4817074257920L, 35890);
      return localc;
    }
    c localc = new c(ab.getContext());
    kbc = localc;
    GMTrace.o(4817074257920L, 35890);
    return localc;
  }
  
  final boolean a(a parama)
  {
    GMTrace.i(4817476911104L, 35893);
    if (parama == null)
    {
      w.e("MicroMsg.exdevice.BluetoothLEScaner", "callback is null");
      GMTrace.o(4817476911104L, 35893);
      return false;
    }
    int i = 0;
    label57:
    boolean bool;
    if (i < this.kbd.size()) {
      if ((a)this.kbd.get(i) == parama)
      {
        if (i >= 0) {
          break label113;
        }
        bool = this.kbd.add(parama);
        w.d("MicroMsg.exdevice.BluetoothLEScaner", "add callback " + bool);
      }
    }
    for (;;)
    {
      GMTrace.o(4817476911104L, 35893);
      return bool;
      i += 1;
      break;
      i = -1;
      break label57;
      label113:
      bool = true;
      w.w("MicroMsg.exdevice.BluetoothLEScaner", "callback has in queue. pass");
    }
  }
  
  public final boolean a(final boolean paramBoolean, final a parama)
  {
    GMTrace.i(4817342693376L, 35892);
    parama = (Boolean)new bb() {}.b(this.mHandler);
    if (parama != null) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      Assert.assertTrue(paramBoolean);
      paramBoolean = parama.booleanValue();
      GMTrace.o(4817342693376L, 35892);
      return paramBoolean;
    }
  }
  
  public final void onLeScan(final BluetoothDevice paramBluetoothDevice, final int paramInt, final byte[] paramArrayOfByte)
  {
    GMTrace.i(4817611128832L, 35894);
    w.d("MicroMsg.exdevice.BluetoothLEScaner", "onLeScan. device addr = %s, name = %s, data = %s", new Object[] { paramBluetoothDevice.getAddress(), paramBluetoothDevice.getName(), b.al(paramArrayOfByte) });
    w.d("MicroMsg.exdevice.BluetoothLEScaner", "callback size = %d", new Object[] { Integer.valueOf(this.kbd.size()) });
    this.mHandler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(4829824942080L, 35985);
        int i = 0;
        while (i < c.this.kbd.size())
        {
          ((c.a)c.this.kbd.get(i)).c(paramBluetoothDevice, paramInt, paramArrayOfByte);
          i += 1;
        }
        GMTrace.o(4829824942080L, 35985);
      }
    });
    GMTrace.o(4817611128832L, 35894);
  }
  
  public static abstract interface a
  {
    public abstract void agz();
    
    public abstract void c(BluetoothDevice paramBluetoothDevice, int paramInt, byte[] paramArrayOfByte);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/g/a/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */