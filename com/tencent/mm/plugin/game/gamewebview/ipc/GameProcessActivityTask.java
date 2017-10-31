package com.tencent.mm.plugin.game.gamewebview.ipc;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bi.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public abstract class GameProcessActivityTask
  implements Parcelable
{
  private static Map<String, WeakReference<GameProcessActivityTask>> iOy;
  static final Set<Object> iPb;
  private String iPd;
  Context mContext;
  private int mtQ;
  private MMActivity.a mtR;
  
  static
  {
    GMTrace.i(16963375988736L, 126387);
    iOy = new ConcurrentHashMap();
    iPb = new HashSet();
    GMTrace.o(16963375988736L, 126387);
  }
  
  public GameProcessActivityTask()
  {
    GMTrace.i(16962033811456L, 126377);
    this.mtQ = -1;
    this.mtR = new MMActivity.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
      {
        GMTrace.i(16953175441408L, 126311);
        if (paramAnonymousInt1 == (GameProcessActivityTask.this.hashCode() & 0xFFFF))
        {
          if (paramAnonymousIntent == null)
          {
            GMTrace.o(16953175441408L, 126311);
            return;
          }
          GameProcessActivityTask localGameProcessActivityTask = (GameProcessActivityTask)paramAnonymousIntent.getParcelableExtra("task_object");
          paramAnonymousIntent = GameProcessActivityTask.yI(paramAnonymousIntent.getStringExtra("task_id"));
          if (paramAnonymousIntent == null)
          {
            w.e("MicroMsg.GameProcessActivityTask", "task is null");
            GMTrace.o(16953175441408L, 126311);
            return;
          }
          GameProcessActivityTask.a(localGameProcessActivityTask, paramAnonymousIntent);
          GameProcessActivityTask.iPb.remove(paramAnonymousIntent);
          paramAnonymousIntent.VB();
          GameProcessActivityTask.this.mContext = null;
        }
        GMTrace.o(16953175441408L, 126311);
      }
    };
    this.iPd = (Process.myPid() + hashCode());
    GMTrace.o(16962033811456L, 126377);
  }
  
  public GameProcessActivityTask(Context paramContext)
  {
    GMTrace.i(16962168029184L, 126378);
    this.mtQ = -1;
    this.mtR = new MMActivity.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
      {
        GMTrace.i(16953175441408L, 126311);
        if (paramAnonymousInt1 == (GameProcessActivityTask.this.hashCode() & 0xFFFF))
        {
          if (paramAnonymousIntent == null)
          {
            GMTrace.o(16953175441408L, 126311);
            return;
          }
          GameProcessActivityTask localGameProcessActivityTask = (GameProcessActivityTask)paramAnonymousIntent.getParcelableExtra("task_object");
          paramAnonymousIntent = GameProcessActivityTask.yI(paramAnonymousIntent.getStringExtra("task_id"));
          if (paramAnonymousIntent == null)
          {
            w.e("MicroMsg.GameProcessActivityTask", "task is null");
            GMTrace.o(16953175441408L, 126311);
            return;
          }
          GameProcessActivityTask.a(localGameProcessActivityTask, paramAnonymousIntent);
          GameProcessActivityTask.iPb.remove(paramAnonymousIntent);
          paramAnonymousIntent.VB();
          GameProcessActivityTask.this.mContext = null;
        }
        GMTrace.o(16953175441408L, 126311);
      }
    };
    this.iPd = (Process.myPid() + hashCode());
    this.mContext = paramContext;
    GMTrace.o(16962168029184L, 126378);
  }
  
  public static void a(GameProcessActivityTask paramGameProcessActivityTask1, GameProcessActivityTask paramGameProcessActivityTask2)
  {
    GMTrace.i(16963107553280L, 126385);
    Parcel localParcel = Parcel.obtain();
    paramGameProcessActivityTask1.writeToParcel(localParcel, 0);
    localParcel.setDataPosition(0);
    paramGameProcessActivityTask2.f(localParcel);
    localParcel.recycle();
    GMTrace.o(16963107553280L, 126385);
  }
  
  public static GameProcessActivityTask yI(String paramString)
  {
    GMTrace.i(16963241771008L, 126386);
    if (!iOy.containsKey(paramString))
    {
      GMTrace.o(16963241771008L, 126386);
      return null;
    }
    if (((WeakReference)iOy.get(paramString)).get() == null)
    {
      GMTrace.o(16963241771008L, 126386);
      return null;
    }
    paramString = (GameProcessActivityTask)((WeakReference)iOy.get(paramString)).get();
    GMTrace.o(16963241771008L, 126386);
    return paramString;
  }
  
  public void VB()
  {
    GMTrace.i(16962436464640L, 126380);
    GMTrace.o(16962436464640L, 126380);
  }
  
  public abstract void a(Context paramContext, a parama);
  
  public final void azb()
  {
    GMTrace.i(16962973335552L, 126384);
    if (this.mContext == null)
    {
      GMTrace.o(16962973335552L, 126384);
      return;
    }
    iOy.put(this.iPd, new WeakReference(this));
    Intent localIntent = new Intent();
    localIntent.putExtra("task_object", this);
    localIntent.putExtra("task_id", this.iPd);
    localIntent.putExtra("orientation", this.mtQ);
    if ((this.mContext instanceof MMActivity))
    {
      iPb.add(this);
      ((MMActivity)this.mContext).vow = this.mtR;
      d.b(this.mContext, "game", ".gamewebview.ui.GameIpcProxyUI", localIntent, hashCode() & 0xFFFF);
      GMTrace.o(16962973335552L, 126384);
      return;
    }
    localIntent.addFlags(268435456);
    d.b(this.mContext, "game", ".gamewebview.ui.GameIpcProxyUI", localIntent);
    GMTrace.o(16962973335552L, 126384);
  }
  
  public int describeContents()
  {
    GMTrace.i(16962839117824L, 126383);
    GMTrace.o(16962839117824L, 126383);
    return 0;
  }
  
  public void f(Parcel paramParcel)
  {
    GMTrace.i(16962570682368L, 126381);
    GMTrace.o(16962570682368L, 126381);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(16962704900096L, 126382);
    GMTrace.o(16962704900096L, 126382);
  }
  
  public static abstract interface a
  {
    public abstract void WJ();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/ipc/GameProcessActivityTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */