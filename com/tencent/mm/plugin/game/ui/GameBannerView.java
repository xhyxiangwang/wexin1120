package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.e;
import android.support.v4.view.u;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.game.d.c;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MMDotView;
import com.tencent.mm.x.ap;
import java.util.LinkedList;

public class GameBannerView
  extends LinearLayout
  implements ViewPager.e, View.OnClickListener
{
  private MMDotView jFr;
  private float kgp;
  private ViewPager leI;
  int mBs;
  private Context mContext;
  private b mHN;
  LinkedList<a> mHO;
  aj mHP;
  private float mHQ;
  
  public GameBannerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12764240150528L, 95101);
    this.mBs = 0;
    this.mHP = new aj(new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(12720082518016L, 94772);
        if ((GameBannerView.a(GameBannerView.this) != null) && (GameBannerView.b(GameBannerView.this).size() > 1))
        {
          GameBannerView.a(GameBannerView.this).c(GameBannerView.a(GameBannerView.this).xN + 1, true);
          GMTrace.o(12720082518016L, 94772);
          return true;
        }
        GameBannerView.c(GameBannerView.this).MM();
        GMTrace.o(12720082518016L, 94772);
        return false;
      }
    }, true);
    this.mHQ = 0.0F;
    this.kgp = 0.0F;
    this.mContext = paramContext;
    inflate(paramContext, R.i.cVO, this);
    this.mHO = new LinkedList();
    GMTrace.o(12764240150528L, 95101);
  }
  
  private void fb(boolean paramBoolean)
  {
    GMTrace.i(12765179674624L, 95108);
    ViewParent localViewParent = getParent();
    if (localViewParent != null) {
      localViewParent.requestDisallowInterceptTouchEvent(paramBoolean);
    }
    GMTrace.o(12765179674624L, 95108);
  }
  
  public final void R(LinkedList<a> paramLinkedList)
  {
    GMTrace.i(12764508585984L, 95103);
    if ((paramLinkedList == null) || (paramLinkedList.size() == 0))
    {
      w.e("MicroMsg.GameBannerView", "Empty banner list");
      setVisibility(8);
      GMTrace.o(12764508585984L, 95103);
      return;
    }
    w.i("MicroMsg.GameBannerView", "bannerList size", new Object[] { Integer.valueOf(paramLinkedList.size()) });
    this.mHP.MM();
    this.mHO.clear();
    this.mHO.addAll(paramLinkedList);
    this.leI.a(this.mHN);
    this.leI.c(paramLinkedList.size() * 1000, false);
    if (this.mHO.size() > 1) {
      this.mHP.w(5000L, 5000L);
    }
    this.jFr.setVisibility(8);
    setVisibility(0);
    GMTrace.o(12764508585984L, 95103);
  }
  
  public final void V(int paramInt)
  {
    GMTrace.i(12764911239168L, 95106);
    int i = paramInt % this.mHO.size();
    w.i("MicroMsg.GameBannerView", "now selected page %d, now exactly positon : %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
    if ((((a)this.mHO.get(i)).mHS != null) && (ap.AV())) {
      ai.a(this.mContext, 11, 1101, i + 1, 1, this.mBs, null);
    }
    GMTrace.o(12764911239168L, 95106);
  }
  
  public final void W(int paramInt)
  {
    GMTrace.i(12764642803712L, 95104);
    GMTrace.o(12764642803712L, 95104);
  }
  
  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
    GMTrace.i(12764777021440L, 95105);
    GMTrace.o(12764777021440L, 95105);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(12765313892352L, 95109);
    if (!(paramView.getTag() instanceof a))
    {
      GMTrace.o(12765313892352L, 95109);
      return;
    }
    Object localObject = (a)paramView.getTag();
    paramView = ((a)localObject).mHS;
    if (!bg.mZ(((a)localObject).mza))
    {
      paramView = ((a)localObject).mza;
      i = c.aa(this.mContext, paramView);
      ai.a(this.mContext, 11, 1101, 1, i, this.mBs, null);
      GMTrace.o(12765313892352L, 95109);
      return;
    }
    w.i("MicroMsg.GameBannerView", "null or nil url");
    localObject = new Bundle();
    ((Bundle)localObject).putCharSequence("game_app_id", paramView.field_appId);
    ((Bundle)localObject).putInt("game_report_from_scene", 5);
    int i = c.a(this.mContext, paramView.field_appId, null, (Bundle)localObject);
    ai.a(this.mContext, 11, 1101, 1, i, this.mBs, null);
    GMTrace.o(12765313892352L, 95109);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(12764374368256L, 95102);
    super.onFinishInflate();
    this.jFr = ((MMDotView)findViewById(R.h.bKZ));
    this.leI = ((ViewPager)findViewById(R.h.bLa));
    this.leI.yw = this;
    this.mHN = new b();
    GMTrace.o(12764374368256L, 95102);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(12765045456896L, 95107);
    int i = paramMotionEvent.getAction();
    float f1 = paramMotionEvent.getRawX();
    float f2 = paramMotionEvent.getRawY();
    switch (i)
    {
    default: 
      switch (paramMotionEvent.getAction())
      {
      }
      break;
    }
    for (;;)
    {
      boolean bool = super.onInterceptTouchEvent(paramMotionEvent);
      GMTrace.o(12765045456896L, 95107);
      return bool;
      this.mHQ = f1;
      this.kgp = f2;
      break;
      i = (int)(f1 - this.mHQ);
      int j = (int)(f2 - this.kgp);
      if (Math.abs(i) <= Math.abs(j)) {
        break;
      }
      fb(true);
      break;
      fb(false);
      this.mHQ = 0.0F;
      this.kgp = 0.0F;
      break;
      this.mHP.MM();
      continue;
      this.mHP.w(5000L, 5000L);
    }
  }
  
  public static final class a
  {
    public String hjY;
    public int index;
    public f mHS;
    public String mza;
    
    public a()
    {
      GMTrace.i(12673374748672L, 94424);
      GMTrace.o(12673374748672L, 94424);
    }
  }
  
  private final class b
    extends u
  {
    public b()
    {
      GMTrace.i(12776722399232L, 95194);
      GMTrace.o(12776722399232L, 95194);
    }
    
    public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
    {
      GMTrace.i(12776856616960L, 95195);
      int i = GameBannerView.b(GameBannerView.this).size();
      paramViewGroup.removeView((View)paramObject);
      w.i("MicroMsg.GameBannerView", "destroyItem : new positon = %d, now position = %d", new Object[] { Integer.valueOf(paramInt % i), Integer.valueOf(paramInt) });
      GMTrace.o(12776856616960L, 95195);
    }
    
    public final boolean a(View paramView, Object paramObject)
    {
      GMTrace.i(12777259270144L, 95198);
      if (paramView == paramObject)
      {
        GMTrace.o(12777259270144L, 95198);
        return true;
      }
      GMTrace.o(12777259270144L, 95198);
      return false;
    }
    
    public final Object b(ViewGroup paramViewGroup, int paramInt)
    {
      GMTrace.i(12776990834688L, 95196);
      int i = paramInt % GameBannerView.b(GameBannerView.this).size();
      View localView = View.inflate(GameBannerView.d(GameBannerView.this), R.i.cVP, null);
      localView.setTag(GameBannerView.b(GameBannerView.this).get(i));
      localView.setOnClickListener(GameBannerView.this);
      ImageView localImageView = (ImageView)localView.findViewById(R.h.bLb);
      String str = ((GameBannerView.a)GameBannerView.b(GameBannerView.this).get(i)).hjY;
      Drawable localDrawable = localImageView.getDrawable();
      if ((localDrawable != null) && ((localDrawable instanceof i))) {
        ((i)localDrawable).setUrl(str);
      }
      try
      {
        for (;;)
        {
          paramViewGroup.addView(localView, 0);
          w.i("MicroMsg.GameBannerView", "instantiateItem : new positon = %d, now position = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt) });
          GMTrace.o(12776990834688L, 95196);
          return localView;
          localImageView.setImageDrawable(new i(str, (byte)0));
        }
      }
      catch (Exception paramViewGroup)
      {
        for (;;)
        {
          w.e("MicroMsg.GameBannerView", "add view failed, " + paramViewGroup.getMessage());
        }
      }
    }
    
    public final int getCount()
    {
      GMTrace.i(12777125052416L, 95197);
      if (GameBannerView.b(GameBannerView.this).size() <= 1)
      {
        i = GameBannerView.b(GameBannerView.this).size();
        GMTrace.o(12777125052416L, 95197);
        return i;
      }
      int i = GameBannerView.b(GameBannerView.this).size();
      GMTrace.o(12777125052416L, 95197);
      return i * 1000 * 2;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameBannerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */