package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.Gallery;
import android.widget.Gallery.LayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.oz;
import com.tencent.mm.modelcontrol.c;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.network.aa;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.amp;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMPageControlView;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.base.MultiTouchImageView.a;
import com.tencent.mm.ui.tools.MMGestureGallery;
import com.tencent.mm.ui.tools.MMGestureGallery.e;
import com.tencent.mm.ui.tools.MMGestureGallery.f;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SnsInfoFlip
  extends FlipView
{
  private static int hbb;
  private static int hbc;
  private Context context;
  private com.tencent.mm.sdk.platformtools.ae handler;
  List<com.tencent.mm.plugin.sns.g.b> hip;
  boolean pYb;
  an pYm;
  boolean qGP;
  boolean qGR;
  b qJA;
  Gallery qJB;
  private boolean qJC;
  HashMap<Integer, Integer> qJD;
  HashMap<Integer, Long> qJE;
  HashMap<Integer, Long> qJF;
  boolean qJG;
  boolean qJH;
  boolean qJI;
  boolean qJJ;
  boolean qJK;
  private boolean qJL;
  private boolean qJM;
  private float qJN;
  MMPageControlView qJO;
  Runnable qJP;
  private String qJQ;
  private int qJR;
  int qJS;
  private boolean qJT;
  long qJU;
  private HashSet<String> qJV;
  private Map<String, Boolean> qJW;
  private int qJX;
  private int qJY;
  private boolean qJZ;
  c qKa;
  private HashMap<String, m> qKb;
  int qKc;
  HashSet<String> qKd;
  public int qKe;
  public int qKf;
  private HashMap<String, a> qKg;
  private MultiTouchImageView.a qKh;
  public String username;
  
  static
  {
    GMTrace.i(8441892438016L, 62897);
    hbc = 0;
    hbb = 0;
    GMTrace.o(8441892438016L, 62897);
  }
  
  public SnsInfoFlip(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(8434242027520L, 62840);
    this.pYb = false;
    this.qJC = true;
    this.qJD = new HashMap();
    this.qJE = new HashMap();
    this.qJF = new HashMap();
    this.pYm = an.vfb;
    this.qJG = false;
    this.qJH = false;
    this.qJI = false;
    this.qJJ = false;
    this.qJK = false;
    this.qJL = true;
    this.qJM = true;
    this.qJN = 1.0F;
    this.qJP = null;
    this.handler = new com.tencent.mm.sdk.platformtools.ae();
    this.qJQ = "";
    this.qJR = -1;
    this.qJS = -1;
    this.qJT = false;
    this.qGP = false;
    this.qGR = false;
    this.qJU = 0L;
    this.qJV = new HashSet();
    this.qJX = 0;
    this.qJY = 0;
    this.qJZ = false;
    this.qKb = new HashMap();
    this.qKc = -1;
    this.qKd = new HashSet();
    this.qKe = 0;
    this.qKf = 0;
    this.qKg = new HashMap();
    this.qKh = new MultiTouchImageView.a()
    {
      public final void bng()
      {
        GMTrace.i(8466991153152L, 63084);
        if ((SnsInfoFlip.g(SnsInfoFlip.this).getSelectedItem() == null) || (SnsInfoFlip.d(SnsInfoFlip.this) == null))
        {
          GMTrace.o(8466991153152L, 63084);
          return;
        }
        int i = SnsInfoFlip.g(SnsInfoFlip.this).getSelectedItemPosition();
        Object localObject = ((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.g(SnsInfoFlip.this).getSelectedItem()).qhV;
        localObject = com.tencent.mm.plugin.sns.model.ae.bhp().HA((String)localObject);
        if (localObject != null) {
          ax.d((m)localObject, i);
        }
        GMTrace.o(8466991153152L, 63084);
      }
      
      public final void bnh()
      {
        GMTrace.i(8467125370880L, 63085);
        if ((SnsInfoFlip.g(SnsInfoFlip.this).getSelectedItem() == null) || (SnsInfoFlip.d(SnsInfoFlip.this) == null))
        {
          GMTrace.o(8467125370880L, 63085);
          return;
        }
        int i = SnsInfoFlip.g(SnsInfoFlip.this).getSelectedItemPosition();
        Object localObject = ((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.g(SnsInfoFlip.this).getSelectedItem()).qhV;
        localObject = com.tencent.mm.plugin.sns.model.ae.bhp().HA((String)localObject);
        if (localObject != null) {
          ax.e((m)localObject, i);
        }
        GMTrace.o(8467125370880L, 63085);
      }
    };
    init(paramContext);
    GMTrace.o(8434242027520L, 62840);
  }
  
  public SnsInfoFlip(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8434107809792L, 62839);
    this.pYb = false;
    this.qJC = true;
    this.qJD = new HashMap();
    this.qJE = new HashMap();
    this.qJF = new HashMap();
    this.pYm = an.vfb;
    this.qJG = false;
    this.qJH = false;
    this.qJI = false;
    this.qJJ = false;
    this.qJK = false;
    this.qJL = true;
    this.qJM = true;
    this.qJN = 1.0F;
    this.qJP = null;
    this.handler = new com.tencent.mm.sdk.platformtools.ae();
    this.qJQ = "";
    this.qJR = -1;
    this.qJS = -1;
    this.qJT = false;
    this.qGP = false;
    this.qGR = false;
    this.qJU = 0L;
    this.qJV = new HashSet();
    this.qJX = 0;
    this.qJY = 0;
    this.qJZ = false;
    this.qKb = new HashMap();
    this.qKc = -1;
    this.qKd = new HashSet();
    this.qKe = 0;
    this.qKf = 0;
    this.qKg = new HashMap();
    this.qKh = new MultiTouchImageView.a()
    {
      public final void bng()
      {
        GMTrace.i(8466991153152L, 63084);
        if ((SnsInfoFlip.g(SnsInfoFlip.this).getSelectedItem() == null) || (SnsInfoFlip.d(SnsInfoFlip.this) == null))
        {
          GMTrace.o(8466991153152L, 63084);
          return;
        }
        int i = SnsInfoFlip.g(SnsInfoFlip.this).getSelectedItemPosition();
        Object localObject = ((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.g(SnsInfoFlip.this).getSelectedItem()).qhV;
        localObject = com.tencent.mm.plugin.sns.model.ae.bhp().HA((String)localObject);
        if (localObject != null) {
          ax.d((m)localObject, i);
        }
        GMTrace.o(8466991153152L, 63084);
      }
      
      public final void bnh()
      {
        GMTrace.i(8467125370880L, 63085);
        if ((SnsInfoFlip.g(SnsInfoFlip.this).getSelectedItem() == null) || (SnsInfoFlip.d(SnsInfoFlip.this) == null))
        {
          GMTrace.o(8467125370880L, 63085);
          return;
        }
        int i = SnsInfoFlip.g(SnsInfoFlip.this).getSelectedItemPosition();
        Object localObject = ((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.g(SnsInfoFlip.this).getSelectedItem()).qhV;
        localObject = com.tencent.mm.plugin.sns.model.ae.bhp().HA((String)localObject);
        if (localObject != null) {
          ax.e((m)localObject, i);
        }
        GMTrace.o(8467125370880L, 63085);
      }
    };
    init(paramContext);
    GMTrace.o(8434107809792L, 62839);
  }
  
  private void a(amn paramamn, int paramInt, String paramString)
  {
    long l2 = 0L;
    GMTrace.i(8435047333888L, 62846);
    Object localObject1;
    String str1;
    int i;
    float f2;
    float f1;
    if ((this.qJB == null) || (!(this.qJB instanceof MMGestureGallery)))
    {
      if (this.qKa != null) {
        this.qKa.va(paramInt);
      }
      localObject1 = com.tencent.mm.plugin.sns.model.ae.bhp().HA(paramString);
      if (localObject1 != null) {
        ax.c((m)localObject1, paramInt);
      }
      if (this.qJR == -1) {
        this.qJR = paramInt;
      }
      this.qJS = 1;
      str1 = paramamn.nas;
      if (bg.mZ(paramString))
      {
        i = this.qJA.getCount();
        paramamn = paramInt + 1 + " / " + i;
        this.qAP.dE(paramamn, null);
        GMTrace.o(8435047333888L, 62846);
      }
    }
    else
    {
      if (paramamn.uhD == null) {
        break label1245;
      }
      f2 = paramamn.uhD.uit;
      f1 = paramamn.uhD.uis;
    }
    for (;;)
    {
      label239:
      float f3;
      if ((f2 <= 0.0F) || (f1 <= 0.0F)) {
        if (paramamn.nas.startsWith("Locall_path"))
        {
          localObject1 = com.tencent.mm.plugin.sns.model.am.dt(com.tencent.mm.plugin.sns.model.ae.getAccSnsPath(), paramamn.nas) + i.m(paramamn);
          localObject1 = com.tencent.mm.sdk.platformtools.d.QI((String)localObject1);
          if (localObject1 == null) {
            break;
          }
          f1 = ((BitmapFactory.Options)localObject1).outHeight;
          f2 = ((BitmapFactory.Options)localObject1).outWidth;
          f3 = f1;
          f1 = f2;
        }
      }
      for (;;)
      {
        if ((f3 <= 0.0F) || (f1 <= 0.0F)) {
          break label1243;
        }
        localObject1 = (MMGestureGallery)this.qJB;
        if ((this.qJK) && (f1 * 1.0D > f3 * 2.0D))
        {
          w.d("MicroMsg.SnsInfoFlip", "set on fling true");
          ((MMGestureGallery)localObject1).vJJ = true;
          break;
          localObject1 = com.tencent.mm.plugin.sns.model.am.dt(com.tencent.mm.plugin.sns.model.ae.getAccSnsPath(), paramamn.nas) + i.d(paramamn);
          break label239;
        }
        w.d("MicroMsg.SnsInfoFlip", "set on fling false");
        ((MMGestureGallery)localObject1).vJJ = false;
        break;
        Object localObject2 = (m)this.qKb.get(paramString);
        localObject1 = localObject2;
        if (localObject2 == null)
        {
          localObject1 = com.tencent.mm.plugin.sns.model.ae.bhp().HA(paramString);
          this.qKb.put(paramString, localObject1);
        }
        if (localObject1 == null)
        {
          GMTrace.o(8435047333888L, 62846);
          return;
        }
        label573:
        long l1;
        if (paramamn.jXP == 2)
        {
          if ((this.qJB instanceof MMGestureGallery)) {
            ((MMGestureGallery)this.qJB).wKL = false;
          }
          if (paramamn.jXP != 6) {
            com.tencent.mm.plugin.sns.model.ae.aCa().post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(8686705573888L, 64721);
                SnsInfoFlip.d(SnsInfoFlip.this).bni();
                GMTrace.o(8686705573888L, 64721);
              }
            });
          }
          w.d("MicroMsg.SnsInfoFlip", "onItemSelected  " + paramInt + " localId " + paramString);
          if (this.qKc != paramInt)
          {
            if (!this.qJD.containsKey(Integer.valueOf(paramInt))) {
              break label1176;
            }
            i = ((Integer)this.qJD.get(Integer.valueOf(paramInt))).intValue();
            this.qJD.put(Integer.valueOf(paramInt), Integer.valueOf(i + 1));
            this.qJE.put(Integer.valueOf(paramInt), Long.valueOf(bg.Pq()));
            if (this.qKc >= 0)
            {
              if (!this.qJE.containsKey(Integer.valueOf(this.qKc))) {
                break label1182;
              }
              l1 = ((Long)this.qJE.get(Integer.valueOf(this.qKc))).longValue();
              label656:
              if (l1 > 0L)
              {
                this.qJE.put(Integer.valueOf(this.qKc), Long.valueOf(0L));
                if (this.qJF.containsKey(Integer.valueOf(this.qKc))) {
                  l2 = ((Long)this.qJF.get(Integer.valueOf(this.qKc))).longValue();
                }
                l1 = bg.aG(l1);
                l2 += l1;
                this.qJF.put(Integer.valueOf(this.qKc), Long.valueOf(l2));
                w.i("MicroMsg.SnsInfoFlip", "lastSelectPosition " + this.qKc + " curtime " + l2 + " passtime " + l1 / 1000.0D);
              }
            }
            if ((this.qGP) && (this.qJA != null))
            {
              paramamn = (com.tencent.mm.plugin.sns.g.b)this.qJA.getItem(this.qKc);
              if (paramamn != null)
              {
                paramamn = paramamn.fNf.nas;
                w.d("MicroMsg.SnsInfoFlip", "recordMediaScollOver, bigPicId:%s", new Object[] { paramamn });
                if (this.qKg.containsKey(paramamn))
                {
                  paramamn = (a)this.qKg.get(paramamn);
                  paramamn.networkType = bnd();
                  if (paramamn.qKm == -1L) {
                    break label1188;
                  }
                  paramamn.qKk = 1;
                  paramamn.qfh = (paramamn.qKm - paramamn.qKl);
                  w.d("MicroMsg.SnsInfoFlip", "recordMediaScollOver, load success, costTime:%d", new Object[] { Long.valueOf(paramamn.qfh) });
                }
              }
            }
          }
        }
        for (;;)
        {
          this.qKc = paramInt;
          if (this.qAO != null) {
            this.qAO.Id(paramString);
          }
          i = ((m)localObject1).field_createTime;
          localObject2 = ((m)localObject1).bjL();
          String str2 = az.l(this.context, i * 1000L);
          localObject1 = null;
          paramamn = (amn)localObject1;
          if (localObject2 != null)
          {
            paramamn = (amn)localObject1;
            if (((bhc)localObject2).uyu != null)
            {
              paramamn = (amn)localObject1;
              if (((bhc)localObject2).uyu.tKd.size() > 1)
              {
                i = ((bhc)localObject2).uyu.tKd.size();
                paramamn = ((com.tencent.mm.plugin.sns.g.b)this.hip.get(paramInt)).qhW + 1 + " / " + i;
                this.qJS = b(str1, (bhc)localObject2);
              }
            }
          }
          this.qAP.dE(str2, paramamn);
          this.qAP.bV(paramString, paramInt);
          if (this.qJA != null) {
            this.qJA.uZ(paramInt);
          }
          GMTrace.o(8435047333888L, 62846);
          return;
          if (!(this.qJB instanceof MMGestureGallery)) {
            break;
          }
          ((MMGestureGallery)this.qJB).wKL = true;
          break;
          label1176:
          i = 0;
          break label573;
          label1182:
          l1 = 0L;
          break label656;
          label1188:
          paramamn.qKk = 2;
          paramamn.qKm = System.currentTimeMillis();
          paramamn.qfh = (paramamn.qKm - paramamn.qKl);
          w.d("MicroMsg.SnsInfoFlip", "recordMediaScollOver, load failed, costTime:%d", new Object[] { Long.valueOf(paramamn.qfh) });
        }
        f3 = f2;
      }
      label1243:
      break;
      label1245:
      f1 = 0.0F;
      f2 = 0.0F;
    }
  }
  
  private static int b(String paramString, bhc parambhc)
  {
    GMTrace.i(8434913116160L, 62845);
    parambhc = parambhc.uyu.tKd.iterator();
    int i = 0;
    while (parambhc.hasNext())
    {
      amn localamn = (amn)parambhc.next();
      int j = i + 1;
      i = j;
      if (paramString.equals(localamn.nas))
      {
        GMTrace.o(8434913116160L, 62845);
        return j;
      }
    }
    GMTrace.o(8434913116160L, 62845);
    return 0;
  }
  
  private void bmZ()
  {
    GMTrace.i(8435584204800L, 62850);
    if ((this.qJB.getSelectedItem() == null) || (this.qJA == null))
    {
      GMTrace.o(8435584204800L, 62850);
      return;
    }
    int i = this.qJB.getSelectedItemPosition();
    if ((this.qJG) && (this.qJA.getCount() > 1))
    {
      this.qJO.setVisibility(0);
      this.qJO.uv(i);
    }
    amn localamn = ((com.tencent.mm.plugin.sns.g.b)this.qJB.getSelectedItem()).fNf;
    this.qKd.add(localamn.nas);
    String str1 = ((com.tencent.mm.plugin.sns.g.b)this.qJB.getSelectedItem()).qhV;
    String str2 = localamn.nas;
    if ((bg.mZ(this.qJQ)) || (!this.qJQ.equals(str2))) {
      this.qJQ = "";
    }
    a(localamn, i, str1);
    GMTrace.o(8435584204800L, 62850);
  }
  
  private static int bnd()
  {
    GMTrace.i(8437194817536L, 62862);
    Context localContext = ab.getContext();
    if (com.tencent.mm.sdk.platformtools.am.is2G(localContext))
    {
      GMTrace.o(8437194817536L, 62862);
      return 1;
    }
    if (com.tencent.mm.sdk.platformtools.am.is3G(localContext))
    {
      GMTrace.o(8437194817536L, 62862);
      return 2;
    }
    if (com.tencent.mm.sdk.platformtools.am.is4G(localContext))
    {
      GMTrace.o(8437194817536L, 62862);
      return 3;
    }
    if (com.tencent.mm.sdk.platformtools.am.isWifi(localContext))
    {
      GMTrace.o(8437194817536L, 62862);
      return 4;
    }
    GMTrace.o(8437194817536L, 62862);
    return 0;
  }
  
  private void init(final Context paramContext)
  {
    GMTrace.i(8434510462976L, 62842);
    this.qJU = System.currentTimeMillis();
    this.context = paramContext;
    View localView = inflate(paramContext, i.g.pOT, this);
    if (com.tencent.mm.ui.base.g.bWx()) {
      localView.findViewById(i.f.pJP).setVisibility(0);
    }
    for (this.qJB = ((Gallery)localView.findViewById(i.f.pJP));; this.qJB = ((Gallery)localView.findViewById(i.f.pJQ)))
    {
      if ((this.qJB instanceof MMGestureGallery))
      {
        this.qJB.setSpacing(50);
        ((MMGestureGallery)this.qJB).wKI = new MMGestureGallery.f()
        {
          public final void alc()
          {
            GMTrace.i(8703751225344L, 64848);
            if ((paramContext instanceof SnsBrowseUI))
            {
              ((SnsBrowseUI)paramContext).alb();
              GMTrace.o(8703751225344L, 64848);
              return;
            }
            if (SnsInfoFlip.a(SnsInfoFlip.this))
            {
              ((MMActivity)paramContext).finish();
              GMTrace.o(8703751225344L, 64848);
              return;
            }
            SnsInfoFlip.c(SnsInfoFlip.this).post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(8472494080000L, 63125);
                if ((SnsInfoFlip.this.qAP != null) && (SnsInfoFlip.b(SnsInfoFlip.this))) {
                  SnsInfoFlip.this.qAP.aha();
                }
                GMTrace.o(8472494080000L, 63125);
              }
            });
            GMTrace.o(8703751225344L, 64848);
          }
        };
        ((MMGestureGallery)this.qJB).wKK = new MMGestureGallery.e()
        {
          public final void bnf()
          {
            GMTrace.i(8629394604032L, 64294);
            if (SnsInfoFlip.this.qAP != null) {
              SnsInfoFlip.this.qAP.blE();
            }
            GMTrace.o(8629394604032L, 64294);
          }
        };
      }
      this.qJO = ((MMPageControlView)findViewById(i.f.pNK));
      this.qJO.vHy = i.g.pPP;
      this.qJW = new HashMap();
      GMTrace.o(8434510462976L, 62842);
      return;
      localView.findViewById(i.f.pJQ).setVisibility(0);
    }
  }
  
  public final void a(List<com.tencent.mm.plugin.sns.g.b> paramList, String paramString, int paramInt, v paramv, t.a parama)
  {
    GMTrace.i(8435181551616L, 62847);
    com.tencent.mm.plugin.sns.model.ae.bhk().a(this);
    this.hip = paramList;
    boolean bool;
    if (this.hip.size() > 1)
    {
      bool = true;
      this.qJT = bool;
      ai.GE(paramString);
      this.qAO = paramv;
      this.qAP = parama;
      this.qJA = new b(this.context);
      this.qJB.setAdapter(this.qJA);
      if ((paramInt >= 0) && (paramInt < this.hip.size()))
      {
        this.qJB.setSelection(paramInt);
        if (this.qJM)
        {
          this.qJM = false;
          paramList = ((com.tencent.mm.plugin.sns.g.b)this.hip.get(paramInt)).fNf;
          if ((paramList == null) || (paramList.uhD == null) || (paramList.uhD.uit <= 0.0F)) {
            break label374;
          }
        }
      }
    }
    label374:
    for (this.qJN = (paramList.uhD.uis / paramList.uhD.uit);; this.qJN = 1.0F)
    {
      this.qJB.setFadingEdgeLength(0);
      this.qJB.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
      {
        public final void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(8695429726208L, 64786);
          if (SnsInfoFlip.d(SnsInfoFlip.this) != null)
          {
            if ((SnsInfoFlip.e(SnsInfoFlip.this)) && (SnsInfoFlip.d(SnsInfoFlip.this).getCount() > 1))
            {
              SnsInfoFlip.f(SnsInfoFlip.this).setVisibility(0);
              SnsInfoFlip.f(SnsInfoFlip.this).uv(paramAnonymousInt);
            }
            paramAnonymousAdapterView = ((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.d(SnsInfoFlip.this).getItem(paramAnonymousInt)).fNf;
            String str = ((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.d(SnsInfoFlip.this).getItem(paramAnonymousInt)).qhV;
            SnsInfoFlip.a(SnsInfoFlip.this, paramAnonymousAdapterView, paramAnonymousInt, str);
            if ((paramAnonymousView instanceof MultiTouchImageView)) {
              ((MultiTouchImageView)paramAnonymousView).bXG();
            }
            if (((SnsInfoFlip.g(SnsInfoFlip.this) instanceof MMGestureGallery)) && ((SnsInfoFlip.h(SnsInfoFlip.this) instanceof SnsBrowseUI))) {
              ((SnsBrowseUI)SnsInfoFlip.h(SnsInfoFlip.this)).bmB();
            }
          }
          GMTrace.o(8695429726208L, 64786);
        }
        
        public final void onNothingSelected(AdapterView<?> paramAnonymousAdapterView)
        {
          GMTrace.i(8695563943936L, 64787);
          GMTrace.o(8695563943936L, 64787);
        }
      });
      if (this.qJC) {
        this.qJB.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
        {
          public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
          {
            GMTrace.i(8705361838080L, 64860);
            if (!SnsInfoFlip.i(SnsInfoFlip.this))
            {
              GMTrace.o(8705361838080L, 64860);
              return true;
            }
            paramAnonymousAdapterView = ((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.d(SnsInfoFlip.this).getItem(paramAnonymousInt)).qhV;
            if (bg.mZ(paramAnonymousAdapterView))
            {
              GMTrace.o(8705361838080L, 64860);
              return false;
            }
            paramAnonymousView = ((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.d(SnsInfoFlip.this).getItem(paramAnonymousInt)).fNf.nas;
            String str = com.tencent.mm.plugin.sns.model.am.dt(com.tencent.mm.plugin.sns.model.ae.getAccSnsPath(), paramAnonymousView) + i.l(((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.d(SnsInfoFlip.this).getItem(paramAnonymousInt)).fNf);
            SnsInfoFlip.this.e(str, paramAnonymousAdapterView, paramAnonymousView, true);
            GMTrace.o(8705361838080L, 64860);
            return true;
          }
        });
      }
      if ((this.qJG) && (this.qJA.getCount() > 1))
      {
        this.qJO.setVisibility(0);
        this.qJO.ei(this.qJA.getCount(), paramInt);
      }
      if ((this.qGR) && (!bg.mZ(((com.tencent.mm.plugin.sns.g.b)this.qJA.getItem(paramInt)).qhV)))
      {
        paramList = ((com.tencent.mm.plugin.sns.g.b)this.qJA.getItem(paramInt)).fNf.nas;
        Ia(com.tencent.mm.plugin.sns.model.am.dt(com.tencent.mm.plugin.sns.model.ae.getAccSnsPath(), paramList) + i.l(((com.tencent.mm.plugin.sns.g.b)this.qJA.getItem(paramInt)).fNf));
      }
      GMTrace.o(8435181551616L, 62847);
      return;
      bool = false;
      break;
    }
  }
  
  public final void ar(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8436926382080L, 62860);
    Object localObject;
    if (!paramBoolean)
    {
      localObject = ((com.tencent.mm.plugin.sns.g.b)this.qJB.getSelectedItem()).fNf;
      if ((localObject != null) && (((amn)localObject).nas != null) && (((amn)localObject).nas.equals(paramString)))
      {
        Toast.makeText(this.context, this.context.getString(i.j.pRY), 0).show();
        this.qJQ = paramString;
      }
    }
    this.qKf += 1;
    if (this.qGP)
    {
      w.d("MicroMsg.SnsInfoFlip", "recordLoadEnd, bigPicId:%s, suceess:%b", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
      if ((paramBoolean) && (this.qKg.containsKey(paramString)))
      {
        localObject = (a)this.qKg.get(paramString);
        ((a)localObject).qKm = System.currentTimeMillis();
        ((a)localObject).networkType = bnd();
        w.d("MicroMsg.SnsInfoFlip", "recordLoadEnd, update map");
        this.qJW.put(paramString, Boolean.valueOf(true));
      }
    }
    if ((this.qJA != null) && ((com.tencent.mm.plugin.sns.g.b)this.qJB.getSelectedItem() != null))
    {
      localObject = ((com.tencent.mm.plugin.sns.g.b)this.qJB.getSelectedItem()).fNf;
      if ((localObject != null) && (((amn)localObject).nas != null) && (((amn)localObject).nas.equals(paramString)))
      {
        this.qJA.notifyDataSetChanged();
        if (this.qGR)
        {
          if (localObject == null)
          {
            GMTrace.o(8436926382080L, 62860);
            return;
          }
          paramString = com.tencent.mm.plugin.sns.model.am.dt(com.tencent.mm.plugin.sns.model.ae.getAccSnsPath(), ((amn)localObject).nas);
          localObject = i.l((amn)localObject);
          if (FileOp.aZ(paramString + (String)localObject))
          {
            paramString = paramString + (String)localObject;
            localObject = new Intent();
            w.i("MicroMsg.FlipView", "edit image path:%s", new Object[] { paramString });
            ((Intent)localObject).putExtra("before_photo_edit", paramString);
            ((Intent)localObject).putExtra("from_scene", 293);
            ((Intent)localObject).putExtra("after_photo_edit", "");
            ((Intent)localObject).putExtra("Retr_Compress_Type", 0);
            ((Intent)localObject).putExtra("Retr_Msg_Type", 0);
            ((Intent)localObject).putExtra("Retr_FromMainTimeline", blB());
            com.tencent.mm.bi.d.b(this.context, "photoedit", ".ui.MMNewPhotoEditUI", (Intent)localObject);
          }
        }
      }
    }
    GMTrace.o(8436926382080L, 62860);
  }
  
  public final void as(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8437060599808L, 62861);
    w.i("MicroMsg.SnsInfoFlip", "onSightFinish " + paramString + " " + paramBoolean);
    if (!paramBoolean)
    {
      amn localamn = ((com.tencent.mm.plugin.sns.g.b)this.qJB.getSelectedItem()).fNf;
      if ((localamn != null) && (localamn.nas != null) && (localamn.nas.equals(paramString)))
      {
        Toast.makeText(this.context, this.context.getString(i.j.pRZ), 0).show();
        this.qJQ = paramString;
      }
    }
    if (this.qJA != null) {
      this.qJA.notifyDataSetChanged();
    }
    GMTrace.o(8437060599808L, 62861);
  }
  
  public final void awa()
  {
    GMTrace.i(8435718422528L, 62851);
    if (this.qJA != null)
    {
      w.d("MicroMsg.SnsInfoFlip", "onRefresh ");
      this.qJA.notifyDataSetChanged();
      bmZ();
    }
    GMTrace.o(8435718422528L, 62851);
  }
  
  public final long blA()
  {
    GMTrace.i(8435315769344L, 62848);
    Object localObject = (com.tencent.mm.plugin.sns.g.b)this.qJB.getSelectedItem();
    if (localObject == null) {
      localObject = "";
    }
    while (!bg.mZ((String)localObject))
    {
      localObject = com.tencent.mm.plugin.sns.model.ae.bhp().HA((String)localObject);
      if (localObject == null)
      {
        GMTrace.o(8435315769344L, 62848);
        return 0L;
        localObject = ((com.tencent.mm.plugin.sns.g.b)localObject).qhV;
      }
      else
      {
        long l = ((m)localObject).field_snsId;
        GMTrace.o(8435315769344L, 62848);
        return l;
      }
    }
    GMTrace.o(8435315769344L, 62848);
    return 0L;
  }
  
  public final boolean blB()
  {
    GMTrace.i(8434376245248L, 62841);
    boolean bool = this.qGP;
    GMTrace.o(8434376245248L, 62841);
    return bool;
  }
  
  public final amn blC()
  {
    GMTrace.i(8436657946624L, 62858);
    if (this.qJA != null)
    {
      int i = this.qJB.getSelectedItemPosition();
      if ((this.hip != null) && (i < this.hip.size()))
      {
        amn localamn = ((com.tencent.mm.plugin.sns.g.b)this.hip.get(i)).fNf;
        GMTrace.o(8436657946624L, 62858);
        return localamn;
      }
    }
    GMTrace.o(8436657946624L, 62858);
    return null;
  }
  
  public final com.tencent.mm.plugin.sns.g.b bmY()
  {
    GMTrace.i(8434778898432L, 62844);
    if (this.qJB == null)
    {
      GMTrace.o(8434778898432L, 62844);
      return null;
    }
    com.tencent.mm.plugin.sns.g.b localb = (com.tencent.mm.plugin.sns.g.b)this.qJB.getSelectedItem();
    GMTrace.o(8434778898432L, 62844);
    return localb;
  }
  
  public final void bna()
  {
    GMTrace.i(8436255293440L, 62855);
    w.i("MicroMsg.SnsInfoFlip", "sns info flip on detch.");
    if (this.qJA != null)
    {
      this.qJA.bni();
      this.qJA.clear();
    }
    com.tencent.mm.plugin.sns.model.ae.bhk().b(this);
    GMTrace.o(8436255293440L, 62855);
  }
  
  public final int bnb()
  {
    GMTrace.i(8436389511168L, 62856);
    if (this.qJB == null)
    {
      GMTrace.o(8436389511168L, 62856);
      return -1;
    }
    int i = this.qJB.getSelectedItemPosition();
    this.hip.remove(i);
    this.qJA.notifyDataSetChanged();
    bmZ();
    i = this.qJA.getCount();
    GMTrace.o(8436389511168L, 62856);
    return i;
  }
  
  public final int bnc()
  {
    GMTrace.i(8436792164352L, 62859);
    Iterator localIterator = this.hip.iterator();
    int k = 0;
    int j;
    for (int i = 0;; i = j)
    {
      j = i;
      if (localIterator.hasNext())
      {
        com.tencent.mm.plugin.sns.g.b localb = (com.tencent.mm.plugin.sns.g.b)localIterator.next();
        com.tencent.mm.plugin.sns.model.ae.bhm();
        j = i;
        if (FileOp.aZ(com.tencent.mm.plugin.sns.model.g.B(localb.fNf))) {
          j = i + 1;
        }
        k += 1;
        if (k <= 9) {}
      }
      else
      {
        GMTrace.o(8436792164352L, 62859);
        return j;
      }
    }
  }
  
  public final void bne()
  {
    GMTrace.i(8437329035264L, 62863);
    Iterator localIterator = this.qKg.values().iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (locala.qKk != -1)
      {
        com.tencent.mm.plugin.report.service.g.paX.i(11601, new Object[] { Integer.valueOf(locala.qfi), Integer.valueOf(locala.qKk), Long.valueOf(locala.qfh), Integer.valueOf(locala.networkType) });
        w.d("MicroMsg.SnsInfoFlip", "report big pic load, picNum:%d, loadResult:%d, loadCostTime:%d, networkType:%d", new Object[] { Integer.valueOf(locala.qfi), Integer.valueOf(locala.qKk), Long.valueOf(locala.qfh), Integer.valueOf(locala.networkType) });
      }
      else if (locala.qKl != -1L)
      {
        if (locala.qKm != -1L) {
          locala.qKk = 1;
        }
        for (;;)
        {
          locala.qfh = (locala.qKm - locala.qKl);
          com.tencent.mm.plugin.report.service.g.paX.i(11601, new Object[] { Integer.valueOf(locala.qfi), Integer.valueOf(locala.qKk), Long.valueOf(locala.qfh), Integer.valueOf(locala.networkType) });
          w.d("MicroMsg.SnsInfoFlip", "report big pic load, picNum:%d, loadResult:%d, loadCostTime:%d, networkType:%d", new Object[] { Integer.valueOf(locala.qfi), Integer.valueOf(locala.qKk), Long.valueOf(locala.qfh), Integer.valueOf(locala.networkType) });
          break;
          locala.qKk = 2;
          locala.qKm = System.currentTimeMillis();
        }
      }
    }
    this.qKg.clear();
    GMTrace.o(8437329035264L, 62863);
  }
  
  public final int getCount()
  {
    GMTrace.i(8436523728896L, 62857);
    if (this.qJA != null)
    {
      int i = this.qJA.getCount();
      GMTrace.o(8436523728896L, 62857);
      return i;
    }
    GMTrace.o(8436523728896L, 62857);
    return 0;
  }
  
  public final int getPosition()
  {
    GMTrace.i(8435449987072L, 62849);
    int i = this.qJS;
    GMTrace.o(8435449987072L, 62849);
    return i;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(8436121075712L, 62854);
    this.qJZ = false;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(8436121075712L, 62854);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(8435986857984L, 62853);
    this.qJZ = true;
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(8435986857984L, 62853);
  }
  
  protected final void onPause()
  {
    GMTrace.i(8435852640256L, 62852);
    super.onPause();
    if (this.qJA != null)
    {
      this.qJA.bni();
      this.qJA.clear();
    }
    GMTrace.o(8435852640256L, 62852);
  }
  
  public final void uV(int paramInt)
  {
    GMTrace.i(8434644680704L, 62843);
    this.infoType = paramInt;
    GMTrace.o(8434644680704L, 62843);
  }
  
  final class a
  {
    int networkType;
    int qKk;
    long qKl;
    long qKm;
    String qKn;
    long qfh;
    int qfi;
    
    a()
    {
      GMTrace.i(8353845608448L, 62241);
      this.qKk = -1;
      this.qKl = -1L;
      this.qKm = -1L;
      this.qfh = -1L;
      GMTrace.o(8353845608448L, 62241);
    }
  }
  
  final class b
    extends BaseAdapter
  {
    private Context context;
    private String hht;
    private boolean kTy;
    private boolean qKo;
    Map<String, WeakReference<View>> qKp;
    private String qKq;
    private int qwJ;
    
    public b(Context paramContext)
    {
      GMTrace.i(8739855794176L, 65117);
      this.qwJ = 0;
      this.qKo = false;
      this.hht = "";
      this.kTy = true;
      this.qKp = new HashMap();
      this.context = paramContext;
      this.qKo = com.tencent.mm.ui.base.g.bWx();
      this.qwJ = SnsInfoFlip.j(SnsInfoFlip.this).size();
      c.Gp();
      this.kTy = c.Gr();
      GMTrace.o(8739855794176L, 65117);
    }
    
    private void uY(int paramInt)
    {
      GMTrace.i(8740124229632L, 65119);
      amn localamn = ((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.j(SnsInfoFlip.this).get(paramInt)).fNf;
      an localan = an.a(SnsInfoFlip.k(SnsInfoFlip.this), ((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.j(SnsInfoFlip.this).get(paramInt)).hzl);
      if (localamn.jXP != 2)
      {
        GMTrace.o(8740124229632L, 65119);
        return;
      }
      com.tencent.mm.plugin.sns.model.ae.bhm();
      boolean bool = com.tencent.mm.plugin.sns.model.g.a(localamn, localan);
      if ((SnsInfoFlip.l(SnsInfoFlip.this)) && (!bool)) {
        SnsInfoFlip.a(SnsInfoFlip.this, localamn.nas);
      }
      GMTrace.o(8740124229632L, 65119);
    }
    
    public final void bni()
    {
      GMTrace.i(8740929536000L, 65125);
      w.i("MicroMsg.SnsInfoFlip", "notify online sight stop %s", new Object[] { bg.bOd() });
      this.qKq = null;
      oz localoz = new oz();
      localoz.fMX.fAI = 2;
      a.uLm.m(localoz);
      GMTrace.o(8740929536000L, 65125);
    }
    
    public final void clear()
    {
      GMTrace.i(8740661100544L, 65123);
      w.i("MicroMsg.SnsInfoFlip", "adapter clear.");
      this.qKp.clear();
      GMTrace.o(8740661100544L, 65123);
    }
    
    public final int getCount()
    {
      GMTrace.i(8739990011904L, 65118);
      if (SnsInfoFlip.j(SnsInfoFlip.this) == null)
      {
        GMTrace.o(8739990011904L, 65118);
        return 0;
      }
      int i = SnsInfoFlip.j(SnsInfoFlip.this).size();
      GMTrace.o(8739990011904L, 65118);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(8741063753728L, 65126);
      if ((paramInt < SnsInfoFlip.j(SnsInfoFlip.this).size()) && (paramInt >= 0))
      {
        Object localObject = SnsInfoFlip.j(SnsInfoFlip.this).get(paramInt);
        GMTrace.o(8741063753728L, 65126);
        return localObject;
      }
      GMTrace.o(8741063753728L, 65126);
      return null;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(8741197971456L, 65127);
      GMTrace.o(8741197971456L, 65127);
      return 0L;
    }
    
    public final int getItemViewType(int paramInt)
    {
      GMTrace.i(8740392665088L, 65121);
      if (((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.j(SnsInfoFlip.this).get(paramInt)).fNf.jXP == 6)
      {
        GMTrace.o(8740392665088L, 65121);
        return 0;
      }
      GMTrace.o(8740392665088L, 65121);
      return 1;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(8740526882816L, 65122);
      boolean bool;
      if (((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.j(SnsInfoFlip.this).get(paramInt)).fNf.jXP == 6)
      {
        if (paramView == null) {}
        for (bool = true;; bool = false)
        {
          w.d("MicroMsg.SnsInfoFlip", "fill view online sight %d convert view is null %b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(bool) });
          paramViewGroup = (com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.j(SnsInfoFlip.this).get(paramInt);
          if (paramViewGroup != null) {
            break;
          }
          w.w("MicroMsg.SnsInfoFlip", "fill online sight view, but flip item is null.");
          GMTrace.o(8740526882816L, 65122);
          return paramView;
        }
        localObject1 = paramViewGroup.qhV;
        if (bg.mZ((String)localObject1))
        {
          w.w("MicroMsg.SnsInfoFlip", "fill online sight view, but sns local id is null.");
          GMTrace.o(8740526882816L, 65122);
          return paramView;
        }
        paramView = (WeakReference)this.qKp.get(localObject1);
        if ((paramView != null) && (paramView.get() != null)) {
          paramView = (OnlineVideoView)paramView.get();
        }
        for (;;)
        {
          if (bg.eI((String)localObject1, this.qKq)) {
            uZ(paramInt);
          }
          w.i("MicroMsg.SnsInfoFlip", "return online sight view %d parent id %s", new Object[] { Integer.valueOf(paramView.hashCode()), paramViewGroup.qhV });
          GMTrace.o(8740526882816L, 65122);
          return paramView;
          paramView = new OnlineVideoView(this.context);
          this.qKp.put(localObject1, new WeakReference(paramView));
        }
      }
      Object localObject2 = ((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.j(SnsInfoFlip.this).get(paramInt)).fNf;
      w.d("MicroMsg.SnsInfoFlip", "gallery position " + paramInt + " " + this.qwJ + " " + ((amn)localObject2).nas);
      if ((paramInt != SnsInfoFlip.m(SnsInfoFlip.this)) && ((SnsInfoFlip.g(SnsInfoFlip.this) instanceof MMGestureGallery))) {
        ((MMGestureGallery)SnsInfoFlip.g(SnsInfoFlip.this)).wKL = false;
      }
      an localan;
      int i;
      label581:
      Object localObject3;
      if (paramView == null)
      {
        paramViewGroup = new SnsInfoFlip.d();
        paramView = View.inflate(this.context, i.g.pOQ, null);
        paramViewGroup.qKr = paramView.findViewById(i.f.pJm);
        paramViewGroup.mLS = ((ProgressBar)paramView.findViewById(i.f.cle));
        paramViewGroup.nqd = ((TextView)paramView.findViewById(i.f.pMh));
        paramViewGroup.qKs = ((FrameLayout)paramView.findViewById(i.f.pJg));
        paramViewGroup.fDY = ((ImageView)paramView.findViewById(i.f.image));
        paramView.setTag(paramViewGroup);
        paramViewGroup.position = paramInt;
        localan = an.a(SnsInfoFlip.k(SnsInfoFlip.this), ((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.j(SnsInfoFlip.this).get(paramInt)).hzl);
        paramView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
        paramViewGroup.mLS.setVisibility(8);
        paramViewGroup.nqd.setVisibility(8);
        paramViewGroup.qKs.setVisibility(0);
        if ((bg.mZ(SnsInfoFlip.n(SnsInfoFlip.this))) || (!SnsInfoFlip.n(SnsInfoFlip.this).equals(((amn)localObject2).nas))) {
          break label1232;
        }
        i = 1;
        if ((!((amn)localObject2).nas.startsWith("Locall_path")) || (bg.mZ(((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.j(SnsInfoFlip.this).get(paramInt)).qhV))) {
          break label1478;
        }
        localObject3 = (m)SnsInfoFlip.o(SnsInfoFlip.this).get(((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.j(SnsInfoFlip.this).get(paramInt)).qhV);
        localObject1 = localObject3;
        if (localObject3 == null)
        {
          localObject1 = com.tencent.mm.plugin.sns.model.ae.bhp().HA(((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.j(SnsInfoFlip.this).get(paramInt)).qhV);
          SnsInfoFlip.o(SnsInfoFlip.this).put(((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.j(SnsInfoFlip.this).get(paramInt)).qhV, localObject1);
        }
        localObject1 = ((m)localObject1).bjL();
        if (((bhc)localObject1).uyu.tKd.size() <= ((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.j(SnsInfoFlip.this).get(paramInt)).qhW) {
          break label1478;
        }
      }
      label825:
      label1009:
      label1158:
      label1232:
      label1244:
      label1250:
      label1427:
      label1478:
      for (Object localObject1 = (amn)((bhc)localObject1).uyu.tKd.get(((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.j(SnsInfoFlip.this).get(paramInt)).qhW);; localObject1 = localObject2)
      {
        localObject2 = com.tencent.mm.plugin.sns.model.ae.bhm();
        localObject3 = paramViewGroup.fDY;
        int j = this.context.hashCode();
        if (i == 0)
        {
          bool = true;
          localObject2 = ((com.tencent.mm.plugin.sns.model.g)localObject2).a((amn)localObject1, (View)localObject3, j, bool, localan);
          if ((localObject2 == null) && (SnsInfoFlip.l(SnsInfoFlip.this))) {
            SnsInfoFlip.a(SnsInfoFlip.this, ((amn)localObject1).nas);
          }
          localObject3 = paramViewGroup.fDY.getLayoutParams();
          ((ViewGroup.LayoutParams)localObject3).width = -1;
          ((ViewGroup.LayoutParams)localObject3).height = -1;
          paramViewGroup.fDY.setLayoutParams((ViewGroup.LayoutParams)localObject3);
          if ((localObject2 != null) || (((amn)localObject1).nas == null) || (((amn)localObject1).nas.startsWith("pre_temp_extend_pic"))) {
            break label1250;
          }
          ViewGroup.LayoutParams localLayoutParams = paramViewGroup.fDY.getLayoutParams();
          BackwardSupportUtil.b.a(this.context, 160.0F);
          j = BackwardSupportUtil.b.a(this.context, 200.0F);
          BackwardSupportUtil.b.a(this.context, 44.0F);
          localObject2 = com.tencent.mm.plugin.sns.model.ae.bhm();
          String str1 = i.ap(1, ((amn)localObject1).nas);
          String str2 = ((amn)localObject1).nas;
          localObject2 = ((com.tencent.mm.plugin.sns.model.g)localObject2).Gs(str1);
          if (!i.a((com.tencent.mm.memory.n)localObject2)) {
            break label1244;
          }
          if (localObject2 != null)
          {
            double d1 = ((com.tencent.mm.memory.n)localObject2).bitmap.getWidth();
            double d2 = ((com.tencent.mm.memory.n)localObject2).bitmap.getHeight();
            if ((d1 > 0.0D) && (d2 > 0.0D)) {
              Math.min(j / d1, j / d2);
            }
          }
          paramViewGroup.fDY.setLayoutParams((ViewGroup.LayoutParams)localObject3);
          paramViewGroup.mLS.setVisibility(0);
          paramViewGroup.fDY.setVisibility(0);
          com.tencent.mm.plugin.sns.model.ae.bhm().cp(paramViewGroup.fDY);
          com.tencent.mm.plugin.sns.model.ae.bhm().c((amn)localObject1, paramViewGroup.fDY, i.e.black, this.context.hashCode(), localan);
          SnsInfoFlip.uW(localLayoutParams.width);
          SnsInfoFlip.uX(localLayoutParams.height);
          if (i != 0) {
            paramViewGroup.mLS.setVisibility(8);
          }
        }
        for (;;)
        {
          if ((this.kTy) && (aa.bu(this.context)))
          {
            if (paramInt - 1 >= 0) {
              uY(paramInt - 1);
            }
            if (paramInt + 1 < SnsInfoFlip.d(SnsInfoFlip.this).getCount()) {
              uY(paramInt + 1);
            }
          }
          do
          {
            GMTrace.o(8740526882816L, 65122);
            return paramView;
            paramViewGroup = (SnsInfoFlip.d)paramView.getTag();
            break;
            i = 0;
            break label581;
            bool = false;
            break label825;
            localObject2 = null;
            break label1009;
            if (!this.qKo) {
              break label1427;
            }
            paramViewGroup.mLS.setVisibility(8);
            if (localObject2 == null) {
              break label1158;
            }
          } while (SnsInfoFlip.p(SnsInfoFlip.this));
          w.i("MicroMsg.SnsInfoFlip", "update view ");
          paramView = new MultiTouchImageView(this.context, ((Bitmap)localObject2).getWidth(), ((Bitmap)localObject2).getHeight(), SnsInfoFlip.q(SnsInfoFlip.this));
          paramView.qJK = SnsInfoFlip.r(SnsInfoFlip.this);
          paramView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
          com.tencent.mm.plugin.sns.model.ae.bhm().c((amn)localObject1, paramView, this.context.hashCode(), localan);
          paramView.setImageBitmap((Bitmap)localObject2);
          w.d("MicroMsg.SnsInfoFlip", "dancy mediaId: %s, isbigImgLoaded: %s, view: %s", new Object[] { ((amn)localObject1).nas, SnsInfoFlip.s(SnsInfoFlip.this).get(((amn)localObject1).nas), Integer.valueOf(paramView.getId()) });
          GMTrace.o(8740526882816L, 65122);
          return paramView;
          paramViewGroup.mLS.setVisibility(8);
          com.tencent.mm.plugin.sns.model.ae.bhm().c((amn)localObject1, paramViewGroup.fDY, this.context.hashCode(), localan);
          paramViewGroup.fDY.setImageBitmap((Bitmap)localObject2);
          paramViewGroup.fDY.setVisibility(0);
        }
      }
    }
    
    public final int getViewTypeCount()
    {
      GMTrace.i(8740258447360L, 65120);
      GMTrace.o(8740258447360L, 65120);
      return 2;
    }
    
    public final void notifyDataSetChanged()
    {
      GMTrace.i(8741332189184L, 65128);
      this.qwJ = SnsInfoFlip.j(SnsInfoFlip.this).size();
      w.d("MicroMsg.SnsInfoFlip", "items.size:" + SnsInfoFlip.j(SnsInfoFlip.this).size());
      SnsInfoFlip.this.invalidate();
      SnsInfoFlip.this.requestLayout();
      super.notifyDataSetChanged();
      if ((SnsInfoFlip.j(SnsInfoFlip.this).size() <= 0) && (SnsInfoFlip.t(SnsInfoFlip.this) != null)) {
        SnsInfoFlip.t(SnsInfoFlip.this).run();
      }
      GMTrace.o(8741332189184L, 65128);
    }
    
    public final void uZ(int paramInt)
    {
      GMTrace.i(8740795318272L, 65124);
      Object localObject1 = (com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.j(SnsInfoFlip.this).get(paramInt);
      if (localObject1 == null)
      {
        w.w("MicroMsg.SnsInfoFlip", "notify online sight play, but flip item is null.");
        GMTrace.o(8740795318272L, 65124);
        return;
      }
      String str = ((com.tencent.mm.plugin.sns.g.b)localObject1).qhV;
      if (bg.mZ(str))
      {
        w.w("MicroMsg.SnsInfoFlip", "notify online sight play, but sns local id is null.");
        GMTrace.o(8740795318272L, 65124);
        return;
      }
      w.i("MicroMsg.SnsInfoFlip", "notify online sight play pos %s sns local id %s", new Object[] { Integer.valueOf(paramInt), str });
      Object localObject2 = (WeakReference)this.qKp.get(str);
      if (localObject2 == null)
      {
        w.w("MicroMsg.SnsInfoFlip", "notify online sight play, but view cache is null ");
        this.qKq = str;
        GMTrace.o(8740795318272L, 65124);
        return;
      }
      localObject2 = (OnlineVideoView)((WeakReference)localObject2).get();
      if (localObject2 == null)
      {
        w.w("MicroMsg.SnsInfoFlip", "online sight view is null, do nothing. snsLocalId %s", new Object[] { str });
        this.qKq = str;
        GMTrace.o(8740795318272L, 65124);
        return;
      }
      w.i("MicroMsg.SnsInfoFlip", "%d notify online sight play video %s", new Object[] { Integer.valueOf(localObject2.hashCode()), str });
      this.qKq = null;
      w.d("MicroMsg.OnlineVideoView", "%d register sns ui event", new Object[] { Integer.valueOf(localObject2.hashCode()) });
      a.uLm.b(((OnlineVideoView)localObject2).qDx);
      ((OnlineVideoView)localObject2).a(((com.tencent.mm.plugin.sns.g.b)localObject1).fNf, ((com.tencent.mm.plugin.sns.g.b)localObject1).qhV, ((com.tencent.mm.plugin.sns.g.b)localObject1).hzl);
      localObject1 = new oz();
      ((oz)localObject1).fMX.fAI = 1;
      ((oz)localObject1).fMX.fAx = str;
      a.uLm.m((com.tencent.mm.sdk.b.b)localObject1);
      GMTrace.o(8740795318272L, 65124);
    }
  }
  
  public static abstract interface c
  {
    public abstract void va(int paramInt);
  }
  
  static final class d
  {
    ImageView fDY;
    String fML;
    ProgressBar mLS;
    TextView nqd;
    int position;
    View qKr;
    FrameLayout qKs;
    
    d()
    {
      GMTrace.i(8554903764992L, 63739);
      this.fML = "";
      GMTrace.o(8554903764992L, 63739);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsInfoFlip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */