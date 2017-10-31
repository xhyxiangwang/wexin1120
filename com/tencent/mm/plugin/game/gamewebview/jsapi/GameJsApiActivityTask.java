package com.tencent.mm.plugin.game.gamewebview.jsapi;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameProcessActivityTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameProcessActivityTask.a;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Map;

public class GameJsApiActivityTask
  extends GameProcessActivityTask
{
  public static final Parcelable.Creator<GameJsApiActivityTask> CREATOR;
  public int iQC;
  public String iSs;
  public com.tencent.mm.plugin.game.gamewebview.ui.d mtZ;
  public String muc;
  public String mud;
  
  static
  {
    GMTrace.i(17071421259776L, 127192);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(17071421259776L, 127192);
  }
  
  public GameJsApiActivityTask(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(17071152824320L, 127190);
    GMTrace.o(17071152824320L, 127190);
  }
  
  public GameJsApiActivityTask(Parcel paramParcel)
  {
    GMTrace.i(17071287042048L, 127191);
    f(paramParcel);
    GMTrace.o(17071287042048L, 127191);
  }
  
  public final void VB()
  {
    GMTrace.i(17070750171136L, 127187);
    if (this.mtZ != null) {
      this.mtZ.v(this.iQC, this.mud);
    }
    GMTrace.o(17070750171136L, 127187);
  }
  
  public final void a(Context paramContext, final GameProcessActivityTask.a parama)
  {
    GMTrace.i(17070615953408L, 127186);
    w.i("MicroMsg.GameJsApiActivityTask", "runInMainProcess, apiName = %s", new Object[] { this.muc });
    Object localObject = d.aCQ();
    if (localObject != null)
    {
      localObject = (c)((Map)localObject).get(this.muc);
      if (!(localObject instanceof e)) {
        ((a)localObject).a(paramContext, this.iSs, new GameJsApiMMTask.a()
        {
          public final void qb(String paramAnonymousString)
          {
            GMTrace.i(17072226566144L, 127198);
            GameJsApiActivityTask.this.mud = paramAnonymousString;
            parama.WJ();
            GMTrace.o(17072226566144L, 127198);
          }
        });
      }
    }
    GMTrace.o(17070615953408L, 127186);
  }
  
  public final void f(Parcel paramParcel)
  {
    GMTrace.i(17070884388864L, 127188);
    this.iSs = paramParcel.readString();
    this.muc = paramParcel.readString();
    this.mud = paramParcel.readString();
    GMTrace.o(17070884388864L, 127188);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(17071018606592L, 127189);
    paramParcel.writeString(this.iSs);
    paramParcel.writeString(this.muc);
    paramParcel.writeString(this.mud);
    GMTrace.o(17071018606592L, 127189);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/GameJsApiActivityTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */