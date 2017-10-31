package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnKeyListener;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelcdntran.g;
import com.tencent.mm.network.aa;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.d.a.a;
import com.tencent.mm.plugin.appbrand.d.d.a;
import com.tencent.mm.plugin.appbrand.d.d.b;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;
import org.json.JSONObject;

public final class JsApiUploadEncryptedFileToCDN
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 194;
  public static final String NAME = "uploadEncryptedFileToCDN";
  
  public JsApiUploadEncryptedFileToCDN()
  {
    GMTrace.i(19789464469504L, 147443);
    GMTrace.o(19789464469504L, 147443);
  }
  
  public final void a(final k paramk, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(19789598687232L, 147444);
    MMActivity localMMActivity = a(paramk);
    if (localMMActivity == null)
    {
      w.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fail,  pageContext is null");
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(19789598687232L, 147444);
      return;
    }
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fail,  data is null");
      paramk.v(paramInt, d("fail:data is null", null));
      GMTrace.o(19789598687232L, 147444);
      return;
    }
    String str1 = paramk.iqL;
    String str2 = paramJSONObject.optString("tempFilePath");
    boolean bool = paramJSONObject.optBoolean("isShowProgressTips", false);
    w.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "JsApiUploadEncryptedFileToCDN appId:%s, data:%s", new Object[] { str1, paramJSONObject.toString() });
    if (bg.mZ(str2))
    {
      w.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fail,  tempFilePath is null");
      paramk.v(paramInt, d("fail:tempFilePath is null", null));
      GMTrace.o(19789598687232L, 147444);
      return;
    }
    Object localObject = com.tencent.mm.plugin.appbrand.appstorage.c.aI(str1, str2);
    if (localObject == null)
    {
      w.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fail,  tempFilePath file is not exist");
      paramk.v(paramInt, d("fail:file doesn't exist", null));
      GMTrace.o(19789598687232L, 147444);
      return;
    }
    if (TextUtils.isEmpty(((AppBrandLocalMediaObject)localObject).hhT))
    {
      w.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fail, fileFullPath is null");
      paramk.v(paramInt, d("fail:fileFullPath is null", null));
      GMTrace.o(19789598687232L, 147444);
      return;
    }
    final JsApiUploadEncryptedMediaFileTask localJsApiUploadEncryptedMediaFileTask = new JsApiUploadEncryptedMediaFileTask();
    localJsApiUploadEncryptedMediaFileTask.appId = str1;
    localJsApiUploadEncryptedMediaFileTask.fAx = str2;
    localJsApiUploadEncryptedMediaFileTask.iYS = bool;
    localJsApiUploadEncryptedMediaFileTask.iYW = localMMActivity;
    localJsApiUploadEncryptedMediaFileTask.iQB = paramk;
    localJsApiUploadEncryptedMediaFileTask.mimeType = ((AppBrandLocalMediaObject)localObject).mimeType;
    localJsApiUploadEncryptedMediaFileTask.iQi = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19789061816320L, 147440);
        HashMap localHashMap = new HashMap();
        localHashMap.put("fileId", localJsApiUploadEncryptedMediaFileTask.fFE);
        localHashMap.put("aesKey", localJsApiUploadEncryptedMediaFileTask.hbd);
        localHashMap.put("fileUrl", localJsApiUploadEncryptedMediaFileTask.fileUrl);
        localHashMap.put("fileLength", localJsApiUploadEncryptedMediaFileTask.iBr);
        w.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fileId:%s", new Object[] { localJsApiUploadEncryptedMediaFileTask.fFE });
        if (bg.mZ(localJsApiUploadEncryptedMediaFileTask.fFE))
        {
          w.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fail , return serverId is empty");
          paramk.v(paramInt, JsApiUploadEncryptedFileToCDN.this.d("fail", null));
        }
        for (;;)
        {
          localJsApiUploadEncryptedMediaFileTask.VE();
          GMTrace.o(19789061816320L, 147440);
          return;
          w.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN ok");
          paramk.v(paramInt, JsApiUploadEncryptedFileToCDN.this.d("ok", localHashMap));
        }
      }
    };
    if (!aa.bu(localMMActivity))
    {
      w.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "2G/3G/4G network available, do upload in mobile network and show the gprs confirm tips dialog");
      if ((!TextUtils.isEmpty(((AppBrandLocalMediaObject)localObject).mimeType)) && (((AppBrandLocalMediaObject)localObject).mimeType.contains("video"))) {}
      for (paramJSONObject = localMMActivity.getString(p.i.iyX);; paramJSONObject = localMMActivity.getString(p.i.iyR))
      {
        localObject = bg.eG(com.tencent.mm.a.e.aY(((AppBrandLocalMediaObject)localObject).hhT));
        com.tencent.mm.ui.base.h.a(localMMActivity, localMMActivity.getString(p.i.iyT, new Object[] { paramJSONObject, localObject }), localMMActivity.getString(p.i.dxm), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(19791880388608L, 147461);
            w.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "do confirm upload in 2G/3G/4G network");
            localJsApiUploadEncryptedMediaFileTask.VD();
            AppBrandMainProcessService.a(localJsApiUploadEncryptedMediaFileTask);
            GMTrace.o(19791880388608L, 147461);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(19789330251776L, 147442);
            w.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "do cancel upload in 2G/3G/4G network");
            paramk.v(paramInt, JsApiUploadEncryptedFileToCDN.this.d("cancel", null));
            localJsApiUploadEncryptedMediaFileTask.VE();
            GMTrace.o(19789330251776L, 147442);
          }
        });
        GMTrace.o(19789598687232L, 147444);
        return;
      }
    }
    w.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "wifi network available, do not show the gprs confirm dialog");
    localJsApiUploadEncryptedMediaFileTask.VD();
    AppBrandMainProcessService.a(localJsApiUploadEncryptedMediaFileTask);
    GMTrace.o(19789598687232L, 147444);
  }
  
  public static class JsApiUploadEncryptedMediaFileTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<JsApiUploadEncryptedMediaFileTask> CREATOR;
    public String appId;
    public String fAx;
    public String fFE;
    public String fileUrl;
    public String hbd;
    public int iBr;
    k iQB;
    public Runnable iQi;
    public boolean iYS;
    public int iYT;
    public int iYU;
    public int iYV;
    MMActivity iYW;
    d.a iYX;
    d.b iYY;
    public ProgressDialog ilL;
    public String mimeType;
    
    static
    {
      GMTrace.i(19802617806848L, 147541);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19802617806848L, 147541);
    }
    
    public JsApiUploadEncryptedMediaFileTask()
    {
      GMTrace.i(19801544065024L, 147533);
      this.iYT = 0;
      this.iYU = 0;
      this.iYV = 0;
      this.ilL = null;
      GMTrace.o(19801544065024L, 147533);
    }
    
    public JsApiUploadEncryptedMediaFileTask(Parcel paramParcel)
    {
      GMTrace.i(19801678282752L, 147534);
      this.iYT = 0;
      this.iYU = 0;
      this.iYV = 0;
      this.ilL = null;
      f(paramParcel);
      GMTrace.o(19801678282752L, 147534);
    }
    
    public final void RS()
    {
      GMTrace.i(19801812500480L, 147535);
      w.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "runInMainProcess mainEvent:%d, clientEvent:%d", new Object[] { Integer.valueOf(this.iYU), Integer.valueOf(this.iYV) });
      if (this.iYU == 1)
      {
        w.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "user cancel upload the file, remove callback");
        f.Sk().a(this.iYX);
        f.Sk().a(this.iYY);
        f.Sk();
        com.tencent.mm.plugin.appbrand.d.b.ou(this.fAx);
        this.iYU = 0;
        this.iYV = 1;
        VC();
        GMTrace.o(19801812500480L, 147535);
        return;
      }
      final AppBrandLocalMediaObject localAppBrandLocalMediaObject = com.tencent.mm.plugin.appbrand.appstorage.c.aI(this.appId, this.fAx);
      if (localAppBrandLocalMediaObject == null)
      {
        w.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "getItemByLocalId return mediaObject is null, ");
        this.iYV = 1;
        VC();
        GMTrace.o(19801812500480L, 147535);
        return;
      }
      Object localObject1 = new com.tencent.mm.plugin.appbrand.d.a();
      ((com.tencent.mm.plugin.appbrand.d.a)localObject1).fAx = localAppBrandLocalMediaObject.fAx;
      ((com.tencent.mm.plugin.appbrand.d.a)localObject1).iGk = localAppBrandLocalMediaObject.hhT;
      ((com.tencent.mm.plugin.appbrand.d.a)localObject1).ieX = localAppBrandLocalMediaObject.ieX;
      Object localObject2 = this.fAx;
      ((com.tencent.mm.plugin.appbrand.d.a)localObject1).mediaId = com.tencent.mm.modelcdntran.d.a("appbrandmediafile", bg.Pp(), (String)localObject2, (String)localObject2);
      f.Sj().a((com.tencent.mm.plugin.appbrand.d.a)localObject1);
      this.iYX = new d.a()
      {
        public final void u(int paramAnonymousInt, String paramAnonymousString)
        {
          GMTrace.i(19799799234560L, 147520);
          w.d("MicroMsg.JsApiUploadEncryptedFileToCDN", "progress, percent:%d, localId:%s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousString });
          JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.iYT = paramAnonymousInt;
          JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.iYV = 3;
          JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.a(JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this);
          GMTrace.o(19799799234560L, 147520);
        }
      };
      this.iYY = new d.b()
      {
        public final void b(boolean paramAnonymousBoolean, String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3)
        {
          GMTrace.i(19791611953152L, 147459);
          w.i("MicroMsg.JsApiUploadEncryptedFileToCDN", " on cdn finish,  is success : %s, mediaId : %s, localId : %s, mediaUrl : %s", new Object[] { Boolean.valueOf(paramAnonymousBoolean), paramAnonymousString2, paramAnonymousString1, paramAnonymousString3 });
          if ((!bg.mZ(paramAnonymousString1)) && (paramAnonymousString1.equals(localAppBrandLocalMediaObject.fAx)))
          {
            f.Sk().a(JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.iYX);
            f.Sk().a(JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.iYY);
            f.Sk();
            com.tencent.mm.plugin.appbrand.d.b.ou(localAppBrandLocalMediaObject.fAx);
            if (paramAnonymousBoolean) {
              break label273;
            }
            w.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "upload encrypt file false");
            paramAnonymousString1 = f.Sj();
            paramAnonymousString2 = JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.fFE;
            if (!bg.mZ(paramAnonymousString2)) {
              break label291;
            }
            w.e("MicroMsg.AppbrandMediaCdnItemManager", "getItemByServerId error, media id is null or nil");
            label137:
            break label305;
            label138:
            paramAnonymousString1 = null;
            label140:
            if ((paramAnonymousString1 == null) || (paramAnonymousString1.iGm == null)) {
              break label343;
            }
            w.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "cdn info is valid");
            JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.hbd = paramAnonymousString1.iGm.field_aesKey;
            JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.fFE = paramAnonymousString1.iGm.field_fileId;
            JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.fileUrl = paramAnonymousString1.iGm.field_fileUrl;
            JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.iBr = paramAnonymousString1.iGm.field_fileLength;
            w.d("MicroMsg.JsApiUploadEncryptedFileToCDN", "aesKey:%s, fileLength:%d", new Object[] { JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.hbd, Integer.valueOf(JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.iBr) });
          }
          for (;;)
          {
            JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.iYV = 1;
            JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.b(JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this);
            GMTrace.o(19791611953152L, 147459);
            return;
            label273:
            JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.fFE = paramAnonymousString2;
            w.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "upload encrypt file success");
            break;
            label291:
            paramAnonymousString3 = paramAnonymousString1.iGv.values().iterator();
            label305:
            if (!paramAnonymousString3.hasNext()) {
              break label138;
            }
            paramAnonymousString1 = (com.tencent.mm.plugin.appbrand.d.a)paramAnonymousString3.next();
            if (!bg.mY(paramAnonymousString1.iGl).equals(paramAnonymousString2)) {
              break label137;
            }
            break label140;
            label343:
            w.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "cdn info is null");
          }
        }
      };
      localObject1 = f.Sk();
      localObject2 = this.iYX;
      if ((((com.tencent.mm.plugin.appbrand.d.b)localObject1).iGr != null) && (localObject2 != null) && (!((com.tencent.mm.plugin.appbrand.d.b)localObject1).iGr.contains(localObject2))) {
        ((com.tencent.mm.plugin.appbrand.d.b)localObject1).iGr.add(localObject2);
      }
      localObject1 = f.Sk();
      Object localObject3 = this.appId;
      localObject2 = localAppBrandLocalMediaObject.fAx;
      int i = com.tencent.mm.modelcdntran.b.hry;
      d.b localb = this.iYY;
      com.tencent.mm.plugin.appbrand.d.a locala = f.Sj().ow((String)localObject2);
      boolean bool;
      if (locala == null)
      {
        w.e("MicroMsg.AppbrandCdnService", "addUploadTask get webview file chooser item  by local id failed : %s", new Object[] { localObject2 });
        bool = false;
        w.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "addUploadTask: add cdn upload task result : %b", new Object[] { Boolean.valueOf(bool) });
        if (!bool)
        {
          w.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "addUploadTask fail");
          this.iYV = 1;
          f.Sk().a(this.iYX);
          f.Sk().a(this.iYY);
          f.Sk();
          com.tencent.mm.plugin.appbrand.d.b.ou(localAppBrandLocalMediaObject.fAx);
          VC();
          GMTrace.o(19801812500480L, 147535);
        }
      }
      else
      {
        locala.appId = ((String)localObject3);
        if ((localb != null) && (((com.tencent.mm.plugin.appbrand.d.b)localObject1).iGq != null) && (localb != null) && (!((com.tencent.mm.plugin.appbrand.d.b)localObject1).iGq.contains(localb))) {
          ((com.tencent.mm.plugin.appbrand.d.b)localObject1).iGq.add(localb);
        }
        locala.iGn = true;
        localObject3 = new com.tencent.mm.modelcdntran.h();
        ((com.tencent.mm.modelcdntran.h)localObject3).hsO = ((com.tencent.mm.plugin.appbrand.d.b)localObject1).hAM;
        ((com.tencent.mm.modelcdntran.h)localObject3).fRd = true;
        ((com.tencent.mm.modelcdntran.h)localObject3).field_mediaId = locala.mediaId;
        ((com.tencent.mm.modelcdntran.h)localObject3).field_fullpath = locala.iGk;
        ((com.tencent.mm.modelcdntran.h)localObject3).field_fileType = i;
        ((com.tencent.mm.modelcdntran.h)localObject3).field_talker = "weixin";
        ((com.tencent.mm.modelcdntran.h)localObject3).field_priority = com.tencent.mm.modelcdntran.b.hrv;
        if (i == com.tencent.mm.modelcdntran.b.hry) {}
        for (((com.tencent.mm.modelcdntran.h)localObject3).field_needStorage = true;; ((com.tencent.mm.modelcdntran.h)localObject3).field_needStorage = false)
        {
          ((com.tencent.mm.modelcdntran.h)localObject3).field_isStreamMedia = false;
          ((com.tencent.mm.modelcdntran.h)localObject3).field_appType = 0;
          ((com.tencent.mm.modelcdntran.h)localObject3).field_bzScene = 0;
          ((com.tencent.mm.modelcdntran.h)localObject3).field_force_aeskeycdn = true;
          ((com.tencent.mm.modelcdntran.h)localObject3).field_trysafecdn = false;
          bool = g.Gi().c((com.tencent.mm.modelcdntran.h)localObject3);
          w.i("MicroMsg.AppbrandCdnService", "summersafecdn add upload cdn task : %b, force_aeskeycdn: %b, trysafecdn: %b, localid : %s ", new Object[] { Boolean.valueOf(bool), Boolean.valueOf(((com.tencent.mm.modelcdntran.h)localObject3).field_force_aeskeycdn), Boolean.valueOf(((com.tencent.mm.modelcdntran.h)localObject3).field_trysafecdn), localObject2 });
          break;
        }
      }
      if (this.iYS)
      {
        w.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "show the process dialog");
        this.iYV = 2;
        VC();
      }
      GMTrace.o(19801812500480L, 147535);
    }
    
    public final void VB()
    {
      GMTrace.i(19801946718208L, 147536);
      if (this.iYV == 0)
      {
        w.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "CLIENT_EVENT_INIT");
        GMTrace.o(19801946718208L, 147536);
        return;
      }
      if (this.iYV == 1)
      {
        w.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "CLIENT_EVENT_FINISH");
        if (this.ilL != null)
        {
          this.ilL.dismiss();
          this.ilL = null;
        }
        if (this.iQi != null)
        {
          this.iQi.run();
          GMTrace.o(19801946718208L, 147536);
        }
      }
      else
      {
        Object localObject;
        if (this.iYV == 2)
        {
          w.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "CLIENT_EVENT_SHOW_DIALOG");
          localObject = this.iYW;
          this.iYW.getString(p.i.dxm);
          this.ilL = com.tencent.mm.ui.base.h.a((Context)localObject, this.iYW.getString(p.i.iyW), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymousDialogInterface)
            {
              GMTrace.i(19786377461760L, 147420);
              w.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "user cancel uploading the media file");
              paramAnonymousDialogInterface.dismiss();
              JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.iYU = 1;
              JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.iYV = 1;
              AppBrandMainProcessService.a(JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this);
              GMTrace.o(19786377461760L, 147420);
            }
          });
          this.ilL.setOnKeyListener(new DialogInterface.OnKeyListener()
          {
            public final boolean onKey(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
            {
              GMTrace.i(19792148824064L, 147463);
              if ((paramAnonymousInt == 4) && (paramAnonymousKeyEvent.getAction() == 1))
              {
                if ((!TextUtils.isEmpty(JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.mimeType)) && (JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.mimeType.contains("video"))) {}
                for (paramAnonymousDialogInterface = JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.iYW.getString(p.i.iyX);; paramAnonymousDialogInterface = JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.iYW.getString(p.i.iyR))
                {
                  com.tencent.mm.ui.base.h.a(JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.iYW, true, JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.iYW.getString(p.i.iyS, new Object[] { paramAnonymousDialogInterface }), "", JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.iYW.getString(p.i.iyU), JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.iYW.getString(p.i.iyV), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
                  {
                    public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                    {
                      GMTrace.i(19795101614080L, 147485);
                      w.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "user cancel upload the media file");
                      JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.ilL.cancel();
                      JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.iYU = 1;
                      JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.iYV = 1;
                      AppBrandMainProcessService.a(JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this);
                      GMTrace.o(19795101614080L, 147485);
                    }
                  }, new DialogInterface.OnClickListener()
                  {
                    public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                    {
                      GMTrace.i(19791343517696L, 147457);
                      w.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "user continue upload media file");
                      GMTrace.o(19791343517696L, 147457);
                    }
                  });
                  GMTrace.o(19792148824064L, 147463);
                  return true;
                }
              }
              GMTrace.o(19792148824064L, 147463);
              return false;
            }
          });
          GMTrace.o(19801946718208L, 147536);
          return;
        }
        if (this.iYV == 3)
        {
          w.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "CLIENT_EVENT_PROGRESS");
          localObject = new HashMap();
          ((Map)localObject).put("tempFilePath", this.fAx);
          ((Map)localObject).put("percent", Integer.valueOf(this.iYT));
          localObject = new JSONObject((Map)localObject).toString();
          com.tencent.mm.plugin.appbrand.jsapi.e locale = new JsApiUploadEncryptedFileToCDN.a().a(this.iQB);
          locale.mData = ((String)localObject);
          locale.VI();
        }
      }
      GMTrace.o(19801946718208L, 147536);
    }
    
    public final void f(Parcel paramParcel)
    {
      boolean bool = true;
      GMTrace.i(19802080935936L, 147537);
      this.appId = paramParcel.readString();
      this.fAx = paramParcel.readString();
      this.fFE = paramParcel.readString();
      this.hbd = paramParcel.readString();
      this.fileUrl = paramParcel.readString();
      this.iBr = paramParcel.readInt();
      if (paramParcel.readInt() == 1) {}
      for (;;)
      {
        this.iYS = bool;
        this.iYT = paramParcel.readInt();
        this.iYV = paramParcel.readInt();
        this.iYU = paramParcel.readInt();
        this.mimeType = paramParcel.readString();
        GMTrace.o(19802080935936L, 147537);
        return;
        bool = false;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(19802215153664L, 147538);
      paramParcel.writeString(this.appId);
      paramParcel.writeString(this.fAx);
      paramParcel.writeString(this.fFE);
      paramParcel.writeString(this.hbd);
      paramParcel.writeString(this.fileUrl);
      paramParcel.writeInt(this.iBr);
      if (this.iYS) {}
      for (paramInt = 1;; paramInt = 0)
      {
        paramParcel.writeInt(paramInt);
        paramParcel.writeInt(this.iYT);
        paramParcel.writeInt(this.iYV);
        paramParcel.writeInt(this.iYU);
        paramParcel.writeString(this.mimeType);
        GMTrace.o(19802215153664L, 147538);
        return;
      }
    }
  }
  
  private static final class a
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = 196;
    private static final String NAME = "onUploadEncryptedFileToCDNProgress";
    
    public a()
    {
      GMTrace.i(19785840590848L, 147416);
      GMTrace.o(19785840590848L, 147416);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/media/JsApiUploadEncryptedFileToCDN.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */