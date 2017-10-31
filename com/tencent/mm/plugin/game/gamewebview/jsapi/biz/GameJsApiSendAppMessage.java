package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.an.n;
import com.tencent.mm.g.a.cd;
import com.tencent.mm.g.a.nz;
import com.tencent.mm.g.a.nz.a;
import com.tencent.mm.g.a.ob;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameProcessActivityTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameProcessActivityTask.a;
import com.tencent.mm.plugin.webview.model.b.a;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.snackbar.b.c;
import com.tencent.mm.x.o;
import com.tencent.mm.x.q;
import com.tencent.mm.x.q.b;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;

public final class GameJsApiSendAppMessage
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = 6;
  public static final String NAME = "sendAppMessage";
  public static int fRV;
  
  public GameJsApiSendAppMessage()
  {
    GMTrace.i(17030216417280L, 126885);
    GMTrace.o(17030216417280L, 126885);
  }
  
  public final void a(final com.tencent.mm.plugin.game.gamewebview.ui.d paramd, final JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(17030350635008L, 126886);
    w.i("MicroMsg.GameJsApiSendAppMessage", "invoke");
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.GameJsApiSendAppMessage", "sendAppMessage fail, appmsg is null");
      paramd.v(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("send_app_msg:fail_null_params", null));
      GMTrace.o(17030350635008L, 126886);
      return;
    }
    if (bg.mZ(paramJSONObject.optString("link")))
    {
      w.e("MicroMsg.GameJsApiSendAppMessage", "link is null");
      paramd.v(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("send_app_msg:fail_invalid_params", null));
      GMTrace.o(17030350635008L, 126886);
      return;
    }
    Object localObject1;
    Object localObject2;
    switch (fRV)
    {
    default: 
      com.tencent.mm.plugin.game.gamewebview.model.h.a(paramd, paramJSONObject);
      localObject1 = new HashMap();
      ((HashMap)localObject1).put("img_url", paramJSONObject.optString("img_url"));
      ((HashMap)localObject1).put("desc", paramJSONObject.optString("desc"));
      ((HashMap)localObject1).put("title", paramJSONObject.optString("title"));
      ((HashMap)localObject1).put("url", paramJSONObject.optString("url"));
      localObject2 = new Intent();
      ((Intent)localObject2).putExtra("Select_Conv_Type", 3);
      ((Intent)localObject2).putExtra("scene_from", 2);
      ((Intent)localObject2).putExtra("mutil_select_is_ret", true);
      ((Intent)localObject2).putExtra("webview_params", (Serializable)localObject1);
      ((Intent)localObject2).putExtra("Retr_Msg_Type", 2);
      com.tencent.mm.bi.d.a(paramd.aDm(), ".ui.transmit.SelectConversationUI", (Intent)localObject2, 1, new MMActivity.a()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
        {
          GMTrace.i(17054644043776L, 127067);
          Object localObject;
          if (paramAnonymousInt1 == 1)
          {
            localObject = paramJSONObject.optString("appid");
            if ((GameJsApiSendAppMessage.this.mtY == null) || (!bg.mZ((String)localObject))) {
              break label420;
            }
            localObject = GameJsApiSendAppMessage.this.mtY.getString("jsapi_args_appid");
          }
          label420:
          for (;;)
          {
            switch (paramAnonymousInt2)
            {
            }
            for (;;)
            {
              GMTrace.o(17054644043776L, 127067);
              return;
              if (paramAnonymousIntent == null) {}
              for (String str = null; (str == null) || (str.length() == 0); str = paramAnonymousIntent.getStringExtra("Select_Conv_User"))
              {
                w.e("MicroMsg.GameJsApiSendAppMessage", "mmOnActivityResult fail, toUser is null");
                paramAnonymousIntent = paramd;
                paramAnonymousInt1 = paramInt;
                localObject = GameJsApiSendAppMessage.this;
                paramAnonymousIntent.v(paramAnonymousInt1, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("send_app_msg:fail", null));
                GMTrace.o(17054644043776L, 127067);
                return;
              }
              GameJsApiSendAppMessage.SendAppMessageTask localSendAppMessageTask = new GameJsApiSendAppMessage.SendAppMessageTask(paramd.aDm());
              localSendAppMessageTask.scene = GameJsApiSendAppMessage.fRV;
              localSendAppMessageTask.appId = ((String)localObject);
              localSendAppMessageTask.toUser = str;
              localSendAppMessageTask.thumbUrl = ((String)paramJSONObject.opt("img_url"));
              localSendAppMessageTask.fMb = ((String)paramJSONObject.opt("src_username"));
              localSendAppMessageTask.mvh = ((String)paramJSONObject.opt("src_displayname"));
              localSendAppMessageTask.jbk = paramAnonymousIntent.getStringExtra("custom_send_text");
              localSendAppMessageTask.title = paramJSONObject.optString("title");
              localSendAppMessageTask.description = paramJSONObject.optString("desc");
              localSendAppMessageTask.mvi = paramd.yU(paramJSONObject.optString("link"));
              localSendAppMessageTask.fOj = bg.mY(paramd.mwd);
              localSendAppMessageTask.mvj = paramd.aDp();
              localSendAppMessageTask.verifyAppId = paramd.aDq();
              localSendAppMessageTask.extInfo = paramJSONObject.optString("review_data");
              localSendAppMessageTask.azb();
              com.tencent.mm.ui.base.h.bl(paramd.aDm(), paramd.getResources().getString(R.l.dxe));
              paramAnonymousIntent = paramd;
              paramAnonymousInt1 = paramInt;
              localObject = GameJsApiSendAppMessage.this;
              paramAnonymousIntent.v(paramAnonymousInt1, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("send_app_msg:ok", null));
            }
          }
        }
      });
    }
    for (;;)
    {
      fRV = 0;
      GMTrace.o(17030350635008L, 126886);
      return;
      localObject1 = new SendAppMessageTask(paramd.aDm());
      ((SendAppMessageTask)localObject1).scene = fRV;
      ((SendAppMessageTask)localObject1).appId = paramJSONObject.optString("appid");
      ((SendAppMessageTask)localObject1).thumbUrl = paramJSONObject.optString("img_url");
      ((SendAppMessageTask)localObject1).fMb = paramJSONObject.optString("src_username");
      ((SendAppMessageTask)localObject1).mvh = paramJSONObject.optString("src_displayname");
      ((SendAppMessageTask)localObject1).title = paramJSONObject.optString("title");
      ((SendAppMessageTask)localObject1).description = paramJSONObject.optString("desc");
      ((SendAppMessageTask)localObject1).mvi = paramd.yU(paramJSONObject.optString("link"));
      ((SendAppMessageTask)localObject1).fOj = bg.mY(paramd.mwd);
      ((SendAppMessageTask)localObject1).mvj = paramd.aDp();
      ((SendAppMessageTask)localObject1).verifyAppId = paramd.aDq();
      ((SendAppMessageTask)localObject1).extInfo = paramJSONObject.optString("review_data");
      paramJSONObject = new Bundle();
      paramJSONObject.putString("KPublisherId", bg.mY(paramd.un.getString("KPublisherId")));
      localObject2 = paramd.un.getString("geta8key_username");
      int i = com.tencent.mm.plugin.game.gamewebview.a.d.aa(paramd.scene, (String)localObject2);
      paramJSONObject.putString("preChatName", paramd.un.getString("preChatName"));
      paramJSONObject.putInt("preMsgIndex", paramd.un.getInt("preMsgIndex", 0));
      paramJSONObject.putString("prePublishId", paramd.un.getString("prePublishId"));
      paramJSONObject.putString("preUsername", paramd.un.getString("preUsername"));
      paramJSONObject.putInt("getA8KeyScene", i);
      paramJSONObject.putString("referUrl", paramd.mxj);
      ((SendAppMessageTask)localObject1).mvl = paramJSONObject;
      ((SendAppMessageTask)localObject1).azb();
      paramd.v(paramInt, "send_app_msg:ok");
    }
  }
  
  private static class SendAppMessageTask
    extends GameProcessActivityTask
  {
    public static final Parcelable.Creator<SendAppMessageTask> CREATOR;
    String appId;
    String description;
    String extInfo;
    String fMb;
    String fOj;
    String jbk;
    String mvh;
    String mvi;
    String mvj;
    String mvk;
    Bundle mvl;
    int scene;
    String thumbUrl;
    String title;
    String toUser;
    String verifyAppId;
    
    static
    {
      GMTrace.i(17043503972352L, 126984);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(17043503972352L, 126984);
    }
    
    public SendAppMessageTask(Context paramContext)
    {
      super();
      GMTrace.i(17043235536896L, 126982);
      GMTrace.o(17043235536896L, 126982);
    }
    
    public SendAppMessageTask(Parcel paramParcel)
    {
      GMTrace.i(17043369754624L, 126983);
      f(paramParcel);
      GMTrace.o(17043369754624L, 126983);
    }
    
    public final void a(Context paramContext, final GameProcessActivityTask.a parama)
    {
      GMTrace.i(17042698665984L, 126978);
      switch (this.scene)
      {
      default: 
        w.i("MicroMsg.GameJsApiSendAppMessage", "sendToFriend");
        if (bg.mZ(this.toUser))
        {
          w.e("MicroMsg.GameJsApiSendAppMessage", "toUser is null");
          GMTrace.o(17042698665984L, 126978);
          return;
        }
        break;
      case 1: 
        w.i("MicroMsg.GameJsApiSendAppMessage", "favoriteUrl");
        localObject1 = new cd();
        localObject2 = new b.a();
        ((b.a)localObject2).url = this.mvi;
        ((b.a)localObject2).thumbUrl = this.thumbUrl;
        ((b.a)localObject2).title = this.title;
        ((b.a)localObject2).desc = this.description;
        ((b.a)localObject2).fKY = this.appId;
        if (this.mvl != null)
        {
          localObject3 = q.gi(bg.mY(this.mvl.getString("KPublisherId")));
          q.b localb = q.Aw().n((String)localObject3, true);
          localb.k("sendAppMsgScene", Integer.valueOf(2));
          localb.k("preChatName", this.mvl.getString("preChatName"));
          localb.k("preMsgIndex", Integer.valueOf(this.mvl.getInt("preMsgIndex")));
          localb.k("prePublishId", this.mvl.getString("prePublishId"));
          localb.k("preUsername", this.mvl.getString("preUsername"));
          localb.k("getA8KeyScene", Integer.valueOf(this.mvl.getInt("getA8KeyScene")));
          localb.k("referUrl", this.mvl.getString("referUrl"));
          if (!bg.mZ(null)) {
            localb.k("adExtStr", null);
          }
          ((cd)localObject1).fwt.fwy = ((String)localObject3);
        }
        if ((paramContext != null) && ((paramContext instanceof MMActivity)))
        {
          ((cd)localObject1).fwt.activity = ((Activity)paramContext);
          ((cd)localObject1).fwt.fwA = 36;
        }
        ((cd)localObject1).fwt.fwC = new b.c()
        {
          public final void aCR()
          {
            GMTrace.i(17055449350144L, 127073);
            GMTrace.o(17055449350144L, 127073);
          }
          
          public final void onHide()
          {
            GMTrace.i(17055315132416L, 127072);
            w.d("MicroMsg.GameJsApiSendAppMessage", "onHide");
            parama.WJ();
            GMTrace.o(17055315132416L, 127072);
          }
          
          public final void onShow()
          {
            GMTrace.i(17055180914688L, 127071);
            GMTrace.o(17055180914688L, 127071);
          }
        };
        com.tencent.mm.plugin.webview.model.b.a((cd)localObject1, (b.a)localObject2);
        com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject1);
        GMTrace.o(17042698665984L, 126978);
        return;
      }
      n.IV();
      Object localObject1 = com.tencent.mm.an.b.hm(this.thumbUrl);
      Object localObject2 = new WXWebpageObject();
      ((WXWebpageObject)localObject2).webpageUrl = this.mvi;
      ((WXWebpageObject)localObject2).extInfo = this.extInfo;
      paramContext = new WXMediaMessage();
      paramContext.mediaObject = ((WXMediaMessage.IMediaObject)localObject2);
      paramContext.title = this.title;
      paramContext.description = this.description;
      if ((localObject1 != null) && (!((Bitmap)localObject1).isRecycled()))
      {
        w.i("MicroMsg.GameJsApiSendAppMessage", "thumb image is not null");
        localObject2 = new ByteArrayOutputStream();
        ((Bitmap)localObject1).compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)localObject2);
        paramContext.thumbData = ((ByteArrayOutputStream)localObject2).toByteArray();
      }
      Object localObject3 = g.aM(this.appId, true);
      localObject1 = new nz();
      ((nz)localObject1).fLZ.fEQ = paramContext;
      ((nz)localObject1).fLZ.appId = this.appId;
      localObject2 = ((nz)localObject1).fLZ;
      if (localObject3 == null)
      {
        paramContext = "";
        ((nz.a)localObject2).appName = paramContext;
        ((nz)localObject1).fLZ.toUser = this.toUser;
        ((nz)localObject1).fLZ.fMa = 2;
        if (!bg.mZ(this.fMb)) {
          break label760;
        }
        ((nz)localObject1).fLZ.fMd = null;
      }
      for (;;)
      {
        ((nz)localObject1).fLZ.fMe = this.fOj;
        ((nz)localObject1).fLZ.fMh = this.mvk;
        paramContext = q.gi(this.mvk);
        ((nz)localObject1).fLZ.fwy = paramContext;
        ((nz)localObject1).fLZ.fMf = this.mvj;
        ((nz)localObject1).fLZ.fMg = this.verifyAppId;
        com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject1);
        if (!bg.mZ(this.jbk))
        {
          paramContext = new ob();
          paramContext.fMk.fMl = this.toUser;
          paramContext.fMk.content = this.jbk;
          paramContext.fMk.type = o.fY(this.toUser);
          paramContext.fMk.flags = 0;
          com.tencent.mm.sdk.b.a.uLm.m(paramContext);
        }
        parama.WJ();
        GMTrace.o(17042698665984L, 126978);
        return;
        paramContext = ((f)localObject3).field_appName;
        break;
        label760:
        ((nz)localObject1).fLZ.fMb = this.fMb;
        ((nz)localObject1).fLZ.fMc = this.mvh;
      }
    }
    
    public int describeContents()
    {
      GMTrace.i(17042967101440L, 126980);
      GMTrace.o(17042967101440L, 126980);
      return 0;
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(17042832883712L, 126979);
      this.scene = paramParcel.readInt();
      this.appId = paramParcel.readString();
      this.fMb = paramParcel.readString();
      this.mvh = paramParcel.readString();
      this.jbk = paramParcel.readString();
      this.toUser = paramParcel.readString();
      this.thumbUrl = paramParcel.readString();
      this.title = paramParcel.readString();
      this.description = paramParcel.readString();
      this.mvi = paramParcel.readString();
      this.extInfo = paramParcel.readString();
      this.fOj = paramParcel.readString();
      this.mvj = paramParcel.readString();
      this.verifyAppId = paramParcel.readString();
      this.mvk = paramParcel.readString();
      this.mvl = paramParcel.readBundle();
      GMTrace.o(17042832883712L, 126979);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(17043101319168L, 126981);
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.scene);
      paramParcel.writeString(this.appId);
      paramParcel.writeString(this.fMb);
      paramParcel.writeString(this.mvh);
      paramParcel.writeString(this.jbk);
      paramParcel.writeString(this.toUser);
      paramParcel.writeString(this.thumbUrl);
      paramParcel.writeString(this.title);
      paramParcel.writeString(this.description);
      paramParcel.writeString(this.mvi);
      paramParcel.writeString(this.fOj);
      paramParcel.writeString(this.mvj);
      paramParcel.writeString(this.verifyAppId);
      paramParcel.writeString(this.mvk);
      paramParcel.writeString(this.extInfo);
      paramParcel.writeBundle(this.mvl);
      GMTrace.o(17043101319168L, 126981);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/GameJsApiSendAppMessage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */