package com.tencent.mm.plugin.game.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.R.m;
import com.tencent.mm.g.b.n;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.f;
import com.tencent.mm.plugin.game.model.SubCoreGameCenter;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.ay;
import com.tencent.mm.plugin.game.model.m;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.j;
import java.util.Set;

public final class e
{
  int mBs;
  private Context mContext;
  private g mHF;
  private u mHG;
  private p mHH;
  private t mHI;
  DialogInterface.OnClickListener mHJ;
  private int mHK;
  private aj mHL;
  String mHt;
  public Dialog mxQ;
  
  public e(Context paramContext)
  {
    GMTrace.i(12742496878592L, 94939);
    this.mHF = null;
    this.mHG = null;
    this.mHH = null;
    this.mHI = null;
    this.mHJ = null;
    this.mBs = 0;
    this.mHt = null;
    this.mHK = 3000;
    this.mHL = new aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(12756455522304L, 95043);
        if (e.this.mxQ != null) {
          e.this.mxQ.cancel();
        }
        GMTrace.o(12756455522304L, 95043);
        return true;
      }
    }, false);
    this.mContext = paramContext;
    GMTrace.o(12742496878592L, 94939);
  }
  
  private static boolean a(Set<String> paramSet, String paramString)
  {
    GMTrace.i(12742899531776L, 94942);
    if ((paramSet == null) || (paramSet.isEmpty()))
    {
      GMTrace.o(12742899531776L, 94942);
      return false;
    }
    if (!paramSet.contains(paramString))
    {
      GMTrace.o(12742899531776L, 94942);
      return false;
    }
    GMTrace.o(12742899531776L, 94942);
    return true;
  }
  
  public final void a(ProgressBar paramProgressBar, Button paramButton, com.tencent.mm.plugin.game.model.c paramc, m paramm)
  {
    GMTrace.i(12742765314048L, 94941);
    if ((paramProgressBar == null) || (paramButton == null))
    {
      GMTrace.o(12742765314048L, 94941);
      return;
    }
    paramButton.setEnabled(true);
    paramButton.setVisibility(0);
    if (com.tencent.mm.pluginsdk.model.app.g.a(this.mContext, paramc))
    {
      int i = com.tencent.mm.plugin.game.d.c.zp(paramc.field_packageName);
      if (paramc.versionCode > i) {
        if (paramm.status == 1)
        {
          paramProgressBar.setVisibility(0);
          paramProgressBar.setProgress(paramm.progress);
          paramButton.setVisibility(8);
        }
      }
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.GameActionBtnHandler", "AppId: %s installed, local: %d, server: %d", new Object[] { paramc.field_appId, Integer.valueOf(i), Integer.valueOf(paramc.versionCode) });
        GMTrace.o(12742765314048L, 94941);
        return;
        if (paramc.scene == 12) {
          paramButton.setText(R.l.ecZ);
        }
        for (;;)
        {
          paramButton.setVisibility(0);
          paramProgressBar.setVisibility(8);
          break;
          paramButton.setText(R.l.ecO);
        }
        paramButton.setVisibility(0);
        paramProgressBar.setVisibility(8);
        if (paramc.scene == 12) {
          paramButton.setText(R.l.ecX);
        } else {
          paramButton.setText(R.l.edw);
        }
      }
    }
    if (paramc.aEa())
    {
      paramButton.setVisibility(0);
      paramProgressBar.setVisibility(8);
      if (paramc.scene == 12)
      {
        paramButton.setText(R.l.ecX);
        GMTrace.o(12742765314048L, 94941);
        return;
      }
      paramButton.setText(R.l.edw);
      GMTrace.o(12742765314048L, 94941);
      return;
    }
    switch (paramc.status)
    {
    default: 
      paramButton.setVisibility(8);
      paramProgressBar.setVisibility(8);
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.GameActionBtnHandler", "updateBtnStateAndText: %s, Status: %d, Text: %s", new Object[] { paramc.field_appId, Integer.valueOf(paramc.status), paramButton.getText() });
      GMTrace.o(12742765314048L, 94941);
      return;
      if (paramm == null)
      {
        paramButton.setVisibility(8);
        paramProgressBar.setVisibility(8);
        GMTrace.o(12742765314048L, 94941);
        return;
      }
      switch (paramm.status)
      {
      default: 
        break;
      case 0: 
        if (paramc.scene == 12) {
          if (paramc.mzj)
          {
            paramm = paramc.field_appId;
            if (!a(com.tencent.mm.plugin.game.model.e.cy(this.mContext), paramm)) {
              paramButton.setText(R.l.ede);
            }
          }
        }
        for (;;)
        {
          paramButton.setVisibility(0);
          paramProgressBar.setVisibility(8);
          break;
          paramButton.setText(R.l.eds);
          continue;
          paramButton.setText(R.l.edr);
        }
      case 1: 
        if (paramm.mode == 3) {
          paramButton.setText(R.l.edu);
        }
      case 2: 
      case 3: 
        for (;;)
        {
          paramButton.setVisibility(0);
          paramProgressBar.setVisibility(8);
          break;
          if (paramm.mode != 1) {
            break;
          }
          paramProgressBar.setProgress(paramm.progress);
          paramButton.setVisibility(8);
          paramProgressBar.setVisibility(0);
          break;
          if (paramc.scene == 12) {
            paramButton.setText(R.l.edd);
          }
          for (;;)
          {
            paramButton.setVisibility(0);
            paramProgressBar.setVisibility(8);
            break;
            paramButton.setText(R.l.edt);
          }
          if (paramc.scene == 12) {
            paramButton.setText(R.l.edq);
          } else {
            paramButton.setText(R.l.edp);
          }
        }
        if (paramc.mzc)
        {
          paramButton.setEnabled(false);
          paramButton.setText(R.l.ecM);
          paramButton.setVisibility(0);
          paramProgressBar.setVisibility(8);
        }
        else
        {
          paramButton.setText(R.l.ecL);
          paramButton.setVisibility(0);
          paramProgressBar.setVisibility(8);
          continue;
          paramButton.setText(R.l.ecK);
          paramButton.setVisibility(0);
          paramProgressBar.setVisibility(8);
          continue;
          if (paramm == null)
          {
            paramButton.setText(R.l.ecJ);
            paramButton.setVisibility(0);
            paramProgressBar.setVisibility(8);
            GMTrace.o(12742765314048L, 94941);
            return;
          }
          switch (paramm.status)
          {
          default: 
            break;
          case 0: 
            paramButton.setText(R.l.ecJ);
          case 1: 
          case 2: 
          case 3: 
            for (;;)
            {
              paramButton.setVisibility(0);
              paramProgressBar.setVisibility(8);
              break;
              if (paramm.mode == 3)
              {
                paramButton.setText(R.l.edu);
                break;
              }
              if (paramm.mode != 1) {
                break;
              }
              paramProgressBar.setProgress(paramm.progress);
              paramButton.setVisibility(8);
              paramProgressBar.setVisibility(0);
              break;
              if (paramc.scene == 12) {
                paramButton.setText(R.l.edd);
              }
              for (;;)
              {
                paramButton.setVisibility(0);
                paramProgressBar.setVisibility(8);
                break;
                paramButton.setText(R.l.edt);
              }
              if (paramc.scene == 12) {
                paramButton.setText(R.l.edq);
              } else {
                paramButton.setText(R.l.edp);
              }
            }
            paramButton.setText(R.l.ecN);
            paramButton.setVisibility(0);
            paramProgressBar.setVisibility(8);
          }
        }
        break;
      }
    }
  }
  
  public final void a(com.tencent.mm.plugin.game.model.c paramc, m paramm)
  {
    GMTrace.i(12742631096320L, 94940);
    if ((paramc == null) || (paramm == null))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GameActionBtnHandler", "Null appInfo or null downloadInfo");
      GMTrace.o(12742631096320L, 94940);
      return;
    }
    Object localObject1 = new View(this.mContext);
    ((View)localObject1).setTag(paramc);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.GameActionBtnHandler", "App Status: %d, Download Mode: %d, Download Status: %d", new Object[] { Integer.valueOf(paramc.status), Integer.valueOf(paramm.mode), Integer.valueOf(paramm.status) });
    if ((com.tencent.mm.pluginsdk.model.app.g.n(this.mContext, paramc.field_appId)) || (paramc.aEa())) {
      paramm.mode = 1;
    }
    int i;
    if (paramm.mode == 3)
    {
      ay.aEZ();
      i = ay.g(this.mContext, "com.tencent.android.qqdownloader", paramc.fWM);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.GameActionBtnHandler", "qqdownloader install status:[%d], yybSupportedVersionCode:[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(paramc.fWM) });
      if ((i == -1) || (i == 1) || (i == 2)) {
        paramm.mode = 1;
      }
    }
    switch (paramc.status)
    {
    }
    for (;;)
    {
      GMTrace.o(12742631096320L, 94940);
      return;
      Object localObject2 = SubCoreGameCenter.aFe().zc(paramc.field_appId);
      if (localObject2 != null)
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.GameActionBtnHandler", "delete msg, appid = " + ((com.tencent.mm.plugin.game.model.q)localObject2).field_appId);
        SubCoreGameCenter.aFe().a((com.tencent.mm.sdk.e.c)localObject2, new String[0]);
      }
      switch (paramm.mode)
      {
      default: 
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.GameActionBtnHandler", "summertoken downloadInfo.mode[%d]", new Object[] { Integer.valueOf(paramm.mode) });
        if (this.mHF == null) {
          this.mHF = new g(this.mContext);
        }
        this.mHF.oz(this.mBs);
        this.mHF.cq(this.mHt, "");
        this.mHF.onClick((View)localObject1);
      }
      while (paramc.mzj)
      {
        localObject1 = com.tencent.mm.plugin.game.model.e.cy(this.mContext);
        if (!a((Set)localObject1, paramc.field_appId))
        {
          if (paramm.mode != 3)
          {
            paramm = LayoutInflater.from(this.mContext).inflate(R.i.cWr, null);
            ((LinearLayout)paramm.findViewById(R.h.ccr)).setGravity(17);
            localObject2 = (ImageView)paramm.findViewById(R.h.cct);
            localObject3 = (TextView)paramm.findViewById(R.h.ccq);
            TextView localTextView = (TextView)paramm.findViewById(R.h.ccu);
            ((ImageView)localObject2).setBackgroundResource(R.g.aYr);
            ((TextView)localObject3).setText(R.l.edl);
            localTextView.setText(R.l.edk);
            this.mxQ = new j(this.mContext, R.m.fdi);
            this.mxQ.setContentView(paramm);
            this.mxQ.setCancelable(true);
            this.mxQ.setCanceledOnTouchOutside(true);
            this.mxQ.show();
            paramm = this.mHL;
            long l = this.mHK;
            paramm.w(l, l);
          }
          SubCoreGameCenter.aFh();
          com.tencent.mm.plugin.game.model.w.b(paramc.field_appId, 1, 0, null, null);
          ((Set)localObject1).add(paramc.field_appId);
          this.mContext.getSharedPreferences("game_center_pref", 0).edit().putStringSet("show_download_gift_tips", (Set)localObject1).commit();
        }
        GMTrace.o(12742631096320L, 94940);
        return;
        localObject2 = f.aoQ().uX(paramc.field_appId);
        if ((localObject2 != null) && (((FileDownloadTaskInfo)localObject2).id > 0L)) {
          f.aoQ().bc(((FileDownloadTaskInfo)localObject2).id);
        }
        if (this.mHG == null) {
          this.mHG = new u(this.mContext);
        }
        localObject2 = this.mHG;
        i = this.mBs;
        Object localObject3 = this.mHt;
        ((u)localObject2).mBs = i;
        ((u)localObject2).mHt = ((String)localObject3);
        this.mHG.onClick((View)localObject1);
        continue;
        if (!bg.mZ(paramc.fWD))
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.GameActionBtnHandler", "gp download url is not null and download flag is download directly by gp store");
          com.tencent.mm.pluginsdk.model.app.q.aQ(this.mContext, paramc.fWD);
          ai.a(this.mContext, paramc.scene, paramc.fKV, paramc.position, 25, paramc.field_appId, this.mBs, paramc.fuy, this.mHt);
        }
      }
      if (this.mHI == null)
      {
        this.mHI = new t(this.mContext);
        this.mHI.mQu = this.mHJ;
      }
      this.mHI.mBs = this.mBs;
      this.mHI.onClick((View)localObject1);
      ai.a(this.mContext, paramc.scene, paramc.fKV, paramc.position, 9, paramc.field_appId, this.mBs, paramc.fuy, this.mHt);
      GMTrace.o(12742631096320L, 94940);
      return;
      paramm = f.aoQ().uX(paramc.field_appId);
      if ((paramm != null) && (paramm.id > 0L)) {
        f.aoQ().bc(paramm.id);
      }
      if (this.mHH == null) {
        this.mHH = new p(this.mContext);
      }
      this.mHH.kjz = this.mBs;
      this.mHH.mOs = paramc.fWH;
      this.mHH.onClick((View)localObject1);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */