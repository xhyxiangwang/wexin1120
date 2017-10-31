package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXVideoObject;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.plugin.sns.h.e;
import com.tencent.mm.plugin.sns.h.g;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.aw;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.akv;
import com.tencent.mm.protocal.c.amp;
import com.tencent.mm.protocal.c.bes;
import com.tencent.mm.protocal.c.bft;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.v;
import com.tencent.mm.x.o;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class aa
  implements z
{
  private String appId;
  private String appName;
  private String fMb;
  private String fMg;
  private String fMh;
  public final MMActivity fsU;
  private int h;
  public String hNh;
  public String hdi;
  public String hdj;
  private Bitmap hkH;
  private String iFw;
  private TextView iin;
  private View jSz;
  private boolean nJR;
  private int qAq;
  private boolean qBR;
  private String qBS;
  private String qBT;
  private boolean qBU;
  private boolean qBV;
  private boolean qBW;
  private boolean qBX;
  private WXMediaMessage qBY;
  private String qBZ;
  private String qCa;
  private String qCb;
  private String qCc;
  private int qCd;
  private com.tencent.mm.modelsns.b qCe;
  private String qCf;
  private String qCg;
  private int qCh;
  private String qCi;
  private String qCj;
  private com.tencent.mm.modelsns.b qyD;
  private String qyu;
  private byte[] qyv;
  private String qyw;
  private int qyx;
  private CdnImageView qyy;
  private TextView qyz;
  private String title;
  private String videoUrl;
  private int w;
  
  public aa(MMActivity paramMMActivity)
  {
    GMTrace.i(8601074663424L, 64083);
    this.w = -1;
    this.h = -1;
    this.hNh = "";
    this.title = "";
    this.qyu = "";
    this.qyv = null;
    this.qBR = false;
    this.hkH = null;
    this.jSz = null;
    this.qyy = null;
    this.iin = null;
    this.qyz = null;
    this.nJR = false;
    this.qBU = false;
    this.qBV = false;
    this.qBW = false;
    this.qBX = false;
    this.qBY = null;
    this.qBZ = "";
    this.videoUrl = "";
    this.qCa = "";
    this.qCd = 0;
    this.qyD = null;
    this.qCe = null;
    this.qAq = 0;
    this.qCf = "";
    this.qCg = "";
    this.qCh = 0;
    this.qCi = "";
    this.qCj = "";
    this.hdi = "";
    this.hdj = "";
    this.fsU = paramMMActivity;
    GMTrace.o(8601074663424L, 64083);
  }
  
  public final void D(Bundle paramBundle)
  {
    GMTrace.i(8601208881152L, 64084);
    this.qyD = com.tencent.mm.modelsns.b.q(this.fsU.getIntent());
    this.qAq = this.fsU.getIntent().getIntExtra("Ksnsupload_type", 0);
    this.qCh = this.fsU.getIntent().getIntExtra("KSnsStreamVideoTotalTime", 0);
    this.qCi = bg.ap(this.fsU.getIntent().getStringExtra("KSnsStreamVideoWroding"), "");
    this.qCj = bg.ap(this.fsU.getIntent().getStringExtra("KSnsStreamVideoWebUrl"), "");
    this.hdi = bg.ap(this.fsU.getIntent().getStringExtra("KSnsStreamVideoAduxInfo"), "");
    this.hdj = bg.ap(this.fsU.getIntent().getStringExtra("KSnsStreamVideoPublishId"), "");
    this.w = this.fsU.getIntent().getIntExtra("Ksnsupload_width", -1);
    this.h = this.fsU.getIntent().getIntExtra("Ksnsupload_height", -1);
    this.qyx = this.fsU.getIntent().getIntExtra("Ksnsupload_source", 0);
    this.qBT = bg.ap(this.fsU.getIntent().getStringExtra("key_snsad_statextstr"), "");
    this.hNh = bg.ap(this.fsU.getIntent().getStringExtra("Ksnsupload_link"), "");
    this.title = bg.ap(this.fsU.getIntent().getStringExtra("Ksnsupload_title"), "");
    this.qyu = bg.ap(this.fsU.getIntent().getStringExtra("Ksnsupload_imgurl"), "");
    this.qyv = this.fsU.getIntent().getByteArrayExtra("Ksnsupload_imgbuf");
    if ((this.qyv == null) && (this.qBY != null) && (this.qBY.mediaObject != null) && ((this.qBY.mediaObject instanceof WXImageObject))) {
      this.qyv = ((WXImageObject)this.qBY.mediaObject).imageData;
    }
    this.nJR = this.fsU.getIntent().getBooleanExtra("ksnsis_video", false);
    this.qBU = this.fsU.getIntent().getBooleanExtra("ksnsis_music", false);
    this.qBV = this.fsU.getIntent().getBooleanExtra("ksnsis_appbrand", false);
    this.fMb = bg.ap(this.fsU.getIntent().getStringExtra("src_username"), "");
    this.qyw = bg.ap(this.fsU.getIntent().getStringExtra("src_displayname"), "");
    this.appId = bg.ap(this.fsU.getIntent().getStringExtra("Ksnsupload_appid"), "");
    this.appName = bg.ap(this.fsU.getIntent().getStringExtra("Ksnsupload_appname"), "");
    this.qBW = this.fsU.getIntent().getBooleanExtra("KThrid_app", false);
    this.qBX = this.fsU.getIntent().getBooleanExtra("KSnsAction", false);
    this.qCb = bg.ap(this.fsU.getIntent().getStringExtra("ShareUrlOriginal"), "");
    this.qCc = bg.ap(this.fsU.getIntent().getStringExtra("ShareUrlOpen"), "");
    this.fMg = bg.ap(this.fsU.getIntent().getStringExtra("JsAppId"), "");
    this.fMh = bg.ap(this.fsU.getIntent().getStringExtra("KPublisherId"), "");
    this.iFw = bg.ap(this.fsU.getIntent().getStringExtra("reportSessionId"), "");
    this.qCd = this.fsU.getIntent().getIntExtra("Ksnsupload_contentattribute", 0);
    this.qCf = bg.ap(this.fsU.getIntent().getStringExtra("KsnsUpload_BrandUsername"), "");
    this.qCg = bg.ap(this.fsU.getIntent().getStringExtra("KsnsUpload_BrandPath"), "");
    this.qBS = bg.ap(this.fsU.getIntent().getStringExtra("KlinkThumb_url"), "");
    if ((this.qBS.startsWith("http://mmsns.qpic.cn")) || (this.qBS.startsWith("https://mmsns.qpic.cn")))
    {
      this.qyu = this.qBS;
      this.qyv = null;
      w.i("MicroMsg.LinkWidget", "get thumb url %s", new Object[] { this.qBS });
    }
    paramBundle = this.fsU.getIntent().getBundleExtra("Ksnsupload_timeline");
    if (paramBundle != null)
    {
      this.qBY = new SendMessageToWX.Req(paramBundle).message;
      if (bg.mZ(this.title)) {
        this.title = this.qBY.title;
      }
      if (bg.mZ(this.qCa)) {
        this.qCa = this.qBY.description;
      }
      if (bg.bp(this.qyv)) {
        this.qyv = this.qBY.thumbData;
      }
    }
    paramBundle = this.fsU.getIntent().getStringExtra("KSnsStrId");
    Object localObject = bg.ap(this.fsU.getIntent().getStringExtra("KSnsLocalId"), "");
    localObject = ae.bhp().HA((String)localObject);
    if (!bg.mZ(paramBundle))
    {
      this.qCe = com.tencent.mm.modelsns.b.gM(706);
      this.qCe.gQ(this.qCe.hNE).li(System.currentTimeMillis()).gQ(this.qCe.hNG).gQ(1).li(paramBundle);
      if (localObject != null)
      {
        this.qCe.gP(((m)localObject).field_type);
        this.qCe.bA(((m)localObject).uF(32)).lh(((m)localObject).bkq()).lh(this.hNh);
      }
      com.tencent.mm.plugin.sns.h.f.qkT.a(this.qCe);
    }
    GMTrace.o(8601208881152L, 64084);
  }
  
  public final void E(Bundle paramBundle)
  {
    GMTrace.i(8601343098880L, 64085);
    GMTrace.o(8601343098880L, 64085);
  }
  
  public final boolean a(int paramInt1, int paramInt2, org.a.d.i parami, String paramString1, List<String> paramList1, akv paramakv, int paramInt3, boolean paramBoolean, List<String> paramList2, PInt paramPInt, String paramString2, int paramInt4, int paramInt5)
  {
    GMTrace.i(8601745752064L, 64088);
    aw localaw;
    if (this.qBU) {
      localaw = new aw(4);
    }
    label287:
    Object localObject;
    for (;;)
    {
      paramPInt.value = localaw.jOR;
      if (paramInt3 > a.pXZ) {
        localaw.uk(4);
      }
      if (this.qyv == null)
      {
        com.tencent.mm.an.n.IV();
        paramPInt = com.tencent.mm.an.b.hm(this.qyu);
        if ((paramPInt != null) && (!paramPInt.isRecycled()))
        {
          paramPInt = d.a(paramPInt, 150, 150, false, false);
          w.i("MicroMsg.LinkWidget", "create bitmap %d %d", new Object[] { Integer.valueOf(paramPInt.getHeight()), Integer.valueOf(paramPInt.getWidth()) });
          this.qyv = d.P(paramPInt);
        }
      }
      localaw.GW(this.title).GU(this.hNh).GV(this.hNh).GR(paramString1);
      if (!this.qBU) {
        break;
      }
      if (!localaw.a(this.qyv, this.hNh, this.hNh, this.hNh, 3, "", "")) {}
      localaw.uo(this.qyx);
      localaw.GZ(this.fMb);
      localaw.Ha(this.qyw);
      paramString1 = this.qBT;
      localaw.qfI.qBT = bg.mY(paramString1);
      w.i("MicroMsg.UploadPackHelper", "setStatExtStr:%s", new Object[] { paramString1 });
      if (!paramBoolean) {
        break label1053;
      }
      localaw.up(1);
      localaw.bq(paramList2);
      paramString1 = new LinkedList();
      if (paramList1 == null) {
        break label1063;
      }
      new LinkedList();
      paramList2 = o.Au();
      paramList1 = paramList1.iterator();
      while (paramList1.hasNext())
      {
        paramPInt = (String)paramList1.next();
        if (!paramList2.contains(paramPInt))
        {
          localObject = new bes();
          ((bes)localObject).jWW = paramPInt;
          paramString1.add(localObject);
        }
      }
      if (this.nJR)
      {
        localaw = new aw(5);
      }
      else if (this.qBV)
      {
        localaw = new aw(25);
        localObject = this.qCf;
        localaw.qfI.uyA.username = ((String)localObject);
        localObject = this.qCg;
        localaw.qfI.uyA.path = ((String)localObject);
      }
      else if (this.qAq == 11)
      {
        localaw = new aw(18);
        localObject = new bft();
        ((bft)localObject).hdf = this.qCi;
        ((bft)localObject).hde = this.title;
        ((bft)localObject).hdc = this.hNh;
        ((bft)localObject).hdg = this.qCj;
        ((bft)localObject).hdd = this.qCh;
        ((bft)localObject).hdh = this.qyu;
        ((bft)localObject).hdi = this.hdi;
        ((bft)localObject).hdj = this.hdj;
        localaw.qfN = ((bft)localObject);
        localaw.qfI.uyz = ((bft)localObject);
      }
      else
      {
        localaw = new aw(3);
      }
    }
    if (this.nJR) {
      if (this.qBY == null) {
        break label1365;
      }
    }
    label654:
    label718:
    label979:
    label991:
    label1053:
    label1063:
    label1365:
    for (paramPInt = (WXVideoObject)this.qBY.mediaObject;; paramPInt = null)
    {
      localObject = this.qyv;
      String str = this.hNh;
      if (paramPInt == null)
      {
        paramString1 = this.hNh;
        if (paramPInt != null) {
          break label718;
        }
      }
      for (paramPInt = this.hNh;; paramPInt = bg.ap(paramPInt.videoUrl, this.hNh))
      {
        localaw.a((byte[])localObject, str, paramString1, paramPInt, 4, bg.ap(this.title, ""), bg.ap(this.qCa, ""));
        break;
        paramString1 = bg.ap(paramPInt.videoLowBandUrl, this.hNh);
        break label654;
      }
      if (!bg.mZ(this.qBS))
      {
        paramString1 = this.qBS;
        paramInt1 = this.w;
        paramInt2 = this.h;
        paramString1 = aw.T("", paramString1, paramString1);
        if (paramString1 == null)
        {
          w.e("MicroMsg.UploadPackHelper", "share img o.url is null!");
          break;
        }
        paramString1.mCK = "";
        if ((paramInt1 > 0) && (paramInt2 > 0))
        {
          paramPInt = new amp();
          paramPInt.uit = paramInt2;
          paramPInt.uis = paramInt1;
          paramString1.uhD = paramPInt;
        }
        if (!bg.mZ("")) {
          paramString1.fuw = "";
        }
        if (!bg.mZ("")) {
          paramString1.mCK = "";
        }
        localaw.qfI.uyu.tKd.add(paramString1);
        break;
      }
      if (this.qyv == null) {
        break;
      }
      if (this.qBV)
      {
        paramString1 = this.qyv;
        if (paramString1 != null) {
          break label979;
        }
      }
      for (paramInt2 = 0;; paramInt2 = 0)
      {
        if (paramInt2 != 0)
        {
          w.i("MicroMsg.LinkWidget", "isPngThumbData");
          paramString1 = f.aF(this.qyv);
          if ((paramString1 != null) && (paramString1.length > 0))
          {
            w.i("MicroMsg.LinkWidget", "use covert data");
            this.qyv = f.aF(paramString1);
          }
        }
        localaw.a(this.qyv, "", "");
        break;
        if (paramString1.length >= 4) {
          break label991;
        }
      }
      paramInt1 = 1;
      paramInt3 = 0;
      for (;;)
      {
        paramInt2 = paramInt1;
        if (paramInt3 >= 4) {
          break;
        }
        if (paramString1[paramInt3] != new byte[] { -119, 80, 78, 71 }[paramInt3]) {
          paramInt1 = 0;
        }
        paramInt3 += 1;
      }
      localaw.up(0);
      break label287;
      if (parami != null) {
        localaw.dw(parami.token, parami.uih);
      }
      localaw.ak(paramString1);
      if (!bg.mZ(this.appId)) {
        localaw.GX(this.appId);
      }
      if (!bg.mZ(this.appName)) {
        localaw.GY(bg.ap(this.appName, ""));
      }
      if (this.qBW) {
        localaw.uo(5);
      }
      localaw.a(paramakv);
      if ((this.qBX) && (this.qBY != null))
      {
        localaw.GS(this.qBY.mediaTagName);
        localaw.S(this.appId, this.qBY.messageExt, this.qBY.messageAction);
      }
      localaw.GT(paramString2);
      localaw.d(this.qCb, this.qCc, this.fMg, paramInt4, paramInt5);
      parami = this.fMh;
      localaw.qfJ.fMh = parami;
      localaw.ot(this.iFw);
      paramInt1 = this.qCd;
      localaw.qfI.haU = paramInt1;
      paramInt1 = localaw.commit();
      if (this.qyD != null)
      {
        this.qyD.gO(paramInt1);
        e.qkT.b(this.qyD);
      }
      if (this.qCe != null)
      {
        this.qCe.gO(paramInt1);
        com.tencent.mm.plugin.sns.h.f.qkT.b(this.qCe);
        this.qCe.LJ();
      }
      ae.bhl().bgd();
      this.fsU.finish();
      GMTrace.o(8601745752064L, 64088);
      return false;
    }
  }
  
  public final boolean a(int paramInt, Intent paramIntent)
  {
    GMTrace.i(8601879969792L, 64089);
    GMTrace.o(8601879969792L, 64089);
    return false;
  }
  
  public final boolean blb()
  {
    GMTrace.i(8601477316608L, 64086);
    GMTrace.o(8601477316608L, 64086);
    return true;
  }
  
  public final View blc()
  {
    GMTrace.i(8601611534336L, 64087);
    this.jSz = v.fa(this.fsU).inflate(i.g.pPS, null);
    if (!bg.mZ(this.hNh)) {
      this.jSz.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8386326298624L, 62483);
          w.i("MicroMsg.LinkWidget", "adlink url " + aa.this.hNh);
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("rawUrl", aa.this.hNh);
          a.ifM.j(paramAnonymousView, aa.this.fsU);
          GMTrace.o(8386326298624L, 62483);
        }
      });
    }
    this.qyy = ((CdnImageView)this.jSz.findViewById(i.f.pJY));
    this.iin = ((TextView)this.jSz.findViewById(i.f.pNx));
    this.qyz = ((TextView)this.jSz.findViewById(i.f.pKS));
    if ((this.nJR) || (this.qBU))
    {
      this.jSz.findViewById(i.f.state).setVisibility(0);
      if (bg.mZ(this.title)) {
        break label228;
      }
      this.iin.setText(this.title);
      label152:
      if (bg.mZ(this.qyu)) {
        break label245;
      }
      this.qyy.setVisibility(0);
      this.qyy.O(this.qyu, 0, 0);
    }
    for (;;)
    {
      com.tencent.mm.plugin.sns.data.i.b(this.qyy, this.fsU);
      View localView = this.jSz;
      GMTrace.o(8601611534336L, 64087);
      return localView;
      this.jSz.findViewById(i.f.state).setVisibility(8);
      break;
      label228:
      this.iin.setText(av.Ix(this.hNh));
      break label152;
      label245:
      if (!bg.bp(this.qyv))
      {
        this.qyy.setVisibility(0);
        this.hkH = d.bf(this.qyv);
        this.qyy.setImageBitmap(this.hkH);
        this.qBR = true;
      }
      else
      {
        this.qyy.setImageResource(i.i.dlk);
        this.qyy.setVisibility(0);
      }
    }
  }
  
  public final boolean bld()
  {
    GMTrace.i(8602014187520L, 64090);
    if ((this.hkH != null) && (!this.hkH.isRecycled()) && (this.qBR)) {
      this.hkH.recycle();
    }
    GMTrace.o(8602014187520L, 64090);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */