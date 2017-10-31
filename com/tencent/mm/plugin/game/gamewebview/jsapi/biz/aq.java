package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameWebViewMainProcessService;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import org.json.JSONObject;

public final class aq
  extends a
{
  public static final int CTRL_BYTE = 240;
  public static final String NAME = "resumeDownloadTask";
  private long fti;
  private int scene;
  
  public aq()
  {
    GMTrace.i(17060683841536L, 127112);
    GMTrace.o(17060683841536L, 127112);
  }
  
  public final void a(final d paramd, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(17060818059264L, 127113);
    w.i("MicroMsg.GameJsApiResumeDownloadTask", "GameJsApiResumeDownloadTask");
    GameWebViewUI localGameWebViewUI = paramd.aDm();
    this.fti = paramJSONObject.optLong("download_id");
    this.scene = paramJSONObject.optInt("scene", 1000);
    if (this.fti <= 0L)
    {
      w.e("MicroMsg.GameJsApiResumeDownloadTask", "fail, invalid downloadId = " + this.fti);
      paramd.v(paramInt, a.d("resume_download_task:fail_invalid_downloadid", null));
      GMTrace.o(17060818059264L, 127113);
      return;
    }
    if (am.isWifi(localGameWebViewUI))
    {
      b(paramd, paramInt);
      GMTrace.o(17060818059264L, 127113);
      return;
    }
    h.a(localGameWebViewUI, localGameWebViewUI.getString(R.l.faX), localGameWebViewUI.getString(R.l.faY), localGameWebViewUI.getString(R.l.faS), localGameWebViewUI.getString(R.l.duP), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(18024232910848L, 134291);
        aq.this.b(paramd, paramInt);
        paramAnonymousDialogInterface.dismiss();
        GMTrace.o(18024232910848L, 134291);
      }
    }, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(18025575088128L, 134301);
        paramAnonymousDialogInterface.dismiss();
        paramAnonymousDialogInterface = paramd;
        paramAnonymousInt = paramInt;
        aq localaq = aq.this;
        paramAnonymousDialogInterface.v(paramAnonymousInt, a.d("add_download_task:fail_network_not_wifi", null));
        GMTrace.o(18025575088128L, 134301);
      }
    }, R.e.aQR);
    GMTrace.o(17060818059264L, 127113);
  }
  
  public final void b(d paramd, int paramInt)
  {
    GMTrace.i(18025306652672L, 134299);
    DoDownloadTask localDoDownloadTask = new DoDownloadTask();
    localDoDownloadTask.type = 3;
    localDoDownloadTask.fti = this.fti;
    localDoDownloadTask.scene = this.scene;
    GameWebViewMainProcessService.b(localDoDownloadTask);
    if (localDoDownloadTask.fwc)
    {
      paramd.v(paramInt, a.d("resume_download_task:ok", null));
      GMTrace.o(18025306652672L, 134299);
      return;
    }
    paramd.v(paramInt, a.d("resume_download_task:fail", null));
    GMTrace.o(18025306652672L, 134299);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */