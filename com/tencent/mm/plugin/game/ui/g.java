package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.n;
import com.tencent.mm.plugin.downloader.e.a;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.f;
import com.tencent.mm.plugin.game.c.bb;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.l;
import com.tencent.mm.pluginsdk.model.app.q;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import java.io.File;

public final class g
  extends d
{
  public g(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(12741691572224L, 94933);
    GMTrace.o(12741691572224L, 94933);
  }
  
  public final void aFx()
  {
    GMTrace.i(17976182964224L, 133933);
    this.mHr.field_scene = this.mzY.scene;
    com.tencent.mm.plugin.downloader.model.e.c(this.mHr);
    if (f.aoQ().bf(this.mHr.field_downloadId))
    {
      com.tencent.mm.plugin.game.model.e.W(this.mContext, this.mzY.field_appId);
      ai.a(this.mContext, this.mzY.scene, this.mzY.fKV, this.mzY.position, 4, this.mzY.field_appId, this.mBs, this.mzY.fuy, this.mHt);
      GMTrace.o(17976182964224L, 133933);
      return;
    }
    w.e("MicsoMsg.GameClickListener", "resumeDownloadTask false");
    f.aoQ().bc(this.mHr.field_downloadId);
    eZ(false);
    GMTrace.o(17976182964224L, 133933);
  }
  
  public final void cq(String paramString1, String paramString2)
  {
    GMTrace.i(12741825789952L, 94934);
    this.mHt = paramString1;
    this.mHu = paramString2;
    GMTrace.o(12741825789952L, 94934);
  }
  
  public final void onClick(View paramView)
  {
    GMTrace.i(12741960007680L, 94935);
    int i;
    int k;
    int j;
    if ((paramView.getTag() instanceof com.tencent.mm.plugin.game.model.c))
    {
      this.mzY = ((com.tencent.mm.plugin.game.model.c)paramView.getTag());
      w.i("MicsoMsg.GameClickListener", "Clicked appid = " + this.mzY.field_appId);
      aFp();
      if ((this.mHq == null) || (!this.mHq.kTy)) {
        break label329;
      }
      this.mHq.kTy = false;
      if (this.mHr != null)
      {
        this.mHr.field_autoInstall = true;
        this.mHr.field_showNotification = true;
        this.mHr.field_autoDownload = false;
        com.tencent.mm.plugin.downloader.model.e.c(this.mHr);
      }
      i = 1;
      if (!com.tencent.mm.pluginsdk.model.app.g.n(this.mContext, this.mzY.field_appId)) {
        break label717;
      }
      if (!(this.mzY instanceof com.tencent.mm.plugin.game.model.c)) {
        break label1200;
      }
      k = com.tencent.mm.plugin.game.d.c.zp(this.mzY.field_packageName);
      j = this.mzY.versionCode;
    }
    for (;;)
    {
      boolean bool;
      if (j > k)
      {
        w.i("MicsoMsg.GameClickListener", "AppId: %s installed, local: %d, server: %d", new Object[] { this.mzY.field_appId, Integer.valueOf(k), Integer.valueOf(j) });
        l.a(this.mzY.fWx, this.mzY.fWC, this.mzY.fKV, this.mzY.field_appId, this.mHs, "app_update");
        if (this.mHq.status == 1)
        {
          if (i != 0) {
            break label708;
          }
          bool = f.aoQ().be(this.mHq.id);
          w.e("MicsoMsg.GameClickListener", "pauseDownloadTask ret = " + bool);
          GMTrace.o(12741960007680L, 94935);
          return;
          w.e("MicsoMsg.GameClickListener", "No AppInfo");
          GMTrace.o(12741960007680L, 94935);
          return;
          label329:
          i = 0;
          break;
        }
        if (this.mHq.status == 2)
        {
          if (f.aoQ().bf(this.mHq.id))
          {
            com.tencent.mm.plugin.game.model.e.W(this.mContext, this.mzY.field_appId);
            ai.a(this.mContext, this.mzY.scene, this.mzY.fKV, this.mzY.position, 4, this.mzY.field_appId, this.mBs, this.mzY.fuy, this.mHt);
            GMTrace.o(12741960007680L, 94935);
            return;
          }
          w.e("MicsoMsg.GameClickListener", "resumeDownloadTask false");
          eZ(true);
          GMTrace.o(12741960007680L, 94935);
          return;
        }
        if (this.mHq.status == 3)
        {
          if ((com.tencent.mm.a.e.aZ(this.mHq.path)) && (com.tencent.mm.plugin.game.d.c.zq(this.mHq.path) > k))
          {
            paramView = Uri.fromFile(new File(this.mHq.path));
            q.e(this.mContext, paramView);
            ai.a(this.mContext, this.mzY.scene, this.mzY.fKV, this.mzY.position, 8, this.mzY.field_appId, this.mBs, this.mzY.fuy, this.mHt);
            GMTrace.o(12741960007680L, 94935);
            return;
          }
          eZ(true);
          GMTrace.o(12741960007680L, 94935);
          return;
        }
        eZ(true);
        GMTrace.o(12741960007680L, 94935);
        return;
      }
      w.i("MicsoMsg.GameClickListener", "launchFromWX, appId = %s, pkg = %s, openId = %s", new Object[] { this.mzY.field_appId, this.mzY.field_packageName, this.mzY.field_openId });
      ai.a(this.mContext, this.mzY.scene, this.mzY.fKV, this.mzY.position, 3, this.mzY.field_appId, this.mBs, this.mzY.fuy, this.mHt);
      aFo();
      label708:
      GMTrace.o(12741960007680L, 94935);
      return;
      label717:
      if (this.mzY.aEa())
      {
        com.tencent.mm.plugin.game.d.c.p(this.mContext, this.mzY.mzu.mFv, "game_center_hv_game");
        ai.a(this.mContext, this.mzY.scene, this.mzY.fKV, this.mzY.position, 29, this.mzY.field_appId, this.mBs, this.mzY.fuy, this.mHt);
        GMTrace.o(12741960007680L, 94935);
        return;
      }
      l.a(this.mzY.fWx, this.mzY.fWC, this.mzY.fKV, this.mzY.field_appId, this.mHs, this.mHu);
      switch (this.mStatus)
      {
      default: 
        eZ(false);
      case 1: 
        do
        {
          GMTrace.o(12741960007680L, 94935);
          return;
        } while (i != 0);
        bool = f.aoQ().be(this.mHq.id);
        w.e("MicsoMsg.GameClickListener", "pauseDownloadTask ret = " + bool);
        GMTrace.o(12741960007680L, 94935);
        return;
      case 2: 
        if (!am.isNetworkConnected(this.mContext))
        {
          Toast.makeText(this.mContext, this.mContext.getString(R.l.edf), 0).show();
          GMTrace.o(12741960007680L, 94935);
          return;
        }
        if (am.isWifi(this.mContext))
        {
          aFx();
          GMTrace.o(12741960007680L, 94935);
          return;
        }
        h.a(this.mContext, this.mContext.getString(R.l.faX), this.mContext.getString(R.l.faY), this.mContext.getString(R.l.faS), this.mContext.getString(R.l.duP), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(17974035480576L, 133917);
            g.this.aFx();
            paramAnonymousDialogInterface.dismiss();
            GMTrace.o(17974035480576L, 133917);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(17977122488320L, 133940);
            paramAnonymousDialogInterface.dismiss();
            w.i("MicsoMsg.GameClickListener", "resumeDownloadTask not wifi, user cancel");
            GMTrace.o(17977122488320L, 133940);
          }
        }, R.e.aQR);
        GMTrace.o(12741960007680L, 94935);
        return;
      }
      if ((!bg.mZ(this.mHp)) && (com.tencent.mm.a.e.aZ(this.mHp)) && (com.tencent.mm.plugin.game.d.c.cr(this.mHp, this.mHr.field_md5)))
      {
        aFn();
        ai.a(this.mContext, this.mzY.scene, this.mzY.fKV, this.mzY.position, 8, this.mzY.field_appId, this.mBs, this.mzY.fuy, this.mHt);
        GMTrace.o(12741960007680L, 94935);
        return;
      }
      eZ(false);
      GMTrace.o(12741960007680L, 94935);
      return;
      label1200:
      j = 0;
      k = 0;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */