package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.support.v7.widget.RecyclerView.k;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.memory.n;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ab;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.DummyViewPager;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.p;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a;
import com.tencent.mm.plugin.sns.ui.am;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.WeakHashMap;

public final class b
  extends Fragment
{
  private static int qtf;
  public int bgColor;
  private boolean hGS;
  private boolean iiy;
  public int kic;
  public int kid;
  private LinearLayoutManager qpe;
  public final Map<String, Bitmap> qqm;
  private int qqw;
  public int qqx;
  public c qtb;
  public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.b qtg;
  com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w qth;
  public boolean qti;
  public boolean qtj;
  public int qtk;
  public int qtl;
  private a qtm;
  public b qtn;
  private a qto;
  private boolean qtp;
  public int qtq;
  public String qtr;
  
  public b()
  {
    GMTrace.i(17104573038592L, 127439);
    this.qqm = new WeakHashMap();
    this.qqw = 1000;
    this.qqx = 700;
    GMTrace.o(17104573038592L, 127439);
  }
  
  public static Fragment a(c paramc, DummyViewPager paramDummyViewPager, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w paramw, boolean paramBoolean1, a parama, boolean paramBoolean2)
  {
    GMTrace.i(17104707256320L, 127440);
    Bundle localBundle = new Bundle();
    localBundle.putSerializable("pageInfo", paramc);
    localBundle.putSerializable("viewpager", paramDummyViewPager);
    localBundle.putSerializable("lifecycle", parama);
    localBundle.putSerializable("pageDownIconInfo", paramw);
    localBundle.putBoolean("isLastPage", paramBoolean1);
    localBundle.putBoolean("needEnterAnimation", paramBoolean2);
    paramc = new b();
    paramc.setArguments(localBundle);
    GMTrace.o(17104707256320L, 127440);
    return paramc;
  }
  
  public final void a(final b paramb)
  {
    GMTrace.i(17106720522240L, 127455);
    if (!paramb.qtA)
    {
      GMTrace.o(17106720522240L, 127455);
      return;
    }
    if (paramb.qtz.getVisibility() != 0)
    {
      com.tencent.mm.sdk.platformtools.w.d("ContentFragment", "nextBtn not visible");
      GMTrace.o(17106720522240L, 127455);
      return;
    }
    AnimationSet localAnimationSet = new AnimationSet(true);
    Object localObject = new TranslateAnimation(0.0F, 0.0F, 0.0F, -10.0F);
    ((TranslateAnimation)localObject).setDuration(this.qqx);
    ((TranslateAnimation)localObject).setInterpolator(new DecelerateInterpolator(1.2F));
    localAnimationSet.addAnimation((Animation)localObject);
    localObject = new AlphaAnimation(0.8F, 0.3F);
    ((AlphaAnimation)localObject).setDuration(this.qqx);
    ((AlphaAnimation)localObject).setInterpolator(new DecelerateInterpolator(1.2F));
    localAnimationSet.addAnimation((Animation)localObject);
    localAnimationSet.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(17103096643584L, 127428);
        if (paramb.qtz.getVisibility() != 0)
        {
          com.tencent.mm.sdk.platformtools.w.d("ContentFragment", "nextBtn not visible");
          GMTrace.o(17103096643584L, 127428);
          return;
        }
        paramAnonymousAnimation = new AnimationSet(true);
        Object localObject = new TranslateAnimation(0.0F, 0.0F, -10.0F, 0.0F);
        ((TranslateAnimation)localObject).setDuration(b.this.qqx);
        ((TranslateAnimation)localObject).setInterpolator(new DecelerateInterpolator(1.2F));
        ((TranslateAnimation)localObject).setStartTime(b.this.qqx);
        paramAnonymousAnimation.addAnimation((Animation)localObject);
        localObject = new AlphaAnimation(0.3F, 0.8F);
        ((AlphaAnimation)localObject).setDuration(b.this.qqx);
        ((AlphaAnimation)localObject).setInterpolator(new DecelerateInterpolator(1.2F));
        ((AlphaAnimation)localObject).setStartTime(b.this.qqx);
        paramAnonymousAnimation.addAnimation((Animation)localObject);
        paramAnonymousAnimation.setAnimationListener(new Animation.AnimationListener()
        {
          public final void onAnimationEnd(Animation paramAnonymous2Animation)
          {
            GMTrace.i(17109270659072L, 127474);
            b.this.a(b.7.this.qtv);
            GMTrace.o(17109270659072L, 127474);
          }
          
          public final void onAnimationRepeat(Animation paramAnonymous2Animation)
          {
            GMTrace.i(17109404876800L, 127475);
            GMTrace.o(17109404876800L, 127475);
          }
          
          public final void onAnimationStart(Animation paramAnonymous2Animation)
          {
            GMTrace.i(17109136441344L, 127473);
            GMTrace.o(17109136441344L, 127473);
          }
        });
        paramb.qtz.startAnimation(paramAnonymousAnimation);
        GMTrace.o(17103096643584L, 127428);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(17103230861312L, 127429);
        GMTrace.o(17103230861312L, 127429);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(17102962425856L, 127427);
        GMTrace.o(17102962425856L, 127427);
      }
    });
    paramb.qtz.startAnimation(localAnimationSet);
    GMTrace.o(17106720522240L, 127455);
  }
  
  public final void ayb()
  {
    GMTrace.i(17105915215872L, 127449);
    if (this.qtn == null)
    {
      GMTrace.o(17105915215872L, 127449);
      return;
    }
    final Object localObject1;
    final Object localObject2;
    if ((this.qtb.qtV != null) && (this.qtb.qtV.length() > 0))
    {
      localObject1 = this.qtb.qtV;
      localObject2 = this.qtn.qty;
      if ((this.qtb.qtW) || (!TextUtils.isEmpty(this.qtb.qtV)))
      {
        if ((this.qti) && (!this.qtj)) {
          com.tencent.mm.sdk.platformtools.w.i("ContentFragment", "waiting for main page loaded to set blur bg");
        }
      }
      else
      {
        if (!this.qqm.containsKey(localObject1)) {
          break label210;
        }
        ((ImageView)localObject2).setImageBitmap((Bitmap)this.qqm.get(localObject1));
      }
    }
    for (;;)
    {
      if (this.qto != null)
      {
        this.qto.bgColor = this.bgColor;
        localObject1 = this.qto;
        localObject2 = this.qtb;
        if (((a)localObject1).qtb != localObject2)
        {
          ((a)localObject1).qtb = ((c)localObject2);
          ((RecyclerView.a)localObject1).TY.notifyChanged();
        }
      }
      GMTrace.o(17105915215872L, 127449);
      return;
      ((ImageView)localObject2).post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17104438820864L, 127438);
          b.this.bjt();
          GMTrace.o(17104438820864L, 127438);
        }
      });
      break;
      label210:
      com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a("adId", (String)localObject1, false, 1000000001, 0, new d.a()
      {
        public final void Hp(String paramAnonymousString)
        {
          Object localObject2 = null;
          float f = 1.0F;
          GMTrace.i(17107391610880L, 127460);
          Object localObject1 = localObject2;
          try
          {
            String str;
            if (b.this.qtb.qtW)
            {
              str = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.dz("adId", localObject1 + "_blurimg");
              if (FileOp.aZ(str)) {
                break label274;
              }
              Bitmap localBitmap = com.tencent.mm.sdk.platformtools.d.decodeFile(paramAnonymousString, null);
              localObject1 = localObject2;
              if (localBitmap != null)
              {
                if ((localBitmap.getHeight() < b.this.kid) || (localBitmap.getWidth() < b.this.kic)) {
                  f = Math.max(b.this.kic * 1.0F / localBitmap.getWidth(), 1.0F * b.this.kid / localBitmap.getHeight());
                }
                localObject1 = com.tencent.mm.sdk.platformtools.d.a(localBitmap, f, f);
                localObject1 = com.tencent.mm.plugin.sns.lucky.a.a.a(Bitmap.createBitmap((Bitmap)localObject1, ((Bitmap)localObject1).getWidth() - b.this.kic >>> 1, ((Bitmap)localObject1).getHeight() - b.this.kid >>> 1, b.this.kic, b.this.kid), str, Color.argb(140, 0, 0, 0), 180);
                if (localObject1 != null) {
                  break label266;
                }
                localObject1 = localObject2;
              }
            }
            while (localObject1 == null)
            {
              b.this.qtr = paramAnonymousString;
              if (b.this.qtq > 0)
              {
                b.this.bju();
                GMTrace.o(17107391610880L, 127460);
                return;
                label266:
                localObject1 = ((n)localObject1).yr();
                continue;
                label274:
                localObject1 = BitmapFactory.decodeFile(str);
              }
              else
              {
                com.tencent.mm.sdk.platformtools.w.i("ContentFragment", "wait for bgHeight");
                GMTrace.o(17107391610880L, 127460);
                return;
              }
            }
          }
          catch (Exception paramAnonymousString)
          {
            com.tencent.mm.sdk.platformtools.w.e("ContentFragment", "the backgroundCoverUrl is set error ,because " + paramAnonymousString.toString());
            GMTrace.o(17107391610880L, 127460);
            return;
          }
          b.this.qqm.put(localObject1, localObject1);
          localObject2.setImageBitmap((Bitmap)localObject1);
          GMTrace.o(17107391610880L, 127460);
        }
        
        public final void biT()
        {
          GMTrace.i(17107123175424L, 127458);
          GMTrace.o(17107123175424L, 127458);
        }
        
        public final void biU()
        {
          GMTrace.i(17107257393152L, 127459);
          if ((b.this.qtb.iHK != null) && (b.this.qtb.iHK.length() > 0)) {}
          try
          {
            b.this.bgColor = Color.parseColor(b.this.qtb.iHK);
            b.this.qtn.qty.setVisibility(8);
            b.this.qtn.qtx.setBackgroundColor(b.this.bgColor);
            b.this.qtn.qty.setBackgroundColor(b.this.bgColor);
            b.this.qtn.jyN.setBackgroundColor(b.this.bgColor);
            b.this.bjv();
            GMTrace.o(17107257393152L, 127459);
            return;
          }
          catch (Exception localException)
          {
            for (;;)
            {
              com.tencent.mm.sdk.platformtools.w.e("ContentFragment", "the color is error : " + b.this.qtb.iHK);
            }
          }
        }
      });
      continue;
      if ((this.qtb.iHK == null) || (this.qtb.iHK.length() <= 0)) {
        continue;
      }
      try
      {
        this.bgColor = Color.parseColor(this.qtb.iHK);
        this.qtn.qty.setVisibility(8);
        this.qtn.qtx.setBackgroundColor(this.bgColor);
        this.qtn.qty.setBackgroundColor(this.bgColor);
        this.qtn.jyN.setBackgroundColor(this.bgColor);
        bjv();
      }
      catch (Exception localException)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.w.e("ContentFragment", "the color is error : " + this.qtb.iHK);
        }
      }
    }
  }
  
  public final boolean bjA()
  {
    GMTrace.i(17106854739968L, 127456);
    if (this.qtk != 0)
    {
      GMTrace.o(17106854739968L, 127456);
      return false;
    }
    if (this.qtl != 0)
    {
      GMTrace.o(17106854739968L, 127456);
      return false;
    }
    int j = this.qpe.fa();
    int i = this.qpe.fb();
    if ((j == i) && (j == -1))
    {
      GMTrace.o(17106854739968L, 127456);
      return false;
      i -= 1;
    }
    for (;;)
    {
      if (i >= j)
      {
        Object localObject = this.qto;
        p localp = (p)((a)localObject).qtb.qtX.get(i);
        localObject = (i)((a)localObject).qtc.get(localp.qno);
        if (!(localObject instanceof x)) {
          break;
        }
        int k = ((x)localObject).bjk();
        if ((k < 0) || (k >= qtf)) {
          break;
        }
      }
      for (boolean bool1 = false;; bool1 = true)
      {
        boolean bool2 = bool1;
        if (bool1)
        {
          bool2 = bool1;
          if (this.iiy) {
            if (this.qpe.fb() == this.qto.getItemCount() - 1) {
              break label217;
            }
          }
        }
        label217:
        for (bool2 = true;; bool2 = false)
        {
          GMTrace.o(17106854739968L, 127456);
          return bool2;
        }
      }
    }
  }
  
  public final void bjs()
  {
    GMTrace.i(17105646780416L, 127447);
    if (this.qtg != null) {
      this.qtg.biM();
    }
    GMTrace.o(17105646780416L, 127447);
  }
  
  public final void bjt()
  {
    GMTrace.i(17105780998144L, 127448);
    if (this.qtn == null)
    {
      GMTrace.o(17105780998144L, 127448);
      return;
    }
    if (((this.qtb.qtW) || (!TextUtils.isEmpty(this.qtb.qtV))) && (!this.qtp))
    {
      this.qtp = true;
      this.qtn.qtB.setVisibility(0);
      this.qtn.qty.setScaleType(ImageView.ScaleType.CENTER_CROP);
      this.qtn.qtB.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
      {
        public final boolean onPreDraw()
        {
          GMTrace.i(17103901949952L, 127434);
          if (b.this.qtn.qtB.getHeight() > 0)
          {
            b.this.qtn.qtB.getViewTreeObserver().removeOnPreDrawListener(this);
            b.this.qtq = b.this.qtn.qtB.getHeight();
            if (b.this.qtq < b.this.kid) {
              b.this.qtq = b.this.kid;
            }
            Object localObject = (FrameLayout.LayoutParams)b.this.qtn.qty.getLayoutParams();
            ((FrameLayout.LayoutParams)localObject).height = b.this.qtq;
            b.this.qtn.qty.setLayoutParams((ViewGroup.LayoutParams)localObject);
            com.tencent.mm.sdk.platformtools.w.v("ContentFragment", "set bgIV height " + b.this.qtn.qtB.getHeight() + ", count " + b.this.qtn.qtB.getChildCount());
            int i = 0;
            while (i < b.this.qtn.qtB.getChildCount())
            {
              localObject = b.this.qtn.qtB.getChildAt(i).getTag();
              if ((localObject instanceof i)) {
                ((i)localObject).biu();
              }
              i += 1;
            }
            b.this.qtn.qtB.removeAllViews();
            b.this.qtn.qtB.setVisibility(8);
            b.this.bju();
          }
          GMTrace.o(17103901949952L, 127434);
          return true;
        }
      });
      a locala = this.qto;
      LinearLayout localLinearLayout = this.qtn.qtB;
      int i = 0;
      while (i < locala.qtb.qtX.size())
      {
        Object localObject = (p)locala.qtb.qtX.get(i);
        localObject = am.a(localLinearLayout.getContext(), (p)localObject, localLinearLayout, locala.bgColor);
        if (localObject != null)
        {
          if ((((i)localObject).getView().getParent() != null) && ((((i)localObject).getView().getParent() instanceof ViewGroup))) {
            ((ViewGroup)((i)localObject).getView().getParent()).removeView(((i)localObject).getView());
          }
          ((i)localObject).getView().setTag(localObject);
          localLinearLayout.addView(((i)localObject).getView());
        }
        i += 1;
      }
    }
    GMTrace.o(17105780998144L, 127448);
  }
  
  public final void bju()
  {
    GMTrace.i(18579760087040L, 138430);
    if ((this.qtq > 0) && (!TextUtils.isEmpty(this.qtr))) {
      try
      {
        if (this.qtn.jyN.getHeight() > this.qtq)
        {
          this.qtq = this.qtn.jyN.getHeight();
          localObject = (FrameLayout.LayoutParams)this.qtn.qty.getLayoutParams();
          ((FrameLayout.LayoutParams)localObject).height = this.qtq;
          this.qtn.qty.setLayoutParams((ViewGroup.LayoutParams)localObject);
        }
        Bitmap localBitmap = BitmapFactory.decodeFile(this.qtr);
        Object localObject = localBitmap;
        if (localBitmap.getWidth() < this.kic)
        {
          float f = 1.0F * this.kic / localBitmap.getWidth();
          localBitmap = com.tencent.mm.sdk.platformtools.d.a(localBitmap, f, f);
          localObject = localBitmap;
          if (localBitmap.getHeight() > this.qtq) {
            localObject = Bitmap.createBitmap(localBitmap, 0, 0, localBitmap.getWidth(), this.qtq);
          }
        }
        this.qqm.put(this.qtb.qtV, localObject);
        this.qtn.qty.setImageBitmap((Bitmap)localObject);
        GMTrace.o(18579760087040L, 138430);
        return;
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        com.tencent.mm.sdk.platformtools.w.e("ContentFragment", bg.f(localOutOfMemoryError));
      }
    }
    GMTrace.o(18579760087040L, 138430);
  }
  
  public final void bjv()
  {
    GMTrace.i(17106049433600L, 127450);
    if (this.bgColor + 16777216 <= -1 - this.bgColor)
    {
      this.qtn.qtz.setImageDrawable(com.tencent.mm.bq.a.b(aG(), i.e.pHh));
      GMTrace.o(17106049433600L, 127450);
      return;
    }
    this.qtn.qtz.setImageDrawable(com.tencent.mm.bq.a.b(aG(), i.e.pHg));
    GMTrace.o(17106049433600L, 127450);
  }
  
  public final RecyclerView bjw()
  {
    GMTrace.i(17106183651328L, 127451);
    if (this.qtn != null)
    {
      RecyclerView localRecyclerView = this.qtn.nRT;
      GMTrace.o(17106183651328L, 127451);
      return localRecyclerView;
    }
    GMTrace.o(17106183651328L, 127451);
    return null;
  }
  
  public final Collection<i> bjx()
  {
    GMTrace.i(17106317869056L, 127452);
    if (this.qto == null)
    {
      localObject = Collections.EMPTY_LIST;
      GMTrace.o(17106317869056L, 127452);
      return (Collection<i>)localObject;
    }
    Object localObject = this.qto;
    if (((a)localObject).qtc == null)
    {
      localObject = Collections.EMPTY_LIST;
      GMTrace.o(17106317869056L, 127452);
      return (Collection<i>)localObject;
    }
    localObject = ((a)localObject).qtc.values();
    GMTrace.o(17106317869056L, 127452);
    return (Collection<i>)localObject;
  }
  
  public final void bjy()
  {
    GMTrace.i(17106452086784L, 127453);
    if (this.qtn.qtz.getVisibility() == 0)
    {
      this.qtn.qtz.clearAnimation();
      this.qtn.qtz.setVisibility(4);
    }
    GMTrace.o(17106452086784L, 127453);
  }
  
  public final void bjz()
  {
    GMTrace.i(17106586304512L, 127454);
    if (!bjA())
    {
      GMTrace.o(17106586304512L, 127454);
      return;
    }
    this.qtn.qtz.clearAnimation();
    this.qtn.qtz.setVisibility(0);
    final AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 0.8F);
    localAlphaAnimation.setDuration(this.qqw);
    localAlphaAnimation.setInterpolator(new DecelerateInterpolator(1.2F));
    localAlphaAnimation.setStartOffset(this.qqw);
    localAlphaAnimation.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(17102559772672L, 127424);
        new ae().postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(17104170385408L, 127436);
            com.tencent.mm.sdk.platformtools.w.d("ContentFragment", "onAnimationEnd show nextBtn");
            b.this.qtn.qtz.setAlpha(1.0F);
            b.this.a(b.this.qtn);
            GMTrace.o(17104170385408L, 127436);
          }
        }, 200L);
        GMTrace.o(17102559772672L, 127424);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(17102693990400L, 127425);
        GMTrace.o(17102693990400L, 127425);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(17102425554944L, 127423);
        com.tencent.mm.sdk.platformtools.w.d("ContentFragment", "onAnimationStart show nextBtn");
        b.this.qtn.qtA = true;
        GMTrace.o(17102425554944L, 127423);
      }
    });
    if ((this.qth != null) && (!this.qth.equals(this.qtn.qtz.getTag())))
    {
      this.qtn.qtz.setTag(this.qth);
      this.qtn.qtz.setVisibility(8);
      com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a(this.qth.iconUrl, 1000000001, new d.a()
      {
        public final void Hp(String paramAnonymousString)
        {
          GMTrace.i(17110612836352L, 127484);
          com.tencent.mm.sdk.platformtools.w.d("ContentFragment", "onDownloaded show nextBtn");
          b localb = b.this;
          ImageView localImageView = b.this.qtn.qtz;
          paramAnonymousString = BitmapFactory.decodeFile(paramAnonymousString);
          ViewGroup.LayoutParams localLayoutParams = localImageView.getLayoutParams();
          if (Float.compare(localb.qth.width, 0.0F) > 0)
          {
            localLayoutParams.width = ((int)localb.qth.width);
            if (Float.compare(localb.qth.height, 0.0F) <= 0) {
              break label174;
            }
          }
          label174:
          for (localLayoutParams.height = ((int)localb.qth.height);; localLayoutParams.height = -2)
          {
            if ((localLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
              ((ViewGroup.MarginLayoutParams)localLayoutParams).bottomMargin = ((int)localb.qth.qnr);
            }
            localImageView.setImageBitmap(paramAnonymousString);
            b.this.qtn.qtz.setVisibility(0);
            b.this.qtn.qtz.startAnimation(localAlphaAnimation);
            GMTrace.o(17110612836352L, 127484);
            return;
            localLayoutParams.width = -1;
            break;
          }
        }
        
        public final void biT()
        {
          GMTrace.i(17110344400896L, 127482);
          GMTrace.o(17110344400896L, 127482);
        }
        
        public final void biU()
        {
          GMTrace.i(17110478618624L, 127483);
          com.tencent.mm.sdk.platformtools.w.d("ContentFragment", "onDownloadError show nextBtn");
          b.this.qtn.qtz.setVisibility(0);
          b.this.qtn.qtz.startAnimation(localAlphaAnimation);
          GMTrace.o(17110478618624L, 127483);
        }
      });
      GMTrace.o(17106586304512L, 127454);
      return;
    }
    this.qtn.qtz.startAnimation(localAlphaAnimation);
    GMTrace.o(17106586304512L, 127454);
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(17104841474048L, 127441);
    super.onCreate(paramBundle);
    qtf = com.tencent.mm.bq.a.fromDPToPix(getContext(), 60);
    paramBundle = ab.de(getContext());
    this.kic = paramBundle[0];
    this.kid = paramBundle[1];
    if (this.qtb == null) {
      this.qtb = ((c)this.or.getSerializable("pageInfo"));
    }
    this.qtm = ((a)this.or.getSerializable("lifecycle"));
    this.qth = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w)this.or.getSerializable("pageDownIconInfo"));
    this.iiy = this.or.getBoolean("isLastPage");
    this.qti = this.or.getBoolean("needEnterAnimation");
    GMTrace.o(17104841474048L, 127441);
  }
  
  public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    GMTrace.i(17104975691776L, 127442);
    paramLayoutInflater = paramLayoutInflater.inflate(i.g.pNR, paramViewGroup, false);
    this.qtn = new b();
    this.qtn.qtx = paramLayoutInflater;
    this.qtn.qty = ((ImageView)paramLayoutInflater.findViewById(i.f.pLn));
    this.qtn.jyN = ((LinearLayout)paramLayoutInflater.findViewById(i.f.pLG));
    this.qtn.qtz = ((ImageView)paramLayoutInflater.findViewById(i.f.pMG));
    this.qtn.nRT = ((RecyclerView)paramLayoutInflater.findViewById(i.f.pJu));
    this.qtn.qtB = ((LinearLayout)paramLayoutInflater.findViewById(i.f.pJN));
    paramViewGroup = this.qtn.nRT;
    paramViewGroup.setOverScrollMode(2);
    paramViewGroup.setOnTouchListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a((DummyViewPager)this.or.getSerializable("viewpager")));
    this.qpe = new LinearLayoutManager();
    paramViewGroup.a(this.qpe);
    this.qto = new a(this.qtb, this.bgColor, aG(), this.qpe);
    paramViewGroup.a(this.qto);
    this.qtg = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.b(paramViewGroup, this);
    paramViewGroup.a(new RecyclerView.k()
    {
      public final void c(RecyclerView paramAnonymousRecyclerView, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(17103499296768L, 127431);
        super.c(paramAnonymousRecyclerView, paramAnonymousInt1, paramAnonymousInt2);
        if ((b.this.qtn.qty != null) && (b.this.qtn.qty.getVisibility() == 0)) {
          b.this.qtn.qty.scrollBy(paramAnonymousInt1, paramAnonymousInt2);
        }
        GMTrace.o(17103499296768L, 127431);
      }
      
      public final void e(RecyclerView paramAnonymousRecyclerView, int paramAnonymousInt)
      {
        GMTrace.i(17103633514496L, 127432);
        super.e(paramAnonymousRecyclerView, paramAnonymousInt);
        b.this.qtk = paramAnonymousInt;
        if (paramAnonymousInt == 0)
        {
          if (b.this.bjA())
          {
            b.this.bjz();
            GMTrace.o(17103633514496L, 127432);
          }
        }
        else if (paramAnonymousInt == 1)
        {
          b.this.bjy();
          ab.df(b.this.getContext());
        }
        GMTrace.o(17103633514496L, 127432);
      }
    });
    paramLayoutInflater.setTag(this.qtn);
    ayb();
    if (this.qtm != null) {
      this.qtm.a(this);
    }
    GMTrace.o(17104975691776L, 127442);
    return paramLayoutInflater;
  }
  
  public final void onDestroy()
  {
    GMTrace.i(17105378344960L, 127445);
    super.onDestroy();
    if (this.qtg != null) {
      this.qtg.qsK.onDestroy();
    }
    GMTrace.o(17105378344960L, 127445);
  }
  
  public final void onPause()
  {
    GMTrace.i(17105244127232L, 127444);
    super.onPause();
    new StringBuilder().append(this).append(" onPause ").append(getUserVisibleHint());
    this.hGS = false;
    if ((this.qtg != null) && (getUserVisibleHint())) {
      this.qtg.bjo();
    }
    GMTrace.o(17105244127232L, 127444);
  }
  
  public final void onResume()
  {
    GMTrace.i(17105109909504L, 127443);
    super.onResume();
    com.tencent.mm.sdk.platformtools.w.i("ContentFragment", this + " onResume " + getUserVisibleHint());
    this.hGS = true;
    if ((this.qtg != null) && (getUserVisibleHint())) {
      this.qtg.biN();
    }
    GMTrace.o(17105109909504L, 127443);
  }
  
  public final void setUserVisibleHint(boolean paramBoolean)
  {
    GMTrace.i(17105512562688L, 127446);
    super.setUserVisibleHint(paramBoolean);
    if (paramBoolean)
    {
      if (this.qtg != null)
      {
        this.qtg.biN();
        GMTrace.o(17105512562688L, 127446);
      }
    }
    else if (this.qtg != null) {
      this.qtg.bjo();
    }
    GMTrace.o(17105512562688L, 127446);
  }
  
  public static abstract interface a
    extends Serializable
  {
    public abstract void a(b paramb);
  }
  
  private static final class b
  {
    public LinearLayout jyN;
    public RecyclerView nRT;
    public boolean qtA;
    public LinearLayout qtB;
    public View qtx;
    public ImageView qty;
    public ImageView qtz;
    
    public b()
    {
      GMTrace.i(17110075965440L, 127480);
      this.qty = null;
      this.jyN = null;
      this.qtz = null;
      this.qtA = false;
      GMTrace.o(17110075965440L, 127480);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */