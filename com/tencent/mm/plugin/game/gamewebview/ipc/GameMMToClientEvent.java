package com.tencent.mm.plugin.game.gamewebview.ipc;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.b.a.c;
import com.tencent.mm.plugin.game.gamewebview.b.a.e;
import com.tencent.mm.plugin.game.gamewebview.ui.h;
import com.tencent.mm.plugin.game.gamewebview.ui.h.3;
import com.tencent.mm.plugin.webview.modeltools.g;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;

public class GameMMToClientEvent
  extends GWMainProcessTask
{
  public static Parcelable.Creator<GameMMToClientEvent> CREATOR;
  private static GameMMToClientEvent mtP;
  private int iOS;
  private String iOT;
  public Object iOU;
  public Bundle lRQ;
  int mtO;
  
  static
  {
    GMTrace.i(16955591360512L, 126329);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(16955591360512L, 126329);
  }
  
  public GameMMToClientEvent()
  {
    GMTrace.i(16954249183232L, 126319);
    GMTrace.o(16954249183232L, 126319);
  }
  
  public GameMMToClientEvent(Parcel paramParcel)
  {
    GMTrace.i(16955457142784L, 126328);
    f(paramParcel);
    GMTrace.o(16955457142784L, 126328);
  }
  
  private static GameMMToClientEvent aCK()
  {
    GMTrace.i(16954383400960L, 126320);
    if (mtP == null) {}
    try
    {
      if (mtP == null) {
        mtP = new GameMMToClientEvent();
      }
      GameMMToClientEvent localGameMMToClientEvent = mtP;
      GMTrace.o(16954383400960L, 126320);
      return localGameMMToClientEvent;
    }
    finally {}
  }
  
  public static void on(int paramInt)
  {
    GMTrace.i(16954517618688L, 126321);
    aCK().iOS = 1;
    aCK().mtO = paramInt;
    GameWebViewMainProcessService.a(aCK());
    GMTrace.o(16954517618688L, 126321);
  }
  
  public static void oo(int paramInt)
  {
    GMTrace.i(16954651836416L, 126322);
    aCK().iOS = 2;
    aCK().mtO = paramInt;
    GameWebViewMainProcessService.a(aCK());
    GMTrace.o(16954651836416L, 126322);
  }
  
  public final void RS()
  {
    GMTrace.i(16954786054144L, 126323);
    switch (this.iOS)
    {
    }
    for (;;)
    {
      GMTrace.o(16954786054144L, 126323);
      return;
      a.a(this.mtO, this);
      GMTrace.o(16954786054144L, 126323);
      return;
      a.op(this.mtO);
    }
  }
  
  public final void VB()
  {
    GMTrace.i(16954920271872L, 126324);
    int i = this.lRQ.getInt("mm_to_client_notify_type");
    w.i("MicroMsg.GameMMToClientEvent", "notifyType = " + i);
    switch (i)
    {
    }
    for (;;)
    {
      GMTrace.o(16954920271872L, 126324);
      return;
      Object localObject1 = this.lRQ.getString("js_event_name");
      if (!bg.mZ((String)localObject1))
      {
        if ((com.tencent.mm.plugin.game.gamewebview.b.b.mvJ == null) || (com.tencent.mm.plugin.game.gamewebview.b.b.mvJ.size() == 0))
        {
          com.tencent.mm.plugin.game.gamewebview.b.b.mvJ = new HashMap();
          com.tencent.mm.plugin.game.gamewebview.b.b.a(new c());
          com.tencent.mm.plugin.game.gamewebview.b.b.a(new com.tencent.mm.plugin.game.gamewebview.b.a.b());
          com.tencent.mm.plugin.game.gamewebview.b.b.a(new e());
          com.tencent.mm.plugin.game.gamewebview.b.b.a(new com.tencent.mm.plugin.game.gamewebview.b.a.d());
          com.tencent.mm.plugin.game.gamewebview.b.b.a(new com.tencent.mm.plugin.game.gamewebview.b.a.a());
        }
        localObject1 = (com.tencent.mm.plugin.game.gamewebview.b.a)com.tencent.mm.plugin.game.gamewebview.b.b.mvJ.get(localObject1);
        if (localObject1 != null) {
          ((com.tencent.mm.plugin.game.gamewebview.b.a)localObject1).j(this.mtO, this.lRQ);
        }
      }
      GMTrace.o(16954920271872L, 126324);
      return;
      Object localObject2 = com.tencent.mm.plugin.game.gamewebview.model.a.oq(this.mtO);
      if (localObject2 != null)
      {
        localObject1 = this.lRQ.getString("file_path");
        String str = this.lRQ.getString("result");
        i = this.lRQ.getInt("code_type");
        int j = this.lRQ.getInt("code_version");
        if (((com.tencent.mm.plugin.game.gamewebview.ui.d)localObject2).mxs != null)
        {
          localObject2 = ((com.tencent.mm.plugin.game.gamewebview.ui.d)localObject2).mxs;
          w.d("MicroMsg.GameWebViewMenuListHelper", "result: " + str);
          if ((((h)localObject2).jeR == null) || (localObject1 == null) || (!((String)localObject1).equals(((h)localObject2).jeR.snV)))
          {
            GMTrace.o(16954920271872L, 126324);
            return;
          }
          if (((h)localObject2).jeR != null) {
            ((h)localObject2).jeR.bAO();
          }
          ((h)localObject2).jeP = i;
          ((h)localObject2).jeQ = j;
          if ((str == null) || (((h)localObject2).jeN == null))
          {
            GMTrace.o(16954920271872L, 126324);
            return;
          }
          new ae().post(new h.3((h)localObject2, str));
        }
      }
    }
  }
  
  public int describeContents()
  {
    GMTrace.i(16955322925056L, 126327);
    GMTrace.o(16955322925056L, 126327);
    return 0;
  }
  
  public final void f(Parcel paramParcel)
  {
    GMTrace.i(16955054489600L, 126325);
    this.iOS = paramParcel.readInt();
    this.mtO = paramParcel.readInt();
    this.lRQ = paramParcel.readBundle(getClass().getClassLoader());
    try
    {
      this.iOT = paramParcel.readString();
      if (!bg.mZ(this.iOT))
      {
        Class localClass = Class.forName(this.iOT);
        if (localClass != null) {
          this.iOU = paramParcel.readParcelable(localClass.getClassLoader());
        }
      }
      GMTrace.o(16955054489600L, 126325);
      return;
    }
    catch (Exception paramParcel)
    {
      w.e("MicroMsg.GameMMToClientEvent", "can't parcel data ex: " + paramParcel.getMessage());
      GMTrace.o(16955054489600L, 126325);
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(16955188707328L, 126326);
    paramParcel.writeInt(this.iOS);
    paramParcel.writeInt(this.mtO);
    paramParcel.writeBundle(this.lRQ);
    if ((!bg.mZ(this.iOT)) && (this.iOU != null))
    {
      paramParcel.writeString(this.iOT);
      paramParcel.writeParcelable((Parcelable)this.iOU, paramInt);
    }
    GMTrace.o(16955188707328L, 126326);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/ipc/GameMMToClientEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */