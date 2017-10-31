package com.tencent.mm.plugin.sns.f;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.text.SpannableString;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.k;
import com.tencent.mm.g.a.kb;
import com.tencent.mm.g.a.kc;
import com.tencent.mm.g.b.af;
import com.tencent.mm.kernel.b;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.q;
import com.tencent.mm.plugin.sns.ui.a.a.c;
import com.tencent.mm.plugin.sns.ui.ab;
import com.tencent.mm.plugin.sns.ui.av;
import com.tencent.mm.plugin.sns.ui.bf;
import com.tencent.mm.pluginsdk.ui.d.m;
import com.tencent.mm.pluginsdk.ui.d.m.a;
import com.tencent.mm.protocal.c.bdk;
import com.tencent.mm.protocal.c.bds;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.t;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class c
  implements com.tencent.mm.ac.e, com.tencent.mm.plugin.sns.model.e
{
  public static final Pattern qho;
  public static final Pattern qhp;
  private com.tencent.mm.plugin.sns.g.c qbL;
  public final int qgC;
  public final int qhg;
  private List<d> qhh;
  public ListView qhi;
  public av qhj;
  public Map<Long, Integer> qhk;
  public HashSet<Long> qhl;
  public HashSet<Long> qhm;
  private HashMap<Long, a> qhn;
  private m.a qhq;
  
  static
  {
    GMTrace.i(8776631451648L, 65391);
    qho = Pattern.compile("\\{richtext:([\\s\\S]*?)\\}");
    qhp = Pattern.compile("\\{sex:([\\s\\S]*?):([\\s\\S]*?):([\\s\\S]*?)\\}");
    GMTrace.o(8776631451648L, 65391);
  }
  
  public c()
  {
    GMTrace.i(8774081314816L, 65372);
    this.qgC = 14;
    this.qhg = 500;
    this.qhk = new HashMap();
    this.qhl = new HashSet();
    this.qhm = new HashSet();
    this.qhn = new HashMap();
    this.qhq = new m.a()
    {
      public final void bp(Object paramAnonymousObject)
      {
        GMTrace.i(8773947097088L, 65371);
        GMTrace.o(8773947097088L, 65371);
      }
    };
    GMTrace.o(8774081314816L, 65372);
  }
  
  private SpannableString a(final Context paramContext, TextView paramTextView, String paramString, final bdk parambdk, final a.c paramc, final d.a parama, final d.b paramb, final d paramd)
  {
    GMTrace.i(8775826145280L, 65385);
    Object localObject = qho.matcher(paramString);
    if ((((Matcher)localObject).find()) && (((Matcher)localObject).groupCount() == 1))
    {
      String str = ((Matcher)localObject).group();
      localObject = ((Matcher)localObject).group(1);
      int i = paramString.indexOf(str);
      paramString = paramString.replace(str, (CharSequence)localObject);
      paramTextView.setOnClickListener(null);
      paramTextView.setClickable(true);
      paramString = new SpannableString(paramString);
      paramTextView.setOnTouchListener(new ab());
      paramString.setSpan(new m(parambdk.twR, new m.a()
      {
        public final void bp(Object paramAnonymousObject)
        {
          GMTrace.i(8773544443904L, 65368);
          c.this.a(paramContext, parambdk, parama, paramb, paramc, paramd);
          GMTrace.o(8773544443904L, 65368);
        }
      }), i, ((String)localObject).length() + i, 33);
      GMTrace.o(8775826145280L, 65385);
      return paramString;
    }
    paramContext = com.tencent.mm.pluginsdk.ui.d.h.a(paramContext, paramString);
    GMTrace.o(8775826145280L, 65385);
    return paramContext;
  }
  
  private static String a(String paramString, bdk parambdk)
  {
    GMTrace.i(8775691927552L, 65384);
    Object localObject = paramString;
    try
    {
      if (bg.mZ(paramString))
      {
        GMTrace.o(8775691927552L, 65384);
        return "";
      }
      localObject = paramString;
      parambdk = parambdk.twR;
      localObject = paramString;
      com.tencent.mm.kernel.h.xA();
      localObject = paramString;
      x localx = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yL().SL(parambdk);
      parambdk = paramString;
      localObject = paramString;
      if (paramString.contains("{username}"))
      {
        localObject = paramString;
        parambdk = paramString.replace("{username}", localx.vq());
      }
      localObject = parambdk;
      int i = localx.gbM;
      if (i == 1)
      {
        i = 0;
        paramString = parambdk;
      }
      w.printErrStackTrace("MicroMsg.SnSABTestMgr", parambdk, "settext error ", new Object[0]);
    }
    catch (Exception paramString)
    {
      try
      {
        parambdk = qhp.matcher(paramString);
        if ((parambdk.find()) && (parambdk.groupCount() == 3))
        {
          localObject = parambdk.group();
          if (i == 0) {
            parambdk = parambdk.group(1);
          }
          for (;;)
          {
            parambdk = paramString.replace((CharSequence)localObject, parambdk);
            paramString = parambdk;
            break;
            localObject = parambdk;
            i = localx.gbM;
            if (i == 2)
            {
              i = 1;
              paramString = parambdk;
              break;
            }
            i = 2;
            paramString = parambdk;
            break;
            if (i == 1) {
              parambdk = parambdk.group(2);
            } else {
              parambdk = parambdk.group(3);
            }
          }
        }
        GMTrace.o(8775691927552L, 65384);
        return paramString;
      }
      catch (Exception parambdk)
      {
        for (;;) {}
      }
      paramString = paramString;
      parambdk = paramString;
      paramString = (String)localObject;
    }
    GMTrace.o(8775691927552L, 65384);
    return paramString;
  }
  
  private static void a(a parama)
  {
    GMTrace.i(8776228798464L, 65388);
    Object localObject = parama.qhA;
    if (localObject == null)
    {
      GMTrace.o(8776228798464L, 65388);
      return;
    }
    String str2 = ((d)localObject).qhf;
    String str3 = ((d)localObject).qhe;
    String str4 = parama.qhF;
    parama.o(parama.qhB, parama.qhC, 0, 0);
    String str1 = parama.qhE;
    localObject = str1;
    if (bg.mZ(str1)) {
      localObject = parama.qhB + ":" + parama.qhC + ":0:0";
    }
    long l1 = parama.mStartTime / 1000L;
    if (parama.mEndTime == -1L) {
      parama.mEndTime = System.currentTimeMillis();
    }
    long l2 = parama.mEndTime / 1000L;
    if (parama != null)
    {
      w.i("MicroMsg.SnSABTestMgr", "report layerId: " + str2 + " expid " + str3 + " acton " + (String)localObject + " starttime " + l1 + " timelineId: " + str4);
      g.paX.i(11917, new Object[] { str2, str3, "", "", Integer.valueOf(1), str4, localObject, Long.valueOf(l1), Long.valueOf(l2) });
    }
    GMTrace.o(8776228798464L, 65388);
  }
  
  private void a(a.c paramc)
  {
    GMTrace.i(15698910773248L, 116966);
    if (paramc == null)
    {
      GMTrace.o(15698910773248L, 116966);
      return;
    }
    Context localContext = paramc.msJ.getContext();
    if (localContext == null)
    {
      GMTrace.o(15698910773248L, 116966);
      return;
    }
    if (paramc.msJ.getBackground() == null)
    {
      paramc.msJ.setBackgroundResource(i.e.aYc);
      paramc.msJ.setPadding(com.tencent.mm.bq.a.fromDPToPix(localContext, 12), com.tencent.mm.bq.a.fromDPToPix(localContext, 12), com.tencent.mm.bq.a.fromDPToPix(localContext, 12), com.tencent.mm.bq.a.fromDPToPix(localContext, 8));
    }
    int i = paramc.position;
    if (this.qhj != null)
    {
      paramc = (WeakReference)this.qhj.qPk.get(Integer.valueOf(i - 1));
      if ((paramc == null) || (paramc.get() == null))
      {
        GMTrace.o(15698910773248L, 116966);
        return;
      }
      ((View)paramc.get()).setBackgroundResource(i.e.aYc);
      ((View)paramc.get()).setPadding(com.tencent.mm.bq.a.fromDPToPix(localContext, 12), com.tencent.mm.bq.a.fromDPToPix(localContext, 12), com.tencent.mm.bq.a.fromDPToPix(localContext, 12), com.tencent.mm.bq.a.fromDPToPix(localContext, 8));
    }
    GMTrace.o(15698910773248L, 116966);
  }
  
  private boolean a(final Context paramContext, bdk parambdk, final a.c paramc, final d.b paramb, final d paramd)
  {
    GMTrace.i(15698776555520L, 116965);
    paramc.msJ.setBackgroundDrawable(null);
    int i = paramc.position;
    Object localObject1;
    if (this.qhj != null)
    {
      localObject1 = (WeakReference)this.qhj.qPk.get(Integer.valueOf(i - 1));
      if ((localObject1 != null) && (((WeakReference)localObject1).get() != null)) {
        break label263;
      }
    }
    final Object localObject2;
    for (;;)
    {
      if (!paramc.qUt)
      {
        paramc.qUu = paramc.qUs.inflate();
        paramc.qUt = true;
        paramc.qUv = ((LinearLayout)paramc.qUu.findViewById(i.f.pLg));
      }
      paramc.qUu.setVisibility(0);
      paramc.qUG.setVisibility(8);
      paramc.iiL.setVisibility(8);
      localObject1 = paramb.iJN;
      if (((List)localObject1).size() == paramc.qUv.getChildCount()) {
        break;
      }
      paramc.qUv.removeAllViews();
      int j = com.tencent.mm.bq.a.fromDPToPix(paramContext, 10);
      i = 0;
      while (i < ((List)localObject1).size())
      {
        localObject2 = new TextView(paramContext);
        ((TextView)localObject2).setBackgroundResource(i.e.pGF);
        ((TextView)localObject2).setPadding(j, j, j, j);
        ((TextView)localObject2).setTextSize(1, 14.0F * com.tencent.mm.bq.a.dZ(paramContext));
        ((TextView)localObject2).setTextColor(paramContext.getResources().getColor(i.c.black));
        paramc.qUv.addView((View)localObject2);
        i += 1;
      }
      label263:
      ((View)((WeakReference)localObject1).get()).setBackgroundDrawable(null);
    }
    i = 0;
    while (i < ((List)localObject1).size())
    {
      localObject2 = (d.a)((List)localObject1).get(i);
      TextView localTextView = (TextView)paramc.qUv.getChildAt(i);
      localTextView.setText(((d.a)localObject2).qhI);
      localTextView.setTag(parambdk);
      String str = a(f.a((d.a)localObject2), parambdk);
      localTextView.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8771665395712L, 65354);
          c.this.a(paramContext, paramAnonymousView, localObject2, paramb, paramc, paramd);
          GMTrace.o(8771665395712L, 65354);
        }
      });
      localTextView.setText(a(paramContext, localTextView, str, parambdk, paramc, (d.a)localObject2, paramb, paramd), TextView.BufferType.SPANNABLE);
      if (((d.a)localObject2).actionType != 5)
      {
        localTextView.setCompoundDrawablePadding(com.tencent.mm.bq.a.fromDPToPix(paramContext, 5));
        localTextView.setCompoundDrawablesWithIntrinsicBounds(paramContext.getResources().getDrawable(i.i.pQa), null, null, null);
      }
      i += 1;
    }
    GMTrace.o(15698776555520L, 116965);
    return true;
  }
  
  private static void b(a.c paramc)
  {
    GMTrace.i(8775557709824L, 65383);
    if (paramc == null)
    {
      GMTrace.o(8775557709824L, 65383);
      return;
    }
    if (paramc.qUn != null) {
      paramc.qUn.setVisibility(8);
    }
    if (paramc.qUp != null) {
      paramc.qUp.setVisibility(8);
    }
    if (paramc.qUs != null) {
      paramc.qUs.setVisibility(8);
    }
    if (paramc.qUu != null) {
      paramc.qUu.setVisibility(8);
    }
    if (paramc.qUG.getVisibility() == 8) {
      paramc.qUG.setVisibility(0);
    }
    if (paramc.iiL.getVisibility() == 8) {
      paramc.iiL.setVisibility(0);
    }
    if (paramc.msJ.getVisibility() == 8) {
      paramc.msJ.setVisibility(0);
    }
    GMTrace.o(8775557709824L, 65383);
  }
  
  private boolean b(final Context paramContext, final bdk parambdk, final a.c paramc, final d.b paramb, final d paramd)
  {
    GMTrace.i(8775155056640L, 65380);
    if (paramb.iJN.size() == 2)
    {
      final d.a locala1 = (d.a)paramb.iJN.get(0);
      final d.a locala2 = (d.a)paramb.iJN.get(1);
      String str1 = a(f.a(locala1), parambdk);
      String str2 = a(f.a(locala2), parambdk);
      com.tencent.mm.ui.base.h.a(paramContext, a(paramb.title, parambdk), paramContext.getString(i.j.dxm), str1, str2, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(8770457436160L, 65345);
          w.i("MicroMsg.SnSABTestMgr", "onClick alert1");
          c.this.a(paramContext, parambdk, locala1, paramb, paramc, paramd);
          GMTrace.o(8770457436160L, 65345);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(8772470702080L, 65360);
          w.i("MicroMsg.SnSABTestMgr", "onClick alert2");
          c.this.a(paramContext, parambdk, locala2, paramb, paramc, paramd);
          GMTrace.o(8772470702080L, 65360);
        }
      });
      GMTrace.o(8775155056640L, 65380);
      return true;
    }
    GMTrace.o(8775155056640L, 65380);
    return false;
  }
  
  public static void c(View paramView, a.c paramc)
  {
    GMTrace.i(8774752403456L, 65377);
    paramc.qUo = false;
    paramc.qUn = ((ViewStub)paramView.findViewById(i.f.pMT));
    paramc.qUn.setVisibility(8);
    paramc.qUs = ((ViewStub)paramView.findViewById(i.f.pMi));
    paramc.qUs.setVisibility(8);
    GMTrace.o(8774752403456L, 65377);
  }
  
  private void dG(long paramLong)
  {
    GMTrace.i(8774483968000L, 65375);
    if (this.qbL == null) {
      this.qbL = new com.tencent.mm.plugin.sns.g.c();
    }
    if (this.qbL.qhX.size() > 500) {
      this.qbL.qhX.remove(0);
    }
    this.qbL.qhX.add(Long.valueOf(paramLong));
    GMTrace.o(8774483968000L, 65375);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8774215532544L, 65373);
    w.i("MicroMsg.SnSABTestMgr", "onSceneend " + paramInt1 + " errCode " + paramInt2);
    paramString = new kb();
    com.tencent.mm.sdk.b.a.uLm.m(paramString);
    GMTrace.o(8774215532544L, 65373);
  }
  
  public final void a(int paramInt, String paramString1, long paramLong, String paramString2, bhc parambhc, boolean paramBoolean)
  {
    GMTrace.i(8776094580736L, 65387);
    if (this.qhn.containsKey(Long.valueOf(paramLong)))
    {
      paramString1 = (a)this.qhn.get(Long.valueOf(paramLong));
      if (paramString1.mEndTime == -1L) {
        paramString1.mEndTime = System.currentTimeMillis();
      }
      paramString1.o(paramString1.qhB, paramString1.qhC, 0, 0);
    }
    GMTrace.o(8776094580736L, 65387);
  }
  
  public final void a(int paramInt, String paramString1, long paramLong, String paramString2, bhc parambhc, boolean paramBoolean, bf parambf)
  {
    GMTrace.i(8775960363008L, 65386);
    GMTrace.o(8775960363008L, 65386);
  }
  
  public final void a(Context paramContext, View paramView, d.a parama, d.b paramb, a.c paramc, d paramd)
  {
    GMTrace.i(16046668906496L, 119557);
    w.i("MicroMsg.SnSABTestMgr", "processButtonClick");
    if (!(paramView.getTag() instanceof bdk))
    {
      GMTrace.o(16046668906496L, 119557);
      return;
    }
    a(paramContext, (bdk)paramView.getTag(), parama, paramb, paramc, paramd);
    GMTrace.o(16046668906496L, 119557);
  }
  
  public final void a(Context paramContext, bdk parambdk, d.a parama, d.b paramb, a.c paramc, d paramd)
  {
    GMTrace.i(8775423492096L, 65382);
    w.i("MicroMsg.SnSABTestMgr", "processButtonClick snsobj " + parambdk.twR + " " + parambdk.tDg);
    int i = parama.qhK - 1;
    a locala = (a)this.qhn.get(Long.valueOf(parambdk.tDg));
    if (locala != null)
    {
      locala.o(paramb.showType, paramb.iJN.size(), parama.index, parama.actionType);
      locala.qhB = -1;
      locala.qhC = -1;
    }
    if (parama.actionType == 3)
    {
      this.qhl.add(Long.valueOf(parambdk.tDg));
      this.qhk.put(Long.valueOf(parambdk.tDg), Integer.valueOf(i));
    }
    for (;;)
    {
      if ((i == 4) || (i == 1)) {
        a(paramContext, parambdk, paramc);
      }
      GMTrace.o(8775423492096L, 65382);
      return;
      if (parama.actionType == 1)
      {
        this.qhk.put(Long.valueOf(parambdk.tDg), Integer.valueOf(i));
        dG(parambdk.tDg);
        b(paramc);
      }
      else
      {
        if (parama.actionType == 5)
        {
          if (this.qhl.contains(Long.valueOf(parambdk.tDg)))
          {
            this.qhl.remove(Long.valueOf(parambdk.tDg));
            dG(parambdk.tDg);
            b(paramc);
            if (this.qhn.containsKey(Long.valueOf(parambdk.tDg))) {
              a((a)this.qhn.remove(Long.valueOf(parambdk.tDg)));
            }
          }
          this.qhk.put(Long.valueOf(parambdk.tDg), Integer.valueOf(-1));
          a(paramc);
          GMTrace.o(8775423492096L, 65382);
          return;
        }
        if (parama.actionType == 7)
        {
          if (i < paramd.qhH.size())
          {
            parama = (d.b)paramd.qhH.get(i);
            if (parama.showType == 2)
            {
              b(paramContext, parambdk, paramc, parama, paramd);
              GMTrace.o(8775423492096L, 65382);
              return;
            }
            if (parama.showType == 5)
            {
              t.makeText(paramContext, bg.ap(parama.title, ""), 0).show();
              dG(parambdk.tDg);
              b(paramc);
              GMTrace.o(8775423492096L, 65382);
            }
          }
        }
        else
        {
          if (parama.actionType == 6)
          {
            t.makeText(paramContext, bg.ap(paramContext.getString(i.j.pRs), ""), 0).show();
            this.qhm.add(Long.valueOf(parambdk.tDg));
            b(paramc);
            paramContext = new kc();
            com.tencent.mm.sdk.b.a.uLm.m(paramContext);
            a(paramc);
            GMTrace.o(8775423492096L, 65382);
            return;
          }
          if (parama.actionType == 2)
          {
            parama = parama.jumpUrl;
            w.i("MicroMsg.SnSABTestMgr", "jump url " + parama);
            paramb = new Intent();
            paramb.putExtra("rawUrl", parama);
            paramb.putExtra("useJs", true);
            com.tencent.mm.plugin.sns.c.a.ifM.j(paramb, paramContext);
            dG(parambdk.tDg);
            b(paramc);
            a(paramc);
            GMTrace.o(8775423492096L, 65382);
            return;
          }
          if (parama.actionType == 8)
          {
            GMTrace.o(8775423492096L, 65382);
            return;
          }
          if (parama.actionType == 4)
          {
            parama = parambdk.twR;
            paramb = new LinkedList();
            paramb.add(parama);
            parama = new com.tencent.mm.plugin.sns.model.v(1, 5L, "", paramb.size(), paramb, 0);
            com.tencent.mm.kernel.h.xA();
            com.tencent.mm.kernel.h.xy().gQO.a(parama, 0);
          }
        }
      }
    }
  }
  
  public final void a(final Context paramContext, bdk parambdk, final a.c paramc)
  {
    GMTrace.i(8774886621184L, 65378);
    if (!com.tencent.mm.sdk.platformtools.v.bMN())
    {
      b(paramc);
      GMTrace.o(8774886621184L, 65378);
      return;
    }
    if ((this.qhh == null) || (this.qhh.size() == 0))
    {
      b(paramc);
      GMTrace.o(8774886621184L, 65378);
      return;
    }
    if (this.qhm.contains(Long.valueOf(parambdk.tDg)))
    {
      b(paramc);
      paramc.qUG.setVisibility(8);
      paramc.iiL.setVisibility(8);
      paramc.msJ.setVisibility(8);
      GMTrace.o(8774886621184L, 65378);
      return;
    }
    if ((parambdk.twR == null) || (parambdk.twR.equals(ae.bgV())))
    {
      b(paramc);
      GMTrace.o(8774886621184L, 65378);
      return;
    }
    if ((this.qbL != null) && (this.qbL.qhX.contains(Long.valueOf(parambdk.tDg))))
    {
      b(paramc);
      GMTrace.o(8774886621184L, 65378);
      return;
    }
    if (parambdk != null) {}
    for (;;)
    {
      try
      {
        arrayOfByte = com.tencent.mm.platformtools.n.a(parambdk.uvv);
        boolean bool = bg.bp(arrayOfByte);
        if (!bool) {
          continue;
        }
        i = 0;
      }
      catch (Exception localException)
      {
        byte[] arrayOfByte;
        int k;
        i = 0;
        continue;
        final d.b localb = null;
        Object localObject2 = this.qhh.iterator();
        final Object localObject1 = localb;
        if (!((Iterator)localObject2).hasNext()) {
          continue;
        }
        localObject1 = (d)((Iterator)localObject2).next();
        if (localObject1 != null) {
          continue;
        }
        b(paramc);
        GMTrace.o(8774886621184L, 65378);
        return;
        if (((d)localObject1).qhG != i) {
          continue;
        }
        if (localObject1 != null) {
          continue;
        }
        b(paramc);
        GMTrace.o(8774886621184L, 65378);
        return;
        if (j < ((d)localObject1).qhH.size()) {
          continue;
        }
        b(paramc);
        GMTrace.o(8774886621184L, 65378);
        return;
        localb = (d.b)((d)localObject1).qhH.get(j);
        int j = localb.showType;
        b(paramc);
        if (i <= 0) {
          continue;
        }
        if (this.qhn.containsKey(Long.valueOf(parambdk.tDg))) {
          continue;
        }
        localObject2 = new a(System.currentTimeMillis(), parambdk.tDg, com.tencent.mm.plugin.sns.data.i.jdMethod_do(parambdk.tDg), (d)localObject1);
        ((a)localObject2).cV(j, localb.iJN.size());
        this.qhn.put(Long.valueOf(parambdk.tDg), localObject2);
        if (j != 1) {
          continue;
        }
        localObject2 = localb.title;
        if (paramc.qUo) {
          continue;
        }
        paramc.qUp = paramc.qUn.inflate();
        paramc.qUo = true;
        paramc.qUr = ((TextView)paramc.qUp.findViewById(i.f.pKH));
        paramc.qUq = ((LinearLayout)paramc.qUp.findViewById(i.f.pHN));
        paramc.qUp.setVisibility(0);
        paramc.qUr.setText((CharSequence)localObject2);
        localObject2 = localb.iJN;
        if (((List)localObject2).size() == paramc.qUq.getChildCount()) {
          continue;
        }
        paramc.qUq.removeAllViews();
        i = 0;
        if (i >= ((List)localObject2).size()) {
          continue;
        }
        final d.a locala = (d.a)((List)localObject2).get(i);
        TextView localTextView = new TextView(paramc.qUq.getContext());
        localTextView.setText(locala.qhI);
        localTextView.setPadding(0, 0, com.tencent.mm.bq.a.fromDPToPix(paramContext, 10), 0);
        localTextView.setVisibility(0);
        localTextView.setTextSize(1, 14.0F * com.tencent.mm.bq.a.dZ(paramContext));
        localTextView.setTextColor(paramContext.getResources().getColor(i.c.aQn));
        paramc.qUq.addView(localTextView);
        i += 1;
        continue;
        ((a)this.qhn.get(Long.valueOf(parambdk.tDg))).cV(j, localb.iJN.size());
        continue;
        i = 0;
        if (i >= ((List)localObject2).size()) {
          continue;
        }
        locala = (d.a)((List)localObject2).get(i);
        localTextView = (TextView)paramc.qUq.getChildAt(i);
        localTextView.setText(a(paramContext, localTextView, a(f.a(locala), parambdk), parambdk, paramc, locala, localb, (d)localObject1));
        localTextView.setTag(parambdk);
        localTextView.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(8777034104832L, 65394);
            c.this.a(paramContext, paramAnonymousView, locala, localb, paramc, localObject1);
            GMTrace.o(8777034104832L, 65394);
          }
        });
        i += 1;
        continue;
        GMTrace.o(8774886621184L, 65378);
        return;
        if (j != 4) {
          continue;
        }
        a(paramContext, parambdk, paramc, localb, (d)localObject1);
        GMTrace.o(8774886621184L, 65378);
        return;
        if (j != 2) {
          continue;
        }
        if (!b(paramContext, parambdk, paramc, localb, (d)localObject1)) {
          continue;
        }
        GMTrace.o(8774886621184L, 65378);
        return;
        GMTrace.o(8774886621184L, 65378);
        return;
        b(paramc);
        GMTrace.o(8774886621184L, 65378);
        return;
      }
      j = 0;
      if (this.qhk.containsKey(Long.valueOf(parambdk.tDg)))
      {
        k = ((Integer)this.qhk.get(Long.valueOf(parambdk.tDg))).intValue();
        j = k;
        if (k == -1)
        {
          b(paramc);
          GMTrace.o(8774886621184L, 65378);
          return;
          i = ((bds)new bds().aC(arrayOfByte)).uvG;
          continue;
        }
      }
      int i = 0;
    }
  }
  
  public final void clean()
  {
    GMTrace.i(8774618185728L, 65376);
    this.qhi = null;
    this.qhj = null;
    Object localObject2;
    if (this.qhl != null)
    {
      localObject1 = this.qhl.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Long)((Iterator)localObject1).next();
        q localq = new q(((Long)localObject2).longValue(), 0, 0, null);
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xy().gQO.a(localq, 0);
        w.i("MicroMsg.SnSABTestMgr", "report id " + localObject2);
      }
    }
    if (this.qhn != null)
    {
      localObject1 = this.qhn.values().iterator();
      while (((Iterator)localObject1).hasNext()) {
        a((a)((Iterator)localObject1).next());
      }
      this.qhn.clear();
    }
    if ((this.qhh.size() == 0) || (this.qbL == null))
    {
      GMTrace.o(8774618185728L, 65376);
      return;
    }
    long l = System.currentTimeMillis();
    Object localObject1 = new StringBuilder();
    com.tencent.mm.kernel.h.xA();
    localObject1 = com.tencent.mm.kernel.h.xz().cachePath + "ws_1100004";
    w.i("MicroMsg.SnSABTestMgr", "listToFile to list  " + (String)localObject1);
    try
    {
      localObject2 = this.qbL.toByteArray();
      com.tencent.mm.a.e.b((String)localObject1, (byte[])localObject2, localObject2.length);
      w.i("MicroMsg.SnSABTestMgr", "listTofile " + (System.currentTimeMillis() - l) + " igNoreAbTestId " + this.qbL.qhX.size());
      GMTrace.o(8774618185728L, 65376);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.SnSABTestMgr", localException, "listToFile failed: " + (String)localObject1, new Object[0]);
      GMTrace.o(8774618185728L, 65376);
    }
  }
  
  public final void init()
  {
    GMTrace.i(8774349750272L, 65374);
    Object localObject1 = new ArrayList();
    Object localObject2 = com.tencent.mm.x.c.c.Cu().Sm("10001").values().iterator();
    label257:
    while (((Iterator)localObject2).hasNext())
    {
      com.tencent.mm.storage.c localc = (com.tencent.mm.storage.c)((Iterator)localObject2).next();
      d locald = new d();
      if (localc == null)
      {
        w.i("MicroMsg.SnsABTestStrategy", "abtest is null");
      }
      else if (!localc.isValid())
      {
        w.i("MicroMsg.SnsABTestStrategy", "abtest is invalid");
      }
      else
      {
        Map localMap = localc.bPn();
        if (localMap != null)
        {
          w.i("MicroMsg.SnsABTestStrategy", "snsabtest feed " + localc.field_expId + " " + localc.field_layerId + " " + localc.field_startTime + " " + localc.field_endTime);
          locald.e(localc.field_layerId, localc.field_expId, localMap);
          if ((locald.fxs) && (locald.qhH != null) && (locald.qhH.size() > 0)) {}
          for (int i = 1;; i = 0)
          {
            if (i == 0) {
              break label257;
            }
            ((List)localObject1).add(locald);
            break;
          }
        }
      }
    }
    this.qhh = ((List)localObject1);
    this.qhk.clear();
    this.qhl.clear();
    this.qhn.clear();
    this.qbL = null;
    if ((this.qhh == null) || (this.qhh.size() == 0))
    {
      GMTrace.o(8774349750272L, 65374);
      return;
    }
    long l = System.currentTimeMillis();
    localObject1 = new StringBuilder();
    com.tencent.mm.kernel.h.xA();
    localObject1 = com.tencent.mm.kernel.h.xz().cachePath + "ws_1100004";
    w.i("MicroMsg.SnSABTestMgr", "filepath to list  " + (String)localObject1);
    localObject2 = FileOp.c((String)localObject1, 0, -1);
    if (localObject2 != null)
    {
      try
      {
        this.qbL = ((com.tencent.mm.plugin.sns.g.c)new com.tencent.mm.plugin.sns.g.c().aC((byte[])localObject2));
        w.i("MicroMsg.SnSABTestMgr", "fileToList " + (System.currentTimeMillis() - l));
        if (this.qbL == null)
        {
          w.i("MicroMsg.SnSABTestMgr", "igNoreAbTestId parser error");
          GMTrace.o(8774349750272L, 65374);
          return;
        }
      }
      catch (IOException localIOException)
      {
        w.printErrStackTrace("MicroMsg.SnSABTestMgr", localIOException, "", new Object[0]);
        FileOp.deleteFile((String)localObject1);
        GMTrace.o(8774349750272L, 65374);
        return;
      }
      w.i("MicroMsg.SnSABTestMgr", "igNoreAbTestId size " + this.qbL.qhX.size());
    }
    GMTrace.o(8774349750272L, 65374);
  }
  
  static final class a
  {
    long mEndTime;
    long mStartTime;
    long qby;
    d qhA;
    int qhB;
    int qhC;
    String qhD;
    String qhE;
    String qhF;
    
    public a(long paramLong1, long paramLong2, String paramString, d paramd)
    {
      GMTrace.i(8772873355264L, 65363);
      this.mStartTime = -1L;
      this.mEndTime = -1L;
      this.qhB = 0;
      this.qhC = 0;
      this.qhD = "";
      this.qhE = "";
      this.qhA = paramd;
      this.mStartTime = paramLong1;
      this.qby = paramLong2;
      this.qhF = paramString;
      GMTrace.o(8772873355264L, 65363);
    }
    
    public final void cV(int paramInt1, int paramInt2)
    {
      GMTrace.i(8773007572992L, 65364);
      this.qhB = paramInt1;
      this.qhC = paramInt2;
      GMTrace.o(8773007572992L, 65364);
    }
    
    public final void o(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      GMTrace.i(8773141790720L, 65365);
      if ((paramInt1 == -1) || (paramInt2 == -1))
      {
        GMTrace.o(8773141790720L, 65365);
        return;
      }
      String str1 = paramInt1 + ":" + paramInt2 + ":" + paramInt3 + ":" + paramInt4;
      String str2 = paramInt1 + ":" + paramInt2;
      if ((str1.equals(this.qhD)) || ((this.qhD.startsWith(str2)) && (paramInt3 == 0) && (paramInt4 == 0)))
      {
        GMTrace.o(8773141790720L, 65365);
        return;
      }
      this.qhD = str1;
      str1 = paramInt1 + ":" + paramInt2 + ":" + paramInt3 + ":" + paramInt4;
      if (!bg.mZ(this.qhE)) {
        this.qhE += "|";
      }
      this.qhE += str1;
      GMTrace.o(8773141790720L, 65365);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/f/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */