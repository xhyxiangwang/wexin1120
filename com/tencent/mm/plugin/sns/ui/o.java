package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.an.n;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.plugin.sns.h.e;
import com.tencent.mm.plugin.sns.h.g;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.av;
import com.tencent.mm.plugin.sns.model.aw;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.akv;
import com.tencent.mm.protocal.c.bes;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.v;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class o
  implements z
{
  private String appId;
  private String appName;
  private String fFg;
  private String fMb;
  private MMActivity fsU;
  private int h;
  private String hNh;
  private Bitmap hkH;
  private TextView iin;
  private View jSz;
  private boolean nJR;
  private int qyA;
  private String qyB;
  private String qyC;
  private com.tencent.mm.modelsns.b qyD;
  private String qyu;
  private byte[] qyv;
  private String qyw;
  private int qyx;
  private CdnImageView qyy;
  private TextView qyz;
  private String title;
  private int w;
  
  public o(MMActivity paramMMActivity)
  {
    GMTrace.i(8617717661696L, 64207);
    this.w = -1;
    this.h = -1;
    this.hNh = "";
    this.title = "";
    this.qyu = "";
    this.qyv = null;
    this.hkH = null;
    this.jSz = null;
    this.qyy = null;
    this.iin = null;
    this.qyz = null;
    this.nJR = false;
    this.qyB = "";
    this.qyC = "";
    this.appName = "";
    this.appId = "";
    this.fFg = "";
    this.qyD = null;
    this.fsU = paramMMActivity;
    GMTrace.o(8617717661696L, 64207);
  }
  
  public final void D(Bundle paramBundle)
  {
    GMTrace.i(8617851879424L, 64208);
    this.qyD = com.tencent.mm.modelsns.b.q(this.fsU.getIntent());
    this.w = this.fsU.getIntent().getIntExtra("Ksnsupload_width", -1);
    this.h = this.fsU.getIntent().getIntExtra("Ksnsupload_height", -1);
    this.qyx = this.fsU.getIntent().getIntExtra("Ksnsupload_source", 0);
    this.hNh = bg.ap(this.fsU.getIntent().getStringExtra("Ksnsupload_link"), "");
    this.title = bg.ap(this.fsU.getIntent().getStringExtra("Ksnsupload_title"), "");
    this.qyu = bg.ap(this.fsU.getIntent().getStringExtra("Ksnsupload_imgurl"), "");
    this.fFg = this.fsU.getIntent().getStringExtra("KsnsUpload_imgPath");
    this.nJR = this.fsU.getIntent().getBooleanExtra("ksnsis_video", false);
    this.fMb = bg.ap(this.fsU.getIntent().getStringExtra("src_username"), "");
    this.qyw = bg.ap(this.fsU.getIntent().getStringExtra("src_displayname"), "");
    this.qyC = bg.ap(this.fsU.getIntent().getStringExtra("KContentObjDesc"), "");
    this.qyB = bg.ap(this.fsU.getIntent().getStringExtra("KUploadProduct_UserData"), "");
    this.appName = bg.ap(this.fsU.getIntent().getStringExtra("Ksnsupload_appname"), "");
    this.appId = bg.ap(this.fsU.getIntent().getStringExtra("Ksnsupload_appid"), "");
    this.qyA = this.fsU.getIntent().getIntExtra("KUploadProduct_subType", 0);
    GMTrace.o(8617851879424L, 64208);
  }
  
  public final void E(Bundle paramBundle)
  {
    GMTrace.i(8617986097152L, 64209);
    GMTrace.o(8617986097152L, 64209);
  }
  
  public final boolean a(int paramInt1, int paramInt2, org.a.d.i parami, String paramString1, List<String> paramList1, akv paramakv, int paramInt3, boolean paramBoolean, List<String> paramList2, PInt paramPInt, String paramString2, int paramInt4, int paramInt5)
  {
    GMTrace.i(8618388750336L, 64212);
    paramString2 = new aw(23);
    paramPInt.value = paramString2.jOR;
    if (paramInt3 > a.pXZ) {
      paramString2.uk(2);
    }
    if (parami != null) {
      paramString2.dw(parami.token, parami.uih);
    }
    paramString2.GW(this.title).GU(this.qyC).GV(this.hNh).GR(paramString1);
    boolean bool2 = false;
    boolean bool1;
    if (!bg.mZ(this.fFg))
    {
      bool1 = paramString2.a(FileOp.c(this.fFg, 0, -1), this.qyC, this.title, this.qyA, this.qyB);
      bool2 = bool1;
      if (!bool1)
      {
        w.i("MicroMsg.EmotionListShareWidget", "set userData user imgurl ");
        bool2 = paramString2.a(this.qyu, this.qyu, this.qyC, this.qyA, this.qyB);
      }
      if (!bool2) {
        w.e("MicroMsg.EmotionListShareWidget", "set userData faild");
      }
      paramString2.uo(this.qyx);
      paramString2.GZ(this.fMb);
      paramString2.Ha(this.qyw);
      if (!paramBoolean) {
        break label440;
      }
      paramString2.up(1);
    }
    for (;;)
    {
      paramString2.bq(paramList2);
      if (!bg.mZ(this.appId))
      {
        paramString2.GX(this.appId);
        paramString2.GY(this.appName);
      }
      parami = new LinkedList();
      if (paramList1 == null) {
        break label450;
      }
      new LinkedList();
      paramString1 = com.tencent.mm.x.o.Au();
      paramList1 = paramList1.iterator();
      while (paramList1.hasNext())
      {
        paramList2 = (String)paramList1.next();
        if (!paramString1.contains(paramList2))
        {
          paramPInt = new bes();
          paramPInt.jWW = paramList2;
          parami.add(paramPInt);
        }
      }
      bool1 = bool2;
      if (bg.mZ(this.qyu)) {
        break;
      }
      bool1 = bool2;
      if (n.IV() == null) {
        break;
      }
      n.IV();
      parami = com.tencent.mm.an.b.hm(this.qyu);
      bool1 = bool2;
      if (parami == null) {
        break;
      }
      bool1 = paramString2.a(d.Q(parami), this.qyC, this.title, this.qyA, this.qyB);
      break;
      label440:
      paramString2.up(0);
    }
    label450:
    paramString2.ak(parami);
    paramString2.a(paramakv);
    paramString2.d(null, null, null, paramInt4, paramInt5);
    paramInt1 = paramString2.commit();
    if (this.qyD != null)
    {
      this.qyD.gO(paramInt1);
      e.qkT.b(this.qyD);
    }
    ae.bhl().bgd();
    this.fsU.finish();
    GMTrace.o(8618388750336L, 64212);
    return false;
  }
  
  public final boolean a(int paramInt, Intent paramIntent)
  {
    GMTrace.i(8618522968064L, 64213);
    GMTrace.o(8618522968064L, 64213);
    return false;
  }
  
  public final boolean blb()
  {
    GMTrace.i(8618120314880L, 64210);
    GMTrace.o(8618120314880L, 64210);
    return true;
  }
  
  public final View blc()
  {
    GMTrace.i(8618254532608L, 64211);
    this.jSz = v.fa(this.fsU).inflate(i.g.pPS, null);
    this.qyy = ((CdnImageView)this.jSz.findViewById(i.f.pJY));
    this.iin = ((TextView)this.jSz.findViewById(i.f.pNx));
    this.qyz = ((TextView)this.jSz.findViewById(i.f.pKS));
    if (this.nJR)
    {
      this.jSz.findViewById(i.f.state).setVisibility(0);
      this.iin.setText(this.title);
      if (bg.mZ(this.qyu)) {
        break label186;
      }
      this.qyy.setVisibility(0);
      this.qyy.O(this.qyu, 0, 0);
    }
    for (;;)
    {
      com.tencent.mm.plugin.sns.data.i.b(this.qyy, this.fsU);
      View localView = this.jSz;
      GMTrace.o(8618254532608L, 64211);
      return localView;
      this.jSz.findViewById(i.f.state).setVisibility(8);
      break;
      label186:
      if (!bg.bp(this.qyv))
      {
        this.qyy.setVisibility(0);
        this.hkH = d.bf(this.qyv);
        this.qyy.setImageBitmap(this.hkH);
      }
      else
      {
        this.qyy.setVisibility(8);
      }
    }
  }
  
  public final boolean bld()
  {
    GMTrace.i(8618657185792L, 64214);
    if ((this.hkH != null) && (!this.hkH.isRecycled())) {
      this.hkH.recycle();
    }
    GMTrace.o(8618657185792L, 64214);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */