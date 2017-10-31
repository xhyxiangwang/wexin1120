package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.jg;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMusicObject;
import com.tencent.mm.plugin.sns.h.e;
import com.tencent.mm.plugin.sns.h.g;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.model.av;
import com.tencent.mm.plugin.sns.model.aw;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.akv;
import com.tencent.mm.protocal.c.aol;
import com.tencent.mm.protocal.c.bes;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.v;
import com.tencent.mm.x.o;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ac
  implements z
{
  private String appName;
  public String fKY;
  MMActivity fsU;
  private c iSb;
  private TextView iin;
  private View jSz;
  public boolean kKg;
  public String mediaId;
  private boolean qBW;
  private boolean qBX;
  public WXMediaMessage qBY;
  public ImageView qCJ;
  private Bitmap qCK;
  private com.tencent.mm.modelsns.b qyD;
  private int qyx;
  private CdnImageView qyy;
  private TextView qyz;
  
  public ac(MMActivity paramMMActivity)
  {
    GMTrace.i(8336665739264L, 62113);
    this.qBY = null;
    this.qyy = null;
    this.iin = null;
    this.qyz = null;
    this.fKY = "";
    this.appName = "";
    this.qBW = false;
    this.qBX = false;
    this.kKg = false;
    this.qyD = null;
    this.iSb = new c() {};
    this.fsU = paramMMActivity;
    com.tencent.mm.sdk.b.a.uLm.b(this.iSb);
    GMTrace.o(8336665739264L, 62113);
  }
  
  public final void D(Bundle paramBundle)
  {
    GMTrace.i(8336799956992L, 62114);
    this.qBY = new SendMessageToWX.Req(this.fsU.getIntent().getBundleExtra("Ksnsupload_timeline")).message;
    this.mediaId = this.fsU.getIntent().getStringExtra("Ksnsupload_musicid");
    this.qyD = com.tencent.mm.modelsns.b.q(this.fsU.getIntent());
    this.fKY = bg.ap(this.fsU.getIntent().getStringExtra("Ksnsupload_appid"), "");
    this.appName = bg.ap(this.fsU.getIntent().getStringExtra("Ksnsupload_appname"), "");
    this.qBW = this.fsU.getIntent().getBooleanExtra("KThrid_app", false);
    this.qBX = this.fsU.getIntent().getBooleanExtra("KSnsAction", false);
    this.qyx = this.fsU.getIntent().getIntExtra("Ksnsupload_source", 0);
    GMTrace.o(8336799956992L, 62114);
  }
  
  public final void E(Bundle paramBundle)
  {
    GMTrace.i(8336934174720L, 62115);
    GMTrace.o(8336934174720L, 62115);
  }
  
  public final boolean a(int paramInt1, int paramInt2, org.a.d.i parami, String paramString1, List<String> paramList1, akv paramakv, int paramInt3, boolean paramBoolean, List<String> paramList2, PInt paramPInt, String paramString2, int paramInt4, int paramInt5)
  {
    GMTrace.i(8337471045632L, 62119);
    com.tencent.mm.plugin.sns.model.ae.bhl();
    paramString1 = av.a(this.qBY, paramString1, this.fKY, this.appName);
    if (paramString1 == null)
    {
      w.e("MicroMsg.MusicWidget", "packHelper == null, %s, %s", new Object[] { this.fKY, this.appName });
      GMTrace.o(8337471045632L, 62119);
      return false;
    }
    paramPInt.value = paramString1.jOR;
    if (paramInt3 > com.tencent.mm.plugin.sns.c.a.pXZ) {
      paramString1.uk(4);
    }
    paramString1.uo(this.qyx);
    if (this.qBW) {
      paramString1.uo(5);
    }
    paramPInt = new LinkedList();
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
          paramPInt.add(localbes);
        }
      }
    }
    paramString1.ak(paramPInt);
    if (parami != null) {
      paramString1.dw(parami.token, parami.uih);
    }
    paramString1.a(paramakv);
    if (paramBoolean) {
      paramString1.up(1);
    }
    for (;;)
    {
      paramString1.bq(paramList2);
      paramString1.d(null, null, null, paramInt4, paramInt5);
      if ((this.qBX) && (this.qBY != null))
      {
        paramString1.GS(this.qBY.mediaTagName);
        paramString1.S(this.fKY, this.qBY.messageExt, this.qBY.messageAction);
      }
      paramInt1 = paramString1.commit();
      if (this.qyD != null)
      {
        this.qyD.gO(paramInt1);
        e.qkT.b(this.qyD);
      }
      com.tencent.mm.plugin.sns.model.ae.bhl().bgd();
      this.fsU.finish();
      GMTrace.o(8337471045632L, 62119);
      return false;
      paramString1.up(0);
    }
  }
  
  public final boolean a(int paramInt, Intent paramIntent)
  {
    GMTrace.i(8337605263360L, 62120);
    GMTrace.o(8337605263360L, 62120);
    return false;
  }
  
  public final void blQ()
  {
    GMTrace.i(8337202610176L, 62117);
    new com.tencent.mm.sdk.platformtools.ae(this.fsU.getMainLooper()).post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8736903004160L, 65095);
        com.tencent.mm.as.b.JL();
        ac.this.kKg = false;
        GMTrace.o(8736903004160L, 65095);
      }
    });
    GMTrace.o(8337202610176L, 62117);
  }
  
  public final boolean blb()
  {
    GMTrace.i(8337068392448L, 62116);
    GMTrace.o(8337068392448L, 62116);
    return true;
  }
  
  public final View blc()
  {
    GMTrace.i(8337336827904L, 62118);
    this.jSz = v.fa(this.fsU).inflate(i.g.pPT, null);
    this.qyy = ((CdnImageView)this.jSz.findViewById(i.f.pJY));
    this.iin = ((TextView)this.jSz.findViewById(i.f.pNx));
    this.qyz = ((TextView)this.jSz.findViewById(i.f.pKS));
    this.jSz.findViewById(i.f.state).setVisibility(8);
    this.iin.setText(this.qBY.title);
    if (this.qBY.thumbData != null) {
      this.qCK = d.bf(this.qBY.thumbData);
    }
    this.qyy.setImageBitmap(this.qCK);
    if (!bg.mZ(this.qBY.description))
    {
      this.qyz.setText(this.qBY.description);
      this.qyz.setVisibility(0);
      this.qCJ = ((ImageView)this.jSz.findViewById(i.f.state));
      this.qCJ.setVisibility(0);
      if ((!com.tencent.mm.as.b.JN()) || (!this.kKg)) {
        break label279;
      }
      this.qCJ.setImageResource(i.e.baP);
    }
    for (;;)
    {
      this.qCJ.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8710998982656L, 64902);
          if (com.tencent.mm.as.b.JN())
          {
            ac.this.blQ();
            GMTrace.o(8710998982656L, 64902);
            return;
          }
          paramAnonymousView = ac.this;
          if (paramAnonymousView.qBY == null)
          {
            w.w("MicroMsg.MusicWidget", "doBeingPlayMusic: but item is null");
            GMTrace.o(8710998982656L, 64902);
            return;
          }
          new com.tencent.mm.sdk.platformtools.ae(paramAnonymousView.fsU.getMainLooper()).post(new ac.3(paramAnonymousView));
          GMTrace.o(8710998982656L, 64902);
        }
      });
      com.tencent.mm.plugin.sns.data.i.b(this.qyy, this.fsU);
      View localView = this.jSz;
      GMTrace.o(8337336827904L, 62118);
      return localView;
      this.qyz.setVisibility(8);
      break;
      label279:
      this.qCJ.setImageResource(i.e.baQ);
    }
  }
  
  public final boolean bld()
  {
    GMTrace.i(8337739481088L, 62121);
    if ((this.qCK != null) && (!this.qCK.isRecycled())) {
      this.qCK.recycle();
    }
    com.tencent.mm.sdk.b.a.uLm.c(this.iSb);
    if ((com.tencent.mm.as.b.JN()) && (this.kKg)) {
      blQ();
    }
    boolean bool = com.tencent.mm.as.b.JN();
    GMTrace.o(8337739481088L, 62121);
    return bool;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */