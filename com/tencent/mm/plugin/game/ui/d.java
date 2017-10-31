package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.provider.Settings.Secure;
import android.provider.Settings.SettingNotFoundException;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.n;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.g.a;
import com.tencent.mm.plugin.downloader.model.o;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.l;
import com.tencent.mm.pluginsdk.model.app.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import java.io.File;
import java.util.Map;

public abstract class d
  implements View.OnClickListener
{
  protected int mBs;
  protected Context mContext;
  protected long mHo;
  protected String mHp;
  protected FileDownloadTaskInfo mHq;
  protected com.tencent.mm.plugin.downloader.e.a mHr;
  protected String mHs;
  protected String mHt;
  protected String mHu;
  private String mHv;
  protected int mStatus;
  protected com.tencent.mm.plugin.game.model.c mzY;
  
  public d(Context paramContext)
  {
    GMTrace.i(12688944005120L, 94540);
    this.mStatus = -1;
    this.mzY = null;
    this.mHo = -1L;
    this.mHv = "xiaomi";
    this.mContext = paramContext;
    GMTrace.o(12688944005120L, 94540);
  }
  
  protected final void aFn()
  {
    GMTrace.i(12689212440576L, 94542);
    Uri localUri = Uri.fromFile(new File(this.mHq.path));
    q.e(this.mContext, localUri);
    GMTrace.o(12689212440576L, 94542);
  }
  
  protected final void aFo()
  {
    GMTrace.i(12689346658304L, 94543);
    com.tencent.mm.plugin.game.model.e.V(this.mContext, this.mzY.field_appId);
    GMTrace.o(12689346658304L, 94543);
  }
  
  protected final void aFp()
  {
    GMTrace.i(12689615093760L, 94545);
    this.mHr = com.tencent.mm.plugin.downloader.model.e.uT(this.mzY.field_appId);
    this.mHq = com.tencent.mm.plugin.downloader.model.f.aoQ().uX(this.mzY.field_appId);
    this.mHo = this.mHq.id;
    this.mStatus = this.mHq.status;
    this.mHp = this.mHq.path;
    GMTrace.o(12689615093760L, 94545);
  }
  
  protected final void eZ(final boolean paramBoolean)
  {
    GMTrace.i(12689480876032L, 94544);
    if (!am.isNetworkConnected(this.mContext))
    {
      Toast.makeText(this.mContext, this.mContext.getString(R.l.edf), 0).show();
      l.aEm();
      l.a(this.mzY.field_appId, com.tencent.mm.plugin.downloader.model.d.kSR, false, null);
      GMTrace.o(12689480876032L, 94544);
      return;
    }
    ap.AS();
    if (!com.tencent.mm.x.c.isSDCardAvailable())
    {
      Toast.makeText(this.mContext, this.mContext.getString(R.l.edh), 0).show();
      l.aEm();
      l.a(this.mzY.field_appId, com.tencent.mm.plugin.downloader.model.d.kSS, false, null);
      GMTrace.o(12689480876032L, 94544);
      return;
    }
    if (!com.tencent.mm.compatible.util.f.K(this.mzY.mzs))
    {
      Toast.makeText(this.mContext, this.mContext.getString(R.l.edg), 0).show();
      l.aEm();
      l.a(this.mzY.field_appId, com.tencent.mm.plugin.downloader.model.d.kSS, false, null);
      GMTrace.o(12689480876032L, 94544);
      return;
    }
    if (com.tencent.mm.protocal.d.toQ.toLowerCase().contains(this.mHv)) {}
    try
    {
      if ((Settings.Secure.getInt(this.mContext.getContentResolver(), "install_non_market_apps") == 0) && (!this.mContext.getSharedPreferences("game_center_pref", 0).getBoolean("show_open_download_authority_tips", false)))
      {
        com.tencent.mm.ui.base.h.a(this.mContext, R.l.eeb, R.l.eec, R.l.eej, R.l.duP, false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(17977390923776L, 133942);
            Intent localIntent = new Intent("android.settings.SECURITY_SETTINGS");
            d.this.mContext.startActivity(localIntent);
            paramAnonymousDialogInterface.cancel();
            GMTrace.o(17977390923776L, 133942);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(17976585617408L, 133936);
            paramAnonymousDialogInterface.cancel();
            GMTrace.o(17976585617408L, 133936);
          }
        });
        this.mContext.getSharedPreferences("game_center_pref", 0).edit().putBoolean("show_open_download_authority_tips", true).commit();
      }
      if ((bg.mZ(this.mzY.fWx)) || (bg.mZ(this.mzY.fWC)))
      {
        w.d("MicroMsg.CommonGameClickLinstener", "downloadApk: appdownloadurl is null or appmd5 is null, try gpDownload");
        if (bg.mZ(this.mzY.fWD))
        {
          w.e("MicroMsg.CommonGameClickLinstener", "downloadApk fail, gpDownloadUrl is null");
          if (bg.mZ(this.mzY.fWx))
          {
            l.aEm();
            l.a(this.mzY.field_appId, com.tencent.mm.plugin.downloader.model.d.DOWNLOAD_ERR_URL_INVALID, false, null);
          }
          if (bg.mZ(this.mzY.fWC))
          {
            l.aEm();
            l.a(this.mzY.field_appId, com.tencent.mm.plugin.downloader.model.d.kSP, false, null);
          }
          GMTrace.o(12689480876032L, 94544);
          return;
        }
      }
    }
    catch (Settings.SettingNotFoundException localSettingNotFoundException)
    {
      for (;;)
      {
        w.e("MicroMsg.CommonGameClickLinstener", "SettingNotFoundException ; %S", new Object[] { localSettingNotFoundException.getMessage() });
        continue;
        w.d("MicroMsg.CommonGameClickLinstener", "downloadApk with gp, ret = %b", new Object[] { Boolean.valueOf(q.aQ(this.mContext, this.mzY.fWD)) });
      }
      ai.a(this.mContext, this.mzY.scene, this.mzY.fKV, this.mzY.position, 4, this.mzY.field_appId, this.mBs, this.mzY.fuy, this.mHt);
      if (am.isWifi(this.mContext))
      {
        fa(paramBoolean);
        GMTrace.o(12689480876032L, 94544);
        return;
      }
      com.tencent.mm.ui.base.h.a(this.mContext, this.mContext.getString(R.l.faX), this.mContext.getString(R.l.faY), this.mContext.getString(R.l.faS), this.mContext.getString(R.l.duP), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(12664247943168L, 94356);
          d.this.fa(paramBoolean);
          paramAnonymousDialogInterface.dismiss();
          GMTrace.o(12664247943168L, 94356);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(12661563588608L, 94336);
          paramAnonymousDialogInterface.dismiss();
          w.i("MicroMsg.CommonGameClickLinstener", "addDownloadTask not wifi, user cancel");
          GMTrace.o(12661563588608L, 94336);
        }
      }, R.e.aQR);
      GMTrace.o(12689480876032L, 94544);
    }
  }
  
  public final void fa(boolean paramBoolean)
  {
    GMTrace.i(17974438133760L, 133920);
    Object localObject;
    com.tencent.mm.plugin.downloader.model.f localf;
    long l;
    if (paramBoolean)
    {
      l.a(this.mzY.fWx, this.mzY.fWC, this.mzY.fKV, this.mzY.field_appId, this.mHs, "app_update");
      localObject = new g.a();
      ((g.a)localObject).va(this.mzY.fWx);
      ((g.a)localObject).vb(this.mzY.mzr);
      ((g.a)localObject).bn(this.mzY.mzs);
      ((g.a)localObject).vc(com.tencent.mm.pluginsdk.model.app.g.a(this.mContext, this.mzY, null));
      ((g.a)localObject).setAppId(this.mzY.field_appId);
      ((g.a)localObject).vd(this.mzY.fWC);
      ((g.a)localObject).dK(true);
      ((g.a)localObject).mh(1);
      ((g.a)localObject).bz(this.mzY.field_packageName);
      ((g.a)localObject).li(this.mzY.fKV);
      if (this.mzY.fCC != 1) {
        break label473;
      }
      localf = com.tencent.mm.plugin.downloader.model.f.aoQ();
      localObject = ((g.a)localObject).kTs;
      w.i("MicroMsg.FileDownloadManager", "addDownloadTaskByCDNDownloader, appId = %s", new Object[] { ((com.tencent.mm.plugin.downloader.model.g)localObject).iqL });
      if (!com.tencent.mm.kernel.h.xx().wM()) {
        break label358;
      }
      com.tencent.mm.kernel.h.xx();
      if (com.tencent.mm.kernel.a.wG()) {
        break label358;
      }
      l = localf.aoU().a((com.tencent.mm.plugin.downloader.model.g)localObject);
    }
    for (;;)
    {
      w.i("MicroMsg.CommonGameClickLinstener", " add download task result:[%d], appid[%s]，downloaerType[%d]", new Object[] { Long.valueOf(l), this.mzY.field_appId, Integer.valueOf(this.mzY.fCC) });
      com.tencent.mm.plugin.game.model.e.W(this.mContext, this.mzY.field_appId);
      GMTrace.o(17974438133760L, 133920);
      return;
      l.a(this.mzY.fWx, this.mzY.fWC, this.mzY.fKV, this.mzY.field_appId, this.mHs, this.mHu);
      break;
      label358:
      l = localf.aoS().a((com.tencent.mm.plugin.downloader.model.g)localObject);
      if (l >= 0L)
      {
        com.tencent.mm.plugin.downloader.model.f.kSX.put(Long.valueOf(l), Long.valueOf(0L));
        ab.getContext().getSharedPreferences("off_line_download_ids", 0).edit().putLong(String.valueOf(l), 0L).commit();
        w.i("MicroMsg.FileDownloadManager", "Add id: %d to offline ids", new Object[] { Long.valueOf(l) });
      }
      else
      {
        w.i("MicroMsg.FileDownloadManager", "add download task to system downloader failed, use browser to download it");
        localf.aoT().a((com.tencent.mm.plugin.downloader.model.g)localObject);
        continue;
        label473:
        l = com.tencent.mm.plugin.downloader.model.f.aoQ().a(((g.a)localObject).kTs);
      }
    }
  }
  
  public final void oz(int paramInt)
  {
    GMTrace.i(12689078222848L, 94541);
    this.mBs = paramInt;
    GMTrace.o(12689078222848L, 94541);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */