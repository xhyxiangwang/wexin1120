package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.oq;
import com.tencent.mm.g.a.oq.b;
import com.tencent.mm.memory.n;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.h.e;
import com.tencent.mm.plugin.sns.h.g;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.aw;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.akv;
import com.tencent.mm.protocal.c.bes;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.x.o;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class al
  implements z
{
  private String desc;
  public String fBx;
  public String fML;
  public MMActivity fsU;
  public String fwU;
  private boolean fxs;
  public ProgressDialog ilL;
  private View jSz;
  public ProgressBar jUz;
  private boolean qCN;
  private Bitmap qCO;
  private com.tencent.mm.sdk.b.c qCQ;
  aw qCR;
  public com.tencent.mm.plugin.sight.decode.a.a qFr;
  public com.tencent.mm.plugin.sight.decode.ui.c qFs;
  private com.tencent.mm.modelsns.b qyD;
  private int qyx;
  
  public al(MMActivity paramMMActivity)
  {
    GMTrace.i(8590337245184L, 64003);
    this.jSz = null;
    this.fBx = "";
    this.fML = "";
    this.fwU = "";
    this.fxs = false;
    this.qCN = false;
    this.qCO = null;
    this.qFs = null;
    this.qyD = null;
    this.qCQ = new com.tencent.mm.sdk.b.c() {};
    this.qCR = null;
    this.desc = "";
    this.ilL = null;
    this.fsU = paramMMActivity;
    GMTrace.o(8590337245184L, 64003);
  }
  
  public final void D(Bundle paramBundle)
  {
    GMTrace.i(8590471462912L, 64004);
    this.qyD = com.tencent.mm.modelsns.b.q(this.fsU.getIntent());
    this.fBx = this.fsU.getIntent().getStringExtra("KSightThumbPath");
    this.fML = this.fsU.getIntent().getStringExtra("KSightPath");
    this.fwU = this.fsU.getIntent().getStringExtra("sight_md5");
    this.qyx = this.fsU.getIntent().getIntExtra("Ksnsupload_source", 0);
    paramBundle = new oq();
    paramBundle.fMI.type = 2;
    com.tencent.mm.sdk.b.a.uLm.m(paramBundle);
    if (bg.mZ(this.fML))
    {
      this.fML = bg.ap(paramBundle.fMJ.fMO, "");
      w.e("MicroMsg.SightWidget", "videoPath is null %s", new Object[] { this.fML });
    }
    if (bg.mZ(this.fwU)) {}
    for (paramBundle = bg.ap(paramBundle.fMJ.fMM, "");; paramBundle = this.fwU)
    {
      this.fwU = paramBundle;
      w.i("MicroMsg.SightWidget", "oncreate thumb path %s videopath %s md5 %s", new Object[] { this.fBx, this.fML, this.fwU });
      com.tencent.mm.sdk.b.a.uLm.b(this.qCQ);
      GMTrace.o(8590471462912L, 64004);
      return;
    }
  }
  
  public final void E(Bundle paramBundle)
  {
    GMTrace.i(8590605680640L, 64005);
    GMTrace.o(8590605680640L, 64005);
  }
  
  public final boolean a(int paramInt1, int paramInt2, org.a.d.i parami, String paramString1, List<String> paramList1, akv paramakv, int paramInt3, boolean paramBoolean, List<String> paramList2, PInt paramPInt, String paramString2, int paramInt4, int paramInt5)
  {
    GMTrace.i(8591008333824L, 64008);
    if (this.qCR != null)
    {
      GMTrace.o(8591008333824L, 64008);
      return false;
    }
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
      this.qCR.d(null, null, null, paramInt4, paramInt5);
      if (!FileOp.aZ(this.fML)) {
        break;
      }
      blR();
      GMTrace.o(8591008333824L, 64008);
      return true;
      this.qCR.up(0);
    }
    w.i("MicroMsg.SightWidget", "commit file is not exist " + this.fML);
    parami = this.fsU;
    this.fsU.getString(i.j.dxm);
    this.ilL = h.a(parami, this.fsU.getString(i.j.pTH), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(8570070368256L, 63852);
        al.this.qCR = null;
        GMTrace.o(8570070368256L, 63852);
      }
    });
    GMTrace.o(8591008333824L, 64008);
    return true;
  }
  
  public final boolean a(int paramInt, Intent paramIntent)
  {
    GMTrace.i(8591276769280L, 64010);
    GMTrace.o(8591276769280L, 64010);
    return false;
  }
  
  public final void blR()
  {
    GMTrace.i(8591142551552L, 64009);
    if (this.qCN)
    {
      GMTrace.o(8591142551552L, 64009);
      return;
    }
    if (!this.qCR.j(this.fML, this.fBx, this.desc, this.fwU))
    {
      w.i("MicroMsg.SightWidget", "videopath " + FileOp.kI(this.fML) + " thumb: " + FileOp.kI(this.fBx));
      t.makeText(this.fsU, i.j.eFR, 0).show();
      GMTrace.o(8591142551552L, 64009);
      return;
    }
    Object localObject = new oq();
    ((oq)localObject).fMI.type = 0;
    ((oq)localObject).fMI.fMK = true;
    com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
    this.qCN = true;
    int i = this.qCR.commit();
    if (this.qyD != null)
    {
      this.qyD.gO(i);
      e.qkT.b(this.qyD);
    }
    ae.bhv().qEO = 0L;
    localObject = new Intent();
    ((Intent)localObject).putExtra("sns_resume_state", false);
    ((Intent)localObject).putExtra("sns_timeline_NeedFirstLoadint", true);
    ((Intent)localObject).setClass(this.fsU, En_424b8e16.class);
    ((Intent)localObject).addFlags(67108864);
    this.fsU.startActivity((Intent)localObject);
    this.fsU.setResult(-1);
    this.fsU.finish();
    GMTrace.o(8591142551552L, 64009);
  }
  
  public final boolean blb()
  {
    GMTrace.i(8590739898368L, 64006);
    GMTrace.o(8590739898368L, 64006);
    return true;
  }
  
  public final View blc()
  {
    GMTrace.i(8590874116096L, 64007);
    this.jSz = View.inflate(this.fsU, i.g.pPV, null);
    this.qFr = ((com.tencent.mm.plugin.sight.decode.a.a)this.jSz.findViewById(i.f.image));
    this.qFr.tG(com.tencent.mm.bq.a.fromDPToPix(this.fsU, 90));
    this.jUz = ((ProgressBar)this.jSz.findViewById(i.f.bUd));
    Object localObject = new DisplayMetrics();
    this.fsU.getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject);
    this.jSz.findViewById(i.f.bsQ).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8324586143744L, 62023);
        if (!FileOp.aZ(al.this.fML))
        {
          w.i("MicroMsg.SightWidget", "click videopath is not exist " + al.this.fML);
          GMTrace.o(8324586143744L, 62023);
          return;
        }
        if (al.this.qFs != null)
        {
          al.this.qFs.dismiss();
          al.this.qFs = null;
        }
        al.this.qFs = new com.tencent.mm.plugin.sight.decode.ui.c(al.this.fsU);
        paramAnonymousView = al.this.qFs;
        String str1 = al.this.fML;
        String str2 = al.this.fBx;
        paramAnonymousView.hCR = str1;
        paramAnonymousView.imagePath = str2;
        paramAnonymousView = al.this.qFs;
        paramAnonymousView.fPe = 0;
        paramAnonymousView.pBL = 0;
        paramAnonymousView.lRC = 1;
        al.this.qFs.show();
        GMTrace.o(8324586143744L, 62023);
      }
    });
    w.i("MicroMsg.SightWidget", "videoPath " + this.fML + " thumbPath " + this.fBx + " " + FileOp.kI(this.fML) + " " + FileOp.kI(this.fBx));
    if (FileOp.aZ(this.fML))
    {
      this.qFr.an(this.fML, false);
      this.jUz.setVisibility(8);
      w.i("MicroMsg.SightWidget", "videopath exist videopath %s md5 %s", new Object[] { this.fML, this.fwU });
    }
    for (;;)
    {
      localObject = this.jSz;
      GMTrace.o(8590874116096L, 64007);
      return (View)localObject;
      localObject = com.tencent.mm.plugin.sns.data.i.Ge(this.fBx);
      if (localObject != null)
      {
        this.qCO = ((n)localObject).yq();
        if (com.tencent.mm.plugin.sns.data.i.m(this.qCO)) {
          this.qFr.D(this.qCO);
        }
      }
      this.jUz.setVisibility(0);
    }
  }
  
  public final boolean bld()
  {
    GMTrace.i(8591410987008L, 64011);
    if (this.ilL != null) {
      this.ilL.dismiss();
    }
    com.tencent.mm.sdk.b.a.uLm.c(this.qCQ);
    if (com.tencent.mm.plugin.sns.data.i.m(this.qCO)) {
      this.qCO.recycle();
    }
    GMTrace.o(8591410987008L, 64011);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */