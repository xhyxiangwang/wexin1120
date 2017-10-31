package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bq.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.plugin.sns.model.al.a;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.protocal.c.bdk;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ab;

public final class s
  extends LinearLayout
  implements v
{
  private Context context;
  private boolean fAk;
  int fAl;
  private String fAx;
  private String gCs;
  private int kxh;
  b qBf;
  private com.tencent.mm.plugin.sns.storage.m qBg;
  a qBh;
  private View.OnTouchListener qBi;
  private boolean qBj;
  
  public s(final Context paramContext, int paramInt, boolean paramBoolean)
  {
    super(paramContext);
    GMTrace.i(8447798018048L, 62941);
    this.qBf = new b();
    this.qBg = null;
    this.kxh = 0;
    this.fAx = "";
    this.fAk = false;
    this.qBi = bg.bOc();
    this.gCs = "";
    this.qBj = true;
    this.kxh = paramInt;
    this.fAk = paramBoolean;
    this.context = paramContext;
    if (this.kxh != -1)
    {
      this.gCs = com.tencent.mm.x.m.zF();
      View localView = LayoutInflater.from(paramContext).inflate(i.g.pOO, this, true);
      this.qBf.qBm = ((LinearLayout)localView.findViewById(i.f.pNp));
      this.qBf.qBw = ((LinearLayout)localView.findViewById(i.f.pNG));
      this.qBf.qBp = ((LinearLayout)localView.findViewById(i.f.pKp));
      this.qBf.qBp.setOnTouchListener(this.qBi);
      this.qBf.qBq = ((ImageView)localView.findViewById(i.f.pKe));
      this.qBf.qBr = ((LinearLayout)localView.findViewById(i.f.pJo));
      this.qBf.qBr.setOnTouchListener(this.qBi);
      this.qBf.qBs = ((LinearLayout)localView.findViewById(i.f.pJt));
      this.qBf.qBu = ((TextView)localView.findViewById(i.f.pLN));
      this.qBf.qBv = ((TextView)localView.findViewById(i.f.pLO));
      this.qBf.qBt = ((TextView)localView.findViewById(i.f.pJU));
      this.qBf.qBn = ((TextView)localView.findViewById(i.f.pLb));
      this.qBf.qBo = ((LinearLayout)localView.findViewById(i.f.pLc));
      this.qBf.neZ = ((TextView)localView.findViewById(i.f.pLY));
      this.qBf.neZ.setTextSize(1, this.qBf.neZ.getTextSize() * ab.dZ(paramContext) / a.getDensity(this.qBf.neZ.getContext()));
      this.qBf.qBA = ((LinearLayout)localView.findViewById(i.f.pKh));
      ((LinearLayout)localView.findViewById(i.f.pKh)).getBackground().setAlpha(50);
      this.qBf.iil = ((ImageView)localView.findViewById(i.f.pJf));
      this.qBf.qBx = ((ImageView)localView.findViewById(i.f.pKy));
      this.qBf.qBy = ((ImageView)localView.findViewById(i.f.pJL));
      this.qBf.qBz = ((LinearLayout)localView.findViewById(i.f.pJx));
      this.qBf.qBB = ((TextView)localView.findViewById(i.f.pJy));
      if (this.kxh != 2) {
        break label663;
      }
      this.qBf.qBw.setVisibility(8);
      this.qBf.qBz.setVisibility(8);
      this.qBf.qBo.setVisibility(0);
    }
    for (;;)
    {
      this.qBf.qBp.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8560675127296L, 63782);
          if (s.a(s.this) == null)
          {
            GMTrace.o(8560675127296L, 63782);
            return;
          }
          if (s.a(s.this).field_likeFlag == 0) {
            if (s.a(s.this).bkf())
            {
              al.a.a(s.a(s.this), 1, "", "", s.b(s.this));
              s.a(s.this).field_likeFlag = 1;
              com.tencent.mm.plugin.sns.model.ae.bhp().z(s.a(s.this));
              label101:
              if (s.a(s.this).field_snsId != 0L) {
                break label279;
              }
            }
          }
          label279:
          for (paramAnonymousView = "";; paramAnonymousView = i.jdMethod_do(s.a(s.this).field_snsId))
          {
            g.paX.i(11989, new Object[] { Integer.valueOf(1), paramAnonymousView, Integer.valueOf(0) });
            new com.tencent.mm.sdk.platformtools.ae().postDelayed(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(8390487048192L, 62514);
                s.this.refresh();
                GMTrace.o(8390487048192L, 62514);
              }
            }, 500L);
            GMTrace.o(8560675127296L, 63782);
            return;
            al.a.a(s.a(s.this).field_userName, 5, "", s.a(s.this), s.b(s.this));
            break;
            s.a(s.this).field_likeFlag = 0;
            com.tencent.mm.plugin.sns.model.ae.bhp().z(s.a(s.this));
            al.a.GI(s.a(s.this).bjM());
            s.a(s.this, com.tencent.mm.plugin.sns.model.ae.bhp().dP(s.a(s.this).field_snsId));
            break label101;
          }
        }
      });
      this.qBf.qBr.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8315861991424L, 61958);
          w.d("MicroMsg.GalleryFooter", "comment cmd");
          if (s.a(s.this) == null)
          {
            GMTrace.o(8315861991424L, 61958);
            return;
          }
          int i = s.a(s.this).quQ;
          Intent localIntent = new Intent();
          localIntent.putExtra("sns_comment_localId", i);
          localIntent.putExtra("sns_source", s.b(s.this));
          localIntent.setClass(paramContext, SnsCommentUI.class);
          if (s.a(s.this).field_snsId == 0L) {}
          for (paramAnonymousView = "";; paramAnonymousView = i.jdMethod_do(s.a(s.this).field_snsId))
          {
            g.paX.i(11989, new Object[] { Integer.valueOf(2), paramAnonymousView, Integer.valueOf(0) });
            paramContext.startActivity(localIntent);
            GMTrace.o(8315861991424L, 61958);
            return;
          }
        }
      });
      this.qBf.qBs.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8744150761472L, 65149);
          if (s.a(s.this) == null)
          {
            GMTrace.o(8744150761472L, 65149);
            return;
          }
          if (s.a(s.this).field_snsId == 0L) {}
          for (paramAnonymousView = "";; paramAnonymousView = i.jdMethod_do(s.a(s.this).field_snsId))
          {
            g.paX.i(11989, new Object[] { Integer.valueOf(3), paramAnonymousView, Integer.valueOf(0) });
            int i = s.a(s.this).quQ;
            paramAnonymousView = new Intent();
            paramAnonymousView.setClass(paramContext, SnsCommentDetailUI.class);
            paramAnonymousView.putExtra("INTENT_TALKER", s.a(s.this).field_userName);
            paramAnonymousView.putExtra("INTENT_SNS_LOCAL_ID", u.W("sns_table_", i));
            paramAnonymousView.putExtra("INTENT_FROMGALLERY", true);
            ((MMActivity)paramContext).startActivityForResult(paramAnonymousView, 1);
            GMTrace.o(8744150761472L, 65149);
            return;
          }
        }
      });
      this.qBf.qBn.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8615704395776L, 64192);
          if (s.c(s.this) != null) {
            s.c(s.this).bkN();
          }
          GMTrace.o(8615704395776L, 64192);
        }
      });
      this.qBf.qBB.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8336531521536L, 62112);
          GMTrace.o(8336531521536L, 62112);
        }
      });
      GMTrace.o(8447798018048L, 62941);
      return;
      label663:
      if (this.kxh == 3)
      {
        this.qBf.qBw.setVisibility(8);
        this.qBf.qBo.setVisibility(8);
        this.qBf.qBz.setVisibility(0);
      }
      else
      {
        this.qBf.qBw.setVisibility(0);
        this.qBf.qBo.setVisibility(8);
        this.qBf.qBz.setVisibility(8);
      }
    }
  }
  
  public final void Id(String paramString)
  {
    GMTrace.i(8448066453504L, 62943);
    this.fAx = paramString;
    refresh();
    GMTrace.o(8448066453504L, 62943);
  }
  
  public final void refresh()
  {
    GMTrace.i(8447932235776L, 62942);
    if (this.kxh == -1)
    {
      GMTrace.o(8447932235776L, 62942);
      return;
    }
    this.qBg = com.tencent.mm.plugin.sns.model.ae.bhp().HA(this.fAx);
    if ((bg.mZ(this.fAx)) || (this.qBg == null))
    {
      GMTrace.o(8447932235776L, 62942);
      return;
    }
    this.qBf.qBy.setVisibility(8);
    if (ai.F(this.qBg.field_localPrivate, this.fAk))
    {
      this.qBf.qBr.setVisibility(8);
      this.qBf.qBp.setVisibility(8);
      localObject = ai.n(this.qBg);
      if (localObject != null)
      {
        if (this.qBg.bkf())
        {
          int i = ((bdk)localObject).uvj;
          if (i <= 0) {
            break label522;
          }
          this.qBf.qBv.setText(String.valueOf(i));
          this.qBf.qBv.setVisibility(0);
          label177:
          int j = ((bdk)localObject).uvg;
          if (j <= 0) {
            break label537;
          }
          this.qBf.qBu.setText(String.valueOf(j));
          this.qBf.qBu.setVisibility(0);
          label211:
          w.d("MicroMsg.GalleryFooter", "commentCount " + i + " " + j);
          if (this.qBg.field_likeFlag != 1) {
            break label552;
          }
          localObject = getResources().getString(i.j.pSw);
          this.qBf.qBt.setText((CharSequence)localObject);
          this.qBf.qBq.setImageResource(i.i.pQi);
        }
        label290:
        if ((this.gCs.equals(this.qBg.field_userName)) || (!this.fAk)) {
          break label590;
        }
        this.qBf.iil.setVisibility(0);
        a.b.a(this.qBf.iil, this.qBg.field_userName);
      }
    }
    for (;;)
    {
      if (this.qBg.bjL() != null) {
        break label605;
      }
      this.qBf.neZ.setVisibility(8);
      GMTrace.o(8447932235776L, 62942);
      return;
      if (!this.qBg.bkf())
      {
        this.qBf.qBA.setVisibility(0);
        this.qBf.qBw.setVisibility(0);
        this.qBf.qBm.setVisibility(8);
        this.qBf.qBs.setVisibility(8);
        this.qBf.qBr.setVisibility(8);
        this.qBf.qBp.setVisibility(8);
        break;
      }
      if (this.qBj) {
        this.qBf.qBm.setVisibility(0);
      }
      this.qBf.qBs.setVisibility(0);
      this.qBf.qBr.setVisibility(0);
      this.qBf.qBp.setVisibility(0);
      this.qBf.qBw.setVisibility(0);
      break;
      label522:
      this.qBf.qBv.setVisibility(8);
      break label177;
      label537:
      this.qBf.qBu.setVisibility(8);
      break label211;
      label552:
      localObject = getResources().getString(i.j.pSx);
      this.qBf.qBt.setText((CharSequence)localObject);
      this.qBf.qBq.setImageResource(i.i.pQj);
      break label290;
      label590:
      this.qBf.iil.setVisibility(8);
    }
    label605:
    Object localObject = this.qBg.bjL().uyr;
    if ((localObject == null) || (((String)localObject).equals("")))
    {
      this.qBf.neZ.setText("");
      this.qBf.neZ.setVisibility(8);
      if (!ai.F(this.qBg.field_localPrivate, this.fAk)) {
        break label813;
      }
      this.qBf.qBx.setVisibility(0);
      this.qBf.neZ.setVisibility(0);
    }
    for (;;)
    {
      if ((this.fAk) && (this.qBg.bki()))
      {
        this.qBf.qBs.setVisibility(0);
        this.qBf.neZ.setVisibility(0);
        this.qBf.qBy.setVisibility(0);
      }
      GMTrace.o(8447932235776L, 62942);
      return;
      this.qBf.neZ.setText(h.b(getContext(), (String)localObject + " ", this.qBf.neZ.getTextSize()));
      this.qBf.neZ.setVisibility(0);
      break;
      label813:
      this.qBf.qBx.setVisibility(8);
    }
  }
  
  public final void setVisibility(int paramInt)
  {
    boolean bool = false;
    GMTrace.i(8447663800320L, 62940);
    if ((this.kxh == 2) || (this.kxh == 3))
    {
      super.setVisibility(paramInt);
      if (paramInt == 8) {}
      for (;;)
      {
        this.qBj = bool;
        GMTrace.o(8447663800320L, 62940);
        return;
        bool = true;
      }
    }
    if ((this.qBg != null) && (!this.qBg.bkf()))
    {
      GMTrace.o(8447663800320L, 62940);
      return;
    }
    if (paramInt == 8)
    {
      this.qBf.qBm.setVisibility(8);
      this.qBj = false;
      GMTrace.o(8447663800320L, 62940);
      return;
    }
    if (paramInt == 0)
    {
      this.qBf.qBm.setVisibility(0);
      this.qBj = true;
    }
    GMTrace.o(8447663800320L, 62940);
  }
  
  public static abstract interface a
  {
    public abstract void bkN();
  }
  
  final class b
  {
    ImageView iil;
    TextView neZ;
    LinearLayout qBA;
    TextView qBB;
    LinearLayout qBm;
    TextView qBn;
    LinearLayout qBo;
    LinearLayout qBp;
    ImageView qBq;
    LinearLayout qBr;
    LinearLayout qBs;
    TextView qBt;
    TextView qBu;
    TextView qBv;
    LinearLayout qBw;
    ImageView qBx;
    ImageView qBy;
    LinearLayout qBz;
    
    b()
    {
      GMTrace.i(8354516697088L, 62246);
      GMTrace.o(8354516697088L, 62246);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */