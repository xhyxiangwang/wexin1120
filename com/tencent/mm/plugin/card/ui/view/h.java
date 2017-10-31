package com.tencent.mm.plugin.card.ui.view;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.d.a.a.t;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.a.o;
import com.tencent.mm.plugin.card.a.i.b;
import com.tencent.mm.plugin.card.b.c;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.b.m;
import com.tencent.mm.plugin.card.b.p;
import com.tencent.mm.protocal.c.jf;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.protocal.c.nc;
import com.tencent.mm.ui.MMActivity;

public abstract class h
  implements aa
{
  protected MMActivity jFp;
  protected g kzO;
  
  public h(g paramg, MMActivity paramMMActivity)
  {
    GMTrace.i(18895977054208L, 140786);
    this.kzO = paramg;
    this.jFp = paramMMActivity;
    GMTrace.o(18895977054208L, 140786);
  }
  
  public abstract boolean amc();
  
  public abstract boolean amd();
  
  public void c(ViewGroup paramViewGroup, final com.tencent.mm.plugin.card.base.b paramb)
  {
    GMTrace.i(18896111271936L, 140787);
    Object localObject1;
    Object localObject2;
    if (amc())
    {
      localObject1 = (TextView)paramViewGroup.findViewById(R.h.bvG);
      localObject2 = this.kzO.code;
      if ((!paramb.aiE()) && ((com.tencent.pb.common.c.h.xJ((String)localObject2)) || (((String)localObject2).length() > 40))) {
        break label302;
      }
      ((TextView)localObject1).setText(m.us((String)localObject2));
      if (paramb.aiz())
      {
        ((TextView)localObject1).setVisibility(0);
        ((TextView)localObject1).setOnLongClickListener(new View.OnLongClickListener()
        {
          public final boolean onLongClick(View paramAnonymousView)
          {
            GMTrace.i(18890608345088L, 140746);
            if (paramAnonymousView.getId() == R.h.bvG)
            {
              p.H(h.this.jFp, paramb.aiL().code);
              com.tencent.mm.ui.base.h.bl(h.this.jFp, o.getString(R.l.duV));
            }
            GMTrace.o(18890608345088L, 140746);
            return false;
          }
        });
        this.kzO.d(c.kAJ);
      }
    }
    else
    {
      if (!amd()) {
        break label330;
      }
      localObject1 = (RelativeLayout)paramViewGroup.findViewById(R.h.bvu);
      if ((paramb == null) || (paramb.aiK() == null) || (paramb.aiK().tFA == null)) {
        break label324;
      }
      paramViewGroup.findViewById(R.h.bvs).setVisibility(8);
      ((RelativeLayout)localObject1).setVisibility(0);
      localObject2 = paramb.aiK().tFA;
      TextView localTextView = (TextView)paramViewGroup.findViewById(R.h.bvw);
      localTextView.setText(((nc)localObject2).title);
      String str = paramb.aiK().hbA;
      if (!com.tencent.pb.common.c.h.xJ(str)) {
        localTextView.setTextColor(l.uk(str));
      }
      paramViewGroup = (TextView)paramViewGroup.findViewById(R.h.bvv);
      localObject2 = ((nc)localObject2).knt;
      if (TextUtils.isEmpty((CharSequence)localObject2)) {
        break label311;
      }
      if (paramViewGroup != null)
      {
        paramViewGroup.setText((CharSequence)localObject2);
        paramViewGroup.setVisibility(0);
      }
    }
    for (;;)
    {
      ((RelativeLayout)localObject1).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(18892487393280L, 140760);
          if (paramb.aiD())
          {
            paramAnonymousView = new i.b();
            com.tencent.mm.plugin.card.b.b.a(h.this.kzO.jFp, paramAnonymousView.knf, paramAnonymousView.kng, false, paramb);
          }
          for (;;)
          {
            t.finish();
            GMTrace.o(18892487393280L, 140760);
            return;
            paramAnonymousView = paramb.aiK().tFA;
            if ((paramAnonymousView != null) && (!com.tencent.pb.common.c.h.xJ(paramAnonymousView.tEM)) && (!com.tencent.pb.common.c.h.xJ(paramAnonymousView.tEL)))
            {
              int i;
              if (h.this.jFp.getIntent() != null)
              {
                i = h.this.jFp.getIntent().getIntExtra("key_from_scene", 3);
                label133:
                if (h.this.jFp.getIntent() == null) {
                  break label244;
                }
              }
              label244:
              for (int j = h.this.jFp.getIntent().getIntExtra("key_from_appbrand_type", 0);; j = 0)
              {
                com.tencent.mm.plugin.card.b.b.a(paramb.aiO(), paramAnonymousView, i, j);
                com.tencent.mm.plugin.report.service.g.paX.i(11941, new Object[] { Integer.valueOf(20), paramb.aiO(), paramb.aiP(), "", paramAnonymousView.title });
                break;
                i = 3;
                break label133;
              }
            }
            if ((paramAnonymousView != null) && (!TextUtils.isEmpty(paramAnonymousView.url)))
            {
              String str = l.r(paramAnonymousView.url, paramAnonymousView.tFX);
              com.tencent.mm.plugin.card.b.b.a(h.this.kzO.jFp, str, 1);
              com.tencent.mm.plugin.report.service.g.paX.i(11941, new Object[] { Integer.valueOf(9), paramb.aiO(), paramb.aiP(), "", paramAnonymousView.title });
              if (l.a(paramAnonymousView, paramb.aiO()))
              {
                str = paramb.aiO();
                paramAnonymousView = paramAnonymousView.title;
                l.uq(str);
                com.tencent.mm.plugin.card.b.b.a(h.this.kzO.jFp, paramb.aiK().koD);
              }
            }
          }
        }
      });
      GMTrace.o(18896111271936L, 140787);
      return;
      ((TextView)localObject1).setVisibility(8);
      break;
      label302:
      ((TextView)localObject1).setVisibility(8);
      break;
      label311:
      if (paramViewGroup != null) {
        paramViewGroup.setVisibility(8);
      }
    }
    label324:
    ((RelativeLayout)localObject1).setVisibility(8);
    label330:
    GMTrace.o(18896111271936L, 140787);
  }
  
  public void e(ViewGroup paramViewGroup)
  {
    GMTrace.i(18896648142848L, 140791);
    GMTrace.o(18896648142848L, 140791);
  }
  
  public boolean i(com.tencent.mm.plugin.card.base.b paramb)
  {
    GMTrace.i(18896513925120L, 140790);
    GMTrace.o(18896513925120L, 140790);
    return true;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */