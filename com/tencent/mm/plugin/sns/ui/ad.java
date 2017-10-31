package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.oq;
import com.tencent.mm.g.a.oq.b;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.av;
import com.tencent.mm.plugin.sns.model.aw;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.aku;
import com.tencent.mm.protocal.c.akv;
import com.tencent.mm.protocal.c.aly;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.amo;
import com.tencent.mm.protocal.c.bes;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.widget.QImageView.a;
import com.tencent.mm.x.o;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ad
  implements z
{
  private String appId;
  private String appName;
  String desc;
  public String fBx;
  public String fML;
  public MMActivity fsU;
  public String fwU;
  private boolean fxs;
  String haX;
  private String iFw;
  public ProgressDialog ilL;
  private View jSz;
  String mVj;
  private boolean qAp;
  private boolean qBW;
  private boolean qBX;
  private WXMediaMessage qBY;
  SightPlayImageView qCM;
  public boolean qCN;
  private Bitmap qCO;
  private aly qCP;
  private c qCQ;
  aw qCR;
  private int qCS;
  public Runnable qCT;
  public Runnable qCU;
  private com.tencent.mm.modelsns.b qyD;
  private int qyx;
  
  public ad(MMActivity paramMMActivity)
  {
    GMTrace.i(8578391867392L, 63914);
    this.jSz = null;
    this.fBx = "";
    this.fML = "";
    this.fwU = "";
    this.fxs = false;
    this.qCN = false;
    this.qCO = null;
    this.qyD = null;
    this.qCP = new aly();
    this.qBW = false;
    this.qBX = false;
    this.qBY = null;
    this.qAp = false;
    this.qCQ = new c() {};
    this.qCR = null;
    this.qCS = 0;
    this.desc = "";
    this.ilL = null;
    this.qCT = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8356664180736L, 62262);
        ad.this.blR();
        GMTrace.o(8356664180736L, 62262);
      }
    };
    this.qCU = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8387400040448L, 62491);
        w.i("MicroMsg.SightWidget", "showProgress");
        ad localad = ad.this;
        MMActivity localMMActivity = ad.this.fsU;
        ad.this.fsU.getString(i.j.dxm);
        localad.ilL = h.a(localMMActivity, ad.this.fsU.getString(i.j.pTH), false, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
          {
            GMTrace.i(8368072687616L, 62347);
            ad.this.qCR = null;
            ad.this.qCN = false;
            af.H(ad.this.qCT);
            GMTrace.o(8368072687616L, 62347);
          }
        });
        GMTrace.o(8387400040448L, 62491);
      }
    };
    this.fsU = paramMMActivity;
    GMTrace.o(8578391867392L, 63914);
  }
  
  public final void D(Bundle paramBundle)
  {
    GMTrace.i(8578526085120L, 63915);
    this.qyD = com.tencent.mm.modelsns.b.q(this.fsU.getIntent());
    this.mVj = bg.ap(this.fsU.getIntent().getStringExtra("KSightCdnUrl"), "");
    this.haX = bg.ap(this.fsU.getIntent().getStringExtra("KSightCdnThumbUrl"), "");
    this.appId = bg.ap(this.fsU.getIntent().getStringExtra("Ksnsupload_appid"), "");
    this.appName = bg.ap(this.fsU.getIntent().getStringExtra("Ksnsupload_appname"), "");
    this.qBW = this.fsU.getIntent().getBooleanExtra("KThrid_app", false);
    this.qBX = this.fsU.getIntent().getBooleanExtra("KSnsAction", false);
    this.qAp = this.fsU.getIntent().getBooleanExtra("Kis_take_photo", false);
    this.qyx = this.fsU.getIntent().getIntExtra("Ksnsupload_source", 0);
    this.iFw = bg.ap(this.fsU.getIntent().getStringExtra("reportSessionId"), "");
    paramBundle = this.fsU.getIntent().getBundleExtra("Ksnsupload_timeline");
    if (paramBundle != null) {
      this.qBY = new SendMessageToWX.Req(paramBundle).message;
    }
    this.fBx = this.fsU.getIntent().getStringExtra("KSightThumbPath");
    this.fML = this.fsU.getIntent().getStringExtra("KSightPath");
    this.fwU = this.fsU.getIntent().getStringExtra("sight_md5");
    paramBundle = this.fsU.getIntent().getByteArrayExtra("KMMSightExtInfo");
    if (paramBundle != null) {}
    try
    {
      this.qCP.aC(paramBundle);
      if (this.qCP == null)
      {
        this.qCP = new aly();
        this.qCP.ugK = this.qAp;
      }
      paramBundle = new oq();
      paramBundle.fMI.type = 2;
      com.tencent.mm.sdk.b.a.uLm.m(paramBundle);
      if (bg.mZ(this.fML))
      {
        this.fML = bg.ap(paramBundle.fMJ.fMO, "");
        w.e("MicroMsg.SightWidget", "videoPath is null %s", new Object[] { this.fML });
      }
      if (bg.mZ(this.fwU))
      {
        paramBundle = bg.ap(paramBundle.fMJ.fMM, "");
        this.fwU = paramBundle;
        w.i("MicroMsg.SightWidget", "oncreate thumb path %s videopath %s md5 %s", new Object[] { this.fBx, this.fML, this.fwU });
        com.tencent.mm.sdk.b.a.uLm.b(this.qCQ);
        GMTrace.o(8578526085120L, 63915);
        return;
      }
    }
    catch (Exception paramBundle)
    {
      for (;;)
      {
        w.i("MicroMsg.SightWidget", "error %s", new Object[] { paramBundle.getMessage() });
        continue;
        paramBundle = this.fwU;
      }
    }
  }
  
  public final void E(Bundle paramBundle)
  {
    GMTrace.i(8578660302848L, 63916);
    GMTrace.o(8578660302848L, 63916);
  }
  
  public final boolean a(int paramInt1, int paramInt2, org.a.d.i parami, String paramString1, List<String> paramList1, akv paramakv, int paramInt3, boolean paramBoolean, List<String> paramList2, PInt paramPInt, String paramString2, int paramInt4, int paramInt5)
  {
    GMTrace.i(8579062956032L, 63919);
    if (this.qCR != null)
    {
      GMTrace.o(8579062956032L, 63919);
      return false;
    }
    if (this.qCN)
    {
      GMTrace.o(8579062956032L, 63919);
      return true;
    }
    this.qCN = true;
    this.desc = paramString1;
    parami = new LinkedList();
    if (paramList1 != null)
    {
      new LinkedList();
      paramString2 = o.Au();
      paramList1 = paramList1.iterator();
      while (paramList1.hasNext())
      {
        String str = (String)paramList1.next();
        if (!paramString2.contains(str))
        {
          bes localbes = new bes();
          localbes.jWW = str;
          parami.add(localbes);
        }
      }
    }
    this.qCR = new aw(15);
    paramPInt.value = this.qCR.jOR;
    if (paramInt3 > com.tencent.mm.plugin.sns.c.a.pXZ) {
      this.qCR.uk(3);
    }
    paramString1 = this.qCR.GR(paramString1);
    new LinkedList();
    paramString1.a(paramakv).ak(parami).um(paramInt1).un(paramInt2).bq(paramList2);
    if (paramBoolean) {
      this.qCR.up(1);
    }
    for (;;)
    {
      this.qCR.bq(paramList2);
      this.qCR.uo(this.qyx);
      this.qCR.fNs = this.qCP;
      this.qCR.d(null, null, null, paramInt4, paramInt5);
      if (!bg.mZ(this.appId)) {
        this.qCR.GX(this.appId);
      }
      if (!bg.mZ(this.appName)) {
        this.qCR.GY(bg.ap(this.appName, ""));
      }
      if (this.qBW) {
        this.qCR.uo(5);
      }
      if ((this.qBX) && (this.qBY != null))
      {
        this.qCR.GS(this.qBY.mediaTagName);
        this.qCR.S(this.appId, this.qBY.messageExt, this.qBY.messageAction);
      }
      af.i(this.qCU, 700L);
      com.tencent.mm.sdk.f.e.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8586042277888L, 63971);
          ad localad = ad.this;
          long l = System.currentTimeMillis();
          aw localaw;
          Object localObject2;
          Object localObject1;
          int i;
          if ((!TextUtils.isEmpty(localad.mVj)) && (!TextUtils.isEmpty(localad.haX)))
          {
            localaw = localad.qCR;
            String str5 = localad.fML;
            localObject2 = localad.fBx;
            localObject1 = localad.desc;
            String str1 = localad.fwU;
            String str2 = localad.mVj;
            String str3 = localad.haX;
            String str4 = ae.getAccSnsTmpPath() + com.tencent.mm.a.g.n(str5.getBytes());
            aw.Hb(str4);
            FileOp.o(str5, str4);
            str5 = ae.getAccSnsTmpPath() + com.tencent.mm.a.g.n(((String)localObject2).getBytes());
            FileOp.o((String)localObject2, str5);
            localObject2 = aw.a("", 6, str4, str5, str1, str2, str3);
            if (localObject2 == null)
            {
              w.e("MicroMsg.UploadPackHelper", "share img o.imagePath is null!");
              i = 0;
              if (i != 0) {
                break label493;
              }
              w.i("MicroMsg.SightWidget", "commitInThread videopath " + FileOp.kI(localad.fML) + " thumb: " + FileOp.kI(localad.fBx) + ",cdnUrl " + localad.mVj + "cdnThubmUrl " + localad.haX);
              af.u(new ad.6(localad));
            }
          }
          for (;;)
          {
            w.i("MicroMsg.SightWidget", "removeRunnable showProgress");
            af.H(ad.this.qCU);
            if (ad.this.qCR != null) {
              break label518;
            }
            GMTrace.o(8586042277888L, 63971);
            return;
            ((amn)localObject2).mCK = ((String)localObject1);
            if (bg.mZ(((amn)localObject2).fuw)) {
              ((amn)localObject2).fuw = ((String)localObject1);
            }
            localaw.qfI.uyu.tKd.add(localObject2);
            localObject1 = new aku();
            ((aku)localObject1).ufH = ((amn)localObject2).pYt;
            localaw.qfJ.uhY.add(localObject1);
            i = 1;
            break;
            if (!localad.qCR.j(localad.fML, localad.fBx, localad.desc, localad.fwU))
            {
              w.i("MicroMsg.SightWidget", "commitInThread videopath " + FileOp.kI(localad.fML) + " thumb: " + FileOp.kI(localad.fBx));
              af.u(new ad.7(localad));
            }
            else
            {
              label493:
              w.i("MicroMsg.SightWidget", "commitInThread cost time %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
            }
          }
          label518:
          af.u(ad.this.qCT);
          GMTrace.o(8586042277888L, 63971);
        }
      }, "sight_send_ready");
      GMTrace.o(8579062956032L, 63919);
      return true;
      this.qCR.up(0);
    }
  }
  
  public final boolean a(int paramInt, Intent paramIntent)
  {
    GMTrace.i(8579197173760L, 63920);
    GMTrace.o(8579197173760L, 63920);
    return false;
  }
  
  public final void blR()
  {
    GMTrace.i(16046132035584L, 119553);
    if (this.qCR == null)
    {
      GMTrace.o(16046132035584L, 119553);
      return;
    }
    if (this.ilL != null) {
      this.ilL.dismiss();
    }
    w.i("MicroMsg.SightWidget", "commitDone");
    Object localObject = new oq();
    ((oq)localObject).fMI.type = 0;
    ((oq)localObject).fMI.fMK = true;
    com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
    this.qCN = true;
    int i = this.qCR.commit();
    if (this.qyD != null)
    {
      this.qyD.gO(i);
      com.tencent.mm.plugin.sns.h.e.qkT.b(this.qyD);
    }
    ae.bhv().qEO = 0L;
    if ((this.fsU.getIntent() != null) && (this.fsU.getIntent().getBooleanExtra("K_go_to_SnsTimeLineUI", false)))
    {
      localObject = new Intent();
      ((Intent)localObject).putExtra("sns_resume_state", false);
      ((Intent)localObject).putExtra("sns_timeline_NeedFirstLoadint", true);
      ((Intent)localObject).setClass(this.fsU, En_424b8e16.class);
      ((Intent)localObject).addFlags(67108864);
      this.fsU.startActivity((Intent)localObject);
    }
    this.fsU.setResult(-1);
    this.fsU.finish();
    ae.bhl().bgd();
    GMTrace.o(16046132035584L, 119553);
  }
  
  public final boolean blb()
  {
    GMTrace.i(8578794520576L, 63917);
    GMTrace.o(8578794520576L, 63917);
    return true;
  }
  
  public final View blc()
  {
    GMTrace.i(8578928738304L, 63918);
    this.jSz = View.inflate(this.fsU, i.g.pPU, null);
    this.qCM = ((SightPlayImageView)this.jSz.findViewById(i.f.cAG));
    Object localObject = new DisplayMetrics();
    this.fsU.getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject);
    this.qCM.cT(com.tencent.mm.bq.a.fromDPToPix(this.fsU, 64), com.tencent.mm.bq.a.fromDPToPix(this.fsU, 64));
    this.qCM.a(QImageView.a.wVt);
    this.qCM.pCw = true;
    this.qCM.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8543092604928L, 63651);
        if (!FileOp.aZ(ad.this.fML))
        {
          w.i("MicroMsg.SightWidget", "click videopath is not exist " + ad.this.fML);
          GMTrace.o(8543092604928L, 63651);
          return;
        }
        int[] arrayOfInt = new int[2];
        if (paramAnonymousView != null) {
          paramAnonymousView.getLocationInWindow(arrayOfInt);
        }
        int i = paramAnonymousView.getWidth();
        int j = paramAnonymousView.getHeight();
        paramAnonymousView = new Intent(ad.this.fsU, SnsOnlineVideoActivity.class);
        paramAnonymousView.putExtra("intent_videopath", ad.this.fML);
        paramAnonymousView.putExtra("intent_thumbpath", ad.this.fBx);
        paramAnonymousView.putExtra("intent_isad", false);
        paramAnonymousView.putExtra("intent_ispreview", true);
        paramAnonymousView.putExtra("img_gallery_left", arrayOfInt[0]);
        paramAnonymousView.putExtra("img_gallery_top", arrayOfInt[1]);
        paramAnonymousView.putExtra("img_gallery_width", i);
        paramAnonymousView.putExtra("img_gallery_height", j);
        ad.this.fsU.startActivity(paramAnonymousView);
        ad.this.fsU.overridePendingTransition(0, 0);
        GMTrace.o(8543092604928L, 63651);
      }
    });
    w.i("MicroMsg.SightWidget", "videoPath " + this.fML + " thumbPath " + this.fBx + " " + FileOp.kI(this.fML) + " " + FileOp.kI(this.fBx));
    if (FileOp.aZ(this.fML)) {
      w.i("MicroMsg.SightWidget", "videopath exist videopath %s md5 %s", new Object[] { this.fML, this.fwU });
    }
    this.qCM.hr(false);
    this.qCM.an(this.fML, false);
    localObject = this.jSz;
    GMTrace.o(8578928738304L, 63918);
    return (View)localObject;
  }
  
  public final boolean bld()
  {
    GMTrace.i(8579331391488L, 63921);
    if (this.ilL != null) {
      this.ilL.dismiss();
    }
    this.qCM.an(this.fML, true);
    com.tencent.mm.sdk.b.a.uLm.c(this.qCQ);
    if (com.tencent.mm.plugin.sns.data.i.m(this.qCO)) {
      this.qCO.recycle();
    }
    GMTrace.o(8579331391488L, 63921);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */