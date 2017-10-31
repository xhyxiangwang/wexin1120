package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.an.a.a.c.a;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.g.a;
import com.tencent.mm.plugin.game.model.SubCoreGameCenter;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.l;
import com.tencent.mm.plugin.game.model.l.b;
import com.tencent.mm.pluginsdk.model.app.q;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class GameInstalledView
  extends LinearLayout
  implements View.OnClickListener
{
  private static Map<String, Integer> mMv;
  private static int mMx;
  private static int mMy;
  private int count;
  LinkedList<com.tencent.mm.pluginsdk.model.app.f> mBJ;
  int mBs;
  private Context mContext;
  private TextView mGT;
  l.b mKr;
  private int mMA;
  private int mMB;
  a mMC;
  LinkedList<com.tencent.mm.plugin.game.model.c> mMD;
  LinearLayout.LayoutParams mME;
  private LinearLayout mMs;
  private ImageView mMt;
  private TextView mMu;
  private final DisplayMetrics mMw;
  private int mMz;
  
  static
  {
    GMTrace.i(12750147289088L, 94996);
    mMv = new HashMap();
    mMx = 6;
    mMy = 7;
    GMTrace.o(12750147289088L, 94996);
  }
  
  public GameInstalledView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12748805111808L, 94986);
    this.mBJ = new LinkedList();
    this.mMw = new DisplayMetrics();
    this.mMz = 4;
    this.count = 0;
    this.mBs = 0;
    this.mMA = 1;
    this.mMB = 999;
    this.mME = new LinearLayout.LayoutParams(-1, -2);
    this.mKr = new l.b()
    {
      public final void g(int paramAnonymousInt, String paramAnonymousString, boolean paramAnonymousBoolean)
      {
        GMTrace.i(12739812524032L, 94919);
        switch (paramAnonymousInt)
        {
        }
        for (;;)
        {
          GMTrace.o(12739812524032L, 94919);
          return;
          GMTrace.o(12739812524032L, 94919);
          return;
          SubCoreGameCenter.aFk().init(GameInstalledView.d(GameInstalledView.this));
          GameInstalledView.this.ee(false);
        }
      }
    };
    this.mContext = paramContext;
    GMTrace.o(12748805111808L, 94986);
  }
  
  private void aFA()
  {
    GMTrace.i(12749207764992L, 94989);
    if (bg.bX(this.mBJ))
    {
      setVisibility(8);
      GMTrace.o(12749207764992L, 94989);
      return;
    }
    setVisibility(0);
    this.mMs.removeAllViews();
    this.count = 0;
    final Object localObject1 = (LayoutInflater)getContext().getSystemService("layout_inflater");
    int j;
    int i;
    int k;
    Object localObject2;
    label280:
    Object localObject3;
    Object localObject4;
    Object localObject5;
    if (this.mBJ.size() >= this.mMz - 1)
    {
      mMy = 7;
      mMx = 6;
      j = BackwardSupportUtil.b.a(this.mContext, (mMx << 1) + 84);
      ((WindowManager)this.mContext.getSystemService("window")).getDefaultDisplay().getMetrics(this.mMw);
      i = (int)(this.mMw.widthPixels * 160 / this.mMw.densityDpi);
      this.mMz = ((this.mMw.widthPixels - 1) / j + 1);
      if (this.mMz == 3) {
        mMy = 3;
      }
      j = (mMx << 1) + 84;
      k = mMx + 6 + mMy;
      i = (i - 16) % j;
      if (i < k)
      {
        mMx -= 2;
        BackwardSupportUtil.b.a(this.mContext, (mMx << 1) + 84);
      }
    }
    else
    {
      this.mME.setMargins(BackwardSupportUtil.b.a(this.mContext, mMx), 0, BackwardSupportUtil.b.a(this.mContext, mMx), 0);
      localObject2 = this.mBJ.iterator();
      if (!((Iterator)localObject2).hasNext()) {
        break label710;
      }
      localObject3 = (com.tencent.mm.pluginsdk.model.app.f)((Iterator)localObject2).next();
      localObject4 = ((LayoutInflater)localObject1).inflate(R.i.cXz, null);
      this.mMt = ((ImageView)((View)localObject4).findViewById(R.h.bMC));
      this.mGT = ((TextView)((View)localObject4).findViewById(R.h.bNj));
      this.mMu = ((TextView)((View)localObject4).findViewById(R.h.bNv));
      localObject5 = com.tencent.mm.pluginsdk.model.app.g.b(((com.tencent.mm.pluginsdk.model.app.f)localObject3).field_appId, 1, com.tencent.mm.bq.a.getDensity(this.mContext));
      if (localObject5 == null) {
        break label592;
      }
      this.mMt.setImageBitmap((Bitmap)localObject5);
      label390:
      this.mGT.setText(com.tencent.mm.pluginsdk.model.app.g.a(this.mContext, (com.tencent.mm.pluginsdk.model.app.f)localObject3, null));
      if (!com.tencent.mm.pluginsdk.model.app.g.a(this.mContext, (com.tencent.mm.pluginsdk.model.app.f)localObject3)) {
        break label677;
      }
      i = com.tencent.mm.plugin.game.d.c.zp(((com.tencent.mm.pluginsdk.model.app.f)localObject3).field_packageName);
      if ((!mMv.containsKey(((com.tencent.mm.pluginsdk.model.app.f)localObject3).field_appId)) || (((Integer)mMv.get(((com.tencent.mm.pluginsdk.model.app.f)localObject3).field_appId)).intValue() <= i)) {
        break label618;
      }
      localObject5 = com.tencent.mm.plugin.downloader.model.f.aoQ().uX(((com.tencent.mm.pluginsdk.model.app.f)localObject3).field_appId);
      this.mMu.setTextColor(this.mContext.getResources().getColor(R.e.aOt));
      if (((FileDownloadTaskInfo)localObject5).status != 1) {
        break label605;
      }
      this.mMu.setText(R.l.ecP);
    }
    for (;;)
    {
      ((View)localObject4).setTag(localObject3);
      ((View)localObject4).setOnClickListener(this);
      this.mMs.addView((View)localObject4, this.mME);
      break label280;
      if (i <= j - k) {
        break;
      }
      mMx = (i - (j >> 1)) / this.mMz + mMx;
      BackwardSupportUtil.b.a(this.mContext, (mMx << 1) + 84);
      break;
      label592:
      this.mMt.setImageResource(R.g.aVT);
      break label390;
      label605:
      this.mMu.setText(R.l.ecO);
      continue;
      label618:
      if (!bg.mZ(((com.tencent.mm.g.b.n)localObject3).fWB))
      {
        this.mMu.setText(((com.tencent.mm.g.b.n)localObject3).fWB);
        this.mMu.setTextColor(this.mContext.getResources().getColor(R.e.aOw));
      }
      else
      {
        this.mMu.setText("");
        continue;
        label677:
        this.mMu.setTextColor(this.mContext.getResources().getColor(R.e.aOt));
        this.mMu.setText(R.l.edp);
      }
    }
    label710:
    if ((this.mMC != null) && (this.mMC.iconUrl != null) && (this.mMC.title != null))
    {
      localObject1 = ((LayoutInflater)localObject1).inflate(R.i.cXz, null);
      this.mMt = ((ImageView)((View)localObject1).findViewById(R.h.bMC));
      this.mGT = ((TextView)((View)localObject1).findViewById(R.h.bNj));
      this.mMu = ((TextView)((View)localObject1).findViewById(R.h.bNv));
      localObject2 = com.tencent.mm.an.n.Ja();
      localObject3 = this.mMC.iconUrl;
      localObject4 = this.mMt;
      localObject5 = new c.a();
      ((c.a)localObject5).hCO = true;
      ((com.tencent.mm.an.a.a)localObject2).a((String)localObject3, (ImageView)localObject4, ((c.a)localObject5).Jk(), new com.tencent.mm.an.a.c.g()
      {
        public final void a(String paramAnonymousString, View paramAnonymousView, com.tencent.mm.an.a.d.b paramAnonymousb)
        {
          GMTrace.i(12663979507712L, 94354);
          if (paramAnonymousb.status == 0) {
            af.u(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(12696997068800L, 94600);
                if (GameInstalledView.a(GameInstalledView.this) == 0)
                {
                  GameInstalledView.b(GameInstalledView.this);
                  GameInstalledView.c(GameInstalledView.this).addView(GameInstalledView.1.this.za, GameInstalledView.this.mME);
                }
                GMTrace.o(12696997068800L, 94600);
              }
            });
          }
          GMTrace.o(12663979507712L, 94354);
        }
        
        public final void ki(String paramAnonymousString)
        {
          GMTrace.i(12663845289984L, 94353);
          GMTrace.o(12663845289984L, 94353);
        }
      });
      this.mGT.setText(this.mMC.title);
      this.mMu.setVisibility(8);
      ((View)localObject1).setTag(this.mMC);
      ((View)localObject1).setOnClickListener(this);
    }
    GMTrace.o(12749207764992L, 94989);
  }
  
  public static void v(Map<String, Integer> paramMap)
  {
    GMTrace.i(12749341982720L, 94990);
    if ((paramMap == null) || (paramMap.isEmpty()))
    {
      GMTrace.o(12749341982720L, 94990);
      return;
    }
    mMv = paramMap;
    GMTrace.o(12749341982720L, 94990);
  }
  
  public final void ee(boolean paramBoolean)
  {
    GMTrace.i(12749073547264L, 94988);
    if (bg.bX(this.mMD))
    {
      setVisibility(8);
      GMTrace.o(12749073547264L, 94988);
      return;
    }
    setVisibility(0);
    Object localObject1;
    Object localObject2;
    if (paramBoolean)
    {
      this.mBJ = com.tencent.mm.plugin.game.model.e.aEd();
      if ((!bg.bX(this.mMD)) && (!bg.bX(this.mBJ)))
      {
        localObject1 = this.mMD.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (com.tencent.mm.plugin.game.model.c)((Iterator)localObject1).next();
          if (this.mBJ.contains(localObject2))
          {
            this.mBJ.remove(localObject2);
            this.mBJ.addFirst(localObject2);
          }
        }
      }
    }
    else
    {
      localObject1 = new LinkedList();
      ((LinkedList)localObject1).addAll(this.mBJ);
      Object localObject3 = new LinkedList();
      ((LinkedList)localObject3).addAll(com.tencent.mm.plugin.game.model.e.aEd());
      localObject2 = new LinkedList();
      Object localObject4 = ((LinkedList)localObject1).iterator();
      com.tencent.mm.pluginsdk.model.app.f localf;
      while (((Iterator)localObject4).hasNext())
      {
        localf = (com.tencent.mm.pluginsdk.model.app.f)((Iterator)localObject4).next();
        if ((!((LinkedList)localObject3).contains(localf)) && (!((LinkedList)localObject2).contains(localf))) {
          ((LinkedList)localObject2).add(localf);
        }
      }
      localObject4 = ((LinkedList)localObject1).iterator();
      while (((Iterator)localObject4).hasNext())
      {
        localf = (com.tencent.mm.pluginsdk.model.app.f)((Iterator)localObject4).next();
        if (((LinkedList)localObject3).contains(localf)) {
          ((LinkedList)localObject3).remove(localf);
        } else if (!com.tencent.mm.pluginsdk.model.app.g.a(this.mContext, localf)) {
          ((LinkedList)localObject2).add(localf);
        }
      }
      if (((LinkedList)localObject3).size() > 0)
      {
        localObject3 = ((LinkedList)localObject3).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject4 = (com.tencent.mm.pluginsdk.model.app.f)((Iterator)localObject3).next();
          if (!((LinkedList)localObject1).contains(localObject4)) {
            ((LinkedList)localObject1).addFirst(localObject4);
          }
        }
      }
      if (((LinkedList)localObject2).size() > 0) {
        ((LinkedList)localObject1).removeAll((Collection)localObject2);
      }
      localObject2 = new LinkedList();
      localObject1 = ((LinkedList)localObject1).iterator();
      while (((Iterator)localObject1).hasNext()) {
        ((LinkedList)localObject2).add(com.tencent.mm.pluginsdk.model.app.g.aM(((com.tencent.mm.pluginsdk.model.app.f)((Iterator)localObject1).next()).field_appId, true));
      }
      this.mBJ = ((LinkedList)localObject2);
    }
    aFA();
    GMTrace.o(12749073547264L, 94988);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(12749476200448L, 94991);
    if (paramView.getTag() == null)
    {
      GMTrace.o(12749476200448L, 94991);
      return;
    }
    int i;
    Object localObject;
    if ((paramView.getTag() instanceof com.tencent.mm.pluginsdk.model.app.f))
    {
      paramView = (com.tencent.mm.pluginsdk.model.app.f)paramView.getTag();
      if ((paramView == null) || (bg.mZ(paramView.field_appId)))
      {
        w.e("MicroMsg.GameInstalledView", "appinfo is null or appid is null");
        GMTrace.o(12749476200448L, 94991);
        return;
      }
      if (com.tencent.mm.pluginsdk.model.app.g.a(this.mContext, paramView))
      {
        i = com.tencent.mm.plugin.game.d.c.zp(paramView.field_packageName);
        if ((mMv.containsKey(paramView.field_appId)) && (((Integer)mMv.get(paramView.field_appId)).intValue() > i))
        {
          localObject = com.tencent.mm.plugin.downloader.model.f.aoQ().uX(paramView.field_appId);
          if (((FileDownloadTaskInfo)localObject).status == 1) {
            com.tencent.mm.plugin.downloader.model.f.aoQ().bc(((FileDownloadTaskInfo)localObject).id);
          }
        }
        for (;;)
        {
          ee(false);
          GMTrace.o(12749476200448L, 94991);
          return;
          if (((FileDownloadTaskInfo)localObject).status == 3)
          {
            if ((com.tencent.mm.a.e.aZ(((FileDownloadTaskInfo)localObject).path)) && (com.tencent.mm.plugin.game.d.c.zq(((FileDownloadTaskInfo)localObject).path) > i))
            {
              paramView = Uri.fromFile(new File(((FileDownloadTaskInfo)localObject).path));
              q.e(this.mContext, paramView);
            }
            else
            {
              com.tencent.mm.plugin.downloader.model.f.aoQ().bc(((FileDownloadTaskInfo)localObject).id);
            }
          }
          else
          {
            l.a(paramView.fWx, paramView.fWC, 1002, paramView.field_appId, "");
            localObject = new g.a();
            ((g.a)localObject).va(paramView.fWx);
            ((g.a)localObject).vc(com.tencent.mm.pluginsdk.model.app.g.a(this.mContext, paramView, null));
            ((g.a)localObject).setAppId(paramView.field_appId);
            ((g.a)localObject).vd(paramView.fWC);
            ((g.a)localObject).dK(true);
            ((g.a)localObject).mh(1);
            com.tencent.mm.plugin.downloader.model.f.aoQ().a(((g.a)localObject).kTs);
            continue;
            com.tencent.mm.plugin.game.model.e.V(this.mContext, paramView.field_appId);
            ai.a(this.mContext, 10, 1002, this.mMA, 3, 0, paramView.field_appId, this.mBs, 0, null, null, null);
            this.mBJ.remove(paramView);
            this.mBJ.addFirst(paramView);
          }
        }
      }
      localObject = com.tencent.mm.plugin.downloader.model.f.aoQ().uX(paramView.field_appId);
      if ((localObject != null) && (((FileDownloadTaskInfo)localObject).status == 3))
      {
        if ((!bg.mZ(((FileDownloadTaskInfo)localObject).path)) && (com.tencent.mm.a.e.aZ(((FileDownloadTaskInfo)localObject).path)))
        {
          paramView = Uri.fromFile(new File(((FileDownloadTaskInfo)localObject).path));
          q.e(this.mContext, paramView);
          GMTrace.o(12749476200448L, 94991);
          return;
        }
        w.e("MicroMsg.GameInstalledView", "file status is success, while the download file not exsit:[%s]", new Object[] { ((FileDownloadTaskInfo)localObject).path });
        com.tencent.mm.plugin.downloader.model.f.aoQ().bc(((FileDownloadTaskInfo)localObject).id);
        ee(false);
        GMTrace.o(12749476200448L, 94991);
        return;
      }
      w.i("MicroMsg.GameInstalledView", "app not installed or download sucess : [%s]", new Object[] { paramView.field_appName });
      ee(false);
      GMTrace.o(12749476200448L, 94991);
      return;
    }
    if ((paramView.getTag() instanceof a))
    {
      paramView = (a)paramView.getTag();
      localObject = new Intent();
      i = 6;
      if (!bg.mZ(paramView.iRK)) {
        break label661;
      }
      ((Intent)localObject).setClass(this.mContext, GameLibraryUI.class);
      ((Intent)localObject).putExtra("game_report_from_scene", 1002);
      this.mContext.startActivity((Intent)localObject);
    }
    for (;;)
    {
      ai.a(this.mContext, 10, 1002, this.mMB, i, 0, null, this.mBs, 0, null, null, null);
      GMTrace.o(12749476200448L, 94991);
      return;
      label661:
      i = com.tencent.mm.plugin.game.d.c.p(this.mContext, paramView.iRK, "game_center_installed_more");
    }
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(12748939329536L, 94987);
    super.onFinishInflate();
    this.mMs = ((LinearLayout)findViewById(R.h.bMG));
    l.a(this.mKr);
    GMTrace.o(12748939329536L, 94987);
  }
  
  public static final class a
  {
    public String iRK;
    public String iconUrl;
    public String title;
    
    public a()
    {
      GMTrace.i(12696728633344L, 94598);
      this.iconUrl = "";
      this.title = "";
      this.iRK = "";
      GMTrace.o(12696728633344L, 94598);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameInstalledView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */