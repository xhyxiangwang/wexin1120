package com.tencent.mm.plugin.game.gamewebview.ipc;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.cd;
import com.tencent.mm.g.a.cd.b;
import com.tencent.mm.g.a.gj;
import com.tencent.mm.g.a.gj.b;
import com.tencent.mm.plugin.game.c.ce;
import com.tencent.mm.plugin.webview.model.ad;
import com.tencent.mm.plugin.webview.model.ai;
import com.tencent.mm.plugin.webview.modeltools.f;
import com.tencent.mm.plugin.webview.ui.tools.game.GameSettingParams;
import com.tencent.mm.pluginsdk.l.a;
import com.tencent.mm.pluginsdk.l.w;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.x.ap;
import java.util.ArrayList;

public class CommonLogicTask
  extends GWMainProcessTask
{
  public static final Parcelable.Creator<CommonLogicTask> CREATOR;
  public Bundle lRQ;
  public Runnable mtM;
  public int type;
  
  static
  {
    GMTrace.i(16941632716800L, 126225);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(16941632716800L, 126225);
  }
  
  public CommonLogicTask()
  {
    GMTrace.i(16941364281344L, 126223);
    this.lRQ = new Bundle();
    GMTrace.o(16941364281344L, 126223);
  }
  
  CommonLogicTask(Parcel paramParcel)
  {
    GMTrace.i(16941498499072L, 126224);
    this.lRQ = new Bundle();
    f(paramParcel);
    GMTrace.o(16941498499072L, 126224);
  }
  
  private static int mN(String paramString)
  {
    int i = 1;
    GMTrace.i(16940827410432L, 126219);
    try
    {
      int j = bg.getInt(com.tencent.mm.k.g.uz().getValue(paramString), 1);
      i = j;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.ComonLogicTask", "getIntValFromDynamicConfig parseInt failed, val: " + paramString);
      }
    }
    GMTrace.o(16940827410432L, 126219);
    return i;
  }
  
  public final void RS()
  {
    int i = 0;
    boolean bool2 = true;
    boolean bool1 = true;
    GMTrace.i(16940693192704L, 126218);
    switch (this.type)
    {
    }
    for (;;)
    {
      VC();
      GMTrace.o(16940693192704L, 126218);
      return;
      if (this.lRQ != null)
      {
        bool1 = this.lRQ.getBoolean("permission_allow", false);
        Object localObject1 = this.lRQ.getString("url");
        if (bg.mZ((String)localObject1))
        {
          w.e("MicroMsg.ComonLogicTask", "ACTIVITY_JUMP_HANDLER, url is null");
          GMTrace.o(16940693192704L, 126218);
          return;
        }
        l.a.sRr.a(ab.getContext(), (String)localObject1, bool1);
        continue;
        if (this.lRQ != null)
        {
          localObject1 = this.lRQ.getIntArray("getConfigStgKey");
          if ((localObject1 == null) || (localObject1.length == 0))
          {
            GMTrace.o(16940693192704L, 126218);
            return;
          }
          Object localObject2 = new ArrayList();
          int j = localObject1.length;
          while (i < j)
          {
            int k = localObject1[i];
            ap.AS();
            ((ArrayList)localObject2).add(bg.mY((String)com.tencent.mm.x.c.xi().get(k, null)));
            i += 1;
          }
          this.lRQ.putStringArrayList("getConfigStgValue", (ArrayList)localObject2);
          continue;
          if (this.lRQ != null)
          {
            localObject1 = this.lRQ.getString("localId");
            localObject1 = f.bAK().Ks((String)localObject1);
            if (localObject1 != null)
            {
              this.lRQ.putParcelable("item", (Parcelable)localObject1);
              continue;
              i = mN("WebViewDownLoadFileSwitch");
              if (this.lRQ == null) {
                this.lRQ = new Bundle();
              }
              localObject1 = this.lRQ;
              if (i == 1) {}
              for (;;)
              {
                ((Bundle)localObject1).putBoolean("allowDownloadFile", bool1);
                break;
                bool1 = false;
              }
              i = mN("EnableWebviewScanQRCode");
              localObject1 = this.lRQ;
              if (i == 1) {}
              for (bool1 = bool2;; bool1 = false)
              {
                ((Bundle)localObject1).putBoolean("allow_webview_scan", bool1);
                break;
              }
              this.lRQ.putBoolean("has_set_uin", ap.AV());
              continue;
              localObject1 = new cd();
              com.tencent.mm.pluginsdk.model.e.a((cd)localObject1, 1, this.lRQ.getString("image_path", ""));
              a.uLm.m((b)localObject1);
              this.lRQ.putInt("fav_simple_img_result", ((cd)localObject1).fwu.ret);
              continue;
              localObject1 = ai.Kw(this.lRQ.getString("localId"));
              this.lRQ.putString("file_path", (String)localObject1);
              continue;
              localObject1 = this.lRQ.getString("game_hv_menu_appid");
              localObject2 = new gj();
              ((gj)localObject2).fCy.nN = 3;
              ((gj)localObject2).fCy.fCA = ((String)localObject1);
              a.uLm.m((b)localObject2);
              this.lRQ.putString("game_hv_menu_pbcache", ((gj)localObject2).fCz.result);
              continue;
              localObject1 = com.tencent.mm.plugin.game.model.g.aEh().aEj();
              if (localObject1 != null)
              {
                localObject2 = new GameSettingParams();
                ((GameSettingParams)localObject2).fDr = ((ce)localObject1).hbA;
                ((GameSettingParams)localObject2).fDs = ((ce)localObject1).mGx;
                this.lRQ.putParcelable("game_setting_params", (Parcelable)localObject2);
                continue;
                com.tencent.mm.plugin.webview.ui.tools.game.c.W(this.lRQ);
              }
            }
          }
        }
      }
    }
  }
  
  public final void VB()
  {
    GMTrace.i(16940558974976L, 126217);
    if (this.mtM != null) {
      this.mtM.run();
    }
    GMTrace.o(16940558974976L, 126217);
  }
  
  public int describeContents()
  {
    GMTrace.i(16940961628160L, 126220);
    GMTrace.o(16940961628160L, 126220);
    return 0;
  }
  
  public final void f(Parcel paramParcel)
  {
    GMTrace.i(16941230063616L, 126222);
    this.type = paramParcel.readInt();
    this.lRQ = paramParcel.readBundle(getClass().getClassLoader());
    GMTrace.o(16941230063616L, 126222);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(16941095845888L, 126221);
    paramParcel.writeInt(this.type);
    paramParcel.writeBundle(this.lRQ);
    GMTrace.o(16941095845888L, 126221);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/ipc/CommonLogicTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */