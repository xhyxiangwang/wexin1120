package com.tencent.mm.plugin.appbrand.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bq.a;
import com.tencent.mm.plugin.appbrand.n.h;
import com.tencent.mm.plugin.appbrand.p.f;
import java.util.Iterator;
import java.util.LinkedList;

public final class e
  extends FrameLayout
{
  private int LM;
  public LinearLayout jze;
  public ImageView jzf;
  public String jzg;
  public int jzh;
  public int jzi;
  public LinkedList<a> jzj;
  private int jzk;
  public b jzl;
  
  public e(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(10138136084480L, 75535);
    this.LM = 0;
    this.jzk = 0;
    this.jzj = new LinkedList();
    setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    this.jzf = new ImageView(paramContext);
    this.jzf.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    addView(this.jzf);
    this.jze = new LinearLayout(paramContext);
    this.jze.setOrientation(0);
    this.jze.setGravity(16);
    this.jze.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    addView(this.jze);
    GMTrace.o(10138136084480L, 75535);
  }
  
  public static Bitmap sr(String paramString)
  {
    GMTrace.i(10138270302208L, 75536);
    paramString = Base64.decode(paramString, 0);
    paramString = BitmapFactory.decodeByteArray(paramString, 0, paramString.length);
    GMTrace.o(10138270302208L, 75536);
    return paramString;
  }
  
  public final void a(View paramView, a parama, boolean paramBoolean)
  {
    GMTrace.i(10138538737664L, 75538);
    ImageView localImageView = (ImageView)paramView.findViewById(p.f.icon);
    TextView localTextView = (TextView)paramView.findViewById(p.f.text);
    View localView1 = paramView.findViewById(p.f.bPX);
    View localView2 = paramView.findViewById(p.f.iub);
    if ("top".equals(this.jzg))
    {
      paramView.setLayoutParams(new LinearLayout.LayoutParams(0, a.fromDPToPix(getContext(), 40), 1.0F));
      localImageView.setVisibility(8);
      localTextView.setTextSize(1, 14.0F);
      localView2.setVisibility(0);
      if ((!paramBoolean) || (parama.jzn == null)) {
        break label421;
      }
      localImageView.setImageBitmap(parama.jzn);
      label125:
      localTextView.setText(parama.jzo);
      if (!paramBoolean) {
        break label433;
      }
      localTextView.setTextColor(this.jzi);
    }
    for (;;)
    {
      if (!paramBoolean) {
        break label445;
      }
      localView1.setBackgroundColor(this.jzi);
      localView1.setVisibility(0);
      GMTrace.o(10138538737664L, 75538);
      return;
      if ((parama.uf != null) && (parama.jzo != null))
      {
        paramView.setLayoutParams(new LinearLayout.LayoutParams(0, a.fromDPToPix(getContext(), 54), 1.0F));
        localImageView.setVisibility(0);
        localImageView.getLayoutParams().width = a.fromDPToPix(getContext(), 32);
        localImageView.getLayoutParams().height = a.fromDPToPix(getContext(), 28);
        localTextView.setVisibility(0);
        localTextView.setTextSize(1, 12.0F);
      }
      for (;;)
      {
        localView2.setVisibility(8);
        break;
        if ((parama.uf != null) && (parama.jzo == null))
        {
          paramView.setLayoutParams(new LinearLayout.LayoutParams(0, a.fromDPToPix(getContext(), 48), 1.0F));
          localImageView.setVisibility(0);
          localImageView.getLayoutParams().width = a.fromDPToPix(getContext(), 36);
          localImageView.getLayoutParams().height = a.fromDPToPix(getContext(), 36);
          localTextView.setVisibility(8);
        }
        else if ((parama.uf == null) && (parama.jzo != null))
        {
          paramView.setLayoutParams(new LinearLayout.LayoutParams(0, a.fromDPToPix(getContext(), 49), 1.0F));
          localImageView.setVisibility(8);
          localTextView.setVisibility(0);
          localTextView.setTextSize(1, 16.0F);
        }
      }
      label421:
      localImageView.setImageBitmap(parama.uf);
      break label125;
      label433:
      localTextView.setTextColor(this.jzh);
    }
    label445:
    localView1.setVisibility(4);
    GMTrace.o(10138538737664L, 75538);
  }
  
  public final void jO(int paramInt)
  {
    GMTrace.i(10138404519936L, 75537);
    a(this.jze.getChildAt(this.jzk), (a)this.jzj.get(this.jzk), false);
    if ((paramInt > 0) && (paramInt < this.jzj.size())) {}
    for (this.jzk = paramInt;; this.jzk = 0)
    {
      a(this.jze.getChildAt(this.jzk), (a)this.jzj.get(this.jzk), true);
      GMTrace.o(10138404519936L, 75537);
      return;
    }
  }
  
  public final int ss(String paramString)
  {
    GMTrace.i(18296694898688L, 136321);
    LinkedList localLinkedList = this.jzj;
    String str = h.sa(paramString);
    Iterator localIterator = this.jzj.iterator();
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
      paramString = (a)localIterator.next();
    } while (!h.sa(paramString.mUrl).equals(str));
    for (;;)
    {
      int i = localLinkedList.indexOf(paramString);
      GMTrace.o(18296694898688L, 136321);
      return i;
      paramString = null;
    }
  }
  
  private static final class a
  {
    public Bitmap jzn;
    public String jzo;
    public String mUrl;
    public Bitmap uf;
    
    public a()
    {
      GMTrace.i(10045794287616L, 74847);
      GMTrace.o(10045794287616L, 74847);
    }
  }
  
  public static abstract interface b
  {
    public abstract void rp(String paramString);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */