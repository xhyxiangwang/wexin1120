package com.tencent.mm.plugin.sns.model;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.memory.n;
import com.tencent.mm.modelcontrol.c;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.storage.r;
import com.tencent.mm.plugin.sns.ui.TagImageView;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.asw;
import com.tencent.mm.protocal.c.axs;
import com.tencent.mm.protocal.c.bdk;
import com.tencent.mm.protocal.c.bds;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.k;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import com.tencent.mm.ui.widget.QDisFadeImageView;
import com.tencent.mm.ui.widget.QFadeImageView;
import com.tencent.mm.ui.widget.QImageView;
import com.tencent.mm.ui.widget.QImageView.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class g
  implements com.tencent.mm.plugin.sns.b.f
{
  public static int qaF;
  Map<Integer, WeakReference<Object>> hzO;
  public boolean pZX;
  private HashMap<Integer, Boolean> qaA;
  private int qaB;
  private int qaC;
  private HashMap<Long, Integer> qaD;
  protected Set<String> qaE;
  public long qai;
  public long qaj;
  public com.tencent.mm.sdk.platformtools.y<String, n> qak;
  public ak<String, WeakReference<Bitmap>> qal;
  private Map<String, LinkedList<WeakReference<c>>> qam;
  private ConcurrentHashMap<Integer, String> qan;
  public LinkedList<b> qao;
  public boolean qap;
  public HashSet<c> qaq;
  public HashMap<String, Integer> qar;
  private int qas;
  public com.tencent.mm.plugin.sns.ui.y qat;
  public long qau;
  public long qav;
  private int qaw;
  private int qax;
  private HashMap<Long, Integer> qay;
  private HashMap<Integer, Boolean> qaz;
  
  static
  {
    GMTrace.i(8141781598208L, 60661);
    qaF = 0;
    GMTrace.o(8141781598208L, 60661);
  }
  
  public g()
  {
    GMTrace.i(8132252139520L, 60590);
    this.qai = 0L;
    this.qaj = 0L;
    this.hzO = new HashMap();
    this.qam = new HashMap();
    this.qan = new ConcurrentHashMap();
    this.qao = new LinkedList();
    this.qap = false;
    this.qaq = new HashSet();
    this.qar = new HashMap();
    this.qas = 4;
    this.pZX = true;
    this.qau = 0L;
    this.qav = 0L;
    this.qaw = 0;
    this.qax = 0;
    this.qay = new HashMap();
    this.qaz = new HashMap();
    this.qaA = new HashMap();
    this.qaB = 0;
    this.qaC = 0;
    this.qaD = new HashMap();
    this.qaE = new HashSet();
    int i = ((ActivityManager)ab.getContext().getSystemService("activity")).getLargeMemoryClass();
    w.i("MicroMsg.LazyerImageLoader2", "BitmapPool %dMB", new Object[] { Integer.valueOf(i) });
    if (i > 256) {}
    for (i = 10485760;; i = 5242880)
    {
      this.qak = new com.tencent.mm.sdk.platformtools.y(i)
      {
        public final void trimToSize(int paramAnonymousInt)
        {
          GMTrace.i(8142855340032L, 60669);
          try
          {
            super.trimToSize(paramAnonymousInt);
            GMTrace.o(8142855340032L, 60669);
            return;
          }
          catch (Exception localException)
          {
            w.e("MicroMsg.LazyerImageLoader2", "trimToSize error: %s", new Object[] { localException.getMessage() });
            GMTrace.o(8142855340032L, 60669);
          }
        }
      };
      this.qal = new ak(this.qas, new ak.a()
      {
        public final boolean bo(Object paramAnonymousObject)
        {
          GMTrace.i(8142050033664L, 60663);
          String str = (String)paramAnonymousObject;
          paramAnonymousObject = g.this;
          int i;
          Object localObject;
          if ((((g)paramAnonymousObject).qaq == null) || (((g)paramAnonymousObject).qaq.size() == 0))
          {
            i = 1;
            if (i == 0) {
              break label531;
            }
            localObject = g.this.qal;
          }
          for (;;)
          {
            try
            {
              paramAnonymousObject = ((ak.b)((ak)localObject).qeq.get(str)).obj;
              if (!(paramAnonymousObject instanceof Bitmap)) {
                continue;
              }
              paramAnonymousObject = (Bitmap)paramAnonymousObject;
              if ((paramAnonymousObject != null) && (!((Bitmap)paramAnonymousObject).isRecycled()))
              {
                w.d("MicroMsg.SnsLRUMap", "remove key:" + str);
                ((Bitmap)paramAnonymousObject).recycle();
              }
            }
            catch (Exception paramAnonymousObject)
            {
              Iterator localIterator;
              g.c localc;
              w.printErrStackTrace("MicroMsg.SnsLRUMap", (Throwable)paramAnonymousObject, "", new Object[0]);
              w.e("MicroMsg.SnsLRUMap", "can not recycled forceRemove ");
              continue;
              boolean bool = false;
              continue;
            }
            i = ((ak)localObject).qeq.size();
            paramAnonymousObject = ((ak)localObject).qeq.remove(str);
            localObject = new StringBuilder("internalMap ").append(((ak)localObject).qeq.size()).append(" bfSize :").append(i).append(" o == null ");
            if (paramAnonymousObject != null)
            {
              bool = true;
              w.d("MicroMsg.SnsLRUMap", bool);
              w.i("MicroMsg.LazyerImageLoader2", "keys " + str + " deRef ok  Big:size:" + g.this.qal.qeq.size() + " listPaitSize:" + g.this.qaq.size());
              GMTrace.o(8142050033664L, 60663);
              return true;
              localObject = ((g)paramAnonymousObject).hzO.keySet().iterator();
              if (((Iterator)localObject).hasNext())
              {
                i = ((Integer)((Iterator)localObject).next()).intValue();
                if (((WeakReference)((g)paramAnonymousObject).hzO.get(Integer.valueOf(i))).get() != null) {
                  continue;
                }
                localIterator = ((g)paramAnonymousObject).qaq.iterator();
                if (!localIterator.hasNext()) {
                  continue;
                }
                localc = (g.c)localIterator.next();
                if (localc.code != i) {
                  continue;
                }
                ((g)paramAnonymousObject).qaq.remove(localc);
                w.d("MicroMsg.LazyerImageLoader2", "remove code ok rCode: " + i);
                continue;
              }
              paramAnonymousObject = ((g)paramAnonymousObject).qaq.iterator();
              if (((Iterator)paramAnonymousObject).hasNext())
              {
                localObject = (g.c)((Iterator)paramAnonymousObject).next();
                if ((str == null) || (!str.equals(((g.c)localObject).id))) {
                  continue;
                }
                i = 0;
                break;
              }
              i = 1;
              break;
              paramAnonymousObject = (WeakReference)((ak.b)((ak)localObject).qeq.get(str)).obj;
              if (paramAnonymousObject == null) {
                break label541;
              }
              paramAnonymousObject = (Bitmap)((WeakReference)paramAnonymousObject).get();
              continue;
            }
            label531:
            GMTrace.o(8142050033664L, 60663);
            return false;
            label541:
            paramAnonymousObject = null;
          }
        }
      });
      GMTrace.o(8132252139520L, 60590);
      return;
    }
  }
  
  public static String B(amn paramamn)
  {
    GMTrace.i(8138291937280L, 60635);
    if (paramamn == null)
    {
      GMTrace.o(8138291937280L, 60635);
      return null;
    }
    if (paramamn.nas.startsWith("pre_temp_sns_pic")) {
      paramamn = ae.getAccSnsTmpPath() + paramamn.nas;
    }
    for (;;)
    {
      GMTrace.o(8138291937280L, 60635);
      return paramamn;
      if (paramamn.nas.startsWith("Locall_path")) {
        paramamn = am.dt(ae.getAccSnsPath(), paramamn.nas) + com.tencent.mm.plugin.sns.data.i.m(paramamn);
      } else if (paramamn.nas.startsWith("pre_temp_extend_pic")) {
        paramamn = paramamn.nas.substring(19);
      } else {
        paramamn = am.dt(ae.getAccSnsPath(), paramamn.nas) + com.tencent.mm.plugin.sns.data.i.d(paramamn);
      }
    }
  }
  
  private boolean C(View paramView, int paramInt)
  {
    GMTrace.i(8132654792704L, 60593);
    if (paramView.hashCode() == paramInt)
    {
      GMTrace.o(8132654792704L, 60593);
      return true;
    }
    if ((paramView instanceof ViewGroup))
    {
      paramView = (ViewGroup)paramView;
      int i = paramView.getChildCount();
      int j;
      do
      {
        j = i - 1;
        if (j < 0) {
          break;
        }
        i = j;
      } while (!C(paramView.getChildAt(j), paramInt));
      GMTrace.o(8132654792704L, 60593);
      return true;
    }
    GMTrace.o(8132654792704L, 60593);
    return false;
  }
  
  public static Bitmap a(String paramString1, String paramString2, String paramString3, boolean paramBoolean, an paraman)
  {
    GMTrace.i(8138023501824L, 60633);
    if ((!paramBoolean) && (bg.mZ(paramString1)))
    {
      GMTrace.o(8138023501824L, 60633);
      return null;
    }
    amn localamn = com.tencent.mm.modelsns.e.a(paramString3, 2, paramString2, paramString2, 1, 1, "");
    com.tencent.mm.plugin.sns.data.i.ap(2, paramString3);
    if (paramString3.equals(""))
    {
      paramString1 = com.tencent.mm.plugin.sns.data.i.Gd(paramString1);
      if (com.tencent.mm.plugin.sns.data.i.m(paramString1))
      {
        GMTrace.o(8138023501824L, 60633);
        return paramString1;
      }
      GMTrace.o(8138023501824L, 60633);
      return null;
    }
    if (com.tencent.mm.plugin.sns.data.i.m(null))
    {
      GMTrace.o(8138023501824L, 60633);
      return null;
    }
    Object localObject = com.tencent.mm.plugin.sns.data.i.l(localamn);
    localObject = com.tencent.mm.plugin.sns.data.i.Gd(am.dt(ae.getAccSnsPath(), paramString3) + (String)localObject);
    paramString3 = (String)localObject;
    if (!com.tencent.mm.plugin.sns.data.i.m((Bitmap)localObject)) {
      paramString3 = com.tencent.mm.plugin.sns.data.i.Gd(paramString1);
    }
    if ((paramString3 == null) && (paramBoolean) && (!bg.mZ(paramString2))) {
      ae.bhk().a(localamn, 3, null, paraman);
    }
    if (!com.tencent.mm.plugin.sns.data.i.m(paramString3))
    {
      GMTrace.o(8138023501824L, 60633);
      return null;
    }
    GMTrace.o(8138023501824L, 60633);
    return paramString3;
  }
  
  private void a(Object paramObject, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(8135204929536L, 60612);
    a(paramObject, paramString, true, paramInt1, paramInt2, -1, -1, paramInt3);
    GMTrace.o(8135204929536L, 60612);
  }
  
  private static void a(Object paramObject, String paramString, n paramn)
  {
    long l2 = 0L;
    GMTrace.i(8133996969984L, 60603);
    if (paramObject == null)
    {
      GMTrace.o(8133996969984L, 60603);
      return;
    }
    if (paramn != null) {
      w.i("MicroMsg.LazyerImageLoader2", "setImageDrawable %s %s %s", new Object[] { paramObject, paramString, paramn.yu() });
    }
    Object localObject;
    long l1;
    if ((paramObject instanceof QFadeImageView))
    {
      paramObject = (QFadeImageView)paramObject;
      localObject = ((QImageView)paramObject).mDrawable;
      l1 = l2;
      if (!bg.mZ(((QFadeImageView)paramObject).amo))
      {
        l1 = l2;
        if (((QFadeImageView)paramObject).amo.equals(paramString)) {
          l1 = ((QFadeImageView)paramObject).msU;
        }
      }
      if ((localObject == null) || (!(localObject instanceof ah))) {
        break label404;
      }
      l1 = ((ah)localObject).msU;
    }
    label390:
    label404:
    for (;;)
    {
      paramn = new ah(paramString, paramn, l1);
      ((QFadeImageView)paramObject).msU = paramn.msU;
      ((QFadeImageView)paramObject).amo = paramString;
      ((QFadeImageView)paramObject).setImageDrawable(paramn);
      paramn.invalidateSelf();
      GMTrace.o(8133996969984L, 60603);
      return;
      if ((paramObject instanceof QDisFadeImageView))
      {
        paramObject = (QDisFadeImageView)paramObject;
        paramString = new com.tencent.mm.memory.a.a(paramString, paramn);
        ((QDisFadeImageView)paramObject).setImageDrawable(paramString);
        paramString.invalidateSelf();
        GMTrace.o(8133996969984L, 60603);
        return;
      }
      if ((paramObject instanceof ImageView))
      {
        localObject = (ImageView)paramObject;
        paramObject = ((ImageView)localObject).getDrawable();
        if ((paramObject != null) && ((paramObject instanceof ah))) {}
        for (paramObject = new ah(paramString, paramn, ((ah)paramObject).msU);; paramObject = new ah(paramString, paramn, 0L))
        {
          ((ImageView)localObject).setImageDrawable((Drawable)paramObject);
          ((ah)paramObject).invalidateSelf();
          GMTrace.o(8133996969984L, 60603);
          return;
        }
      }
      if ((paramObject instanceof com.tencent.mm.plugin.sight.decode.a.a))
      {
        w.i("MicroMsg.LazyerImageLoader2", "update sight thumb " + paramString);
        if ((paramObject instanceof SightPlayImageView))
        {
          localObject = (SightPlayImageView)paramObject;
          paramObject = ((QImageView)localObject).mDrawable;
          if ((paramObject == null) || (!(paramObject instanceof ah))) {
            break label390;
          }
        }
      }
      for (paramObject = new ah(paramString, paramn, ((ah)paramObject).msU);; paramObject = new ah(paramString, paramn, 0L))
      {
        ((SightPlayImageView)localObject).setImageDrawable((Drawable)paramObject);
        ((ah)paramObject).invalidateSelf();
        GMTrace.o(8133996969984L, 60603);
        return;
      }
    }
  }
  
  private void a(Object paramObject, String paramString, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    GMTrace.i(8135339147264L, 60613);
    if (paramObject == null)
    {
      GMTrace.o(8135339147264L, 60613);
      return;
    }
    int i = paramObject.hashCode();
    this.qaq.remove(new c(null, i, 0, false));
    c localc = new c(paramString, i, paramInt2, paramBoolean);
    this.qaq.add(localc);
    LinkedList localLinkedList = (LinkedList)this.qam.get(paramString);
    Object localObject = localLinkedList;
    if (localLinkedList == null)
    {
      localObject = new LinkedList();
      this.qam.put(paramString, localObject);
    }
    ((LinkedList)localObject).add(new WeakReference(localc));
    localObject = (String)((View)paramObject).getTag(2130706432);
    if (localObject != null)
    {
      localLinkedList = (LinkedList)this.qam.get(localObject);
      if (localLinkedList != null)
      {
        paramInt2 = 0;
        if (paramInt2 >= localLinkedList.size()) {
          break label505;
        }
        localc = (c)((WeakReference)localLinkedList.get(paramInt2)).get();
        if ((localc == null) || (localc.code != i)) {
          break label352;
        }
      }
    }
    for (;;)
    {
      if (paramInt2 != -1)
      {
        w.v("MicroMsg.LazyerImageLoader2", "updateImageViewToKey remove last pair %s", new Object[] { localObject });
        localLinkedList.remove(paramInt2);
      }
      ((View)paramObject).setTag(2130706432, paramString);
      localObject = new WeakReference(paramObject);
      this.hzO.put(Integer.valueOf(i), localObject);
      if (paramInt1 != -1)
      {
        if (!(paramObject instanceof QFadeImageView)) {
          break label361;
        }
        ((QFadeImageView)paramObject).setImageResource(paramInt1);
      }
      for (;;)
      {
        if ((paramInt5 == a.qaQ) && (((paramObject instanceof ImageView)) || ((paramObject instanceof QFadeImageView))))
        {
          k.bC((View)paramObject);
          GMTrace.o(8135339147264L, 60613);
          return;
          label352:
          paramInt2 += 1;
          break;
          label361:
          if ((paramObject instanceof ImageView))
          {
            ((ImageView)paramObject).setImageDrawable(com.tencent.mm.bq.a.b(((ImageView)paramObject).getContext(), paramInt1));
          }
          else
          {
            localObject = (com.tencent.mm.plugin.sight.decode.a.a)paramObject;
            if (!this.pZX) {}
            for (paramBoolean = true;; paramBoolean = false)
            {
              ((com.tencent.mm.plugin.sight.decode.a.a)localObject).an(null, paramBoolean);
              break;
            }
          }
        }
      }
      if ((paramString != null) && (paramString.startsWith("3")) && (((paramObject instanceof ImageView)) || ((paramObject instanceof QFadeImageView))))
      {
        k.i((View)paramObject, paramInt3, paramInt4);
        w.d("MicroMsg.LazyerImageLoader2", "try to setlayerType " + paramInt3 + " " + paramInt4);
      }
      GMTrace.o(8135339147264L, 60613);
      return;
      label505:
      paramInt2 = -1;
    }
  }
  
  private boolean a(final int paramInt, final amn paramamn, final an paraman)
  {
    GMTrace.i(8135741800448L, 60616);
    if (!this.pZX)
    {
      GMTrace.o(8135741800448L, 60616);
      return false;
    }
    ae.bhc().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8092657909760L, 60295);
        if (!g.this.a(paramInt, paramamn))
        {
          com.tencent.mm.plugin.sns.data.e locale = new com.tencent.mm.plugin.sns.data.e(paramamn);
          locale.pYl = paramInt;
          locale.nry = paramamn.nas;
          ae.bhk().a(paramamn, 1, locale, paraman);
        }
        GMTrace.o(8092657909760L, 60295);
      }
    });
    GMTrace.o(8135741800448L, 60616);
    return true;
  }
  
  public static boolean a(amn paramamn, an paraman)
  {
    GMTrace.i(8138157719552L, 60634);
    if ((paramamn == null) || (paramamn.nas == null) || (paramamn.nas.equals("")))
    {
      GMTrace.o(8138157719552L, 60634);
      return false;
    }
    if (paramamn.nas.startsWith("Locall_path")) {}
    for (String str = am.dt(ae.getAccSnsPath(), paramamn.nas) + com.tencent.mm.plugin.sns.data.i.m(paramamn); !FileOp.aZ(str); str = am.dt(ae.getAccSnsPath(), paramamn.nas) + com.tencent.mm.plugin.sns.data.i.d(paramamn))
    {
      ae.bhk().a(paramamn, 2, null, paraman);
      GMTrace.o(8138157719552L, 60634);
      return false;
    }
    GMTrace.o(8138157719552L, 60634);
    return true;
  }
  
  private static boolean bL(String paramString, int paramInt)
  {
    GMTrace.i(8136547106816L, 60622);
    paramString = bh.p(paramString, "SightDownloadControl");
    if ((paramString == null) || (paramString.isEmpty()))
    {
      GMTrace.o(8136547106816L, 60622);
      return true;
    }
    if (paramInt == 1)
    {
      if (bg.getInt((String)paramString.get(".SightDownloadControl.G3PlusAutoDownload"), 0) == 1)
      {
        GMTrace.o(8136547106816L, 60622);
        return true;
      }
      GMTrace.o(8136547106816L, 60622);
      return false;
    }
    if (bg.getInt((String)paramString.get(".SightDownloadControl.WifiAutoDownload"), 0) == 1)
    {
      GMTrace.o(8136547106816L, 60622);
      return true;
    }
    GMTrace.o(8136547106816L, 60622);
    return false;
  }
  
  private static void cq(View paramView)
  {
    GMTrace.i(8134936494080L, 60610);
    if ((paramView instanceof QImageView))
    {
      ((QImageView)paramView).a(QImageView.a.wVo);
      ((QImageView)paramView).setImageResource(i.e.pGK);
      GMTrace.o(8134936494080L, 60610);
      return;
    }
    if ((paramView instanceof ImageView))
    {
      ((ImageView)paramView).setImageResource(i.e.pGK);
      GMTrace.o(8134936494080L, 60610);
      return;
    }
    GMTrace.o(8134936494080L, 60610);
  }
  
  public static String r(amn paramamn)
  {
    GMTrace.i(8134131187712L, 60604);
    if ((paramamn == null) || (paramamn.nas == null) || (paramamn.nas.equals("")))
    {
      GMTrace.o(8134131187712L, 60604);
      return null;
    }
    String str = am.dt(ae.getAccSnsPath(), paramamn.nas) + com.tencent.mm.plugin.sns.data.i.e(paramamn);
    if (!FileOp.aZ(str))
    {
      paramamn = paramamn.uhA;
      GMTrace.o(8134131187712L, 60604);
      return paramamn;
    }
    GMTrace.o(8134131187712L, 60604);
    return str;
  }
  
  public static String s(amn paramamn)
  {
    GMTrace.i(8134265405440L, 60605);
    if ((paramamn == null) || (paramamn.nas == null) || (paramamn.nas.equals("")))
    {
      GMTrace.o(8134265405440L, 60605);
      return null;
    }
    String str = am.dt(ae.getAccSnsPath(), paramamn.nas) + com.tencent.mm.plugin.sns.data.i.d(paramamn);
    if (!FileOp.aZ(str))
    {
      paramamn = paramamn.mDo;
      GMTrace.o(8134265405440L, 60605);
      return paramamn;
    }
    GMTrace.o(8134265405440L, 60605);
    return str;
  }
  
  public static boolean t(amn paramamn)
  {
    GMTrace.i(8135876018176L, 60617);
    String str1 = am.dt(ae.getAccSnsPath(), paramamn.nas);
    String str2 = com.tencent.mm.plugin.sns.data.i.j(paramamn);
    if (FileOp.aZ(str1 + str2))
    {
      GMTrace.o(8135876018176L, 60617);
      return true;
    }
    if ((FileOp.aZ(str1 + com.tencent.mm.plugin.sns.data.i.p(paramamn))) && (!bg.mZ(paramamn.nas)) && (paramamn.nas.startsWith("Locall_path")))
    {
      GMTrace.o(8135876018176L, 60617);
      return true;
    }
    GMTrace.o(8135876018176L, 60617);
    return false;
  }
  
  public final boolean A(amn paramamn)
  {
    GMTrace.i(16639374393344L, 123973);
    if ((paramamn == null) || (paramamn.nas == null) || (paramamn.nas.equals("")))
    {
      GMTrace.o(16639374393344L, 123973);
      return false;
    }
    if (FileOp.aZ(am.dt(ae.getAccSnsPath(), paramamn.nas) + com.tencent.mm.plugin.sns.data.i.f(paramamn)))
    {
      GMTrace.o(16639374393344L, 123973);
      return true;
    }
    if (FileOp.aZ(am.dt(ae.getAccSnsPath(), paramamn.nas) + com.tencent.mm.plugin.sns.data.i.e(paramamn)))
    {
      GMTrace.o(16639374393344L, 123973);
      return true;
    }
    paramamn = com.tencent.mm.plugin.sns.data.i.ap(1, paramamn.nas);
    boolean bool = com.tencent.mm.plugin.sns.data.i.a((n)this.qak.get(paramamn));
    GMTrace.o(16639374393344L, 123973);
    return bool;
  }
  
  public final n Gs(String paramString)
  {
    GMTrace.i(8133594316800L, 60600);
    n localn = (n)this.qak.get(paramString);
    if ((localn == null) || (localn.isRecycled()))
    {
      this.qak.remove(paramString);
      GMTrace.o(8133594316800L, 60600);
      return null;
    }
    GMTrace.o(8133594316800L, 60600);
    return localn;
  }
  
  public final void Gt(String paramString)
  {
    GMTrace.i(8137889284096L, 60632);
    b(paramString, null);
    GMTrace.o(8137889284096L, 60632);
  }
  
  public final void I(Activity paramActivity)
  {
    GMTrace.i(8132789010432L, 60594);
    w.d("MicroMsg.LazyerImageLoader2", "try to remove ImageView " + this.hzO.size());
    Object localObject1 = new LinkedList();
    Object localObject2 = this.qaq.iterator();
    Object localObject3;
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (c)((Iterator)localObject2).next();
      if (C(paramActivity.getWindow().getDecorView(), ((c)localObject3).code)) {
        ((List)localObject1).add(Integer.valueOf(((c)localObject3).code));
      }
    }
    localObject2 = ((List)localObject1).iterator();
    int i;
    for (;;)
    {
      if (!((Iterator)localObject2).hasNext()) {
        break label214;
      }
      i = ((Integer)((Iterator)localObject2).next()).intValue();
      this.hzO.remove(Integer.valueOf(i));
      localObject3 = this.qaq.iterator();
      if (((Iterator)localObject3).hasNext())
      {
        c localc = (c)((Iterator)localObject3).next();
        if (localc.code != i) {
          break;
        }
        this.qaq.remove(localc);
      }
    }
    label214:
    ((List)localObject1).clear();
    localObject2 = this.qaq.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (c)((Iterator)localObject2).next();
      if (((c)localObject3).qaT == paramActivity.hashCode()) {
        ((List)localObject1).add(Integer.valueOf(((c)localObject3).code));
      }
    }
    paramActivity = ((List)localObject1).iterator();
    for (;;)
    {
      if (!paramActivity.hasNext()) {
        break label374;
      }
      i = ((Integer)paramActivity.next()).intValue();
      this.hzO.remove(Integer.valueOf(i));
      localObject1 = this.qaq.iterator();
      if (((Iterator)localObject1).hasNext())
      {
        localObject2 = (c)((Iterator)localObject1).next();
        if (((c)localObject2).code != i) {
          break;
        }
        this.qaq.remove(localObject2);
      }
    }
    label374:
    this.qal.bhL();
    w.d("MicroMsg.LazyerImageLoader2", "after try to remove ImageView " + this.hzO.size());
    GMTrace.o(8132789010432L, 60594);
  }
  
  public final int a(m paramm, int[] paramArrayOfInt)
  {
    int j = 5;
    GMTrace.i(8136144453632L, 60619);
    Object localObject;
    PInt localPInt1;
    PInt localPInt2;
    if ((paramArrayOfInt != null) || (bg.aG(this.qau) > 60000L))
    {
      localObject = new PInt();
      localPInt1 = new PInt();
      localPInt2 = new PInt();
      c.Gp();
      if (!c.a((PInt)localObject, localPInt1, localPInt2)) {
        break label155;
      }
      this.qaw = 5;
      if (paramArrayOfInt != null) {
        if (((PInt)localObject).value != 0) {
          break label164;
        }
      }
    }
    label155:
    label164:
    for (int i = 0;; i = 1)
    {
      paramArrayOfInt[0] = i;
      paramArrayOfInt[1] = localPInt1.value;
      paramArrayOfInt[2] = localPInt2.value;
      this.qax = ((PInt)localObject).value;
      this.qau = bg.Pq();
      if ((this.qax != 0) && (paramm != null)) {
        break label169;
      }
      i = this.qaw;
      GMTrace.o(8136144453632L, 60619);
      return i;
      this.qaw = 10;
      break;
    }
    label169:
    if (this.qay.containsKey(Long.valueOf(paramm.field_snsId)))
    {
      i = ((Integer)this.qay.get(Long.valueOf(paramm.field_snsId))).intValue();
      GMTrace.o(8136144453632L, 60619);
      return i;
    }
    paramArrayOfInt = new bds();
    try
    {
      localObject = (bdk)new bdk().aC(paramm.field_attrBuf);
      if (((bdk)localObject).uvv == null)
      {
        i = this.qaw;
        GMTrace.o(8136144453632L, 60619);
        return i;
      }
      paramArrayOfInt.aC(((bdk)localObject).uvv.ush.toK);
      if ((paramArrayOfInt.uvK == null) || (paramArrayOfInt.uvK.info == null))
      {
        i = this.qaw;
        GMTrace.o(8136144453632L, 60619);
        return i;
      }
    }
    catch (Exception paramm)
    {
      w.printErrStackTrace("MicroMsg.LazyerImageLoader2", paramm, "", new Object[0]);
      i = this.qaw;
      GMTrace.o(8136144453632L, 60619);
      return i;
    }
    paramArrayOfInt = paramArrayOfInt.uvK.info;
    i = paramArrayOfInt.hashCode();
    if (this.qax == 1)
    {
      if (!this.qaA.containsKey(Integer.valueOf(i))) {
        this.qaA.put(Integer.valueOf(i), Boolean.valueOf(bL(paramArrayOfInt, this.qax)));
      }
      if (((Boolean)this.qaA.get(Integer.valueOf(i))).booleanValue()) {}
      for (i = 5;; i = 10)
      {
        w.i("MicroMsg.LazyerImageLoader2", "isAutoDownload(sight_autodownload) snsID:%d, result:%d", new Object[] { Long.valueOf(paramm.field_snsId), Integer.valueOf(i) });
        this.qay.put(Long.valueOf(paramm.field_snsId), Integer.valueOf(i));
        GMTrace.o(8136144453632L, 60619);
        return i;
      }
    }
    if (!this.qaz.containsKey(Integer.valueOf(i))) {
      this.qaz.put(Integer.valueOf(i), Boolean.valueOf(bL(paramArrayOfInt, this.qax)));
    }
    if (((Boolean)this.qaz.get(Integer.valueOf(i))).booleanValue()) {}
    for (i = j;; i = 10) {
      break;
    }
  }
  
  public final Bitmap a(amn paramamn, View paramView, int paramInt, boolean paramBoolean, an paraman)
  {
    GMTrace.i(8138426155008L, 60636);
    if ((paramamn == null) || (paramamn.nas == null) || (paramamn.nas.equals("")))
    {
      GMTrace.o(8138426155008L, 60636);
      return null;
    }
    String str = com.tencent.mm.plugin.sns.data.i.ap(3, paramamn.nas);
    Object localObject1 = B(paramamn);
    int j = -1;
    int k = -1;
    int i = j;
    try
    {
      localObject2 = d.QI((String)localObject1);
      i = j;
      j = ((BitmapFactory.Options)localObject2).outWidth;
      i = j;
      int m = ((BitmapFactory.Options)localObject2).outHeight;
      k = m;
      i = j;
    }
    catch (Exception localException)
    {
      Object localObject2;
      boolean bool;
      for (;;) {}
    }
    a(paramView, str, false, -1, paramInt, i, k, a.qaP);
    paramView = ae.bhk();
    localObject2 = paramamn.nas;
    if (paramView.pZZ.containsKey(com.tencent.mm.plugin.sns.data.i.aq(2, (String)localObject2))) {}
    for (paramInt = 1; paramInt != 0; paramInt = 0)
    {
      GMTrace.o(8138426155008L, 60636);
      return null;
    }
    paramView = this.qal;
    localObject2 = (ak.b)paramView.qeq.get(str);
    if (localObject2 == null)
    {
      paramView = null;
      paramView = (WeakReference)paramView;
      localObject2 = new StringBuilder("getFromWeakReference ").append(str).append("  ");
      if (paramView != null) {
        break label302;
      }
      bool = true;
      label237:
      w.i("MicroMsg.LazyerImageLoader2", bool);
      if (paramView != null) {
        break label308;
      }
    }
    label302:
    label308:
    for (paramView = null;; paramView = (Bitmap)paramView.get())
    {
      if (!com.tencent.mm.plugin.sns.data.i.m(paramView)) {
        break label319;
      }
      GMTrace.o(8138426155008L, 60636);
      return paramView;
      ((ak.b)paramView.qeq.get(str)).bhM();
      paramView = ((ak.b)localObject2).obj;
      break;
      bool = false;
      break label237;
    }
    label319:
    if (paramamn.nas.startsWith("pre_temp_extend_pic"))
    {
      paramView = r.HR((String)localObject1);
      localObject1 = this.qal;
      localObject2 = new WeakReference(paramView);
      if ((ak.b)((ak)localObject1).qeq.get(str) != null) {
        break label432;
      }
      localObject2 = new ak.b((ak)localObject1, localObject2);
      ((ak)localObject1).qeq.put(str, localObject2);
      ((ak)localObject1).bhL();
    }
    for (;;)
    {
      if (!com.tencent.mm.plugin.sns.data.i.m(paramView)) {
        break label473;
      }
      GMTrace.o(8138426155008L, 60636);
      return paramView;
      paramView = com.tencent.mm.plugin.sns.data.i.Gd((String)localObject1);
      break;
      label432:
      ((ak.b)((ak)localObject1).qeq.get(str)).bhM();
      ((ak.b)((ak)localObject1).qeq.get(str)).obj = localObject2;
    }
    label473:
    if (paramBoolean) {
      ae.bhk().a(paramamn, 2, null, paraman);
    }
    GMTrace.o(8138426155008L, 60636);
    return null;
  }
  
  public final n a(amn paramamn, ImageView paramImageView, int paramInt, an paraman)
  {
    GMTrace.i(8138560372736L, 60637);
    if ((paramamn == null) || (paramamn.nas == null) || (paramamn.nas.equals("")))
    {
      GMTrace.o(8138560372736L, 60637);
      return null;
    }
    paramImageView.setDrawingCacheEnabled(false);
    String str = com.tencent.mm.plugin.sns.data.i.ap(0, paramamn.nas);
    a(paramImageView, str, -1, paramInt);
    paramImageView = paramamn.nas;
    paramImageView = Gs(str);
    if (!com.tencent.mm.plugin.sns.data.i.a(paramImageView))
    {
      a(0, paramamn, paraman);
      GMTrace.o(8138560372736L, 60637);
      return null;
    }
    GMTrace.o(8138560372736L, 60637);
    return paramImageView;
  }
  
  public final String a(amn paramamn)
  {
    GMTrace.i(8133191663616L, 60597);
    String str = am.dt(ae.getAccSnsPath(), paramamn.nas);
    paramamn = com.tencent.mm.plugin.sns.data.i.e(paramamn);
    paramamn = str + paramamn;
    GMTrace.o(8133191663616L, 60597);
    return paramamn;
  }
  
  public final void a(amn paramamn, View paramView, int paramInt1, int paramInt2, int paramInt3, an paraman)
  {
    GMTrace.i(8133862752256L, 60602);
    if ((paramamn == null) || (paramamn.nas == null) || (paramamn.nas.equals("")))
    {
      GMTrace.o(8133862752256L, 60602);
      return;
    }
    paramView.setDrawingCacheEnabled(false);
    String str = com.tencent.mm.plugin.sns.data.i.ap(0, paramamn.nas);
    a(paramView, str, paramInt1, paramInt2, paramInt3);
    Object localObject = paramamn.nas;
    localObject = Gs(str);
    if (!com.tencent.mm.plugin.sns.data.i.a((n)localObject))
    {
      if (paramInt1 == -1) {
        cq(paramView);
      }
      if (this.qaE.contains(str))
      {
        GMTrace.o(8133862752256L, 60602);
        return;
      }
      a(0, paramamn, paraman);
      GMTrace.o(8133862752256L, 60602);
      return;
    }
    a(paramView, str, (n)localObject);
    GMTrace.o(8133862752256L, 60602);
  }
  
  public final void a(amn paramamn, View paramView, int paramInt1, int paramInt2, an paraman)
  {
    GMTrace.i(8133460099072L, 60599);
    a(paramamn, paramView, -1, paramInt1, paramInt2, paraman);
    GMTrace.o(8133460099072L, 60599);
  }
  
  public final void a(amn paramamn, View paramView, int paramInt, an paraman)
  {
    GMTrace.i(8134399623168L, 60606);
    c(paramamn, paramView, -1, paramInt, paraman);
    GMTrace.o(8134399623168L, 60606);
  }
  
  public final void a(Object paramObject, String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(8135070711808L, 60611);
    a(paramObject, paramString, true, paramInt1, paramInt2, -1, -1, a.qaP);
    GMTrace.o(8135070711808L, 60611);
  }
  
  public final void a(List<amn> paramList, View paramView, int paramInt1, int paramInt2, a parama)
  {
    GMTrace.i(8138828808192L, 60639);
    a(paramList, paramView, paramInt1, paramInt2, parama, false);
    GMTrace.o(8138828808192L, 60639);
  }
  
  public final void a(final List<amn> paramList, View paramView, int paramInt1, int paramInt2, final a parama, boolean paramBoolean)
  {
    GMTrace.i(8138963025920L, 60640);
    if ((paramList == null) || (paramList.size() == 0))
    {
      GMTrace.o(8138963025920L, 60640);
      return;
    }
    if (paramList.size() == 1)
    {
      if (!paramBoolean)
      {
        b((amn)paramList.get(0), paramView, paramInt1, parama);
        GMTrace.o(8138963025920L, 60640);
        return;
      }
      paramList = (amn)paramList.get(0);
      paramInt2 = a.qaQ;
      if ((paramList == null) || (paramList.nas == null) || (paramList.nas.equals("")))
      {
        GMTrace.o(8138963025920L, 60640);
        return;
      }
      paramView.setDrawingCacheEnabled(false);
      str = com.tencent.mm.plugin.sns.data.i.ap(5, paramList.nas);
      a(paramView, str, -1, paramInt1, paramInt2);
      localObject = paramList.nas;
      localObject = Gs(str);
      if (!com.tencent.mm.plugin.sns.data.i.a((n)localObject))
      {
        cq(paramView);
        if (!this.qaE.contains(str))
        {
          a(5, paramList, parama);
          GMTrace.o(8138963025920L, 60640);
        }
      }
      else
      {
        a(paramView, str, (n)localObject);
      }
      GMTrace.o(8138963025920L, 60640);
      return;
    }
    String str = com.tencent.mm.plugin.sns.data.i.ap(0, com.tencent.mm.plugin.sns.data.i.bn(paramList));
    a(paramView, str, true, -1, paramInt1, -1, -1, paramInt2);
    Object localObject = Gs(str);
    paramBoolean = com.tencent.mm.plugin.sns.data.i.a((n)localObject);
    w.v("MicroMsg.LazyerImageLoader2", "set Sns GridList " + paramBoolean);
    if (!paramBoolean)
    {
      cq(paramView);
      if (this.qaE.contains(str))
      {
        GMTrace.o(8138963025920L, 60640);
        return;
      }
      new WeakReference(paramView);
      ae.bhc().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8110374649856L, 60427);
          long l = bg.Pq();
          final Object localObject = new com.tencent.mm.plugin.sns.data.e(paramList);
          ((com.tencent.mm.plugin.sns.data.e)localObject).nry = com.tencent.mm.plugin.sns.data.i.bn(paramList);
          ((com.tencent.mm.plugin.sns.data.e)localObject).pYl = this.qaH;
          int k = 0;
          int i = 1;
          amn localamn;
          b localb;
          String str;
          int j;
          if ((k < paramList.size()) && (k < 4))
          {
            localamn = (amn)paramList.get(k);
            localb = ae.bhk();
            str = localamn.nas;
            if (localb.pZZ.containsKey(com.tencent.mm.plugin.sns.data.i.aq(1, str)))
            {
              j = 1;
              label117:
              if (j == 0) {
                break label159;
              }
              i = 0;
            }
          }
          for (;;)
          {
            k += 1;
            break;
            if (localb.pZZ.containsKey(com.tencent.mm.plugin.sns.data.i.aq(5, str)))
            {
              j = 1;
              break label117;
            }
            j = 0;
            break label117;
            label159:
            if ((!FileOp.aZ(am.dt(ae.getAccSnsPath(), localamn.nas) + com.tencent.mm.plugin.sns.data.i.e(localamn))) && (!FileOp.aZ(am.dt(ae.getAccSnsPath(), localamn.nas) + com.tencent.mm.plugin.sns.data.i.l(localamn))) && (!FileOp.aZ(am.dt(ae.getAccSnsPath(), localamn.nas) + com.tencent.mm.plugin.sns.data.i.m(localamn))))
            {
              ae.bhk().a(localamn, 1, (com.tencent.mm.plugin.sns.data.e)localObject, parama);
              i = 0;
              continue;
              l = bg.aG(l);
              if (l > 100L) {
                w.i("MicroMsg.LazyerImageLoader2", "fileexist check2  endtime " + l + " " + Thread.currentThread().getName() + " " + com.tencent.mm.compatible.util.e.gZR + " " + ae.bhD() + " " + ((com.tencent.mm.plugin.sns.data.e)localObject).nry);
              }
              if (bg.aG(g.this.qai) > 60000L)
              {
                com.tencent.mm.plugin.report.service.g.paX.i(11696, new Object[] { Integer.valueOf(1), Long.valueOf(l), Integer.valueOf(0), Thread.currentThread().getName(), ae.bhD(), com.tencent.mm.compatible.util.e.gZR });
                g.this.qai = bg.Pq();
              }
              localObject = com.tencent.mm.plugin.sns.data.i.bn(paramList);
              if (i != 0) {
                ae.aCa().post(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(8107824513024L, 60408);
                    new i(com.tencent.mm.plugin.sns.data.i.ap(0, localObject), localObject, g.4.this.qaK).m(new String[] { "" });
                    GMTrace.o(8107824513024L, 60408);
                  }
                });
              }
              GMTrace.o(8110374649856L, 60427);
              return;
            }
          }
        }
      });
      GMTrace.o(8138963025920L, 60640);
      return;
    }
    a(paramView, str, (n)localObject);
    GMTrace.o(8138963025920L, 60640);
  }
  
  public final boolean a(final int paramInt, final amn paramamn)
  {
    GMTrace.i(16041971286016L, 119522);
    if (!this.pZX)
    {
      GMTrace.o(16041971286016L, 119522);
      return false;
    }
    final String str2 = am.dt(ae.getAccSnsPath(), paramamn.nas);
    final String str1;
    if (paramInt == 4) {
      str1 = com.tencent.mm.plugin.sns.data.i.g(paramamn);
    }
    String str3;
    for (;;)
    {
      str3 = com.tencent.mm.plugin.sns.data.i.e(paramamn);
      if (!com.tencent.mm.plugin.sns.model.a.b.Hc(paramamn.nas)) {
        break;
      }
      GMTrace.o(16041971286016L, 119522);
      return false;
      if (paramInt == 5) {
        str1 = com.tencent.mm.plugin.sns.data.i.h(paramamn);
      } else if (paramInt == 0) {
        str1 = com.tencent.mm.plugin.sns.data.i.f(paramamn);
      } else {
        str1 = com.tencent.mm.plugin.sns.data.i.e(paramamn);
      }
    }
    long l = bg.Pq();
    boolean bool2 = FileOp.aZ(str2 + str3);
    boolean bool1 = bool2;
    if (!bool2) {
      bool1 = FileOp.aZ(str2 + com.tencent.mm.plugin.sns.data.i.l(paramamn));
    }
    if (!bool1) {
      FileOp.aZ(str2 + com.tencent.mm.plugin.sns.data.i.m(paramamn));
    }
    l = bg.aG(l);
    if (l > 100L) {
      w.i("MicroMsg.LazyerImageLoader2", "fileexist check  endtime " + l + " " + Thread.currentThread().getName() + " " + com.tencent.mm.compatible.util.e.gZR + " " + ae.bhD() + " " + paramamn.nas);
    }
    if (bg.aG(this.qai) > 60000L)
    {
      com.tencent.mm.plugin.report.service.g.paX.i(11696, new Object[] { Integer.valueOf(1), Long.valueOf(l), Integer.valueOf(0), Thread.currentThread().getName(), ae.bhD(), com.tencent.mm.compatible.util.e.gZR });
      this.qai = bg.Pq();
    }
    if ((FileOp.aZ(str2 + str3)) || (FileOp.aZ(str2 + com.tencent.mm.plugin.sns.data.i.l(paramamn))) || (FileOp.aZ(str2 + com.tencent.mm.plugin.sns.data.i.m(paramamn))))
    {
      ae.aCa().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8073598992384L, 60153);
          while (g.this.qao.size() >= 60)
          {
            localb = (g.b)g.this.qao.removeFirst();
            g.this.qaE.remove(localb.amo);
          }
          w.i("MicroMsg.LazyerImageLoader2", "add loaderlist size:" + g.this.qao.size());
          g.b localb = new g.b(g.this, com.tencent.mm.plugin.sns.data.i.ap(paramInt, paramamn.nas), str2 + str1, str2, paramamn, paramInt);
          if (!g.this.qak.aZ(localb.amo)) {
            g.this.qao.add(localb);
          }
          for (;;)
          {
            g.this.bgF();
            GMTrace.o(8073598992384L, 60153);
            return;
            g.this.qaE.remove(localb.amo);
          }
        }
      });
      GMTrace.o(16041971286016L, 119522);
      return true;
    }
    GMTrace.o(16041971286016L, 119522);
    return false;
  }
  
  public final boolean a(m paramm, final amn paramamn, com.tencent.mm.plugin.sight.decode.a.a parama, int paramInt1, int paramInt2, final an paraman, boolean paramBoolean)
  {
    GMTrace.i(8134533840896L, 60607);
    if ((paramamn == null) || (paramamn.nas == null) || (paramamn.nas.equals("")))
    {
      GMTrace.o(8134533840896L, 60607);
      return false;
    }
    String str1 = com.tencent.mm.plugin.sns.data.i.ap(1, paramamn.nas);
    a(parama, str1, -1, paramInt1);
    Object localObject = am.dt(ae.getAccSnsPath(), paramamn.nas);
    String str2 = com.tencent.mm.plugin.sns.data.i.e(paramamn);
    if (!FileOp.aZ((String)localObject + str2))
    {
      localObject = new com.tencent.mm.plugin.sns.data.e(paramamn);
      ((com.tencent.mm.plugin.sns.data.e)localObject).pYl = 1;
      ((com.tencent.mm.plugin.sns.data.e)localObject).nry = paramamn.nas;
      ae.bhk().a(paramamn, 1, (com.tencent.mm.plugin.sns.data.e)localObject, paraman);
    }
    localObject = "";
    if (paramBoolean)
    {
      if (u(paramamn)) {
        break label489;
      }
      localObject = am.dt(ae.getAccSnsPath(), paramamn.nas);
      str2 = com.tencent.mm.plugin.sns.data.i.j(paramamn);
      if (FileOp.aZ((String)localObject + str2)) {
        localObject = (String)localObject + str2;
      }
    }
    else
    {
      w.i("MicroMsg.LazyerImageLoader2", "setsight %s sightPath %s isAd %b", new Object[] { str1, localObject, Boolean.valueOf(paramBoolean) });
      if ((bg.mZ((String)localObject)) || (u(paramamn))) {
        break label514;
      }
      if (!((String)localObject).equals(parama.Nx())) {
        parama.D(null);
      }
      if (this.pZX) {
        break label508;
      }
    }
    label489:
    label497:
    label508:
    for (paramBoolean = true;; paramBoolean = false)
    {
      parama.an((String)localObject, paramBoolean);
      parama.lp(paramInt2);
      GMTrace.o(8134533840896L, 60607);
      return true;
      if ((FileOp.aZ((String)localObject + com.tencent.mm.plugin.sns.data.i.p(paramamn))) && (paramamn.nas != null) && (paramamn.nas.startsWith("Locall_path")))
      {
        localObject = (String)localObject + com.tencent.mm.plugin.sns.data.i.p(paramamn);
        break;
      }
      if (this.pZX)
      {
        w.i("MicroMsg.LazyerImageLoader2", "push sight loader " + paramamn.nas + " url: " + paramamn.mDo);
        if (!paramBoolean) {
          break label497;
        }
        if (b(paramm, null) == 5) {
          ae.aCa().postDelayed(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(8101113626624L, 60358);
              ae.bhk().a(paramamn, 4, null, paraman);
              GMTrace.o(8101113626624L, 60358);
            }
          }, 0L);
        }
      }
      for (;;)
      {
        localObject = "";
        break;
        w.i("MicroMsg.LazyerImageLoader2", "do no auto download sns sight.");
      }
    }
    label514:
    w.i("MicroMsg.LazyerImageLoader2", "sightPath %s", new Object[] { localObject });
    if (!this.pZX)
    {
      paramBoolean = true;
      parama.an(null, paramBoolean);
      paramm = paramamn.nas;
      paramm = Gs(str1);
      paramBoolean = com.tencent.mm.plugin.sns.data.i.a(paramm);
      w.v("MicroMsg.LazyerImageLoader2", "setsight thumb  %s", new Object[] { Boolean.valueOf(paramBoolean) });
      if (paramBoolean) {
        break label714;
      }
      if ((!(parama instanceof ImageView)) && (!(parama instanceof QFadeImageView))) {
        break label645;
      }
      cq((View)parama);
    }
    for (;;)
    {
      if (this.qaE.contains(str1))
      {
        GMTrace.o(8134533840896L, 60607);
        return false;
        paramBoolean = false;
        break;
        label645:
        if ((parama instanceof com.tencent.mm.plugin.sight.decode.a.a))
        {
          if (!this.pZX) {}
          for (paramBoolean = true;; paramBoolean = false)
          {
            parama.an(null, paramBoolean);
            parama.lp(0);
            parama.D(null);
            break;
          }
        }
      }
    }
    a(1, paramamn, paraman);
    GMTrace.o(8134533840896L, 60607);
    return false;
    label714:
    a(parama, str1, paramm);
    GMTrace.o(8134533840896L, 60607);
    return true;
  }
  
  public final boolean a(String paramString, n paramn)
  {
    GMTrace.i(8137755066368L, 60631);
    if ((paramn != null) && (paramString != null)) {
      this.qak.put(paramString, paramn);
    }
    GMTrace.o(8137755066368L, 60631);
    return true;
  }
  
  public final boolean a(String paramString, n paramn, int paramInt)
  {
    GMTrace.i(8137620848640L, 60630);
    a(paramInt + "-" + paramString, paramn);
    GMTrace.o(8137620848640L, 60630);
    return true;
  }
  
  public final int b(m paramm, int[] paramArrayOfInt)
  {
    int j = 5;
    GMTrace.i(8136412889088L, 60621);
    Object localObject;
    PInt localPInt;
    if ((paramArrayOfInt != null) || (bg.aG(this.qav) > 60000L))
    {
      localObject = new PInt();
      localPInt = new PInt();
      c.Gp();
      if (!c.a((PInt)localObject, localPInt)) {
        break label136;
      }
      this.qaB = 5;
      if (paramArrayOfInt != null) {
        if (((PInt)localObject).value != 0) {
          break label145;
        }
      }
    }
    label136:
    label145:
    for (int i = 0;; i = 1)
    {
      paramArrayOfInt[0] = i;
      paramArrayOfInt[1] = localPInt.value;
      this.qaC = ((PInt)localObject).value;
      this.qav = bg.Pq();
      if ((this.qaC != 0) && (paramm != null)) {
        break label150;
      }
      i = this.qaB;
      GMTrace.o(8136412889088L, 60621);
      return i;
      this.qaB = 10;
      break;
    }
    label150:
    if (this.qaD.containsKey(Long.valueOf(paramm.field_snsId)))
    {
      i = ((Integer)this.qaD.get(Long.valueOf(paramm.field_snsId))).intValue();
      GMTrace.o(8136412889088L, 60621);
      return i;
    }
    paramArrayOfInt = new bds();
    try
    {
      localObject = (bdk)new bdk().aC(paramm.field_attrBuf);
      if (((bdk)localObject).uvv == null)
      {
        i = this.qaB;
        GMTrace.o(8136412889088L, 60621);
        return i;
      }
      paramArrayOfInt.aC(((bdk)localObject).uvv.ush.toK);
      if ((paramArrayOfInt.uvK == null) || (paramArrayOfInt.uvK.info == null))
      {
        i = this.qaw;
        GMTrace.o(8136412889088L, 60621);
        return i;
      }
    }
    catch (Exception paramm)
    {
      w.printErrStackTrace("MicroMsg.LazyerImageLoader2", paramm, "", new Object[0]);
      i = this.qaB;
      GMTrace.o(8136412889088L, 60621);
      return i;
    }
    paramArrayOfInt = paramArrayOfInt.uvK.info;
    i = paramArrayOfInt.hashCode();
    if (this.qaC == 1)
    {
      if (!this.qaA.containsKey(Integer.valueOf(i))) {
        this.qaA.put(Integer.valueOf(i), Boolean.valueOf(bL(paramArrayOfInt, this.qaC)));
      }
      if (((Boolean)this.qaA.get(Integer.valueOf(i))).booleanValue()) {}
      for (i = 5;; i = 10)
      {
        w.i("MicroMsg.LazyerImageLoader2", "isAutoAdDownload(sight_autodownload) snsID:%d, result:%d", new Object[] { Long.valueOf(paramm.field_snsId), Integer.valueOf(i) });
        this.qaD.put(Long.valueOf(paramm.field_snsId), Integer.valueOf(i));
        GMTrace.o(8136412889088L, 60621);
        return i;
      }
    }
    if (!this.qaz.containsKey(Integer.valueOf(i))) {
      this.qaz.put(Integer.valueOf(i), Boolean.valueOf(bL(paramArrayOfInt, this.qaC)));
    }
    if (((Boolean)this.qaz.get(Integer.valueOf(i))).booleanValue()) {}
    for (i = j;; i = 10) {
      break;
    }
  }
  
  public final Bitmap b(amn paramamn)
  {
    GMTrace.i(8133057445888L, 60596);
    if ((paramamn.nas == null) || (paramamn.nas.equals("")))
    {
      GMTrace.o(8133057445888L, 60596);
      return null;
    }
    String str1 = com.tencent.mm.plugin.sns.data.i.ap(1, paramamn.nas);
    Object localObject = paramamn.nas;
    localObject = Gs(str1);
    if (com.tencent.mm.plugin.sns.data.i.a((n)localObject))
    {
      paramamn = ((n)localObject).yq();
      GMTrace.o(8133057445888L, 60596);
      return paramamn;
    }
    localObject = am.dt(ae.getAccSnsPath(), paramamn.nas);
    String str2 = com.tencent.mm.plugin.sns.data.i.e(paramamn);
    localObject = (String)localObject + str2;
    if (FileOp.aZ((String)localObject))
    {
      if (paramamn.nas.startsWith("pre_temp_extend_pic")) {}
      for (paramamn = n.i(r.HR((String)localObject)); com.tencent.mm.plugin.sns.data.i.a(paramamn); paramamn = com.tencent.mm.plugin.sns.data.i.Ge((String)localObject))
      {
        a(str1, paramamn);
        paramamn = paramamn.yq();
        GMTrace.o(8133057445888L, 60596);
        return paramamn;
      }
      GMTrace.o(8133057445888L, 60596);
      return null;
    }
    GMTrace.o(8133057445888L, 60596);
    return null;
  }
  
  public final void b(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(8138694590464L, 60638);
    a(paramView, null, true, -1, paramInt3, -1, -1, a.qaP);
    if (paramInt1 != -1) {
      paramView.setBackgroundResource(paramInt1);
    }
    if (paramInt2 != -1)
    {
      if ((paramView instanceof QFadeImageView))
      {
        ((QFadeImageView)paramView).setImageResource(paramInt2);
        GMTrace.o(8138694590464L, 60638);
        return;
      }
      if ((paramView instanceof ImageView))
      {
        ((ImageView)paramView).setImageDrawable(com.tencent.mm.bq.a.b(paramView.getContext(), paramInt2));
        GMTrace.o(8138694590464L, 60638);
      }
    }
    else
    {
      if ((paramView instanceof QFadeImageView))
      {
        ((QFadeImageView)paramView).setImageResource(i.e.pGK);
        GMTrace.o(8138694590464L, 60638);
        return;
      }
      if ((paramView instanceof ImageView)) {
        ((ImageView)paramView).setImageResource(i.e.pGK);
      }
    }
    GMTrace.o(8138694590464L, 60638);
  }
  
  public final void b(amn paramamn, View paramView, int paramInt1, int paramInt2, an paraman)
  {
    GMTrace.i(8133728534528L, 60601);
    a(paramamn, paramView, paramInt1, paramInt2, a.qaP, paraman);
    GMTrace.o(8133728534528L, 60601);
  }
  
  public final void b(amn paramamn, View paramView, int paramInt, an paraman)
  {
    GMTrace.i(8133325881344L, 60598);
    b(paramamn, paramView, -1, paramInt, paraman);
    GMTrace.o(8133325881344L, 60598);
  }
  
  protected final void b(String paramString, n paramn)
  {
    GMTrace.i(8139097243648L, 60641);
    n localn = paramn;
    if (!com.tencent.mm.plugin.sns.data.i.a(paramn))
    {
      localn = (n)this.qak.get(paramString);
      if (localn != null)
      {
        paramn = localn;
        if (!localn.isRecycled()) {}
      }
      else
      {
        this.qak.remove(paramString);
        paramn = null;
      }
      localn = paramn;
    }
    if (com.tencent.mm.plugin.sns.data.i.a(localn))
    {
      if ((this.qak != null) && (localn != null) && (paramString != null)) {
        this.qak.put(paramString, localn);
      }
      paramn = (LinkedList)this.qam.get(paramString);
      if (paramn != null)
      {
        paramn = paramn.iterator();
        while (paramn.hasNext())
        {
          Object localObject = (c)((WeakReference)paramn.next()).get();
          if ((localObject != null) && (((c)localObject).qaU) && (paramString != null) && (paramString.equals(((c)localObject).id)))
          {
            int i = ((c)localObject).code;
            localObject = (WeakReference)this.hzO.get(Integer.valueOf(i));
            if (localObject != null)
            {
              localObject = ((WeakReference)localObject).get();
              if (localObject != null)
              {
                if ((localObject instanceof QFadeImageView))
                {
                  QFadeImageView localQFadeImageView = (QFadeImageView)localObject;
                  if ((this.qat != null) && ((localQFadeImageView instanceof TagImageView)))
                  {
                    i = ((TagImageView)localQFadeImageView).position;
                    if ((i != -1) && (!this.qat.uO(i))) {
                      continue;
                    }
                  }
                }
                if ((com.tencent.mm.plugin.sns.data.i.a(localn)) && (localObject != null))
                {
                  a(localObject, paramString, localn);
                }
                else
                {
                  boolean bool1;
                  if (localn == null)
                  {
                    bool1 = true;
                    label305:
                    if (localObject != null) {
                      break label361;
                    }
                  }
                  label361:
                  for (boolean bool2 = true;; bool2 = false)
                  {
                    w.d("MicroMsg.LazyerImageLoader2", "setRefImageView null bmNUll: %s ivNull: %s bimapavailable %s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(com.tencent.mm.plugin.sns.data.i.a(localn)) });
                    break;
                    bool1 = false;
                    break label305;
                  }
                }
              }
            }
          }
        }
      }
    }
    GMTrace.o(8139097243648L, 60641);
  }
  
  public final void bgE()
  {
    GMTrace.i(8132386357248L, 60591);
    if (this.qak != null)
    {
      this.hzO.clear();
      this.qal.qeq.clear();
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append("mMemoryCache \n");
      localStringBuffer.append("putCount:" + this.qak.putCount() + ";");
      localStringBuffer.append("missCount:" + this.qak.missCount() + ";");
      localStringBuffer.append("hitCount:" + this.qak.hitCount() + ";");
      localStringBuffer.append("createCount:" + this.qak.createCount() + ";");
      localStringBuffer.append("evictionCount:" + this.qak.evictionCount() + ";");
      w.i("MicroMsg.LazyerImageLoader2", "report lurcache ");
      this.qak.trimToSize(-1);
    }
    this.qal.bhL();
    System.gc();
    GMTrace.o(8132386357248L, 60591);
  }
  
  public final boolean bgF()
  {
    GMTrace.i(8135607582720L, 60615);
    if (this.qap)
    {
      w.i("MicroMsg.LazyerImageLoader2", "loaderlist size runing pass");
      GMTrace.o(8135607582720L, 60615);
      return false;
    }
    ae.aCa().postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8046889664512L, 59954);
        if (g.this.qap)
        {
          w.i("MicroMsg.LazyerImageLoader2", "loaderlist size runing pass");
          GMTrace.o(8046889664512L, 59954);
          return;
        }
        if (g.this.qao.size() > 0)
        {
          w.i("MicroMsg.LazyerImageLoader2", "tryStart loaderlist size:" + g.this.qao.size());
          ((g.b)g.this.qao.removeLast()).m(new String[] { "" });
        }
        GMTrace.o(8046889664512L, 59954);
      }
    }, 0L);
    GMTrace.o(8135607582720L, 60615);
    return true;
  }
  
  public final void bga()
  {
    GMTrace.i(8139231461376L, 60642);
    bgE();
    this.qau = 0L;
    this.qav = 0L;
    this.qao.clear();
    this.qap = false;
    GMTrace.o(8139231461376L, 60642);
  }
  
  public final Bitmap c(amn paramamn, View paramView, int paramInt, an paraman)
  {
    GMTrace.i(8132520574976L, 60592);
    paramamn = a(paramamn, paramView, paramInt, true, paraman);
    GMTrace.o(8132520574976L, 60592);
    return paramamn;
  }
  
  public final boolean c(amn paramamn, View paramView, int paramInt1, int paramInt2, an paraman)
  {
    GMTrace.i(8134802276352L, 60609);
    if ((paramamn == null) || (paramamn.nas == null) || (paramamn.nas.equals("")))
    {
      GMTrace.o(8134802276352L, 60609);
      return false;
    }
    String str = com.tencent.mm.plugin.sns.data.i.ap(1, paramamn.nas);
    a(paramView, str, paramInt1, paramInt2);
    Object localObject = paramamn.nas;
    localObject = Gs(str);
    boolean bool = com.tencent.mm.plugin.sns.data.i.a((n)localObject);
    w.v("MicroMsg.LazyerImageLoader2", "set sns Thumb  " + bool + str);
    if (!bool)
    {
      if (paramInt1 == -1) {
        cq(paramView);
      }
      if (this.qaE.contains(str))
      {
        GMTrace.o(8134802276352L, 60609);
        return true;
      }
      a(1, paramamn, paraman);
      GMTrace.o(8134802276352L, 60609);
      return false;
    }
    a(paramView, str, (n)localObject);
    GMTrace.o(8134802276352L, 60609);
    return true;
  }
  
  public final void cp(View paramView)
  {
    GMTrace.i(8132923228160L, 60595);
    if ((paramView instanceof ImageView))
    {
      ((ImageView)paramView).setImageBitmap(null);
      GMTrace.o(8132923228160L, 60595);
      return;
    }
    if ((paramView instanceof QImageView))
    {
      ((QImageView)paramView).setImageBitmap(null);
      GMTrace.o(8132923228160L, 60595);
      return;
    }
    GMTrace.o(8132923228160L, 60595);
  }
  
  public final boolean cr(View paramView)
  {
    GMTrace.i(8135473364992L, 60614);
    int i = paramView.hashCode();
    paramView = this.qaq.iterator();
    while (paramView.hasNext())
    {
      c localc = (c)paramView.next();
      if (i == localc.code) {
        this.qaq.remove(localc);
      }
    }
    this.hzO.remove(Integer.valueOf(i));
    GMTrace.o(8135473364992L, 60614);
    return true;
  }
  
  public final void d(amn paramamn, View paramView, int paramInt, an paraman)
  {
    GMTrace.i(8134668058624L, 60608);
    if ((paramamn == null) || (paramamn.nas == null) || (paramamn.nas.equals("")))
    {
      GMTrace.o(8134668058624L, 60608);
      return;
    }
    String str = com.tencent.mm.plugin.sns.data.i.ap(4, paramamn.nas);
    a(paramView, str, -1, paramInt);
    Object localObject = paramamn.nas;
    localObject = Gs(str);
    boolean bool = com.tencent.mm.plugin.sns.data.i.a((n)localObject);
    w.v("MicroMsg.LazyerImageLoader2", "set sns Thumb  " + bool);
    if (!bool)
    {
      cq(paramView);
      if (!this.qaE.contains(str))
      {
        a(4, paramamn, paraman);
        GMTrace.o(8134668058624L, 60608);
      }
    }
    else
    {
      a(paramView, str, (n)localObject);
    }
    GMTrace.o(8134668058624L, 60608);
  }
  
  public final boolean dr(String paramString1, String paramString2)
  {
    GMTrace.i(8137486630912L, 60629);
    if ((this.qar.containsKey(paramString1)) && (3 == ((Integer)this.qar.get(paramString1)).intValue())) {
      this.qar.remove(paramString1);
    }
    String str = com.tencent.mm.plugin.sns.data.i.ap(1, paramString1);
    Iterator localIterator = ((LinkedList)this.qam.get(str)).iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (c)((WeakReference)localIterator.next()).get();
      if ((localObject != null) && (((c)localObject).qaU) && (str != null) && (str.equals(((c)localObject).id)))
      {
        int i = ((c)localObject).code;
        localObject = (WeakReference)this.hzO.get(Integer.valueOf(i));
        if (localObject != null)
        {
          localObject = ((WeakReference)localObject).get();
          if ((localObject != null) && ((localObject instanceof com.tencent.mm.plugin.sight.decode.a.a)))
          {
            w.i("MicroMsg.LazyerImageLoader2", "download fin set sight %s %s", new Object[] { paramString1, paramString2 });
            localObject = (com.tencent.mm.plugin.sight.decode.a.a)localObject;
            if ((((com.tencent.mm.plugin.sight.decode.a.a)localObject).bex() instanceof com.tencent.mm.plugin.sns.ui.ak))
            {
              com.tencent.mm.plugin.sns.ui.ak localak = (com.tencent.mm.plugin.sns.ui.ak)((com.tencent.mm.plugin.sight.decode.a.a)localObject).bex();
              boolean bool;
              if (localak != null)
              {
                if (FileOp.aZ(paramString2))
                {
                  if (!this.pZX) {}
                  for (bool = true;; bool = false)
                  {
                    ((com.tencent.mm.plugin.sight.decode.a.a)localObject).an(paramString2, bool);
                    ((com.tencent.mm.plugin.sight.decode.a.a)localObject).lp(localak.position);
                    localak.qFp.setVisibility(8);
                    localak.qrh.setVisibility(8);
                    localak.qrk.setVisibility(8);
                    if ((!this.qar.containsKey(paramString1)) || (4 != ((Integer)this.qar.get(paramString1)).intValue())) {
                      break;
                    }
                    this.qar.remove(paramString1);
                    break;
                  }
                }
                this.qar.put(paramString1, Integer.valueOf(4));
                localak.qFp.setVisibility(8);
                localak.qrh.setImageResource(i.e.bdr);
                localak.qrh.setVisibility(0);
              }
              else
              {
                if (!this.pZX) {}
                for (bool = true;; bool = false)
                {
                  ((com.tencent.mm.plugin.sight.decode.a.a)localObject).an(paramString2, bool);
                  break;
                }
              }
            }
          }
        }
      }
    }
    GMTrace.o(8137486630912L, 60629);
    return true;
  }
  
  public final int k(m paramm)
  {
    GMTrace.i(8136010235904L, 60618);
    int i = a(paramm, null);
    GMTrace.o(8136010235904L, 60618);
    return i;
  }
  
  public final int l(m paramm)
  {
    GMTrace.i(15397591973888L, 114721);
    int i = b(paramm, null);
    GMTrace.o(15397591973888L, 114721);
    return i;
  }
  
  public final void pause()
  {
    GMTrace.i(8132117921792L, 60589);
    this.pZX = false;
    b localb = ae.bhk();
    localb.pZX = false;
    Object localObject1 = new LinkedList();
    Object localObject2 = localb.gES.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      com.tencent.mm.plugin.sns.data.f localf = (com.tencent.mm.plugin.sns.data.f)((Iterator)localObject2).next();
      if (localf.requestType != 6)
      {
        localb.qaa.remove(localf.amo);
        ((LinkedList)localObject1).add(localf);
      }
    }
    localObject1 = ((LinkedList)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (com.tencent.mm.plugin.sns.data.f)((Iterator)localObject1).next();
      localb.gES.remove(localObject2);
    }
    GMTrace.o(8132117921792L, 60589);
  }
  
  public final void start()
  {
    GMTrace.i(8131983704064L, 60588);
    this.pZX = true;
    bgF();
    b localb = ae.bhk();
    localb.pZX = true;
    localb.qL();
    GMTrace.o(8131983704064L, 60588);
  }
  
  public final boolean u(amn paramamn)
  {
    GMTrace.i(8136681324544L, 60623);
    if (!this.qar.containsKey(paramamn.nas))
    {
      GMTrace.o(8136681324544L, 60623);
      return false;
    }
    if (((Integer)this.qar.get(paramamn.nas)).intValue() == 1)
    {
      GMTrace.o(8136681324544L, 60623);
      return true;
    }
    GMTrace.o(8136681324544L, 60623);
    return false;
  }
  
  public final boolean v(amn paramamn)
  {
    GMTrace.i(8136815542272L, 60624);
    if (!this.qar.containsKey(paramamn.nas))
    {
      GMTrace.o(8136815542272L, 60624);
      return false;
    }
    if (((Integer)this.qar.get(paramamn.nas)).intValue() == 2)
    {
      GMTrace.o(8136815542272L, 60624);
      return true;
    }
    GMTrace.o(8136815542272L, 60624);
    return false;
  }
  
  public final boolean w(amn paramamn)
  {
    GMTrace.i(8136949760000L, 60625);
    if (!this.qar.containsKey(paramamn.nas))
    {
      GMTrace.o(8136949760000L, 60625);
      return false;
    }
    if (((Integer)this.qar.get(paramamn.nas)).intValue() == 3)
    {
      GMTrace.o(8136949760000L, 60625);
      return true;
    }
    GMTrace.o(8136949760000L, 60625);
    return false;
  }
  
  public final void x(amn paramamn)
  {
    GMTrace.i(8137083977728L, 60626);
    this.qar.put(paramamn.nas, Integer.valueOf(1));
    GMTrace.o(8137083977728L, 60626);
  }
  
  public final void y(amn paramamn)
  {
    GMTrace.i(8137218195456L, 60627);
    this.qar.put(paramamn.nas, Integer.valueOf(2));
    GMTrace.o(8137218195456L, 60627);
  }
  
  public final void z(amn paramamn)
  {
    GMTrace.i(8137352413184L, 60628);
    this.qar.put(paramamn.nas, Integer.valueOf(3));
    GMTrace.o(8137352413184L, 60628);
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(8121783156736L, 60512);
      qaP = 1;
      qaQ = 2;
      qaR = new int[] { qaP, qaQ };
      GMTrace.o(8121783156736L, 60512);
    }
  }
  
  final class b
    extends h<String, Integer, Boolean>
  {
    String amo;
    private amn fNf;
    private String hSk;
    private n haz;
    private String path;
    private int qaS;
    
    public b(String paramString1, String paramString2, String paramString3, amn paramamn, int paramInt)
    {
      GMTrace.i(8061116743680L, 60060);
      this.amo = "";
      this.haz = null;
      this.qaS = 0;
      g.this.qaE.add(paramString1);
      this.amo = paramString1;
      this.path = paramString2;
      this.hSk = paramString3;
      this.fNf = paramamn;
      this.qaS = paramInt;
      g.qaF += 1;
      w.d("MicroMsg.ImageLoader", "peddingCount %d ", new Object[] { Integer.valueOf(g.qaF) });
      GMTrace.o(8061116743680L, 60060);
    }
    
    private void P(String paramString1, String paramString2, String paramString3)
    {
      GMTrace.i(8061250961408L, 60061);
      FileOp.aZ(this.hSk + paramString3);
      if (!FileOp.aZ(this.hSk + paramString1))
      {
        String str = paramString2;
        if (!FileOp.aZ(this.hSk + paramString2)) {
          str = com.tencent.mm.plugin.sns.data.i.m(this.fNf);
        }
        boolean bool = r.a(this.hSk, str, paramString1, ae.bhx());
        if (!bool)
        {
          w.i("MicroMsg.ImageLoader", "delete %s", new Object[] { str });
          FileOp.deleteFile(this.hSk + str);
        }
        w.i("MicroMsg.ImageLoader", "createUserThumb %s -> %s, result:%b", new Object[] { this.hSk + str, this.hSk + paramString1, Boolean.valueOf(bool) });
      }
      r.b(this.hSk, paramString1, paramString3, ae.bhw());
      GMTrace.o(8061250961408L, 60061);
    }
    
    public final com.tencent.mm.sdk.platformtools.ae bgG()
    {
      GMTrace.i(8061385179136L, 60062);
      com.tencent.mm.sdk.platformtools.ae localae = ae.aBY();
      GMTrace.o(8061385179136L, 60062);
      return localae;
    }
  }
  
  static final class c
  {
    public int code;
    public String id;
    public int qaT;
    public boolean qaU;
    
    public c(String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
    {
      GMTrace.i(8151176839168L, 60731);
      this.id = paramString;
      this.code = paramInt1;
      this.qaT = paramInt2;
      this.qaU = paramBoolean;
      GMTrace.o(8151176839168L, 60731);
    }
    
    public final boolean equals(Object paramObject)
    {
      GMTrace.i(8151445274624L, 60733);
      if ((paramObject != null) && (paramObject.hashCode() == this.code))
      {
        GMTrace.o(8151445274624L, 60733);
        return true;
      }
      GMTrace.o(8151445274624L, 60733);
      return false;
    }
    
    public final int hashCode()
    {
      GMTrace.i(8151311056896L, 60732);
      int i = this.code;
      GMTrace.o(8151311056896L, 60732);
      return i;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */