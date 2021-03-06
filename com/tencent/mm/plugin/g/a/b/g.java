package com.tencent.mm.plugin.g.a.b;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
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
import java.util.Iterator;
import java.util.List;

@TargetApi(21)
public final class g
  extends ScanCallback
{
  private static g kbV;
  private BluetoothAdapter kai;
  private BluetoothManager kbW;
  private BluetoothLeScanner kbX;
  private ArrayList<a> kbd;
  private boolean kbe;
  private Context mContext;
  ae mHandler;
  
  private g(Context paramContext)
  {
    GMTrace.i(4815060992000L, 35875);
    if (paramContext == null)
    {
      w.e("MicroMsg.exdevice.NewBluetoothLEScanner", "No context for scanner");
      GMTrace.o(4815060992000L, 35875);
      return;
    }
    this.mContext = paramContext;
    this.kbd = new ArrayList();
    this.kbe = false;
    this.kai = null;
    this.kbX = null;
    this.mHandler = null;
    this.kbW = ((BluetoothManager)this.mContext.getSystemService("bluetooth"));
    this.kai = this.kbW.getAdapter();
    if (this.kai != null)
    {
      w.d("MicroMsg.exdevice.NewBluetoothLEScanner", "Get bluetoothLeScanner");
      this.kbX = this.kai.getBluetoothLeScanner();
    }
    this.mHandler = new ae(new af("NewBluetoothLEScannerThread").nTP.getLooper());
    GMTrace.o(4815060992000L, 35875);
  }
  
  private boolean a(a parama)
  {
    GMTrace.i(4815195209728L, 35876);
    if (parama == null)
    {
      w.e("MicroMsg.exdevice.NewBluetoothLEScanner", "callback is null");
      GMTrace.o(4815195209728L, 35876);
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
        w.d("MicroMsg.exdevice.NewBluetoothLEScanner", "add callback " + bool);
      }
    }
    for (;;)
    {
      GMTrace.o(4815195209728L, 35876);
      return bool;
      i += 1;
      break;
      i = -1;
      break label57;
      label113:
      bool = true;
      w.w("MicroMsg.exdevice.NewBluetoothLEScanner", "callback has in queue. pass");
    }
  }
  
  public static g agJ()
  {
    GMTrace.i(4814926774272L, 35874);
    if (kbV != null)
    {
      localg = kbV;
      GMTrace.o(4814926774272L, 35874);
      return localg;
    }
    g localg = new g(ab.getContext());
    kbV = localg;
    GMTrace.o(4814926774272L, 35874);
    return localg;
  }
  
  public final void onBatchScanResults(List<ScanResult> paramList)
  {
    GMTrace.i(4815597862912L, 35879);
    if (paramList != null)
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        ScanResult localScanResult = (ScanResult)paramList.next();
        w.d("MicroMsg.exdevice.NewBluetoothLEScanner", "onLeScan. device addr = %s, name = %s, data = %s", new Object[] { localScanResult.getDevice().getAddress(), localScanResult.getDevice().getName(), b.al(localScanResult.getScanRecord().getBytes()) });
      }
    }
    GMTrace.o(4815597862912L, 35879);
  }
  
  public final void onScanFailed(final int paramInt)
  {
    GMTrace.i(4815329427456L, 35877);
    this.mHandler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(4818819088384L, 35903);
        int i = 0;
        while (i < g.a(g.this).size())
        {
          ((g.a)g.a(g.this).get(i)).kQ(paramInt);
          i += 1;
        }
        GMTrace.o(4818819088384L, 35903);
      }
    });
    GMTrace.o(4815329427456L, 35877);
  }
  
  public final void onScanResult(final int paramInt, final ScanResult paramScanResult)
  {
    GMTrace.i(4815463645184L, 35878);
    if ((paramScanResult != null) && (paramScanResult.getScanRecord() != null))
    {
      w.d("MicroMsg.exdevice.NewBluetoothLEScanner", "onLeScan. device addr = %s, name = %s, data = %s", new Object[] { paramScanResult.getDevice().getAddress(), paramScanResult.getDevice().getName(), b.al(paramScanResult.getScanRecord().getBytes()) });
      w.d("MicroMsg.exdevice.NewBluetoothLEScanner", "callback size = %d", new Object[] { Integer.valueOf(this.kbd.size()) });
      final BluetoothDevice localBluetoothDevice = paramScanResult.getDevice();
      paramInt = paramScanResult.getRssi();
      paramScanResult = paramScanResult.getScanRecord().getBytes();
      this.mHandler.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(4837475352576L, 36042);
          int i = 0;
          while (i < g.a(g.this).size())
          {
            ((g.a)g.a(g.this).get(i)).c(localBluetoothDevice, paramInt, paramScanResult);
            i += 1;
          }
          GMTrace.o(4837475352576L, 36042);
        }
      });
    }
    GMTrace.o(4815463645184L, 35878);
  }
  
  public static abstract interface a
  {
    public abstract void c(BluetoothDevice paramBluetoothDevice, int paramInt, byte[] paramArrayOfByte);
    
    public abstract void kQ(int paramInt);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/g/a/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */