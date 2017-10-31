package com.tencent.mm.plugin.sns.f;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.AbsoluteLayout;
import android.widget.AbsoluteLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.a;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.q;
import com.tencent.mm.plugin.sns.model.t;
import com.tencent.mm.plugin.sns.storage.f;
import com.tencent.mm.plugin.sns.storage.j;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.ui.SnsCommentUI;
import com.tencent.mm.plugin.sns.ui.bf;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.d;
import com.tencent.mm.ui.MMActivity;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class b
  implements com.tencent.mm.plugin.sns.model.e
{
  private boolean fxs;
  public Context mContext;
  private int pWC;
  public final int qgC;
  private com.tencent.mm.plugin.sns.ui.b.b qgD;
  private FrameLayout qgE;
  AbsoluteLayout qgF;
  protected Animation qgG;
  protected Animation qgH;
  public boolean qgI;
  int[] qgJ;
  private int[] qgK;
  private int[] qgL;
  private int[] qgM;
  private int[] qgN;
  public Map<Long, b> qgO;
  private Map<Long, b> qgP;
  private HashSet<Long> qgQ;
  public h qgR;
  private HashMap<Long, Boolean> qgS;
  
  public b(Context paramContext, com.tencent.mm.plugin.sns.ui.b.b paramb, FrameLayout paramFrameLayout)
  {
    GMTrace.i(8778778935296L, 65407);
    this.qgC = 14;
    this.qgF = null;
    this.qgI = false;
    this.qgJ = new int[] { i.j.pRu, i.j.pRv, i.j.pRw, i.j.pRx };
    this.qgK = new int[] { i.i.pQd, i.i.pQf, i.i.pQe, i.i.pQc };
    this.qgL = this.qgJ;
    this.fxs = true;
    this.qgO = new HashMap();
    this.qgP = new HashMap();
    this.qgQ = new HashSet();
    this.qgR = null;
    this.qgS = new HashMap();
    this.pWC = -1;
    g localg = com.tencent.mm.plugin.sns.model.ae.bhh();
    h localh2 = new h();
    com.tencent.mm.storage.c localc = com.tencent.mm.x.c.c.Cu().em("100007");
    h localh1;
    if (!localc.isValid())
    {
      w.i("MicroMsg.SnsABTestStrategy", "abtest is invalid");
      localh1 = null;
    }
    for (;;)
    {
      localg.qhS = localh1;
      this.qgR = com.tencent.mm.plugin.sns.model.ae.bhh().bih();
      if (this.qgR != null)
      {
        this.qgM = this.qgR.qhU;
        if (!this.qgR.bii()) {
          this.fxs = false;
        }
      }
      this.mContext = paramContext;
      this.qgD = paramb;
      this.qgE = paramFrameLayout;
      this.qgG = new ScaleAnimation(1.0F, 1.0F, 0.0F, 1.0F, 1, 1.0F, 1, 0.0F);
      this.qgG = AnimationUtils.loadAnimation(paramContext, i.a.pGd);
      this.qgH = new ScaleAnimation(1.0F, 1.0F, 1.0F, 0.0F, 1, 1.0F, 1, 0.0F);
      this.qgH = AnimationUtils.loadAnimation(paramContext, i.a.pGe);
      GMTrace.o(8778778935296L, 65407);
      return;
      Map localMap = localc.bPn();
      localh1 = localh2;
      if (localMap != null)
      {
        w.i("MicroMsg.SnsABTestStrategy", "snsabtest feed " + localc.field_expId + " " + localc.field_layerId + " " + localc.field_startTime + " " + localc.field_endTime);
        localh2.e(localc.field_layerId, localc.field_expId, localMap);
        localh1 = localh2;
      }
    }
  }
  
  private static String a(a parama, Map<String, String> paramMap)
  {
    GMTrace.i(8779181588480L, 65410);
    if (parama == null)
    {
      GMTrace.o(8779181588480L, 65410);
      return "";
    }
    StringBuffer localStringBuffer2;
    StringBuffer localStringBuffer1;
    int i;
    label57:
    char c;
    if (com.tencent.mm.sdk.platformtools.v.bMN())
    {
      parama = parama.qgy;
      localStringBuffer2 = new StringBuffer();
      localStringBuffer1 = new StringBuffer();
      i = 0;
      if (i >= parama.length()) {
        break label232;
      }
      c = parama.charAt(i);
      if (c != '$') {
        break label204;
      }
      if (localStringBuffer1.length() != 0) {
        break label121;
      }
      localStringBuffer1.append(c);
    }
    for (;;)
    {
      i += 1;
      break label57;
      if (com.tencent.mm.sdk.platformtools.v.bMO())
      {
        parama = parama.qgz;
        break;
      }
      parama = parama.qgA;
      break;
      label121:
      if (localStringBuffer1.charAt(localStringBuffer1.length() - 1) == '$')
      {
        localStringBuffer2.append('$');
        localStringBuffer1 = new StringBuffer();
      }
      else
      {
        String str = (String)paramMap.get(localStringBuffer1.substring(1));
        if (str == null)
        {
          GMTrace.o(8779181588480L, 65410);
          return "";
        }
        localStringBuffer2.append(str);
        continue;
        label204:
        if (localStringBuffer1.length() == 0) {
          localStringBuffer2.append(c);
        } else {
          localStringBuffer1.append(c);
        }
      }
    }
    label232:
    parama = localStringBuffer2.toString();
    GMTrace.o(8779181588480L, 65410);
    return parama;
  }
  
  public final void a(int paramInt, String paramString1, long paramLong, String paramString2, bhc parambhc, boolean paramBoolean)
  {
    GMTrace.i(8778510499840L, 65405);
    if ((paramBoolean) && (this.fxs))
    {
      if (this.qgQ.contains(Long.valueOf(paramLong)))
      {
        paramBoolean = false;
        if (this.qgS.containsKey(Long.valueOf(paramLong))) {
          paramBoolean = ((Boolean)this.qgS.get(Long.valueOf(paramLong))).booleanValue();
        }
        if (paramBoolean)
        {
          paramString1 = (b)this.qgP.get(Long.valueOf(paramLong));
          if (paramString1 != null) {
            paramString1.rB();
          }
        }
      }
      this.qgP.remove(Long.valueOf(paramLong));
      this.qgQ.remove(Long.valueOf(paramLong));
    }
    GMTrace.o(8778510499840L, 65405);
  }
  
  public final void a(int paramInt, String paramString1, long paramLong, String paramString2, bhc parambhc, boolean paramBoolean, bf parambf)
  {
    GMTrace.i(8778376282112L, 65404);
    if ((paramBoolean) && (this.fxs) && (this.qgR != null) && (parambf != null))
    {
      this.qgQ.add(Long.valueOf(paramLong));
      paramString1 = new b(paramLong, this.qgR.qhe, this.qgR.qhf, parambf.bnW());
      this.qgP.put(Long.valueOf(paramLong), paramString1);
    }
    GMTrace.o(8778376282112L, 65404);
  }
  
  final void a(View paramView, AbsoluteLayout paramAbsoluteLayout, final com.tencent.mm.plugin.sns.data.b paramb)
  {
    GMTrace.i(8779047370752L, 65409);
    Object localObject1 = (ViewGroup)paramView;
    ((ViewGroup)localObject1).removeAllViews();
    if (this.qgR == null)
    {
      GMTrace.o(8779047370752L, 65409);
      return;
    }
    if ((paramb.pYc == null) || (paramb.pYc.qSm == null))
    {
      GMTrace.o(8779047370752L, 65409);
      return;
    }
    Object localObject2 = paramb.pYc.qSm;
    Object localObject3 = new Paint(1);
    int n = BackwardSupportUtil.b.a(this.mContext, 12.0F);
    int i1 = BackwardSupportUtil.b.a(this.mContext, 10.0F);
    int k = BackwardSupportUtil.b.a(this.mContext, 150.0F);
    LinkedList localLinkedList = new LinkedList();
    float f = BackwardSupportUtil.b.a(this.mContext, 17.0F) * com.tencent.mm.bq.a.dZ(this.mContext) + i1 * 2;
    int m = (int)f;
    int i = 0;
    int j = 0;
    while (j < this.qgR.qhH.size())
    {
      Object localObject4 = (a)this.qgR.qhH.get(j);
      final TextView localTextView = new TextView(this.mContext);
      localTextView.setPadding(n, i1, n, i1);
      localTextView.setTextSize(1, 14.0F * com.tencent.mm.bq.a.dZ(this.mContext));
      localTextView.setTextColor(this.mContext.getResources().getColor(i.c.pGk));
      localObject4 = a((a)localObject4, ((com.tencent.mm.plugin.sns.storage.b)localObject2).qlU);
      localTextView.setText((CharSequence)localObject4);
      ((Paint)localObject3).setTextSize(localTextView.getTextSize());
      ((ViewGroup)localObject1).addView(localTextView);
      i = Math.max(i, (int)((Paint)localObject3).measureText((String)localObject4) + n * 2);
      localTextView.setTag(Integer.valueOf(j));
      localLinkedList.add(localTextView);
      localTextView.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8769652129792L, 65339);
          int i = ((Integer)paramAnonymousView.getTag()).intValue();
          paramAnonymousView = (b.b)b.this.qgO.get(Long.valueOf(paramb.pYd));
          int j = ((a)b.this.qgR.qhH.get(i)).qgx;
          if (paramAnonymousView != null) {
            paramAnonymousView.Hf("3:" + j + ":" + localTextView.getText());
          }
          if (((a)b.this.qgR.qhH.get(i)).qgB == 1)
          {
            Intent localIntent = new Intent();
            localIntent.setClass(b.this.mContext, SnsCommentUI.class);
            localIntent.putExtra("sns_comment_type", 2);
            localIntent.putExtra("sns_id", paramb.pYd);
            localIntent.putExtra("sns_uxinfo", paramAnonymousView.qhb);
            localIntent.putExtra("action_st_time", paramAnonymousView.qhc);
            localIntent.putExtra("sns_actionresult", paramAnonymousView.qha.toString());
            ((MMActivity)b.this.mContext).startActivity(localIntent);
            b.this.qgO.remove(Long.valueOf(paramb.pYd));
            b.this.bif();
            GMTrace.o(8769652129792L, 65339);
            return;
          }
          b.this.a(paramAnonymousView);
          b.this.bif();
          GMTrace.o(8769652129792L, 65339);
        }
      });
      j += 1;
    }
    w.i("MicroMsg.AdNotLikeAbTestHelper", "w h " + i + " " + m);
    j = i;
    if (i < k) {
      j = k;
    }
    localObject1 = localLinkedList.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (TextView)((Iterator)localObject1).next();
      localObject3 = ((TextView)localObject2).getLayoutParams();
      ((ViewGroup.LayoutParams)localObject3).width = j;
      ((ViewGroup.LayoutParams)localObject3).height = ((int)f);
      ((TextView)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject3);
    }
    new Rect();
    k = com.tencent.mm.pluginsdk.e.dG(this.mContext);
    localObject1 = paramb.pYc.bnX();
    n = BackwardSupportUtil.b.a(this.mContext, 2.0F);
    i1 = localObject1[0];
    int i2 = localObject1[1];
    int i3 = this.pWC;
    paramb = paramb.pYc;
    if (paramb.qSi != null) {}
    for (i = paramb.qSi.getHeight();; i = 0)
    {
      paramAbsoluteLayout.updateViewLayout(paramView, new AbsoluteLayout.LayoutParams(-2, -2, i1 - j - n, i2 - i3 - k + m - i));
      GMTrace.o(8779047370752L, 65409);
      return;
    }
  }
  
  public final void a(b paramb)
  {
    GMTrace.i(8778644717568L, 65406);
    this.qgO.remove(Long.valueOf(paramb.hNx));
    paramb.rB();
    GMTrace.o(8778644717568L, 65406);
  }
  
  public final boolean bif()
  {
    int j = 0;
    GMTrace.i(8779315806208L, 65411);
    if (this.qgF != null)
    {
      Object localObject;
      int i;
      if ((this.qgF.getTag() instanceof a))
      {
        localObject = (a)this.qgF.getTag();
        localObject = (b)this.qgO.get(Long.valueOf(((a)localObject).pYd));
        if (localObject != null)
        {
          if ((((b)localObject).qha != null) && (((b)localObject).qha.length() != 0)) {
            break label153;
          }
          i = 0;
          if (i == 0) {
            break label181;
          }
          i = j;
          if (((b)localObject).qha != null)
          {
            if (((b)localObject).qha.length() != 0) {
              break label158;
            }
            i = j;
          }
          label110:
          if (i != 0) {
            ((b)localObject).Hf("2:0:");
          }
          a((b)localObject);
        }
      }
      for (;;)
      {
        this.qgE.removeView(this.qgF);
        this.qgF = null;
        GMTrace.o(8779315806208L, 65411);
        return true;
        label153:
        i = 1;
        break;
        label158:
        i = j;
        if (!((b)localObject).qha.toString().startsWith("1:0")) {
          break label110;
        }
        i = 1;
        break label110;
        label181:
        ((b)localObject).Hf("2:0:");
        a((b)localObject);
      }
    }
    this.qgI = false;
    GMTrace.o(8779315806208L, 65411);
    return false;
  }
  
  public final void c(View paramView1, View paramView2)
  {
    GMTrace.i(16046803124224L, 119558);
    paramView1.getTag();
    paramView2.setVisibility(0);
    this.qgI = true;
    this.qgG.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8777436758016L, 65397);
        b.this.qgI = false;
        GMTrace.o(8777436758016L, 65397);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8777570975744L, 65398);
        GMTrace.o(8777570975744L, 65398);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8777302540288L, 65396);
        b.this.qgI = true;
        GMTrace.o(8777302540288L, 65396);
      }
    });
    paramView2.startAnimation(this.qgG);
    GMTrace.o(16046803124224L, 119558);
  }
  
  public final int cs(final View paramView)
  {
    GMTrace.i(8778913153024L, 65408);
    if (this.qgI)
    {
      GMTrace.o(8778913153024L, 65408);
      return 0;
    }
    if (this.qgF != null)
    {
      if ((this.qgF.getTag() instanceof a))
      {
        paramView = ((a)this.qgF.getTag()).pVI;
        this.qgI = true;
        paramView.startAnimation(this.qgH);
        this.qgH.setAnimationListener(new Animation.AnimationListener()
        {
          public final void onAnimationEnd(Animation paramAnonymousAnimation)
          {
            GMTrace.i(8769383694336L, 65337);
            if (paramView != null)
            {
              paramView.clearAnimation();
              paramView.setVisibility(8);
              b.this.bif();
            }
            b.this.qgI = false;
            GMTrace.o(8769383694336L, 65337);
          }
          
          public final void onAnimationRepeat(Animation paramAnonymousAnimation)
          {
            GMTrace.i(8769249476608L, 65336);
            GMTrace.o(8769249476608L, 65336);
          }
          
          public final void onAnimationStart(Animation paramAnonymousAnimation)
          {
            GMTrace.i(8769115258880L, 65335);
            b.this.qgI = true;
            GMTrace.o(8769115258880L, 65335);
          }
        });
      }
      for (;;)
      {
        GMTrace.o(8778913153024L, 65408);
        return 0;
        bif();
      }
    }
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof com.tencent.mm.plugin.sns.data.b)))
    {
      GMTrace.o(8778913153024L, 65408);
      return 0;
    }
    if ((!this.fxs) || (this.qgR == null))
    {
      GMTrace.o(8778913153024L, 65408);
      return 2;
    }
    final Object localObject1 = (com.tencent.mm.plugin.sns.data.b)paramView.getTag();
    long l = ((com.tencent.mm.plugin.sns.data.b)localObject1).pYd;
    Object localObject2 = ((com.tencent.mm.plugin.sns.data.b)localObject1).pYc.qSm;
    boolean bool;
    if (this.qgS.containsKey(Long.valueOf(l))) {
      bool = ((Boolean)this.qgS.get(Long.valueOf(l))).booleanValue();
    }
    while (!bool)
    {
      GMTrace.o(8778913153024L, 65408);
      return 2;
      if (this.qgR == null)
      {
        bool = false;
      }
      else if (localObject2 == null)
      {
        bool = false;
      }
      else
      {
        i = 0;
        for (;;)
        {
          if (i >= this.qgR.qhH.size()) {
            break label341;
          }
          if (bg.mZ(a((a)this.qgR.qhH.get(i), ((com.tencent.mm.plugin.sns.storage.b)localObject2).qlU)))
          {
            this.qgS.put(Long.valueOf(l), Boolean.valueOf(false));
            bool = false;
            break;
          }
          i += 1;
        }
        label341:
        this.qgS.put(Long.valueOf(l), Boolean.valueOf(true));
        bool = true;
      }
    }
    localObject2 = ((com.tencent.mm.plugin.sns.data.b)localObject1).fxL;
    final Object localObject3 = new b(((com.tencent.mm.plugin.sns.data.b)localObject1).pYd, ((com.tencent.mm.plugin.sns.data.b)localObject1).pYc.bnW(), this.qgR.qhe, this.qgR.qhf, this.mContext.getString(i.j.pRB));
    this.qgO.put(Long.valueOf(((com.tencent.mm.plugin.sns.data.b)localObject1).pYd), localObject3);
    if (this.qgQ.contains(Long.valueOf(((com.tencent.mm.plugin.sns.data.b)localObject1).pYd))) {
      this.qgQ.remove(Long.valueOf(((com.tencent.mm.plugin.sns.data.b)localObject1).pYd));
    }
    this.qgF = new AbsoluteLayout(this.mContext);
    this.qgF.setId(i.f.cMc);
    new FrameLayout.LayoutParams(-1, -1);
    this.qgE.addView(this.qgF);
    localObject3 = com.tencent.mm.ui.v.fa(this.mContext).inflate(i.g.pNU, null);
    Object localObject4 = new TextView[3];
    ImageView[] arrayOfImageView = new ImageView[3];
    localObject4[0] = ((TextView)((View)localObject3).findViewById(i.f.pHV));
    localObject4[1] = ((TextView)((View)localObject3).findViewById(i.f.pIa));
    localObject4[2] = ((TextView)((View)localObject3).findViewById(i.f.pHZ));
    arrayOfImageView[0] = ((ImageView)((View)localObject3).findViewById(i.f.pHW));
    arrayOfImageView[1] = ((ImageView)((View)localObject3).findViewById(i.f.pHY));
    arrayOfImageView[2] = ((ImageView)((View)localObject3).findViewById(i.f.pHX));
    int j = 0;
    int i = 0;
    if (!t.dy(((com.tencent.mm.plugin.sns.data.b)localObject1).pYd))
    {
      k = 0;
      for (;;)
      {
        j = i;
        if (k >= this.qgM.length) {
          break;
        }
        j = i;
        if (this.qgM[k] == 3) {
          j = i + 1;
        }
        k += 1;
        i = j;
      }
    }
    int k = 0;
    i = 0;
    while (i < this.qgM.length)
    {
      m = k;
      if (this.qgM[i] == 0) {
        m = k + 1;
      }
      i += 1;
      k = m;
    }
    if (k + j > 0)
    {
      i = this.qgM.length - k - j;
      if (i == 0)
      {
        GMTrace.o(8778913153024L, 65408);
        return 2;
      }
    }
    for (this.qgN = new int[i];; this.qgN = new int[this.qgM.length])
    {
      i = 0;
      for (k = 0; i < this.qgM.length; k = m)
      {
        m = k;
        if (this.qgM[i] != 0) {
          if (j > 0)
          {
            m = k;
            if (this.qgM[i] == 3) {}
          }
          else
          {
            this.qgN[k] = this.qgM[i];
            m = k + 1;
          }
        }
        i += 1;
      }
    }
    if (t.dx(((com.tencent.mm.plugin.sns.data.b)localObject1).pYd))
    {
      i = 0;
      if (i < this.qgN.length)
      {
        if (this.qgN[i] != 3) {
          break label1153;
        }
        this.qgN[i] = 4;
      }
    }
    i = 0;
    int m = com.tencent.mm.bq.a.fromDPToPix(this.mContext, 12);
    int n = com.tencent.mm.bq.a.fromDPToPix(this.mContext, 8);
    int i1 = com.tencent.mm.bq.a.fromDPToPix(this.mContext, 12);
    j = 0;
    label942:
    final int i2;
    int i3;
    if (j < this.qgN.length)
    {
      i2 = this.qgN[j];
      i3 = this.qgN[j] - 1;
      localObject4[j].setText(this.qgL[i3]);
      Object localObject5 = localObject4[j];
      Paint localPaint = new Paint();
      String str = ((TextView)localObject5).getText().toString();
      localPaint.setTextSize(((TextView)localObject5).getTextSize());
      k = (int)localPaint.measureText(str, 0, str.length()) + (m * 2 + n * 2 + i1);
      if (k <= i) {
        break label1472;
      }
      i = k;
    }
    label1153:
    label1472:
    for (;;)
    {
      localObject4[j].setCompoundDrawablePadding(com.tencent.mm.bq.a.fromDPToPix(this.mContext, 8));
      localObject4[j].setCompoundDrawablesWithIntrinsicBounds(this.mContext.getResources().getDrawable(this.qgK[i3]), null, null, null);
      if (i3 == 1) {
        arrayOfImageView[j].setVisibility(0);
      }
      for (;;)
      {
        localObject4[j].setTag(localObject1);
        localObject4[j].setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(8770725871616L, 65347);
            b localb = b.this;
            int j = i2;
            paramAnonymousView = localObject1;
            Object localObject = localObject3;
            AbsoluteLayout localAbsoluteLayout = b.this.qgF;
            w.d("MicroMsg.AdNotLikeAbTestHelper", "processFristButtonClick " + j + " " + paramAnonymousView.pYd);
            b.b localb1 = (b.b)localb.qgO.get(Long.valueOf(paramAnonymousView.pYd));
            if (localb1 != null) {
              if (j != 4) {
                break label441;
              }
            }
            label321:
            label441:
            for (int i = 3;; i = j)
            {
              localb1.Hf("1:" + i + ":" + localb.mContext.getString(localb.qgJ[(j - 1)]));
              if (j == 1)
              {
                localObject = com.tencent.mm.plugin.sns.model.ae.bhp().HA(paramAnonymousView.fxL);
                if (localObject != null)
                {
                  if (((m)localObject).uF(32))
                  {
                    paramAnonymousView = ((m)localObject).bjJ();
                    if (paramAnonymousView != null) {
                      break label321;
                    }
                  }
                  for (paramAnonymousView = "";; paramAnonymousView = paramAnonymousView.iLj)
                  {
                    ((com.tencent.mm.plugin.sns.b.c)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.sns.b.c.class)).a(11855, ((m)localObject).bkt(), new Object[] { Integer.valueOf(3), paramAnonymousView, Integer.valueOf(((m)localObject).bkt()) });
                    com.tencent.mm.plugin.sns.model.ae.bhr().delete(((m)localObject).field_snsId);
                    com.tencent.mm.plugin.sns.model.ae.bht().dK(((m)localObject).field_snsId);
                    paramAnonymousView = new q(((m)localObject).field_snsId, 8);
                    com.tencent.mm.kernel.h.xA();
                    com.tencent.mm.kernel.h.xy().gQO.a(paramAnonymousView, 0);
                    localb.a(localb1);
                    localb.bif();
                    GMTrace.o(8770725871616L, 65347);
                    return;
                  }
                }
              }
              else
              {
                if (j == 2)
                {
                  localb.a((View)localObject, localAbsoluteLayout, paramAnonymousView);
                  GMTrace.o(8770725871616L, 65347);
                  return;
                }
                if (j == 3)
                {
                  if (!t.dx(paramAnonymousView.pYd)) {
                    t.dv(paramAnonymousView.pYd);
                  }
                  localb.a(localb1);
                  localb.bif();
                  GMTrace.o(8770725871616L, 65347);
                  return;
                }
                if (j == 4)
                {
                  if (t.dx(paramAnonymousView.pYd)) {
                    t.dw(paramAnonymousView.pYd);
                  }
                  localb.a(localb1);
                  localb.bif();
                }
              }
              GMTrace.o(8770725871616L, 65347);
              return;
            }
          }
        });
        j += 1;
        break label942;
        i += 1;
        break;
        arrayOfImageView[j].setVisibility(8);
      }
      j = 0;
      while (j < this.qgN.length)
      {
        localObject4[j].setMaxWidth(i);
        j += 1;
      }
      j = this.qgN.length;
      while (j < 3)
      {
        localObject4[j].setVisibility(8);
        j += 1;
      }
      new Rect();
      j = com.tencent.mm.pluginsdk.e.dG(this.mContext);
      localObject4 = ((com.tencent.mm.plugin.sns.data.b)localObject1).pYc.bnX();
      w.d("MicroMsg.AdNotLikeAbTestHelper", "addCommentView getLocationInWindow " + localObject4[0] + "  " + localObject4[1] + " height: " + j);
      i += com.tencent.mm.bq.a.fromDPToPix(this.mContext, 12);
      k = BackwardSupportUtil.b.a(this.mContext, 17.0F);
      m = BackwardSupportUtil.b.a(this.mContext, 2.0F);
      this.pWC = com.tencent.mm.pluginsdk.e.dH(this.mContext);
      localObject4 = new AbsoluteLayout.LayoutParams(i, -2, localObject4[0] - i - m, localObject4[1] - this.pWC - j + k);
      localObject1 = new a((String)localObject2, (View)localObject3, ((com.tencent.mm.plugin.sns.data.b)localObject1).pYd, ((com.tencent.mm.plugin.sns.data.b)localObject1).pYc.qSm);
      this.qgF.setTag(localObject1);
      this.qgF.addView((View)localObject3, (ViewGroup.LayoutParams)localObject4);
      ((View)localObject3).setVisibility(8);
      this.qgI = true;
      new com.tencent.mm.sdk.platformtools.ae().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8779852677120L, 65415);
          b.this.c(paramView, localObject3);
          GMTrace.o(8779852677120L, 65415);
        }
      });
      GMTrace.o(8778913153024L, 65408);
      return 1;
    }
  }
  
  final class a
  {
    View pVI;
    long pYd;
    String qgY;
    com.tencent.mm.plugin.sns.storage.b qgZ;
    
    public a(String paramString, View paramView, long paramLong, com.tencent.mm.plugin.sns.storage.b paramb)
    {
      GMTrace.i(8773276008448L, 65366);
      this.pVI = null;
      this.qgY = paramString;
      this.pVI = paramView;
      this.qgZ = paramb;
      this.pYd = paramLong;
      GMTrace.o(8773276008448L, 65366);
    }
  }
  
  static final class b
  {
    long hNx;
    StringBuffer qha;
    String qhb;
    long qhc;
    long qhd;
    String qhe;
    String qhf;
    
    public b(long paramLong, String paramString1, String paramString2, String paramString3)
    {
      GMTrace.i(8771933831168L, 65356);
      this.qha = new StringBuffer();
      this.qhb = paramString1;
      this.qhe = paramString2;
      this.qhf = paramString3;
      this.hNx = paramLong;
      this.qhc = System.currentTimeMillis();
      this.qha.append("0:0:");
      GMTrace.o(8771933831168L, 65356);
    }
    
    public b(long paramLong, String paramString1, String paramString2, String paramString3, String paramString4)
    {
      GMTrace.i(8771799613440L, 65355);
      this.qha = new StringBuffer();
      this.qhb = paramString1;
      this.qhe = paramString2;
      this.qhf = paramString3;
      this.hNx = paramLong;
      this.qhc = System.currentTimeMillis();
      this.qha.append("1:0:" + paramString4);
      GMTrace.o(8771799613440L, 65355);
    }
    
    public final void Hf(String paramString)
    {
      GMTrace.i(8772068048896L, 65357);
      w.d("MicroMsg.AdNotLikeAbTestHelper", "addactionResult " + paramString);
      if (this.qha.length() != 0) {
        this.qha.append("|");
      }
      this.qha.append(paramString);
      GMTrace.o(8772068048896L, 65357);
    }
    
    public final void rB()
    {
      GMTrace.i(8772202266624L, 65358);
      this.qhd = System.currentTimeMillis();
      w.d("MicroMsg.AdNotLikeAbTestHelper", "report abtestnotlike " + this.hNx + " uxinfo:" + this.qhb + " actionresult: " + this.qha + " " + this.qhc + " " + this.qhd);
      com.tencent.mm.plugin.report.service.g.paX.i(11988, new Object[] { this.qhf, this.qhe, "", "", i.jdMethod_do(this.hNx), this.qhb, this.qha, Long.valueOf(this.qhc / 1000L), Long.valueOf(this.qhd / 1000L) });
      GMTrace.o(8772202266624L, 65358);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */