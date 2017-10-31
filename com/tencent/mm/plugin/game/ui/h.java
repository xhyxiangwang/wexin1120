package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.game.model.ad;
import com.tencent.mm.plugin.game.model.ad.a;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.util.List;

public final class h
  extends BaseAdapter
{
  int CM;
  int mBs;
  private Context mContext;
  private ad mJM;
  
  public h(Context paramContext)
  {
    GMTrace.i(12767461376000L, 95125);
    this.mContext = paramContext;
    GMTrace.o(12767461376000L, 95125);
  }
  
  private void f(ViewGroup paramViewGroup)
  {
    GMTrace.i(12768266682368L, 95131);
    paramViewGroup.setClipChildren(false);
    int i = 0;
    while (i < paramViewGroup.getChildCount())
    {
      View localView = paramViewGroup.getChildAt(i);
      if ((localView instanceof ViewGroup))
      {
        ((ViewGroup)localView).setClipChildren(false);
        f((ViewGroup)localView);
      }
      i += 1;
    }
    GMTrace.o(12768266682368L, 95131);
  }
  
  public final void a(ad paramad)
  {
    GMTrace.i(12767595593728L, 95126);
    this.mJM = paramad;
    af.u(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12773501173760L, 95170);
        h.this.notifyDataSetChanged();
        GMTrace.o(12773501173760L, 95170);
      }
    });
    GMTrace.o(12767595593728L, 95126);
  }
  
  public final int getCount()
  {
    GMTrace.i(12767729811456L, 95127);
    if (this.mJM == null)
    {
      GMTrace.o(12767729811456L, 95127);
      return 0;
    }
    int i = this.mJM.mBC.size();
    GMTrace.o(12767729811456L, 95127);
    return i;
  }
  
  public final Object getItem(int paramInt)
  {
    GMTrace.i(12767864029184L, 95128);
    Object localObject = this.mJM.mBC.get(paramInt);
    GMTrace.o(12767864029184L, 95128);
    return localObject;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(12767998246912L, 95129);
    long l = paramInt;
    GMTrace.o(12767998246912L, 95129);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(12768132464640L, 95130);
    Object localObject1;
    Object localObject2;
    if (paramView == null)
    {
      paramView = LayoutInflater.from(this.mContext).inflate(this.CM, paramViewGroup, false);
      paramViewGroup = new a();
      paramViewGroup.mJO = ((TextView)paramView.findViewById(R.h.bMc));
      paramViewGroup.hvo = ((ImageView)paramView.findViewById(R.h.bLZ));
      paramViewGroup.jsp = ((TextView)paramView.findViewById(R.h.bMb));
      paramViewGroup.mJP = ((TextView)paramView.findViewById(R.h.bMe));
      paramViewGroup.mJQ = ((TextView)paramView.findViewById(R.h.bMd));
      paramViewGroup.mJR = ((GameDetailRankLikeView)paramView.findViewById(R.h.bMa));
      paramViewGroup.mJR.mBs = this.mBs;
      f((ViewGroup)paramView);
      paramView.setTag(paramViewGroup);
      localObject1 = (ad.a)getItem(paramInt);
      paramViewGroup.mJO.setText(((ad.a)localObject1).mBD);
      a.b.a(paramViewGroup.hvo, ((ad.a)localObject1).fJp, 0.5F, false);
      ap.AS();
      localObject2 = c.yL().SL(((ad.a)localObject1).fJp);
      if (localObject2 == null) {
        break label330;
      }
      localObject2 = new SpannableString(com.tencent.mm.pluginsdk.ui.d.h.b(this.mContext, ((x)localObject2).vq(), paramViewGroup.jsp.getTextSize()));
      paramViewGroup.jsp.setText((CharSequence)localObject2);
      label257:
      if (!bg.mZ(((ad.a)localObject1).tag)) {
        break label343;
      }
      paramViewGroup.mJP.setVisibility(8);
      label277:
      if (bg.mZ(((ad.a)localObject1).mBG)) {
        break label366;
      }
      paramViewGroup.mJQ.setText(((ad.a)localObject1).mBG);
      paramViewGroup.mJR.setVisibility(8);
    }
    for (;;)
    {
      GMTrace.o(12768132464640L, 95130);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label330:
      paramViewGroup.jsp.setText("");
      break label257;
      label343:
      paramViewGroup.mJP.setVisibility(0);
      paramViewGroup.mJP.setText(((ad.a)localObject1).tag);
      break label277;
      label366:
      paramViewGroup.mJQ.setText(((ad.a)localObject1).mkF);
      localObject1 = paramViewGroup.mJR;
      localObject2 = this.mJM;
      ((GameDetailRankLikeView)localObject1).mJS = ((ad)localObject2);
      ((GameDetailRankLikeView)localObject1).iqL = ((ad)localObject2).iqL;
      ((GameDetailRankLikeView)localObject1).mJT = ((ad.a)((ad)localObject2).mBC.get(paramInt));
      ((GameDetailRankLikeView)localObject1).aFy();
      paramViewGroup.mJR.setVisibility(0);
    }
  }
  
  private final class a
  {
    public ImageView hvo;
    public TextView jsp;
    public TextView mJO;
    public TextView mJP;
    public TextView mJQ;
    public GameDetailRankLikeView mJR;
    
    public a()
    {
      GMTrace.i(12684112166912L, 94504);
      GMTrace.o(12684112166912L, 94504);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */