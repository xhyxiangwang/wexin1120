package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.as.b;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMSlideDelView;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.d;
import com.tencent.mm.ui.base.MMSlideDelView.e;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.o;
import com.tencent.mm.ui.o.a;
import com.tencent.mm.x.ap;

final class a
  extends o<ae>
  implements m.b
{
  private final MMActivity fsU;
  protected MMSlideDelView.f kfL;
  protected MMSlideDelView.c kfM;
  protected MMSlideDelView.e kfN;
  protected MMSlideDelView.d kfO;
  
  public a(Context paramContext, o.a parama)
  {
    super(paramContext, new ae());
    GMTrace.i(7631217360896L, 56857);
    this.kfO = MMSlideDelView.bXl();
    this.voo = parama;
    this.fsU = ((MMActivity)paramContext);
    GMTrace.o(7631217360896L, 56857);
  }
  
  private static int tj(String paramString)
  {
    int j = 1;
    GMTrace.i(7632559538176L, 56867);
    int i = j;
    if (paramString != null)
    {
      i = j;
      if (paramString.length() <= 0) {}
    }
    try
    {
      i = Integer.valueOf(paramString).intValue();
      GMTrace.o(7632559538176L, 56867);
      return i;
    }
    catch (NumberFormatException paramString)
    {
      for (;;)
      {
        i = j;
      }
    }
  }
  
  final String A(x paramx)
  {
    GMTrace.i(7632425320448L, 56866);
    paramx = com.tencent.mm.plugin.bottle.a.c.a(this.fsU, paramx);
    GMTrace.o(7632425320448L, 56866);
    return paramx;
  }
  
  public final void QA()
  {
    GMTrace.i(7631351578624L, 56858);
    ap.AS();
    setCursor(com.tencent.mm.x.c.yQ().bQm());
    if (this.voo != null) {
      this.voo.Qx();
    }
    super.notifyDataSetChanged();
    GMTrace.o(7631351578624L, 56858);
  }
  
  protected final void QB()
  {
    GMTrace.i(7632693755904L, 56868);
    QA();
    GMTrace.o(7632693755904L, 56868);
  }
  
  public final void a(MMSlideDelView.c paramc)
  {
    GMTrace.i(7631888449536L, 56862);
    this.kfM = paramc;
    GMTrace.o(7631888449536L, 56862);
  }
  
  public final void a(MMSlideDelView.e parame)
  {
    GMTrace.i(7631754231808L, 56861);
    this.kfN = parame;
    GMTrace.o(7631754231808L, 56861);
  }
  
  public final void a(MMSlideDelView.f paramf)
  {
    GMTrace.i(7631620014080L, 56860);
    this.kfL = paramf;
    GMTrace.o(7631620014080L, 56860);
  }
  
  public final int getItemViewType(int paramInt)
  {
    GMTrace.i(7632022667264L, 56863);
    GMTrace.o(7632022667264L, 56863);
    return 0;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(7632291102720L, 56865);
    ae localae = (ae)getItem(paramInt);
    Object localObject;
    label272:
    label494:
    label515:
    int i;
    int j;
    int k;
    if (paramView == null)
    {
      paramViewGroup = new a();
      paramView = (MMSlideDelView)View.inflate(this.fsU, R.i.cNf, null);
      localObject = View.inflate(this.fsU, R.i.dgY, null);
      paramViewGroup.iiL = ((ImageView)((View)localObject).findViewById(R.h.bjt));
      paramViewGroup.kfQ = ((TextView)((View)localObject).findViewById(R.h.cgr));
      paramViewGroup.kfR = ((TextView)((View)localObject).findViewById(R.h.cDm));
      paramViewGroup.kfS = ((TextView)((View)localObject).findViewById(R.h.bSO));
      paramViewGroup.kfT = ((ImageView)((View)localObject).findViewById(R.h.cyV));
      paramViewGroup.kfU = ((TextView)((View)localObject).findViewById(R.h.cBn));
      paramViewGroup.kfV = paramView.findViewById(R.h.cyo);
      paramViewGroup.kfW = ((TextView)paramView.findViewById(R.h.cyp));
      paramView.setView((View)localObject);
      paramView.kfL = this.kfL;
      paramView.kfM = this.kfM;
      paramView.kfO = this.kfO;
      paramView.mai = false;
      paramView.setTag(paramViewGroup);
      ap.AS();
      localObject = com.tencent.mm.x.c.yL().SL(localae.field_username);
      paramViewGroup.kfQ.setText(A((x)localObject));
      TextView localTextView = paramViewGroup.kfR;
      if (localae.field_status != 1) {
        break label641;
      }
      localObject = this.fsU.getString(R.l.enr);
      localTextView.setText((CharSequence)localObject);
      a.b.a(paramViewGroup.iiL, x.SA(localae.field_username));
      ap.AS();
      localObject = com.tencent.mm.x.c.yQ().pE().a(localae.field_isSend, localae.field_username, localae.field_content, tj(localae.field_msgType), this.fsU);
      paramViewGroup.kfS.setText(h.b(this.fsU, (CharSequence)localObject, paramViewGroup.kfS.getTextSize()));
      paramViewGroup.kfS.setTextColor(com.tencent.mm.bq.a.T(this.fsU, R.e.aPw));
      if ((tj(localae.field_msgType) == 34) && (localae.field_isSend == 0) && (!bg.mZ(localae.field_content)) && (!new com.tencent.mm.modelvoice.n(localae.field_content).hUs)) {
        paramViewGroup.kfS.setTextColor(com.tencent.mm.bq.a.T(this.fsU, R.e.aPx));
      }
      switch (localae.field_status)
      {
      case 3: 
      case 4: 
      default: 
        paramInt = -1;
        if (paramInt != -1)
        {
          paramViewGroup.kfT.setBackgroundResource(paramInt);
          paramViewGroup.kfT.setVisibility(0);
          paramViewGroup.kfV.setTag(localae.field_username);
          paramViewGroup.kfV.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(7633633280000L, 56875);
              w.v("MicroMsg.BottleConversationAdapter", "on delView clicked");
              a.this.kfO.aIn();
              if (a.this.kfN != null) {
                a.this.kfN.aU(paramAnonymousView.getTag());
              }
              GMTrace.o(7633633280000L, 56875);
            }
          });
          paramInt = paramView.getPaddingBottom();
          i = paramView.getPaddingTop();
          j = paramView.getPaddingRight();
          k = paramView.getPaddingLeft();
          if (localae.field_unReadCount <= 100) {
            break label695;
          }
          paramViewGroup.kfU.setText("...");
          paramViewGroup.kfU.setVisibility(0);
          w.v("MicroMsg.BottleConversationAdapter", "has unread 100");
        }
        break;
      }
    }
    for (;;)
    {
      paramView.setBackgroundResource(R.g.baE);
      paramView.setPadding(k, i, j, paramInt);
      GMTrace.o(7632291102720L, 56865);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label641:
      localObject = com.tencent.mm.pluginsdk.i.n.c(this.fsU, localae.field_conversationTime, true);
      break label272;
      paramInt = -1;
      break label494;
      paramInt = R.k.dpb;
      break label494;
      paramInt = -1;
      break label494;
      paramInt = R.k.dpa;
      break label494;
      paramViewGroup.kfT.setVisibility(8);
      break label515;
      label695:
      if (localae.field_unReadCount > 0)
      {
        paramViewGroup.kfU.setText(localae.field_unReadCount);
        paramViewGroup.kfU.setVisibility(0);
        w.v("MicroMsg.BottleConversationAdapter", "has unread");
      }
      else
      {
        paramViewGroup.kfU.setVisibility(4);
        w.v("MicroMsg.BottleConversationAdapter", "no unread");
      }
    }
  }
  
  public final int getViewTypeCount()
  {
    GMTrace.i(7631485796352L, 56859);
    GMTrace.o(7631485796352L, 56859);
    return 1;
  }
  
  public final void onPause()
  {
    GMTrace.i(7632156884992L, 56864);
    if (this.kfO != null) {
      this.kfO.aIm();
    }
    GMTrace.o(7632156884992L, 56864);
  }
  
  public static final class a
  {
    public ImageView iiL;
    public TextView kfQ;
    public TextView kfR;
    public TextView kfS;
    public ImageView kfT;
    public TextView kfU;
    public View kfV;
    public TextView kfW;
    
    public a()
    {
      GMTrace.i(7628398788608L, 56836);
      GMTrace.o(7628398788608L, 56836);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/bottle/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */