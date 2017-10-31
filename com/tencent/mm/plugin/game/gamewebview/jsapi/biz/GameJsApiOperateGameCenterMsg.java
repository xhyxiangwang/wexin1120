package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.gm;
import com.tencent.mm.g.a.gm.b;
import com.tencent.mm.plugin.game.gamewebview.ipc.GWMainProcessTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameWebViewMainProcessService;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import org.json.JSONObject;

public final class GameJsApiOperateGameCenterMsg
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = 174;
  public static final String NAME = "operateGameCenterMsg";
  
  public GameJsApiOperateGameCenterMsg()
  {
    GMTrace.i(17043638190080L, 126985);
    GMTrace.o(17043638190080L, 126985);
  }
  
  public final void a(final d paramd, JSONObject paramJSONObject, final int paramInt)
  {
    Object localObject = null;
    GMTrace.i(17043772407808L, 126986);
    w.i("MicroMsg.GameJsApiOperateGameCenterMsg", "invoke");
    if (paramJSONObject == null)
    {
      w.i("MicroMsg.GameJsApiOperateGameCenterMsg", "data is null");
      paramd.v(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("getGameMessages:fail_invalid_data", null));
      GMTrace.o(17043772407808L, 126986);
      return;
    }
    int i = paramJSONObject.optInt("cmd");
    JSONObject localJSONObject = paramJSONObject.optJSONObject("param");
    final OperateGameCenterMsgTask localOperateGameCenterMsgTask = new OperateGameCenterMsgTask();
    localOperateGameCenterMsgTask.nN = i;
    paramJSONObject = (JSONObject)localObject;
    if (localJSONObject != null) {
      paramJSONObject = localJSONObject.toString();
    }
    localOperateGameCenterMsgTask.fCA = paramJSONObject;
    localOperateGameCenterMsgTask.iQi = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17033034989568L, 126906);
        localOperateGameCenterMsgTask.VE();
        HashMap localHashMap = new HashMap();
        localHashMap.put("result", bg.mY(localOperateGameCenterMsgTask.result));
        paramd.v(paramInt, GameJsApiOperateGameCenterMsg.d("getGameMessages:ok", localHashMap));
        GMTrace.o(17033034989568L, 126906);
      }
    };
    localOperateGameCenterMsgTask.VD();
    GameWebViewMainProcessService.a(localOperateGameCenterMsgTask);
    GMTrace.o(17043772407808L, 126986);
  }
  
  private static class OperateGameCenterMsgTask
    extends GWMainProcessTask
  {
    public static Parcelable.Creator<OperateGameCenterMsgTask> CREATOR;
    public String fCA;
    public Runnable iQi;
    public int nN;
    public String result;
    
    static
    {
      GMTrace.i(17047798939648L, 127016);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(17047798939648L, 127016);
    }
    
    public OperateGameCenterMsgTask()
    {
      GMTrace.i(17047530504192L, 127014);
      GMTrace.o(17047530504192L, 127014);
    }
    
    public OperateGameCenterMsgTask(Parcel paramParcel)
    {
      GMTrace.i(17047664721920L, 127015);
      f(paramParcel);
      GMTrace.o(17047664721920L, 127015);
    }
    
    public final void RS()
    {
      GMTrace.i(17046993633280L, 127010);
      gm localgm = new gm();
      localgm.fCF.nN = this.nN;
      localgm.fCF.fCA = this.fCA;
      com.tencent.mm.sdk.b.a.uLm.m(localgm);
      this.result = localgm.fCG.fCH;
      VC();
      GMTrace.o(17046993633280L, 127010);
    }
    
    public final void VB()
    {
      GMTrace.i(17047127851008L, 127011);
      if (this.iQi != null) {
        this.iQi.run();
      }
      GMTrace.o(17047127851008L, 127011);
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(17047262068736L, 127012);
      this.nN = paramParcel.readInt();
      this.fCA = paramParcel.readString();
      this.result = paramParcel.readString();
      GMTrace.o(17047262068736L, 127012);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(17047396286464L, 127013);
      paramParcel.writeInt(this.nN);
      paramParcel.writeString(this.fCA);
      paramParcel.writeString(this.result);
      GMTrace.o(17047396286464L, 127013);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/GameJsApiOperateGameCenterMsg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */