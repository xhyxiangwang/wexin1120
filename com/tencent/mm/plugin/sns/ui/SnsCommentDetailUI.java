package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Looper;
import android.support.v7.app.ActionBarActivity;
import android.text.ClipboardManager;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.ScaleAnimation;
import android.widget.AbsListView;
import android.widget.AbsListView.LayoutParams;
import android.widget.AbsListView.OnScrollListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.gf;
import com.tencent.mm.g.a.gh;
import com.tencent.mm.g.a.jg;
import com.tencent.mm.g.a.mr;
import com.tencent.mm.g.a.ph;
import com.tencent.mm.g.a.pq;
import com.tencent.mm.g.a.pr;
import com.tencent.mm.g.a.ps;
import com.tencent.mm.g.a.rb;
import com.tencent.mm.plugin.sight.decode.a.b.e;
import com.tencent.mm.plugin.sight.decode.a.b.f;
import com.tencent.mm.plugin.sns.a.b.f;
import com.tencent.mm.plugin.sns.b.h.a;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.d;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader;
import com.tencent.mm.plugin.sns.model.ac;
import com.tencent.mm.plugin.sns.model.ad;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.plugin.sns.model.al.a;
import com.tencent.mm.plugin.sns.model.ao.b;
import com.tencent.mm.plugin.sns.model.b.b;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a;
import com.tencent.mm.plugin.sns.storage.j;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.c.akv;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.amo;
import com.tencent.mm.protocal.c.amp;
import com.tencent.mm.protocal.c.bcz;
import com.tencent.mm.protocal.c.bdk;
import com.tencent.mm.protocal.c.bdz;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.cr;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.MaskImageButton;
import com.tencent.mm.ui.v;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import com.tencent.mm.x.ag.a;
import com.tencent.mm.x.ag.b;
import com.tencent.mm.x.ag.b.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SnsCommentDetailUI
  extends MMActivity
  implements com.tencent.mm.ac.e, h.a, b.b
{
  public static int qHG;
  private String fMT;
  private String gCs;
  private com.tencent.mm.sdk.b.c iSb;
  private boolean iXP;
  private int jXL;
  private com.tencent.mm.ui.tools.l kwF;
  private int kxh;
  private ClipboardManager lWu;
  private View.OnClickListener mLx;
  private int mScreenHeight;
  private int mScreenWidth;
  private String oev;
  private LinearLayout pZE;
  private View.OnTouchListener qBi;
  private boolean qHA;
  private long qHB;
  private bg qHC;
  private boolean qHD;
  private int qHE;
  private int qHF;
  public int qHH;
  private com.tencent.mm.plugin.sns.ui.b.b qHI;
  private SnsTranslateResultView qHJ;
  private boolean qHK;
  private Dialog qHL;
  private af qHM;
  private com.tencent.mm.sdk.b.c qHN;
  private com.tencent.mm.sdk.b.c qHO;
  private com.tencent.mm.sdk.b.c qHP;
  private com.tencent.mm.sdk.b.c qHQ;
  private c qHR;
  private View.OnClickListener qHS;
  private View.OnClickListener qHT;
  private com.tencent.mm.sdk.b.c qHU;
  private com.tencent.mm.sdk.b.c qHV;
  boolean qHW;
  private LinearLayout qHX;
  private boolean qHY;
  PhotosContent qHZ;
  private long qHe;
  private long qHf;
  private View qHg;
  private TextView qHh;
  private LinearLayout qHi;
  private SnsDetailLuckyHeader qHj;
  private ListView qHk;
  private View qHl;
  private b qHm;
  private ScaleAnimation qHn;
  private ScaleAnimation qHo;
  LinearLayout qHp;
  LinearLayout qHq;
  private LinkedList<bcz> qHr;
  private int qHs;
  private boolean qHt;
  private ar qHu;
  private String qHv;
  private com.tencent.mm.storage.ar qHw;
  private int qHx;
  private ImageView qHy;
  private k qHz;
  int qIa;
  public ag.b.a qIb;
  private bf qIc;
  private boolean qxM;
  private SnsCommentFooter qxN;
  private ao qxP;
  private c qxV;
  private com.tencent.mm.plugin.sns.f.b qxW;
  private com.tencent.mm.ui.base.q qxY;
  private com.tencent.mm.plugin.sns.a.b.g qyU;
  
  static
  {
    GMTrace.i(8414512021504L, 62693);
    qHG = 34;
    GMTrace.o(8414512021504L, 62693);
  }
  
  public SnsCommentDetailUI()
  {
    GMTrace.i(8404714127360L, 62620);
    this.qHe = 0L;
    this.qHf = 0L;
    this.qHs = -1;
    this.qHt = false;
    this.qBi = com.tencent.mm.sdk.platformtools.bg.bOc();
    this.qxY = null;
    this.jXL = 0;
    this.qHx = 0;
    this.iXP = false;
    this.oev = "";
    this.qHA = false;
    this.qHB = 0L;
    this.qHD = false;
    this.qHF = 103;
    this.qHH = 210;
    this.qHK = false;
    this.qHL = null;
    this.qHM = new af();
    this.qHN = new com.tencent.mm.sdk.b.c() {};
    this.qHO = new com.tencent.mm.sdk.b.c() {};
    this.qHP = new com.tencent.mm.sdk.b.c() {};
    this.qHQ = new com.tencent.mm.sdk.b.c() {};
    this.qHR = new c();
    this.qHS = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8767101992960L, 65320);
        paramAnonymousView = (String)paramAnonymousView.getTag();
        w.d("MicroMsg.SnsCommentDetailUI", "onCommentClick:" + paramAnonymousView);
        Intent localIntent = new Intent();
        Object localObject = SnsCommentDetailUI.e(SnsCommentDetailUI.this);
        if (((com.tencent.mm.plugin.sns.storage.m)localObject).uF(32))
        {
          localObject = new com.tencent.mm.plugin.sns.a.b.c(((com.tencent.mm.plugin.sns.storage.m)localObject).bkp(), 1, 2, "", ((com.tencent.mm.plugin.sns.storage.m)localObject).bku(), ((com.tencent.mm.plugin.sns.storage.m)localObject).bjM());
          com.tencent.mm.kernel.h.xA();
          com.tencent.mm.kernel.h.xy().gQO.a((com.tencent.mm.ac.k)localObject, 0);
          localIntent.putExtra("Contact_User", paramAnonymousView);
          localIntent.putExtra("Contact_Scene", 37);
          com.tencent.mm.plugin.sns.c.a.ifM.d(localIntent, SnsCommentDetailUI.this);
          GMTrace.o(8767101992960L, 65320);
          return;
        }
        localIntent.putExtra("Contact_User", paramAnonymousView);
        com.tencent.mm.plugin.sns.c.a.ifM.d(localIntent, SnsCommentDetailUI.this);
        GMTrace.o(8767101992960L, 65320);
      }
    };
    this.qHT = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8558796079104L, 63768);
        w.e("MicroMsg.SnsCommentDetailUI", "scrollTopClickListener");
        SnsCommentDetailUI.f(SnsCommentDetailUI.this);
        if (!SnsCommentDetailUI.g(SnsCommentDetailUI.this))
        {
          GMTrace.o(8558796079104L, 63768);
          return;
        }
        SnsCommentDetailUI.h(SnsCommentDetailUI.this);
        GMTrace.o(8558796079104L, 63768);
      }
    };
    this.mLx = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8510075043840L, 63405);
        w.e("MicroMsg.SnsCommentDetailUI", "scrollTopClickListener");
        SnsCommentDetailUI.a(SnsCommentDetailUI.this, paramAnonymousView);
        GMTrace.o(8510075043840L, 63405);
      }
    };
    this.qHU = new com.tencent.mm.sdk.b.c() {};
    this.iSb = new com.tencent.mm.sdk.b.c() {};
    this.qHV = new com.tencent.mm.sdk.b.c() {};
    this.qHW = false;
    this.qHX = null;
    this.qHY = false;
    this.qHZ = null;
    this.qIa = 0;
    this.qIb = new ag.b.a()
    {
      public final void p(String paramAnonymousString, final boolean paramAnonymousBoolean)
      {
        GMTrace.i(8599866703872L, 64074);
        new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper()).postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8335457779712L, 62104);
            if ((paramAnonymousBoolean) && (!SnsCommentDetailUI.this.isFinishing()) && (SnsCommentDetailUI.this.qIa < 5)) {
              SnsCommentDetailUI.this.bmF();
            }
            SnsCommentDetailUI localSnsCommentDetailUI = SnsCommentDetailUI.this;
            localSnsCommentDetailUI.qIa += 1;
            GMTrace.o(8335457779712L, 62104);
          }
        }, 500L);
        GMTrace.o(8599866703872L, 64074);
      }
    };
    this.qIc = null;
    GMTrace.o(8404714127360L, 62620);
  }
  
  private void bkW()
  {
    GMTrace.i(14422768615424L, 107458);
    if ((this.vov.vpj == 1) || (this.qxN.bmP()))
    {
      this.qHR.run();
      GMTrace.o(14422768615424L, 107458);
      return;
    }
    this.qxM = true;
    GMTrace.o(14422768615424L, 107458);
  }
  
  private int bmD()
  {
    GMTrace.i(14438874742784L, 107578);
    if ((this.qHk != null) && (this.qHk.getChildCount() > 1))
    {
      View localView = this.qHk.getChildAt(0);
      if (localView != null)
      {
        int i = localView.getHeight();
        GMTrace.o(14438874742784L, 107578);
        return i;
      }
    }
    GMTrace.o(14438874742784L, 107578);
    return 0;
  }
  
  private static boolean bmE()
  {
    GMTrace.i(8406458957824L, 62633);
    if ((al.a.bhO() & 0x1) <= 0)
    {
      GMTrace.o(8406458957824L, 62633);
      return true;
    }
    GMTrace.o(8406458957824L, 62633);
    return false;
  }
  
  private void bmG()
  {
    GMTrace.i(8406727393280L, 62635);
    if ((this.qHl == null) || (this.qHl.getVisibility() == 8))
    {
      GMTrace.o(8406727393280L, 62635);
      return;
    }
    this.qHl.startAnimation(this.qHo);
    this.qHo.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8660935770112L, 64529);
        w.d("MicroMsg.SnsCommentDetailUI", "onAnimationEnd");
        if (SnsCommentDetailUI.B(SnsCommentDetailUI.this) != null)
        {
          SnsCommentDetailUI.B(SnsCommentDetailUI.this).clearAnimation();
          SnsCommentDetailUI.B(SnsCommentDetailUI.this).setVisibility(8);
        }
        GMTrace.o(8660935770112L, 64529);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8660801552384L, 64528);
        GMTrace.o(8660801552384L, 64528);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8660667334656L, 64527);
        GMTrace.o(8660667334656L, 64527);
      }
    });
    GMTrace.o(8406727393280L, 62635);
  }
  
  private void bmH()
  {
    GMTrace.i(8406861611008L, 62636);
    if (this.qHy == null)
    {
      GMTrace.o(8406861611008L, 62636);
      return;
    }
    this.qHy.setPressed(false);
    if (bg.Fb(this.oev))
    {
      this.qHy.setImageResource(i.e.baP);
      GMTrace.o(8406861611008L, 62636);
      return;
    }
    this.qHy.setImageResource(i.e.baQ);
    GMTrace.o(8406861611008L, 62636);
  }
  
  private boolean e(List<bcz> paramList, boolean paramBoolean)
  {
    GMTrace.i(8406995828736L, 62637);
    int k = BackwardSupportUtil.b.a(this, 32.0F);
    int m = BackwardSupportUtil.b.a(this, 6.0F);
    int i = BackwardSupportUtil.b.a(this, 10.0F);
    int j = BackwardSupportUtil.b.a(this, 17.0F);
    if (this.qHi == null)
    {
      GMTrace.o(8406995828736L, 62637);
      return false;
    }
    int n = ((WindowManager)this.vov.voR.getSystemService("window")).getDefaultDisplay().getWidth();
    float f = getResources().getDimension(i.d.aSg);
    w.d("MicroMsg.SnsCommentDetailUI", "guess size %d %f", new Object[] { Integer.valueOf(n), Float.valueOf(f) });
    f = n - f * 2.0F;
    if (paramList.size() <= 0)
    {
      if (this.qHi.getParent() != null) {
        this.qHi.setVisibility(8);
      }
      this.qHi.removeAllViews();
      this.qHi.setVisibility(8);
      this.pZE.setVisibility(8);
      GMTrace.o(8406995828736L, 62637);
      return false;
    }
    this.qHi.getParent();
    this.qHi.removeAllViews();
    this.qHi.setVisibility(0);
    Object localObject1;
    if (this.kxh == 11) {
      if (!this.qHK)
      {
        this.qHi.setBackgroundResource(i.e.pGN);
        this.qHi.setPadding(0, m, 0, m);
        localObject1 = new ImageView(this.vov.voR);
        if (this.kxh != 11) {
          break label685;
        }
        ((ImageView)localObject1).setImageResource(i.i.pQn);
      }
    }
    for (;;)
    {
      ((ImageView)localObject1).setPadding(i, j, i, 0);
      Object localObject2 = new LinearLayout.LayoutParams(-2, -2);
      ((LinearLayout.LayoutParams)localObject2).gravity = 49;
      ((ImageView)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
      ((ImageView)localObject1).setClickable(false);
      ((ImageView)localObject1).setFocusable(false);
      this.qHi.addView((View)localObject1);
      n = com.tencent.mm.bq.a.fromDPToPix(this.vov.voR, qHG);
      j = (int)(f - n) / (m + k);
      i = j;
      if ((int)(f - n) % (m + k) > k) {
        i = j + 1;
      }
      w.d("MicroMsg.SnsCommentDetailUI", "guess size %d", new Object[] { Integer.valueOf(i) });
      localObject1 = new i(this.vov.voR);
      ((i)localObject1).setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
      ((i)localObject1).qxI = i;
      i = 0;
      while (i < paramList.size())
      {
        localObject2 = (bcz)paramList.get(i);
        TouchImageView localTouchImageView = new TouchImageView(this.vov.voR);
        localTouchImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        localTouchImageView.setImageResource(i.e.pGR);
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(k, k);
        localLayoutParams.setMargins(0, m, m, 0);
        localTouchImageView.setLayoutParams(localLayoutParams);
        localTouchImageView.setTag(((bcz)localObject2).twR);
        a.b.b(localTouchImageView, ((bcz)localObject2).twR, true);
        localTouchImageView.setOnClickListener(this.qHS);
        ((i)localObject1).addView(localTouchImageView);
        i += 1;
      }
      localObject1 = hZ(false);
      if (localObject1 != null)
      {
        if (this.gCs.equals(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_userName))
        {
          this.qHi.setBackgroundResource(i.e.pGO);
          break;
        }
        this.qHi.setBackgroundResource(i.e.pGN);
        break;
      }
      this.qHi.setBackgroundResource(i.e.pGN);
      break;
      this.qHi.setBackgroundResource(i.e.pGL);
      break;
      label685:
      ((ImageView)localObject1).setImageResource(i.i.pQm);
    }
    this.qHi.addView((View)localObject1);
    paramList = this.pZE;
    if (paramBoolean) {}
    for (i = 8;; i = 0)
    {
      paramList.setVisibility(i);
      GMTrace.o(8406995828736L, 62637);
      return true;
    }
  }
  
  private static boolean f(LinkedList<bcz> paramLinkedList1, LinkedList<bcz> paramLinkedList2)
  {
    GMTrace.i(8404848345088L, 62621);
    if ((paramLinkedList1 == null) || (paramLinkedList2 == null))
    {
      GMTrace.o(8404848345088L, 62621);
      return false;
    }
    if (paramLinkedList1.size() != paramLinkedList2.size())
    {
      GMTrace.o(8404848345088L, 62621);
      return false;
    }
    int j = paramLinkedList1.size();
    int i = 0;
    while (i < j)
    {
      if (!((bcz)paramLinkedList1.get(i)).twR.equals(((bcz)paramLinkedList2.get(i)).twR))
      {
        GMTrace.o(8404848345088L, 62621);
        return false;
      }
      i += 1;
    }
    GMTrace.o(8404848345088L, 62621);
    return true;
  }
  
  private void hY(boolean paramBoolean)
  {
    GMTrace.i(8405250998272L, 62624);
    this.qHt = false;
    if (this.qxN.bmL())
    {
      this.qxN.bmR();
      this.qxN.Il(getString(i.j.pUh));
    }
    this.qxN.ia(false);
    if (paramBoolean) {
      BackwardSupportUtil.c.a(this.qHk);
    }
    GMTrace.o(8405250998272L, 62624);
  }
  
  private com.tencent.mm.plugin.sns.storage.m hZ(boolean paramBoolean)
  {
    GMTrace.i(8405385216000L, 62625);
    com.tencent.mm.plugin.sns.storage.m localm;
    if (!com.tencent.mm.sdk.platformtools.bg.mZ(this.qHv))
    {
      localm = com.tencent.mm.plugin.sns.storage.h.HA(this.qHv);
      if (localm == null)
      {
        if (paramBoolean) {
          Toast.makeText(this, i.j.pTg, 0).show();
        }
        finish();
        GMTrace.o(8405385216000L, 62625);
        return null;
      }
      this.fMT = localm.bjM();
    }
    for (;;)
    {
      GMTrace.o(8405385216000L, 62625);
      return localm;
      localm = com.tencent.mm.plugin.sns.storage.h.Hz(this.fMT);
      if (localm == null)
      {
        finish();
        GMTrace.o(8405385216000L, 62625);
        return null;
      }
      this.qHv = localm.bkg();
    }
  }
  
  private LinearLayout uU(int paramInt)
  {
    GMTrace.i(8406324740096L, 62632);
    if (this.qHX == null)
    {
      this.qHX = ((LinearLayout)v.fa(this).inflate(paramInt, null));
      localLinearLayout = this.qHX;
      GMTrace.o(8406324740096L, 62632);
      return localLinearLayout;
    }
    this.qHW = true;
    LinearLayout localLinearLayout = this.qHX;
    GMTrace.o(8406324740096L, 62632);
    return localLinearLayout;
  }
  
  public final void Gm(String paramString)
  {
    GMTrace.i(8407264264192L, 62639);
    GMTrace.o(8407264264192L, 62639);
  }
  
  protected final void MH()
  {
    GMTrace.i(8406190522368L, 62631);
    oC(i.j.pRR);
    new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8559064514560L, 63770);
        BackwardSupportUtil.c.a(SnsCommentDetailUI.c(SnsCommentDetailUI.this));
        GMTrace.o(8559064514560L, 63770);
      }
    };
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(8320425394176L, 61992);
        if (SnsCommentDetailUI.b(SnsCommentDetailUI.this) != null) {
          SnsCommentDetailUI.b(SnsCommentDetailUI.this).ia(false);
        }
        SnsCommentDetailUI.this.finish();
        GMTrace.o(8320425394176L, 61992);
        return true;
      }
    });
    this.gCs = com.tencent.mm.x.m.zF();
    if (com.tencent.mm.plugin.sns.model.ae.bgY()) {
      finish();
    }
    final com.tencent.mm.plugin.sns.storage.m localm = hZ(true);
    if (localm == null)
    {
      w.e("MicroMsg.SnsCommentDetailUI", "invalid pcid:" + this.fMT);
      finish();
      GMTrace.o(8406190522368L, 62631);
      return;
    }
    w.i("MicroMsg.SnsCommentDetailUI", "snsId: " + this.fMT + "localId " + this.qHv + "  username:" + localm.field_userName);
    int i;
    if ((!u.HW(this.fMT)) && (localm.bki()))
    {
      localObject1 = localm.bjY();
      findViewById(i.f.pMP).setVisibility(0);
      localObject2 = (TextView)findViewById(i.f.pKJ);
      switch (((amo)localObject1).uig)
      {
      default: 
        if (!com.tencent.mm.sdk.platformtools.bg.mZ(((amo)localObject1).uip))
        {
          ((TextView)localObject2).setText(((amo)localObject1).uip);
          i = 1;
          findViewById(i.f.pMQ).setVisibility(0);
        }
        break;
      }
    }
    for (;;)
    {
      if (i != 0) {
        findViewById(i.f.pMP).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(8602551058432L, 64094);
            if (localm.uF(32))
            {
              GMTrace.o(8602551058432L, 64094);
              return;
            }
            ai.uh(localm.quQ);
            ai.uf(localm.quQ);
            com.tencent.mm.plugin.sns.model.ae.bhl().bgd();
            paramAnonymousView = new Intent();
            SnsCommentDetailUI.this.setResult(-1, paramAnonymousView);
            if (SnsCommentDetailUI.r(SnsCommentDetailUI.this)) {
              paramAnonymousView.putExtra("sns_gallery_force_finish", true);
            }
            SnsCommentDetailUI.this.finish();
            SnsCommentDetailUI.this.finish();
            GMTrace.o(8602551058432L, 64094);
          }
        });
      }
      this.qHk = ((ListView)findViewById(i.f.pIr));
      this.qHk.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8570607239168L, 63856);
          SnsCommentDetailUI.a(SnsCommentDetailUI.this, SnsCommentDetailUI.c(SnsCommentDetailUI.this).getBottom());
          w.d("MicroMsg.SnsCommentDetailUI", "listOriginalBottom: " + SnsCommentDetailUI.d(SnsCommentDetailUI.this));
          GMTrace.o(8570607239168L, 63856);
        }
      });
      this.qHk.setOnScrollListener(new AbsListView.OnScrollListener()
      {
        public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(8615301742592L, 64189);
          GMTrace.o(8615301742592L, 64189);
        }
        
        public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
        {
          GMTrace.i(8615435960320L, 64190);
          if (paramAnonymousInt == 1)
          {
            SnsCommentDetailUI.this.aKl();
            SnsCommentDetailUI.s(SnsCommentDetailUI.this);
          }
          GMTrace.o(8615435960320L, 64190);
        }
      });
      this.qHg = v.fa(this.vov.voR).inflate(i.g.pOJ, null);
      this.qHg.setOnClickListener(this.qHT);
      this.qHk.addHeaderView(this.qHg);
      boolean bool = bmF();
      if (bool) {
        break label615;
      }
      w.i("MicroMsg.SnsCommentDetailUI", "error isOk setheader " + bool);
      finish();
      GMTrace.o(8406190522368L, 62631);
      return;
      if (!com.tencent.mm.sdk.platformtools.bg.mZ(((amo)localObject1).uip)) {
        ((TextView)localObject2).setText(((amo)localObject1).uip);
      }
      for (;;)
      {
        findViewById(i.f.pMQ).setVisibility(8);
        i = 0;
        break;
        ((TextView)localObject2).setText(i.j.pTs);
      }
      if (!com.tencent.mm.sdk.platformtools.bg.mZ(((amo)localObject1).uip)) {
        ((TextView)localObject2).setText(((amo)localObject1).uip);
      }
      for (;;)
      {
        findViewById(i.f.pMQ).setVisibility(8);
        i = 0;
        break;
        ((TextView)localObject2).setText(i.j.pTu);
      }
      if (!com.tencent.mm.sdk.platformtools.bg.mZ(((amo)localObject1).uip)) {
        ((TextView)localObject2).setText(((amo)localObject1).uip);
      }
      for (;;)
      {
        i = 1;
        findViewById(i.f.pMQ).setVisibility(8);
        break;
        ((TextView)localObject2).setText(i.j.pTt);
      }
      ((TextView)localObject2).setText(i.j.pTv);
      break;
      findViewById(i.f.pMP).setVisibility(8);
      i = 0;
    }
    label615:
    Object localObject1 = hZ(false);
    if (localObject1 != null) {
      this.kxh = av.d(((com.tencent.mm.plugin.sns.storage.m)localObject1).bjL());
    }
    if ((this.kxh == 11) && (com.tencent.mm.x.m.zF().equals(localm.field_userName)))
    {
      this.qHj = new SnsDetailLuckyHeader(this);
      localObject1 = new AbsListView.LayoutParams(-1, -2);
      this.qHj.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      this.qHj.setOnClickListener(this.qHT);
    }
    this.qHi = new LinearLayout(this.vov.voR);
    localObject1 = new AbsListView.LayoutParams(-1, -2);
    this.qHi.setLayoutParams((ViewGroup.LayoutParams)localObject1);
    this.qHi.setOnClickListener(this.qHT);
    BackwardSupportUtil.b.a(this, 2.0F);
    localObject1 = new AbsListView.LayoutParams(-1, 1);
    Object localObject2 = new LinearLayout(this.vov.voR);
    ((LinearLayout)localObject2).setBackgroundResource(i.e.pHA);
    ((LinearLayout)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
    this.pZE = ((LinearLayout)localObject2);
    if ((localm.field_localPrivate & 0x1) != 0)
    {
      findViewById(i.f.pJn).setVisibility(8);
      localObject1 = new TextView(this);
      ((TextView)localObject1).setLayoutParams(new AbsListView.LayoutParams(-1, -2));
      ((TextView)localObject1).setText(getString(i.j.pRX));
      ((TextView)localObject1).setTextColor(getResources().getColor(i.c.black));
      ((TextView)localObject1).setGravity(17);
      ((TextView)localObject1).setPadding(0, BackwardSupportUtil.b.a(this, 7.0F), 0, 0);
      this.qHk.addFooterView((View)localObject1);
    }
    if (this.qHj != null)
    {
      this.qHK = true;
      this.qHk.addHeaderView(this.qHj);
    }
    localObject2 = ai.m(localm);
    Object localObject3;
    label1234:
    long l;
    if (localObject2 == null)
    {
      this.qHi.setVisibility(8);
      this.qHm = new b(new LinkedList(), new LinkedList(), this, localm.bkg());
      this.qHk.addHeaderView(this.qHi);
      this.qHk.setAdapter(this.qHm);
      this.qxN = ((SnsCommentFooter)findViewById(i.f.pJn));
      this.qxN.qIP = new SnsCommentFooter.a()
      {
        public final void bmJ()
        {
          GMTrace.i(8466185846784L, 63078);
          if (!com.tencent.mm.plugin.sns.lucky.a.m.Gn(localm.bkg()))
          {
            if ((SnsCommentDetailUI.t(SnsCommentDetailUI.this) != null) && (SnsCommentDetailUI.t(SnsCommentDetailUI.this).isShowing()))
            {
              GMTrace.o(8466185846784L, 63078);
              return;
            }
            SnsCommentDetailUI.a(SnsCommentDetailUI.this, com.tencent.mm.plugin.sns.lucky.ui.a.e(SnsCommentDetailUI.this.vov.voR, SnsCommentDetailUI.this.qHZ.uS(0)));
            GMTrace.o(8466185846784L, 63078);
            return;
          }
          if ((SnsCommentDetailUI.this.vov.vpj == 1) || (SnsCommentDetailUI.b(SnsCommentDetailUI.this).bmP()))
          {
            GMTrace.o(8466185846784L, 63078);
            return;
          }
          SnsCommentDetailUI.u(SnsCommentDetailUI.this);
          GMTrace.o(8466185846784L, 63078);
        }
      };
      this.qxN.qIQ = new SnsCommentFooter.d()
      {
        public final void onShow()
        {
          GMTrace.i(8470346596352L, 63109);
          if (SnsCommentDetailUI.b(SnsCommentDetailUI.this).qIM)
          {
            GMTrace.o(8470346596352L, 63109);
            return;
          }
          SnsCommentDetailUI.u(SnsCommentDetailUI.this);
          GMTrace.o(8470346596352L, 63109);
        }
      };
      localObject1 = hZ(true);
      if ((localObject1 != null) && (!((com.tencent.mm.plugin.sns.storage.m)localObject1).bkf())) {
        this.qxN.setVisibility(8);
      }
      this.qxN.bmM();
      this.qxN.bmQ();
      this.qxN.a(new SnsCommentFooter.c()
      {
        public final void HZ(String paramAnonymousString)
        {
          int i = 1;
          GMTrace.i(8589934592000L, 64000);
          if (!com.tencent.mm.plugin.sns.lucky.a.m.Gn(localm.bkg()))
          {
            com.tencent.mm.plugin.sns.lucky.ui.a.e(SnsCommentDetailUI.this.vov.voR, SnsCommentDetailUI.this.qHZ.uS(0));
            GMTrace.o(8589934592000L, 64000);
            return;
          }
          bcz localbcz = SnsCommentDetailUI.b(SnsCommentDetailUI.this).bmS();
          if (SnsCommentDetailUI.b(SnsCommentDetailUI.this).qIL == 1) {}
          for (;;)
          {
            SnsCommentDetailUI.a(SnsCommentDetailUI.this, paramAnonymousString, localbcz, i);
            SnsCommentDetailUI.b(SnsCommentDetailUI.this).ia(false);
            w.i("MicroMsg.SnsCommentDetailUI", "comment send imp!");
            SnsCommentDetailUI.s(SnsCommentDetailUI.this);
            new com.tencent.mm.sdk.platformtools.ae().postDelayed(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(14444243451904L, 107618);
                SnsCommentDetailUI.u(SnsCommentDetailUI.this);
                GMTrace.o(14444243451904L, 107618);
              }
            }, 100L);
            GMTrace.o(8589934592000L, 64000);
            return;
            i = 0;
          }
        }
      });
      localObject1 = this.qxN;
      localObject3 = new SnsCommentFooter.b()
      {
        public final void bmK()
        {
          GMTrace.i(8392097660928L, 62526);
          SnsCommentDetailUI.v(SnsCommentDetailUI.this);
          if ((SnsCommentDetailUI.c(SnsCommentDetailUI.this).getFirstVisiblePosition() > 1) || (SnsCommentDetailUI.c(SnsCommentDetailUI.this).getLastVisiblePosition() <= 0)) {
            BackwardSupportUtil.c.b(SnsCommentDetailUI.c(SnsCommentDetailUI.this), 1);
          }
          GMTrace.o(8392097660928L, 62526);
        }
      };
      i = localm.field_likeFlag;
      ((SnsCommentFooter)localObject1).qIJ.setVisibility(0);
      ((SnsCommentFooter)localObject1).qIJ.setOnClickListener(new SnsCommentFooter.7((SnsCommentFooter)localObject1, (SnsCommentFooter.b)localObject3));
      this.qxN.bmT();
      this.qHA = getIntent().getBooleanExtra("INTENT_FROMSUI", false);
      if (this.qHA)
      {
        this.qHB = getIntent().getLongExtra("INTENT_FROMSUI_COMMENTID", 0L);
        if ((this.qHB != 0L) && (this.qHm.qIB != null))
        {
          i = 0;
          if (i < this.qHm.qIB.size())
          {
            localObject3 = (bcz)this.qHm.qIB.get(i);
            if (((bcz)localObject3).uuE == 0) {
              break label1698;
            }
            l = ((bcz)localObject3).uuE;
            label1280:
            if (l != this.qHB) {
              break label1736;
            }
            this.qHk.setSelection(i);
            localObject1 = this.qHw.SL(((bcz)localObject3).twR);
            if (localObject1 == null) {
              break label1708;
            }
            localObject1 = ((com.tencent.mm.l.a)localObject1).vq();
            label1326:
            this.qxN.a(getString(i.j.pTz) + (String)localObject1, (bcz)localObject3);
            if (((bdk)localObject2).uvi.size() <= 0) {
              break label1781;
            }
            int j = i + 1;
            i = j;
            if (j > this.qHm.getCount()) {
              i = this.qHm.getCount() - 1;
            }
          }
        }
      }
    }
    label1698:
    label1708:
    label1736:
    label1781:
    for (;;)
    {
      this.qHR.CH = i;
      if (this.qHA) {
        new com.tencent.mm.sdk.platformtools.ae().postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8322572877824L, 62008);
            SnsCommentDetailUI.this.aKl();
            SnsCommentDetailUI.l(SnsCommentDetailUI.this).kyV = SnsCommentDetailUI.w(SnsCommentDetailUI.this);
            SnsCommentDetailUI.l(SnsCommentDetailUI.this).run();
            GMTrace.o(8322572877824L, 62008);
          }
        }, 100L);
      }
      this.qHJ = ((SnsTranslateResultView)this.qHg.findViewById(i.f.pNo));
      this.qHJ.as(((TextView)this.qHg.findViewById(i.f.bAy)).getTextSize());
      this.qHJ.pio.setBackgroundResource(i.e.pHw);
      localObject1 = new as(this.fMT, localm.bkg(), false, true, 2);
      this.qHJ.pio.setTag(localObject1);
      this.kwF.a(this.qHJ.pio, this.qHI.qVf, this.qHI.qVc);
      if (com.tencent.mm.plugin.sns.model.ao.bQ(this.fMT, 4))
      {
        localObject1 = com.tencent.mm.plugin.sns.model.ao.GJ(this.fMT);
        if ((localObject1 != null) && (((ao.b)localObject1).hie))
        {
          this.qHJ.setVisibility(0);
          this.qHJ.a(null, 1, ((ao.b)localObject1).result, ((ao.b)localObject1).hpO, false);
          GMTrace.o(8406190522368L, 62631);
          return;
          this.qHr = ((bdk)localObject2).uvi;
          e(((bdk)localObject2).uvi, ((bdk)localObject2).uvl.isEmpty());
          if (this.qHj != null) {
            this.qHj.a(localm, this.qHI);
          }
          this.qHm = new b(((bdk)localObject2).uvl, ((bdk)localObject2).uvi, this, localm.bkg());
          break;
          l = ((bcz)localObject3).uuH;
          break label1280;
          if (((bcz)localObject3).ufQ != null)
          {
            localObject1 = ((bcz)localObject3).ufQ;
            break label1326;
          }
          localObject1 = ((bcz)localObject3).twR;
          break label1326;
          i += 1;
          break label1234;
        }
        this.qHJ.setVisibility(8);
        GMTrace.o(8406190522368L, 62631);
        return;
      }
      this.qHJ.setVisibility(8);
      GMTrace.o(8406190522368L, 62631);
      return;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ac.k paramk)
  {
    GMTrace.i(8407801135104L, 62643);
    if ((paramk.getType() == 218) && (this.qxY != null)) {
      this.qxY.dismiss();
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramk = com.tencent.mm.plugin.sns.storage.h.Hz(this.fMT);
      if (paramk == null)
      {
        w.e("MicroMsg.SnsCommentDetailUI", "invalid pcid:" + this.fMT);
        finish();
        GMTrace.o(8407801135104L, 62643);
        return;
      }
      w.d("MicroMsg.SnsCommentDetailUI", "snsId: " + this.fMT + "  username:" + paramk.field_userName);
      if (this.qHg == null)
      {
        w.e("MicroMsg.SnsCommentDetailUI", "fatal error! Sns onSceneEnd before initView and infoHeader is null!");
        finish();
        GMTrace.o(8407801135104L, 62643);
        return;
      }
      bmF();
      paramString = ai.m(paramk);
      w.i("MicroMsg.SnsCommentDetailUI", "onsceneend " + paramString.uvi.size() + " " + paramString.uvl.size());
      if (paramString == null)
      {
        GMTrace.o(8407801135104L, 62643);
        return;
      }
      if (!f(this.qHr, paramString.uvi))
      {
        e(paramString.uvi, paramString.uvl.isEmpty());
        this.qHr = paramString.uvi;
      }
      if (this.qHj != null) {
        this.qHj.a(paramk, this.qHI);
      }
      paramk = this.qHm;
      LinkedList localLinkedList = paramString.uvl;
      paramString = paramString.uvi;
      paramk.qIB = localLinkedList;
      paramk.qIC = paramString;
      this.qHm.notifyDataSetChanged();
    }
    GMTrace.o(8407801135104L, 62643);
  }
  
  public final void a(boolean paramBoolean1, String paramString, boolean paramBoolean2, boolean paramBoolean3, int paramInt, long paramLong)
  {
    GMTrace.i(8405116780544L, 62623);
    GMTrace.o(8405116780544L, 62623);
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString, boolean paramBoolean3, boolean paramBoolean4, int paramInt, long paramLong)
  {
    GMTrace.i(8404982562816L, 62622);
    GMTrace.o(8404982562816L, 62622);
  }
  
  public final void anR()
  {
    GMTrace.i(8408069570560L, 62645);
    if (this.vov.vpj == 2)
    {
      w.i("MicroMsg.SnsCommentDetailUI", "keybaordhide! ");
      this.qHt = false;
      if (this.qxN.nEm)
      {
        this.qxN.nEm = false;
        GMTrace.o(8408069570560L, 62645);
        return;
      }
      if (this.qxN.bmL())
      {
        this.qxN.bmR();
        this.qxN.Il(getString(i.j.pUh));
        GMTrace.o(8408069570560L, 62645);
      }
    }
    else if (this.vov.vpj == 1)
    {
      bmG();
      this.qxM = false;
      this.qHR.run();
    }
    GMTrace.o(8408069570560L, 62645);
  }
  
  public final void ar(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8407398481920L, 62640);
    GMTrace.o(8407398481920L, 62640);
  }
  
  public final void as(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8407935352832L, 62644);
    GMTrace.o(8407935352832L, 62644);
  }
  
  public final void bgh()
  {
    GMTrace.i(8407532699648L, 62641);
    GMTrace.o(8407532699648L, 62641);
  }
  
  final boolean bmF()
  {
    GMTrace.i(8406593175552L, 62634);
    final com.tencent.mm.plugin.sns.storage.m localm = hZ(true);
    if (localm == null)
    {
      GMTrace.o(8406593175552L, 62634);
      return false;
    }
    w.i("MicroMsg.SnsCommentDetailUI", "setheader " + this.qHg.toString());
    final Object localObject1 = new DisplayMetrics();
    bUr().getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject1);
    this.mScreenWidth = ((DisplayMetrics)localObject1).widthPixels;
    this.mScreenHeight = ((DisplayMetrics)localObject1).heightPixels;
    int i;
    final Object localObject5;
    if (this.mScreenHeight < this.mScreenWidth)
    {
      i = this.mScreenHeight;
      this.mScreenWidth = i;
      this.qHE = com.tencent.mm.plugin.sns.model.ae.bhw();
      localObject5 = localm.bjL();
      this.kxh = av.d((bhc)localObject5);
      localObject1 = (ImageView)this.qHg.findViewById(i.f.pIj);
      if ((localObject1 != null) && (localm != null)) {
        break label264;
      }
      localObject2 = new StringBuilder("unknow error ? ");
      if (localObject1 != null) {
        break label252;
      }
      bool = true;
      label194:
      localObject1 = ((StringBuilder)localObject2).append(bool).append(" ");
      if (localm != null) {
        break label258;
      }
    }
    label252:
    label258:
    for (boolean bool = true;; bool = false)
    {
      w.e("MicroMsg.SnsCommentDetailUI", bool);
      GMTrace.o(8406593175552L, 62634);
      return false;
      i = this.mScreenWidth;
      break;
      bool = false;
      break label194;
    }
    label264:
    ((MaskImageButton)localObject1).wLk = localm.bkg();
    a.b.b((ImageView)localObject1, localm.getUserName(), true);
    ((ImageView)localObject1).setTag(localm.getUserName());
    ((ImageView)localObject1).setOnClickListener(this.qHI.qVd);
    final Object localObject2 = (TextView)this.qHg.findViewById(i.f.cgr);
    com.tencent.mm.kernel.h.xA();
    final Object localObject6 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yL().SL(localm.getUserName());
    w.i("MicroMsg.SnsCommentDetailUI", "snsinfo username " + localm.getUserName() + " " + localm.bjM() + " " + localm.bjZ());
    if (localObject6 == null)
    {
      GMTrace.o(8406593175552L, 62634);
      return false;
    }
    if (((x)localObject6).vo() == 0)
    {
      w.i("MicroMsg.SnsCommentDetailUI", "getContact %s", new Object[] { localm.getUserName() });
      ag.a.AC().a(localm.getUserName(), "", this.qIb);
    }
    final Object localObject3;
    if (localObject6 == null)
    {
      localObject1 = localm.getUserName();
      localObject3 = com.tencent.mm.sdk.platformtools.bg.ap((String)localObject1, "");
      if ((!localm.bks()) || (!com.tencent.mm.sdk.platformtools.bg.mZ((String)localObject3))) {
        break label9542;
      }
      localObject1 = localm.bjH();
      if ((localObject1 == null) || (com.tencent.mm.sdk.platformtools.bg.mZ(((com.tencent.mm.plugin.sns.storage.b)localObject1).fvS))) {
        break label9542;
      }
      localObject3 = ((com.tencent.mm.plugin.sns.storage.b)localObject1).fvS;
    }
    label560:
    label763:
    label1140:
    label1161:
    label1336:
    label1380:
    label1581:
    label1593:
    label1603:
    label1664:
    label1796:
    label2418:
    label2499:
    label2520:
    label2713:
    label2714:
    label2839:
    label3026:
    label3112:
    label3146:
    label3579:
    label4104:
    label4147:
    label4470:
    label4638:
    label4886:
    label4980:
    label5200:
    label5325:
    label5462:
    label5534:
    label5577:
    label5583:
    label5992:
    label5998:
    label6101:
    label6379:
    label6381:
    label6387:
    label6803:
    label6818:
    label6911:
    label7000:
    label7027:
    label7046:
    label7193:
    label7328:
    label7987:
    label8261:
    label8271:
    label8319:
    label8329:
    label8340:
    label8400:
    label8413:
    label8527:
    label8537:
    label8825:
    label8992:
    label9002:
    label9012:
    label9022:
    label9039:
    label9249:
    label9319:
    label9501:
    label9519:
    label9522:
    label9525:
    label9533:
    label9536:
    label9539:
    label9542:
    for (;;)
    {
      ((String)localObject3).length();
      if (this.kxh == 11)
      {
        i = 3;
        localObject1 = new com.tencent.mm.pluginsdk.ui.d.i(com.tencent.mm.pluginsdk.ui.d.h.a(this, (CharSequence)localObject3));
        ((com.tencent.mm.pluginsdk.ui.d.i)localObject1).f(new com.tencent.mm.pluginsdk.ui.d.m(new com.tencent.mm.plugin.sns.data.a(localm.bks(), ((x)localObject6).getUsername(), localm.bkg(), 2), this.qHz, i), (CharSequence)localObject3);
        ((TextView)localObject2).setOnTouchListener(new ab());
        ((TextView)localObject2).setText((CharSequence)localObject1, TextView.BufferType.SPANNABLE);
        ((TextView)this.qHg.findViewById(i.f.pNC)).setText("");
        this.qIc = new bf(this.qHg);
        if (!localm.bks()) {
          break label1581;
        }
        this.qIc.p(Long.valueOf(localm.field_snsId), new com.tencent.mm.plugin.sns.data.b(this.qIc, 0, this.qHv, localm.field_snsId));
        this.qIc.a(localm.bjH(), localm.bjJ());
        this.qIc.a(this.qHI.qVm, this.qHI.qVB);
        this.qIc.setVisibility(0);
        localObject2 = ((bhc)localObject5).uyr;
        this.qHh = ((TextView)this.qHg.findViewById(i.f.bAy));
        localObject1 = new as(this.fMT, localm.bkg(), true, false, 2);
        this.qHh.setTag(localObject1);
        this.kwF.a(this.qHh, this.qHI.qVf, this.qHI.qVc);
        localObject1 = this.qHg.findViewById(i.f.pJi);
        if (localObject1 != null) {
          ((View)localObject1).setVisibility(8);
        }
        if ((!localm.bks()) || (localm.bjH() == null) || (localm.bjH().qmi != 1)) {
          break label9539;
        }
        this.qHh.setVisibility(8);
        this.qHh = ((TextView)this.qHg.findViewById(i.f.pJD));
        this.qHh.setClickable(false);
        this.qHh.setLongClickable(false);
        localObject2 = (LinearLayout)this.qHg.findViewById(i.f.pKa);
        ((LinearLayout)localObject2).setBackground(bUr().getResources().getDrawable(i.e.pHu));
        localObject1 = new LinearLayout.LayoutParams(((WindowManager)bUr().getSystemService("window")).getDefaultDisplay().getWidth() - com.tencent.mm.bq.a.fromDPToPix(bUr(), 50) - com.tencent.mm.bq.a.fromDPToPix(bUr(), 12) - com.tencent.mm.bq.a.fromDPToPix(bUr(), 12), -2);
        ((LinearLayout.LayoutParams)localObject1).setMargins(0, com.tencent.mm.bq.a.fromDPToPix(bUr(), 5), 0, 0);
        ((LinearLayout)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
        localObject1 = (TextView)this.qHg.findViewById(i.f.pJz);
        ((TextView)localObject1).setClickable(false);
        ((TextView)localObject1).setLongClickable(false);
        if (com.tencent.mm.sdk.platformtools.bg.mZ(localm.bjH().qmj)) {
          break label1593;
        }
        ((TextView)localObject1).setText(localm.bjH().qmj + " ");
        com.tencent.mm.pluginsdk.ui.d.h.d((TextView)localObject1, 2);
        ((TextView)localObject1).setVisibility(0);
        if (!com.tencent.mm.sdk.platformtools.bg.mZ(localm.bjH().qmk)) {
          break label1603;
        }
        localObject1 = ((bhc)localObject5).uyr;
        this.kwF.a((View)localObject2, this.qHI.qVt, this.qHI.qVc);
        localObject2 = localObject1;
        if (localm.bjH().bio())
        {
          this.qHg.findViewById(i.f.pJi).setVisibility(0);
          ((Button)this.qHg.findViewById(i.f.pJj)).setText(localm.bjH().bik());
          ((Button)this.qHg.findViewById(i.f.pJk)).setText(localm.bjH().bil());
          ((Button)this.qHg.findViewById(i.f.pJj)).setOnClickListener(this.qHI.qVF);
          ((Button)this.qHg.findViewById(i.f.pJk)).setOnClickListener(this.qHI.qVG);
          localObject2 = localObject1;
        }
      }
      for (;;)
      {
        if ((localObject2 == null) || (((String)localObject2).equals("")))
        {
          this.qHh.setVisibility(8);
          av.e((bhc)localObject5);
          localObject1 = (ViewStub)this.qHg.findViewById(i.f.pJZ);
          if (!this.qHY)
          {
            if (this.kxh != 2) {
              break label1664;
            }
            ((ViewStub)localObject1).setLayoutResource(i.g.pPF);
            if ((this.kxh != 2) && (this.kxh != 3) && (this.kxh != 4) && (this.kxh != 5)) {
              break label1796;
            }
            this.qHZ = ((PhotosContent)((ViewStub)localObject1).inflate());
          }
        }
        for (;;)
        {
          this.qHY = true;
          if (this.kxh == 6) {
            break label2418;
          }
          if ((this.kxh != 2) && (this.kxh != 3) && (this.kxh != 4) && (this.kxh != 5)) {
            break label4147;
          }
          if (this.qHZ == null) {
            break label4104;
          }
          this.qHZ.bmj();
          i = 0;
          while (i < ar.qLx[this.kxh])
          {
            localObject1 = (TagImageView)this.qHZ.findViewById(ar.qLB[i]);
            this.qHZ.a((TagImageView)localObject1);
            ((TagImageView)localObject1).setOnClickListener(this.qHI.qBP);
            this.kwF.a((View)localObject1, this.qHI.qVq, this.qHI.qVc);
            i += 1;
          }
          localObject1 = ((x)localObject6).vq();
          break;
          i = 2;
          break label560;
          this.qIc.setVisibility(8);
          break label763;
          ((TextView)localObject1).setVisibility(8);
          break label1140;
          localObject1 = localm.bjH().qmk;
          break label1161;
          this.qHh.setText((String)localObject2 + " ");
          com.tencent.mm.pluginsdk.ui.d.h.d(this.qHh, 2);
          this.qHh.setVisibility(0);
          break label1336;
          if (this.kxh == 3)
          {
            ((ViewStub)localObject1).setLayoutResource(i.g.pPC);
            break label1380;
          }
          if (this.kxh == 4)
          {
            ((ViewStub)localObject1).setLayoutResource(i.g.pPD);
            break label1380;
          }
          if (this.kxh == 5)
          {
            ((ViewStub)localObject1).setLayoutResource(i.g.pPE);
            break label1380;
          }
          if (this.kxh == 6) {
            break label1380;
          }
          if ((this.kxh == 1) || (this.kxh == 0))
          {
            ((ViewStub)localObject1).setLayoutResource(i.g.pPb);
            break label1380;
          }
          if (this.kxh == 9)
          {
            ((ViewStub)localObject1).setLayoutResource(i.g.pMs);
            break label1380;
          }
          if (this.kxh != 11) {
            break label1380;
          }
          ((ViewStub)localObject1).setLayoutResource(i.g.pOR);
          break label1380;
          if (this.kxh == 9) {
            ((ViewStub)localObject1).inflate();
          } else if (this.kxh == 11) {
            this.qHZ = ((PhotosContent)((ViewStub)localObject1).inflate());
          } else {
            ((ViewStub)localObject1).setVisibility(8);
          }
        }
        this.qHZ.uR(this.qHE);
        localObject2 = new LinkedList();
        final Object localObject4;
        int j;
        if ((localm.bks()) && (this.kxh == 2))
        {
          localObject4 = localm.bjH();
          if ((localObject4 == null) || (((com.tencent.mm.plugin.sns.storage.b)localObject4).qmi != 1)) {
            break label3579;
          }
          i = ((WindowManager)bUr().getSystemService("window")).getDefaultDisplay().getWidth();
          if ((((bhc)localObject5).uyu != null) && (((bhc)localObject5).uyu.tKd.size() > 0)) {}
          for (localObject1 = (amn)((bhc)localObject5).uyu.tKd.get(0);; localObject1 = null)
          {
            f1 = ((amn)localObject1).uhD.uis;
            f2 = ((amn)localObject1).uhD.uit;
            i = i - com.tencent.mm.bq.a.fromDPToPix(bUr(), 50) - com.tencent.mm.bq.a.fromDPToPix(bUr(), 12) - com.tencent.mm.bq.a.fromDPToPix(bUr(), 12) - com.tencent.mm.bq.a.fromDPToPix(bUr(), 20);
            j = (int)(f2 * i / f1);
            localObject1 = new amp();
            ((amp)localObject1).uis = i;
            ((amp)localObject1).uit = j;
            ((amp)localObject1).uiu = (((amp)localObject1).uis * ((amp)localObject1).uit);
            ((LinkedList)localObject2).add(localObject1);
            localObject1 = (LinearLayout.LayoutParams)this.qHZ.getLayoutParams();
            ((LinearLayout.LayoutParams)localObject1).leftMargin = com.tencent.mm.bq.a.fromDPToPix(bUr(), 10);
            ((LinearLayout.LayoutParams)localObject1).rightMargin = com.tencent.mm.bq.a.fromDPToPix(bUr(), 10);
            this.qHZ.setLayoutParams((ViewGroup.LayoutParams)localObject1);
            this.qHg.findViewById(i.f.pKa).setTag(this.qHZ.uS(0));
            this.qHg.findViewById(i.f.pKa).setOnClickListener(this.qHI.qVH);
            i = 0;
            while (i < ar.qLx[this.kxh])
            {
              localObject1 = (TagImageView)this.qHZ.findViewById(ar.qLB[i]);
              this.kwF.a((View)localObject1, this.qHI.qVt, this.qHI.qVc);
              i += 1;
            }
          }
          this.qHg.findViewById(i.f.pJj).setTag(this.qHZ.uS(0));
          this.qHg.findViewById(i.f.pJk).setTag(this.qHZ.uS(0));
        }
        final Object localObject7;
        while ((localObject4 == null) || (((com.tencent.mm.plugin.sns.storage.b)localObject4).qlY <= 0.0F) || (((com.tencent.mm.plugin.sns.storage.b)localObject4).qlZ <= 0.0F))
        {
          if (!com.tencent.mm.sdk.platformtools.bg.mZ(((com.tencent.mm.plugin.sns.storage.b)localObject4).qmd))
          {
            localObject1 = this.qHZ;
            localObject7 = this.qHZ.uS(0);
            d.a("adId", ((com.tencent.mm.plugin.sns.storage.b)localObject4).qmd, false, 41, 0, new d.a()
            {
              public final void Hp(String paramAnonymousString)
              {
                GMTrace.i(8714622861312L, 64929);
                MaskImageView localMaskImageView = (MaskImageView)localObject1.findViewById(i.f.pKC);
                if (localMaskImageView != null)
                {
                  localMaskImageView.setVisibility(0);
                  localMaskImageView.setImageBitmap(BitmapFactory.decodeFile(paramAnonymousString));
                  float f1 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(localObject4.qme, 1, localObject4.qma, localObject4.qmb);
                  float f2 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(localObject4.qmf, 1, localObject4.qma, localObject4.qmb);
                  float f3 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(localObject4.qmg, 1, localObject4.qma, localObject4.qmb);
                  float f4 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(localObject4.qmh, 1, localObject4.qma, localObject4.qmb);
                  paramAnonymousString = new FrameLayout.LayoutParams((int)f1, (int)f2);
                  paramAnonymousString.setMargins((int)(localObject7.getRight() - f3 - f1), (int)(localObject7.getBottom() - f4 - f2), 0, 0);
                  localMaskImageView.setLayoutParams(paramAnonymousString);
                }
                GMTrace.o(8714622861312L, 64929);
              }
              
              public final void biT()
              {
                GMTrace.i(8714354425856L, 64927);
                GMTrace.o(8714354425856L, 64927);
              }
              
              public final void biU()
              {
                GMTrace.i(8714488643584L, 64928);
                GMTrace.o(8714488643584L, 64928);
              }
            });
          }
          this.qHg.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener()
          {
            boolean qIl;
            
            public final void onViewAttachedToWindow(View paramAnonymousView)
            {
              GMTrace.i(8570875674624L, 63858);
              w.i("MicroMsg.SnsCommentDetailUI", "onViewAttachedToWindow infoHeader %s", new Object[] { Boolean.valueOf(this.qIl) });
              if (!this.qIl)
              {
                GMTrace.o(8570875674624L, 63858);
                return;
              }
              this.qIl = false;
              if (localObject5 == null)
              {
                GMTrace.o(8570875674624L, 63858);
                return;
              }
              if (localm == null)
              {
                GMTrace.o(8570875674624L, 63858);
                return;
              }
              if (SnsCommentDetailUI.this.qHZ == null)
              {
                GMTrace.o(8570875674624L, 63858);
                return;
              }
              paramAnonymousView = SnsCommentDetailUI.z(SnsCommentDetailUI.this);
              PhotosContent localPhotosContent = SnsCommentDetailUI.this.qHZ;
              bhc localbhc = localObject5;
              String str = localm.bkg();
              SnsCommentDetailUI.x(SnsCommentDetailUI.this);
              int i = SnsCommentDetailUI.this.hashCode();
              int j = SnsCommentDetailUI.y(SnsCommentDetailUI.this);
              localm.uF(32);
              paramAnonymousView.a(localPhotosContent, localbhc, str, i, j, -1, false, an.vfa, localObject2);
              GMTrace.o(8570875674624L, 63858);
            }
            
            public final void onViewDetachedFromWindow(View paramAnonymousView)
            {
              GMTrace.i(8571009892352L, 63859);
              w.i("MicroMsg.SnsCommentDetailUI", "onViewDetachedFromWindow infoHeader");
              this.qIl = true;
              GMTrace.o(8571009892352L, 63859);
            }
          });
          localObject1 = this.qHu;
          localObject4 = this.qHZ;
          localObject7 = localm.bkg();
          i = hashCode();
          j = this.kxh;
          localm.uF(32);
          ((ar)localObject1).a((PhotosContent)localObject4, (bhc)localObject5, (String)localObject7, i, j, -1, false, an.vfa, (List)localObject2);
          localObject4 = (TextView)this.qHg.findViewById(i.f.pIi);
          if (!localm.bks()) {
            break label8329;
          }
          localObject2 = localm.bjJ();
          if (localObject2 == null) {
            break label8319;
          }
          localObject1 = ((com.tencent.mm.plugin.sns.storage.a)localObject2).qlh;
          localObject2 = ((com.tencent.mm.plugin.sns.storage.a)localObject2).qli;
          ((TextView)localObject4).setTag(localm.bkg());
          if (com.tencent.mm.sdk.platformtools.bg.mZ((String)localObject1)) {
            break label8319;
          }
          if (!com.tencent.mm.sdk.platformtools.bg.mZ((String)localObject2)) {
            break;
          }
          ((TextView)localObject4).setVisibility(0);
          ((TextView)localObject4).setText((CharSequence)localObject1);
          ((TextView)localObject4).setClickable(false);
          ((TextView)localObject4).setTextColor(-9211021);
          ((TextView)localObject4).setOnClickListener(this.qHI.qVy);
          ((TextView)this.qHg.findViewById(i.f.pIX)).setText(az.l(bUr(), localm.bjZ() * 1000L));
          localObject4 = (AsyncTextView)this.qHg.findViewById(i.f.pIh);
          ((TextView)localObject4).setOnClickListener(this.qHI.qVC);
          ((TextView)localObject4).setVisibility(8);
          localObject7 = (AsyncTextView)this.qHg.findViewById(i.f.pIg);
          ((TextView)localObject7).setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(8767638863872L, 65324);
              paramAnonymousView = new com.tencent.mm.plugin.sns.a.b.c(localm.bkp(), 24, 2, "", localm.bku(), localm.bjM());
              com.tencent.mm.kernel.h.xA();
              com.tencent.mm.kernel.h.xy().gQO.a(paramAnonymousView, 0);
              SnsCommentDetailUI.b(SnsCommentDetailUI.this).b(localObject6.vq(), null);
              SnsCommentDetailUI.b(SnsCommentDetailUI.this).ia(true);
              SnsCommentDetailUI.B(SnsCommentDetailUI.this).setVisibility(8);
              SnsCommentDetailUI.u(SnsCommentDetailUI.this);
              GMTrace.o(8767638863872L, 65324);
            }
          });
          ((TextView)localObject7).setVisibility(8);
          if (localm.bks())
          {
            localObject6 = localm.bjJ();
            ((TextView)localObject4).setTag(localm.bkg());
            if (((com.tencent.mm.plugin.sns.storage.a)localObject6).qlj != com.tencent.mm.plugin.sns.storage.a.qkV) {
              break label8537;
            }
            if (com.tencent.mm.sdk.platformtools.bg.mZ(((com.tencent.mm.plugin.sns.storage.a)localObject6).qlk)) {
              break label8527;
            }
            ((TextView)localObject4).setText(((com.tencent.mm.plugin.sns.storage.a)localObject6).qlk);
            ((TextView)localObject4).setVisibility(0);
            break label8825;
            if ((((TextView)localObject4).getVisibility() != 8) && (com.tencent.mm.sdk.platformtools.bg.mZ(((com.tencent.mm.plugin.sns.storage.a)localObject6).qll)))
            {
              ((TextView)localObject4).setTextColor(getResources().getColor(i.c.pGu));
              ((TextView)localObject4).setOnClickListener(null);
            }
            if (localm.bjL().uyu.tKe != 4) {
              break label8992;
            }
            ((TextView)localObject7).setTag(localm.bkg());
            ((TextView)localObject7).setVisibility(0);
            ((TextView)localObject7).setText(String.format("%s%s%s", new Object[] { bUr().getResources().getString(i.j.pRz), localObject3, bUr().getResources().getString(i.j.pRA) }));
          }
          localObject1 = (TextView)this.qHg.findViewById(i.f.pIA);
          ((TextView)localObject1).setOnTouchListener(new ab());
          localObject2 = com.tencent.mm.plugin.sns.c.a.ifN.m(this, ((bhc)localObject5).uyt.nas);
          av.a((bhc)localObject5, this);
          if (!com.tencent.mm.plugin.sns.c.a.ifN.bD((String)localObject2)) {
            break label9002;
          }
          ((TextView)localObject1).setVisibility(0);
          localObject2 = new SpannableString(getString(i.j.pRQ) + (String)localObject2);
          ((SpannableString)localObject2).setSpan(new a(), 0, ((SpannableString)localObject2).length(), 33);
          ((TextView)localObject1).setText((CharSequence)localObject2, TextView.BufferType.SPANNABLE);
          if ((((bhc)localObject5).uyt == null) || (!com.tencent.mm.pluginsdk.model.app.g.Nz(((bhc)localObject5).uyt.nas)))
          {
            ((TextView)localObject1).setTextColor(getResources().getColor(i.c.pGu));
            ((TextView)localObject1).setOnTouchListener(null);
          }
          ((TextView)localObject1).setTag(localObject5);
          localObject1 = (TextView)this.qHg.findViewById(i.f.pIz);
          if (!localm.getUserName().equals(this.gCs)) {
            break label9012;
          }
          ((TextView)localObject1).setVisibility(0);
          ((TextView)localObject1).setTag(localm.bkg() + ";" + localm.bjM());
          ((TextView)localObject1).setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(8348611117056L, 62202);
              com.tencent.mm.ui.base.h.a(SnsCommentDetailUI.this, i.j.pTY, i.j.dxm, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                {
                  GMTrace.i(8613020041216L, 64172);
                  w.d("MicroMsg.SnsCommentDetailUI", "to del by localId " + SnsCommentDetailUI.j(SnsCommentDetailUI.this));
                  paramAnonymous2DialogInterface = com.tencent.mm.plugin.sns.storage.h.HA(SnsCommentDetailUI.j(SnsCommentDetailUI.this));
                  if (paramAnonymous2DialogInterface == null)
                  {
                    w.e("MicroMsg.SnsCommentDetailUI", "try to del item fail can not get snsinfo by localid %s", new Object[] { SnsCommentDetailUI.j(SnsCommentDetailUI.this) });
                    GMTrace.o(8613020041216L, 64172);
                    return;
                  }
                  if (paramAnonymous2DialogInterface.uF(32))
                  {
                    GMTrace.o(8613020041216L, 64172);
                    return;
                  }
                  Object localObject;
                  if (paramAnonymous2DialogInterface.field_snsId == 0L)
                  {
                    com.tencent.mm.plugin.sns.model.ae.bhp().uJ(paramAnonymous2DialogInterface.quQ);
                    localObject = new Intent();
                    ((Intent)localObject).putExtra("sns_gallery_op_id", u.HV(SnsCommentDetailUI.j(SnsCommentDetailUI.this)));
                    SnsCommentDetailUI.this.setResult(-1, (Intent)localObject);
                    if ((SnsCommentDetailUI.r(SnsCommentDetailUI.this)) && (!paramAnonymous2DialogInterface.isValid())) {
                      ((Intent)localObject).putExtra("sns_gallery_force_finish", true);
                    }
                    localObject = paramAnonymous2DialogInterface.bjL();
                    if (localObject != null) {
                      if (((bhc)localObject).uyt != null) {
                        break label373;
                      }
                    }
                  }
                  label373:
                  for (paramAnonymous2DialogInterface = null;; paramAnonymous2DialogInterface = ((bhc)localObject).uyt.nas)
                  {
                    if ((!com.tencent.mm.sdk.platformtools.bg.mZ(paramAnonymous2DialogInterface)) && (com.tencent.mm.plugin.sns.c.a.ifN.bE(paramAnonymous2DialogInterface)))
                    {
                      String str = com.tencent.mm.plugin.sns.c.a.ifN.bC(paramAnonymous2DialogInterface);
                      mr localmr = new mr();
                      localmr.fKS.appId = paramAnonymous2DialogInterface;
                      localmr.fKS.fKT = ((bhc)localObject).jWW;
                      localmr.fKS.flK = str;
                      com.tencent.mm.sdk.b.a.uLm.m(localmr);
                    }
                    SnsCommentDetailUI.this.finish();
                    GMTrace.o(8613020041216L, 64172);
                    return;
                    com.tencent.mm.plugin.sns.model.ae.bho().dB(paramAnonymous2DialogInterface.field_snsId);
                    com.tencent.mm.kernel.h.xA();
                    com.tencent.mm.kernel.h.xy().gQO.a(new com.tencent.mm.plugin.sns.model.q(paramAnonymous2DialogInterface.field_snsId, 1), 0);
                    com.tencent.mm.plugin.sns.model.ae.bhp().delete(paramAnonymous2DialogInterface.field_snsId);
                    com.tencent.mm.plugin.sns.model.ae.bht().dK(paramAnonymous2DialogInterface.field_snsId);
                    break;
                  }
                }
              }, null);
              GMTrace.o(8348611117056L, 62202);
            }
          });
          localObject3 = (TextView)this.qHg.findViewById(i.f.pNM);
          localObject4 = ai.m(localm);
          if (localObject4 != null) {
            break label9022;
          }
          ((TextView)localObject3).setVisibility(8);
          this.qHn = new ScaleAnimation(0.0F, 1.0F, 1.0F, 1.0F, 1, 1.0F, 1, 0.0F);
          this.qHn.setDuration(150L);
          this.qHo = new ScaleAnimation(1.0F, 0.0F, 1.0F, 1.0F, 1, 1.0F, 1, 0.0F);
          this.qHo.setDuration(150L);
          if (this.qHl == null)
          {
            this.qHl = this.qHg.findViewById(i.f.pIl);
            this.qHl.setVisibility(8);
          }
          this.qHp = ((LinearLayout)this.qHg.findViewById(i.f.pIq));
          this.qHp.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(8469272854528L, 63101);
              if (!com.tencent.mm.plugin.sns.lucky.a.m.Gn(localm.bkg()))
              {
                com.tencent.mm.plugin.sns.lucky.ui.a.e(SnsCommentDetailUI.this.vov.voR, SnsCommentDetailUI.this.qHZ.uS(0));
                GMTrace.o(8469272854528L, 63101);
                return;
              }
              SnsCommentDetailUI.b(SnsCommentDetailUI.this).qbt = null;
              SnsCommentDetailUI.b(SnsCommentDetailUI.this).Il("");
              SnsCommentDetailUI.b(SnsCommentDetailUI.this).qIL = 0;
              SnsCommentDetailUI.b(SnsCommentDetailUI.this).ia(true);
              SnsCommentDetailUI.B(SnsCommentDetailUI.this).setVisibility(8);
              SnsCommentDetailUI.u(SnsCommentDetailUI.this);
              GMTrace.o(8469272854528L, 63101);
            }
          });
          this.qHp.setOnTouchListener(this.qBi);
          this.qHq = ((LinearLayout)this.qHg.findViewById(i.f.pIP));
          this.qHq.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(8533697363968L, 63581);
              SnsCommentDetailUI localSnsCommentDetailUI = SnsCommentDetailUI.this;
              paramAnonymousView = (LinearLayout)paramAnonymousView;
              ImageView localImageView = (ImageView)paramAnonymousView.findViewById(i.f.pIO);
              ScaleAnimation localScaleAnimation = new ScaleAnimation(0.9F, 1.5F, 0.9F, 1.5F, 1, 0.5F, 1, 0.5F);
              localScaleAnimation.setDuration(400L);
              localScaleAnimation.setStartOffset(100L);
              localScaleAnimation.setRepeatCount(0);
              localImageView.clearAnimation();
              localImageView.startAnimation(localScaleAnimation);
              localScaleAnimation.setAnimationListener(new SnsCommentDetailUI.32(localSnsCommentDetailUI, paramAnonymousView));
              SnsCommentDetailUI.v(SnsCommentDetailUI.this);
              GMTrace.o(8533697363968L, 63581);
            }
          });
          this.qHq.setOnTouchListener(this.qBi);
          localObject1 = (ImageButton)this.qHg.findViewById(i.f.pIY);
          localObject2 = hZ(true);
          if ((localObject2 != null) && ((((com.tencent.mm.plugin.sns.storage.m)localObject2).bkb() & 0x1) != 0)) {
            ((ImageButton)localObject1).setVisibility(8);
          }
          if ((localObject2 != null) && (!((com.tencent.mm.plugin.sns.storage.m)localObject2).bkf())) {
            ((ImageButton)localObject1).setVisibility(8);
          }
          localObject2 = (ImageView)this.qHq.findViewById(i.f.pIO);
          localObject3 = (ImageView)this.qHp.findViewById(i.f.pIp);
          localObject4 = (TextView)this.qHq.findViewById(i.f.pIQ);
          localObject5 = (TextView)this.qHp.findViewById(i.f.pIx);
          if (this.kxh == 11)
          {
            this.qHg.findViewById(i.f.pIl).setBackgroundResource(i.e.pGP);
            ((ImageButton)localObject1).setImageResource(i.e.pGX);
            ((ImageView)localObject2).setImageResource(i.e.pGY);
            ((ImageView)localObject3).setImageResource(i.e.pGZ);
            ((TextView)localObject4).setTextColor(getResources().getColor(i.c.pGn));
            ((TextView)localObject5).setTextColor(getResources().getColor(i.c.pGn));
            this.qHq.setBackgroundResource(i.e.pHa);
            this.qHp.setBackgroundResource(i.e.pHb);
          }
          ((ImageButton)localObject1).setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(8322036006912L, 62004);
              w.d("MicroMsg.SnsCommentDetailUI", "showComment click" + SnsCommentDetailUI.B(SnsCommentDetailUI.this).getVisibility());
              paramAnonymousView = localm.bjL();
              if ((paramAnonymousView != null) && (paramAnonymousView.uyu.tKc == 21) && (!com.tencent.mm.plugin.sns.lucky.a.m.Gn(localm.bkg())))
              {
                com.tencent.mm.plugin.sns.lucky.ui.a.e(SnsCommentDetailUI.this.vov.voR, SnsCommentDetailUI.this.qHZ.uS(0));
                GMTrace.o(8322036006912L, 62004);
                return;
              }
              if (SnsCommentDetailUI.B(SnsCommentDetailUI.this).getVisibility() == 0)
              {
                SnsCommentDetailUI.f(SnsCommentDetailUI.this);
                GMTrace.o(8322036006912L, 62004);
                return;
              }
              SnsCommentDetailUI.B(SnsCommentDetailUI.this).setVisibility(0);
              SnsCommentDetailUI.B(SnsCommentDetailUI.this).startAnimation(SnsCommentDetailUI.C(SnsCommentDetailUI.this));
              if (SnsCommentDetailUI.y(SnsCommentDetailUI.this) == 11) {
                SnsCommentDetailUI.D(SnsCommentDetailUI.this).findViewById(i.f.pIl).setBackgroundResource(i.e.pGP);
              }
              if (!u.HW(SnsCommentDetailUI.n(SnsCommentDetailUI.this)))
              {
                SnsCommentDetailUI.this.qHp.setEnabled(false);
                SnsCommentDetailUI.this.qHq.setEnabled(false);
                localObject4.setText(SnsCommentDetailUI.this.getString(i.j.pSY));
                localObject4.setTextColor(SnsCommentDetailUI.this.getResources().getColor(i.c.pGm));
                localObject5.setTextColor(SnsCommentDetailUI.this.getResources().getColor(i.c.pGm));
                if (SnsCommentDetailUI.y(SnsCommentDetailUI.this) == 11)
                {
                  localObject2.setImageResource(i.i.pQh);
                  GMTrace.o(8322036006912L, 62004);
                  return;
                }
                localObject2.setImageResource(i.i.pQj);
                GMTrace.o(8322036006912L, 62004);
                return;
              }
              SnsCommentDetailUI.this.qHp.setEnabled(true);
              localObject2.setImageResource(i.e.pGQ);
              SnsCommentDetailUI.this.qHq.setEnabled(true);
              localObject4.setTextColor(SnsCommentDetailUI.this.getResources().getColor(i.c.white));
              localObject5.setTextColor(SnsCommentDetailUI.this.getResources().getColor(i.c.white));
              paramAnonymousView = com.tencent.mm.plugin.sns.storage.h.Hz(SnsCommentDetailUI.n(SnsCommentDetailUI.this));
              if (SnsCommentDetailUI.y(SnsCommentDetailUI.this) == 11)
              {
                localObject2.setImageResource(i.e.pGY);
                localObject3.setImageResource(i.e.pGZ);
                localObject4.setTextColor(SnsCommentDetailUI.this.getResources().getColor(i.c.pGn));
                localObject5.setTextColor(SnsCommentDetailUI.this.getResources().getColor(i.c.pGn));
              }
              while (paramAnonymousView.field_likeFlag == 0)
              {
                localObject4.setText(SnsCommentDetailUI.this.getString(i.j.pSY));
                GMTrace.o(8322036006912L, 62004);
                return;
                localObject2.setImageResource(i.e.pGQ);
                localObject4.setTextColor(SnsCommentDetailUI.this.getResources().getColor(i.c.white));
                localObject5.setTextColor(SnsCommentDetailUI.this.getResources().getColor(i.c.white));
              }
              localObject4.setText(SnsCommentDetailUI.this.getString(i.j.pSy));
              GMTrace.o(8322036006912L, 62004);
            }
          });
          GMTrace.o(8406593175552L, 62634);
          return true;
        }
        float f2 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(((com.tencent.mm.plugin.sns.storage.b)localObject4).qlY, 1, ((com.tencent.mm.plugin.sns.storage.b)localObject4).qma, ((com.tencent.mm.plugin.sns.storage.b)localObject4).qmb);
        float f1 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(((com.tencent.mm.plugin.sns.storage.b)localObject4).qlZ, 1, ((com.tencent.mm.plugin.sns.storage.b)localObject4).qma, ((com.tencent.mm.plugin.sns.storage.b)localObject4).qmb);
        if (((com.tencent.mm.plugin.sns.storage.b)localObject4).qlX == 0)
        {
          i = ((WindowManager)bUr().getSystemService("window")).getDefaultDisplay().getWidth();
          if (f2 < i - com.tencent.mm.bq.a.fromDPToPix(bUr(), 50) - com.tencent.mm.bq.a.fromDPToPix(bUr(), 12) - com.tencent.mm.bq.a.fromDPToPix(bUr(), 12)) {
            break label9536;
          }
          f2 = i - com.tencent.mm.bq.a.fromDPToPix(bUr(), 50) - com.tencent.mm.bq.a.fromDPToPix(bUr(), 12) - com.tencent.mm.bq.a.fromDPToPix(bUr(), 12);
          f1 = (int)(((com.tencent.mm.plugin.sns.storage.b)localObject4).qlZ * f2 / ((com.tencent.mm.plugin.sns.storage.b)localObject4).qlY);
        }
        for (;;)
        {
          localObject1 = new amp();
          ((amp)localObject1).uis = f2;
          ((amp)localObject1).uit = f1;
          ((amp)localObject1).uiu = (((amp)localObject1).uis * ((amp)localObject1).uit);
          ((LinkedList)localObject2).add(localObject1);
          break;
          if (((com.tencent.mm.plugin.sns.storage.b)localObject4).qlX == 1)
          {
            i = ((WindowManager)bUr().getSystemService("window")).getDefaultDisplay().getWidth() - com.tencent.mm.bq.a.fromDPToPix(bUr(), 50) - com.tencent.mm.bq.a.fromDPToPix(bUr(), 50) - com.tencent.mm.bq.a.fromDPToPix(bUr(), 12) - com.tencent.mm.bq.a.fromDPToPix(bUr(), 12);
            j = (int)(i * ((com.tencent.mm.plugin.sns.storage.b)localObject4).qlZ / ((com.tencent.mm.plugin.sns.storage.b)localObject4).qlY);
            localObject1 = new amp();
            if (i > 0) {
              f2 = i;
            }
            ((amp)localObject1).uis = f2;
            if (j > 0) {
              f1 = j;
            }
            ((amp)localObject1).uit = f1;
            ((amp)localObject1).uiu = (((amp)localObject1).uis * ((amp)localObject1).uit);
            ((LinkedList)localObject2).add(localObject1);
            break;
          }
          if (((com.tencent.mm.plugin.sns.storage.b)localObject4).qlX != 2) {
            break;
          }
          i = ((WindowManager)bUr().getSystemService("window")).getDefaultDisplay().getWidth() - com.tencent.mm.bq.a.fromDPToPix(bUr(), 50) - com.tencent.mm.bq.a.fromDPToPix(bUr(), 12) - com.tencent.mm.bq.a.fromDPToPix(bUr(), 12);
          j = (int)(i * ((com.tencent.mm.plugin.sns.storage.b)localObject4).qlZ / ((com.tencent.mm.plugin.sns.storage.b)localObject4).qlY);
          localObject1 = new amp();
          if (i > 0) {
            f2 = i;
          }
          ((amp)localObject1).uis = f2;
          if (j > 0) {
            f1 = j;
          }
          ((amp)localObject1).uit = f1;
          ((amp)localObject1).uiu = (((amp)localObject1).uis * ((amp)localObject1).uit);
          ((LinkedList)localObject2).add(localObject1);
          break;
          w.e("MicroMsg.SnsCommentDetailUI", "the imagesKeeper is null,when viewtype = " + this.kxh + ",stub is " + ((ViewStub)localObject1).toString());
          break label2418;
          if (this.kxh == 11)
          {
            this.qHZ.bmj();
            localObject1 = (TagImageView)this.qHZ.findViewById(i.f.pIF);
            this.qHZ.a((TagImageView)localObject1);
            ((TagImageView)localObject1).setOnClickListener(this.qHI.qBP);
            localObject2 = localm.bkg();
            localObject4 = new ArrayList();
            ((List)localObject4).add(localObject1);
            localObject7 = new ap();
            ((ap)localObject7).fAx = ((String)localObject2);
            ((ap)localObject7).index = 0;
            ((ap)localObject7).qJz = ((List)localObject4);
            ((ap)localObject7).qGP = true;
            if (localObject1 != null) {
              ((TagImageView)localObject1).setTag(localObject7);
            }
            localObject1 = (TextView)this.qHg.findViewById(i.f.pJW);
            if (!com.tencent.mm.x.m.zF().equals(((bhc)localObject5).jWW))
            {
              localObject2 = ai.n(localm);
              if ((((bdk)localObject2).uvw != null) && (((bdk)localObject2).uvw.uvY != 0))
              {
                ((TextView)localObject1).setText(getString(i.j.pRd, new Object[] { Integer.valueOf(((bdk)localObject2).uvw.uvY) }));
                ((TextView)localObject1).setVisibility(0);
              }
            }
            for (;;)
            {
              localObject1 = localm.bjY();
              if (localObject1 == null) {
                break label4638;
              }
              if (!com.tencent.mm.x.m.zF().equals(((bhc)localObject5).jWW)) {
                break label4470;
              }
              localObject1 = this.qHu;
              localObject2 = this.qHZ;
              localObject4 = localm.bkg();
              i = hashCode();
              j = this.kxh;
              localm.uF(32);
              ((ar)localObject1).a((PhotosContent)localObject2, (bhc)localObject5, (String)localObject4, i, j, -1, false, an.vfa, true);
              break;
              ((TextView)localObject1).setVisibility(8);
              continue;
              ((TextView)localObject1).setVisibility(8);
            }
            if (com.tencent.mm.plugin.sns.lucky.a.m.h(localm))
            {
              localObject1 = this.qHu;
              localObject2 = this.qHZ;
              localObject4 = localm.bkg();
              i = hashCode();
              j = this.kxh;
              localm.uF(32);
              ((ar)localObject1).a((PhotosContent)localObject2, (bhc)localObject5, (String)localObject4, i, j, -1, false, an.vfa, false);
              break label2418;
            }
            if (((amo)localObject1).fQZ == 0)
            {
              localObject1 = this.qHu;
              localObject2 = this.qHZ;
              localObject4 = localm.bkg();
              i = hashCode();
              j = this.kxh;
              localm.uF(32);
              ((ar)localObject1).a((PhotosContent)localObject2, (bhc)localObject5, (String)localObject4, i, j, -1, false, an.vfa, true);
              break label2418;
            }
            w.e("MicroMsg.SnsCommentDetailUI", "mediaPostInfo.hbStatus is " + ((amo)localObject1).fQZ);
            break label2418;
            w.e("MicroMsg.SnsCommentDetailUI", "mediaPostInfo is null " + localm.bkg());
            break label2418;
          }
          Object localObject8;
          Object localObject9;
          if (this.kxh == 9)
          {
            localObject7 = new ak();
            localObject1 = this.qHg;
            localObject8 = ((View)localObject1).findViewById(i.f.bsQ);
            localObject9 = (com.tencent.mm.plugin.sight.decode.a.a)((View)localObject1).findViewById(i.f.image);
            ((ak)localObject7).qFo = ((View)localObject8);
            ((ak)localObject7).qrh = ((ImageView)((View)localObject1).findViewById(i.f.cyW));
            ((ak)localObject7).qFp = ((MMPinProgressBtn)((View)localObject1).findViewById(i.f.progress));
            ((ak)localObject7).qrk = ((TextView)((View)localObject1).findViewById(i.f.pJK));
            ((ak)localObject7).qFq = ((TextView)((View)localObject1).findViewById(i.f.pJJ));
            ((ak)localObject7).pDA = ((com.tencent.mm.plugin.sight.decode.a.a)localObject9);
            ((ak)localObject7).a((bhc)localObject5, 0, localm.bkg(), localm.bks());
            ((ak)localObject7).qrk.setVisibility(8);
            ((ak)localObject7).pDA.bn(localObject7);
            ((View)localObject8).setTag(localObject7);
            ((ak)localObject7).qFo.setOnClickListener(this.qHI.qVz);
            if (!localm.bin())
            {
              this.kwF.a((View)localObject8, this.qHI.qVs, this.qHI.qVc);
              localObject2 = com.tencent.mm.modelsns.e.a((bhc)localObject5, ((ak)localObject7).pDA.bey(), localm.bks());
              localObject1 = localObject2;
              if (localm.bks())
              {
                localObject4 = localm.bjH();
                if ((localObject4 == null) || (((com.tencent.mm.plugin.sns.storage.b)localObject4).qmi != 1)) {
                  break label5583;
                }
                if ((((bhc)localObject5).uyu == null) || (((bhc)localObject5).uyu.tKd.size() <= 0)) {
                  break label5577;
                }
                localObject4 = (amn)((bhc)localObject5).uyu.tKd.get(0);
                localObject1 = localObject2;
                if (localObject4 != null)
                {
                  i = ((WindowManager)bUr().getSystemService("window")).getDefaultDisplay().getWidth() - com.tencent.mm.bq.a.fromDPToPix(bUr(), 50) - com.tencent.mm.bq.a.fromDPToPix(bUr(), 12) - com.tencent.mm.bq.a.fromDPToPix(bUr(), 12) - com.tencent.mm.bq.a.fromDPToPix(bUr(), 20);
                  localObject1 = Pair.create(Integer.valueOf(i), Integer.valueOf((int)(i * ((amn)localObject4).uhD.uit / ((amn)localObject4).uhD.uis)));
                }
                localObject2 = (LinearLayout.LayoutParams)((ak)localObject7).qFo.getLayoutParams();
                ((LinearLayout.LayoutParams)localObject2).leftMargin = com.tencent.mm.bq.a.fromDPToPix(bUr(), 10);
                ((LinearLayout.LayoutParams)localObject2).rightMargin = com.tencent.mm.bq.a.fromDPToPix(bUr(), 10);
                ((ak)localObject7).qFo.setLayoutParams((ViewGroup.LayoutParams)localObject2);
                this.qHg.findViewById(i.f.pKa).setTag(localObject7);
                this.qHg.findViewById(i.f.pKa).setOnClickListener(this.qHI.qVH);
                this.qHg.findViewById(i.f.pJj).setTag(localObject7);
                this.qHg.findViewById(i.f.pJk).setTag(localObject7);
              }
            }
            do
            {
              do
              {
                do
                {
                  if (localObject1 != null)
                  {
                    ((com.tencent.mm.plugin.sight.decode.a.a)localObject9).cT(((Integer)((Pair)localObject1).first).intValue(), ((Integer)((Pair)localObject1).second).intValue());
                    localObject2 = ((ak)localObject7).qFq.getLayoutParams();
                    ((ViewGroup.LayoutParams)localObject2).width = ((Integer)((Pair)localObject1).first).intValue();
                    ((ViewGroup.LayoutParams)localObject2).height = ((Integer)((Pair)localObject1).second).intValue();
                    ((ak)localObject7).qFq.setLayoutParams((ViewGroup.LayoutParams)localObject2);
                  }
                  if ((((bhc)localObject5).uyu == null) || (((bhc)localObject5).uyu.tKd.size() <= 0)) {
                    break label5992;
                  }
                  localObject1 = (amn)((bhc)localObject5).uyu.tKd.get(0);
                  if (localm.bks())
                  {
                    ((ak)localObject7).pDA.a(new b.e()
                    {
                      public final void a(com.tencent.mm.plugin.sight.decode.a.b paramAnonymousb, int paramAnonymousInt)
                      {
                        GMTrace.i(8768175734784L, 65328);
                        if (paramAnonymousInt != -1)
                        {
                          if (SnsCommentDetailUI.A(SnsCommentDetailUI.this) == null)
                          {
                            GMTrace.o(8768175734784L, 65328);
                            return;
                          }
                          SnsCommentDetailUI.A(SnsCommentDetailUI.this).di(localm.field_snsId);
                        }
                        GMTrace.o(8768175734784L, 65328);
                      }
                    });
                    if (!this.qyU.dj(localm.field_snsId)) {
                      ((ak)localObject7).pDA.a(new b.f()
                      {
                        public final void a(com.tencent.mm.plugin.sight.decode.a.b paramAnonymousb, long paramAnonymousLong)
                        {
                          GMTrace.i(8703214354432L, 64844);
                          if (SnsCommentDetailUI.A(SnsCommentDetailUI.this) == null)
                          {
                            GMTrace.o(8703214354432L, 64844);
                            return;
                          }
                          int i = (int)paramAnonymousb.beI();
                          SnsCommentDetailUI.A(SnsCommentDetailUI.this).p(localm.field_snsId, com.tencent.mm.sdk.platformtools.bg.Pq());
                          SnsCommentDetailUI.A(SnsCommentDetailUI.this).u(localm.field_snsId, i);
                          if (paramAnonymousLong >= 3L)
                          {
                            SnsCommentDetailUI.A(SnsCommentDetailUI.this).o(localm.field_snsId, localm.field_snsId);
                            localObject7.pDA.a(null);
                          }
                          GMTrace.o(8703214354432L, 64844);
                        }
                      });
                    }
                  }
                  if ((((bhc)localObject5).uyu == null) || (((bhc)localObject5).uyu.tKd.size() <= 0)) {
                    break;
                  }
                  com.tencent.mm.plugin.sns.model.ae.bhm();
                  if (com.tencent.mm.plugin.sns.model.g.t((amn)localObject1)) {
                    break label6101;
                  }
                  if (!com.tencent.mm.plugin.sns.model.ae.bhm().w((amn)localObject1)) {
                    break label5998;
                  }
                  ((ak)localObject7).qrh.setVisibility(8);
                  ((ak)localObject7).qFp.setVisibility(0);
                  ((ak)localObject7).qFp.cgd();
                  ((com.tencent.mm.plugin.sight.decode.a.a)localObject9).bn(localObject7);
                  com.tencent.mm.plugin.sns.model.ae.bhm().a(localm, (amn)localObject1, (com.tencent.mm.plugin.sight.decode.a.a)localObject9, hashCode(), 0, an.vfa, localm.bks());
                  ((View)localObject8).setTag(localObject7);
                  if (this.qyU == null) {
                    break;
                  }
                  if (!localm.bks()) {
                    break label6387;
                  }
                  if (com.tencent.mm.plugin.sns.model.ae.bhm().l(localm) != 5) {
                    break label6381;
                  }
                  bool = true;
                  this.qyU.k(localm.field_snsId, bool);
                  break;
                  this.kwF.a((View)localObject8, this.qHI.qVt, this.qHI.qVc);
                  break label4886;
                  localObject4 = null;
                  break label4980;
                  localObject1 = localObject2;
                } while (localObject4 == null);
                localObject1 = localObject2;
              } while (((com.tencent.mm.plugin.sns.storage.b)localObject4).qlY <= 0.0F);
              localObject1 = localObject2;
            } while (((com.tencent.mm.plugin.sns.storage.b)localObject4).qlZ <= 0.0F);
            f2 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(((com.tencent.mm.plugin.sns.storage.b)localObject4).qlY, 1, ((com.tencent.mm.plugin.sns.storage.b)localObject4).qma, ((com.tencent.mm.plugin.sns.storage.b)localObject4).qmb);
            f1 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(((com.tencent.mm.plugin.sns.storage.b)localObject4).qlZ, 1, ((com.tencent.mm.plugin.sns.storage.b)localObject4).qma, ((com.tencent.mm.plugin.sns.storage.b)localObject4).qmb);
            if (((com.tencent.mm.plugin.sns.storage.b)localObject4).qlX == 0)
            {
              i = ((WindowManager)bUr().getSystemService("window")).getDefaultDisplay().getWidth();
              if (f2 < i - com.tencent.mm.bq.a.fromDPToPix(bUr(), 50) - com.tencent.mm.bq.a.fromDPToPix(bUr(), 12) - com.tencent.mm.bq.a.fromDPToPix(bUr(), 12)) {
                break label9533;
              }
              f2 = i - com.tencent.mm.bq.a.fromDPToPix(bUr(), 50) - com.tencent.mm.bq.a.fromDPToPix(bUr(), 12) - com.tencent.mm.bq.a.fromDPToPix(bUr(), 12);
              f1 = (int)(((com.tencent.mm.plugin.sns.storage.b)localObject4).qlZ * f2 / ((com.tencent.mm.plugin.sns.storage.b)localObject4).qlY);
            }
          }
          for (;;)
          {
            localObject1 = Pair.create(Integer.valueOf((int)f2), Integer.valueOf((int)f1));
            break label5200;
            if (((com.tencent.mm.plugin.sns.storage.b)localObject4).qlX == 1)
            {
              i = ((WindowManager)bUr().getSystemService("window")).getDefaultDisplay().getWidth() - com.tencent.mm.bq.a.fromDPToPix(bUr(), 50) - com.tencent.mm.bq.a.fromDPToPix(bUr(), 50) - com.tencent.mm.bq.a.fromDPToPix(bUr(), 12) - com.tencent.mm.bq.a.fromDPToPix(bUr(), 12);
              localObject1 = Pair.create(Integer.valueOf(i), Integer.valueOf((int)(i * ((com.tencent.mm.plugin.sns.storage.b)localObject4).qlZ / ((com.tencent.mm.plugin.sns.storage.b)localObject4).qlY)));
              break label5200;
            }
            localObject1 = localObject2;
            if (((com.tencent.mm.plugin.sns.storage.b)localObject4).qlX != 2) {
              break label5200;
            }
            i = ((WindowManager)bUr().getSystemService("window")).getDefaultDisplay().getWidth() - com.tencent.mm.bq.a.fromDPToPix(bUr(), 50) - com.tencent.mm.bq.a.fromDPToPix(bUr(), 12) - com.tencent.mm.bq.a.fromDPToPix(bUr(), 12);
            localObject1 = Pair.create(Integer.valueOf(i), Integer.valueOf((int)(i * ((com.tencent.mm.plugin.sns.storage.b)localObject4).qlZ / ((com.tencent.mm.plugin.sns.storage.b)localObject4).qlY)));
            break label5200;
            localObject1 = null;
            break label5325;
            if ((localm.bks()) && (com.tencent.mm.plugin.sns.model.ae.bhm().l(localm) == 5))
            {
              com.tencent.mm.plugin.sns.model.ae.bhm().z((amn)localObject1);
              ((ak)localObject7).qrh.setVisibility(8);
              ((ak)localObject7).qFp.setVisibility(0);
              ((ak)localObject7).qFp.cgd();
              break label5462;
            }
            com.tencent.mm.plugin.sns.model.ae.bhm().x((amn)localObject1);
            ((ak)localObject7).qrh.setVisibility(0);
            ((ak)localObject7).qFp.setVisibility(8);
            ((ak)localObject7).qrh.setImageDrawable(com.tencent.mm.bq.a.b(this, i.i.dqL));
            break label5462;
            if (com.tencent.mm.plugin.sns.model.ae.bhm().u((amn)localObject1))
            {
              ((ak)localObject7).qrh.setVisibility(0);
              ((ak)localObject7).qFp.setVisibility(8);
              ((ak)localObject7).qrh.setImageDrawable(com.tencent.mm.bq.a.b(this, i.i.dqL));
            }
            for (;;)
            {
              if (!((ak)localObject7).pDA.bez()) {
                break label6379;
              }
              w.d("MicroMsg.SnsCommentDetailUI", "play video error " + ((amn)localObject1).nas + " " + ((amn)localObject1).mDo + " " + ((amn)localObject1).uhA);
              com.tencent.mm.plugin.sns.model.ae.bhm().x((amn)localObject1);
              ((ak)localObject7).qrh.setVisibility(0);
              ((ak)localObject7).qFp.setVisibility(8);
              ((ak)localObject7).qrh.setImageDrawable(com.tencent.mm.bq.a.b(this, i.i.dqL));
              break;
              if (com.tencent.mm.plugin.sns.model.ae.bhm().v((amn)localObject1))
              {
                ((ak)localObject7).qrh.setVisibility(8);
                ((ak)localObject7).qFp.setVisibility(8);
              }
              else if ((localm.bks()) && (com.tencent.mm.plugin.sns.model.ae.bhm().l(localm) <= 5))
              {
                ((ak)localObject7).qrh.setVisibility(8);
                ((ak)localObject7).qFp.setVisibility(8);
              }
              else
              {
                com.tencent.mm.plugin.sns.model.ae.bhm().x((amn)localObject1);
                ((ak)localObject7).qrh.setVisibility(0);
                ((ak)localObject7).qFp.setVisibility(8);
                ((ak)localObject7).qrh.setImageDrawable(com.tencent.mm.bq.a.b(this, i.i.dqL));
              }
            }
            break label5462;
            bool = false;
            break label5534;
            if (com.tencent.mm.plugin.sns.model.ae.bhm().k(localm) == 5)
            {
              bool = true;
              break label5534;
            }
            bool = false;
            break label5534;
            if (this.kxh == 0)
            {
              localObject1 = (LinearLayout)this.qHg.findViewById(i.f.pMt);
              localObject2 = uU(i.g.pPa);
              if (!this.qHW)
              {
                ((LinearLayout)localObject1).removeView(this.qHZ);
                ((LinearLayout)localObject1).addView((View)localObject2, 3);
                if (((LinearLayout)localObject2).getLayoutParams() == null) {
                  break label6803;
                }
              }
              for (localObject1 = new LinearLayout.LayoutParams(((LinearLayout)localObject2).getLayoutParams());; localObject1 = new LinearLayout.LayoutParams(-1, -2))
              {
                ((LinearLayout.LayoutParams)localObject1).setMargins(((LinearLayout.LayoutParams)localObject1).leftMargin, com.tencent.mm.bq.a.fromDPToPix(this, 12), ((LinearLayout.LayoutParams)localObject1).rightMargin, ((LinearLayout.LayoutParams)localObject1).bottomMargin);
                ((LinearLayout)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
                if (((bhc)localObject5).uyu.tKd.isEmpty()) {
                  break label6818;
                }
                localObject4 = (amn)((bhc)localObject5).uyu.tKd.get(0);
                localObject1 = (MMImageView)((LinearLayout)localObject2).findViewById(i.f.pJY);
                com.tencent.mm.plugin.sns.model.ae.bhm().b((amn)localObject4, (View)localObject1, i.i.dkW, hashCode(), an.vfa);
                this.qHy = ((ImageView)((LinearLayout)localObject2).findViewById(i.f.state));
                this.qHy.setOnTouchListener(this.qBi);
                this.oev = ((bhc)localObject5).nas;
                bmH();
                bool = getIntent().getBooleanExtra("SNS_FROM_MUSIC_ITEM", false);
                ((MMImageView)localObject1).setTag(new r((bhc)localObject5, this.qHv, bool));
                ((MMImageView)localObject1).setOnClickListener(this.qHC.qSB);
                localObject7 = ((amn)localObject4).mCK;
                if (!com.tencent.mm.sdk.platformtools.bg.mZ((String)localObject7)) {
                  ((TextView)((LinearLayout)localObject2).findViewById(i.f.pKS)).setText((CharSequence)localObject7);
                }
                localObject4 = ((amn)localObject4).fuw;
                if (!com.tencent.mm.sdk.platformtools.bg.mZ((String)localObject4)) {
                  ((TextView)((LinearLayout)localObject2).findViewById(i.f.pNx)).setText(new SpannableString((CharSequence)localObject4), TextView.BufferType.SPANNABLE);
                }
                ((LinearLayout)localObject2).setTag(new r((bhc)localObject5, this.qHv));
                this.kwF.a((View)localObject2, this.qHI.qVr, this.qHI.qVc);
                ((LinearLayout)localObject2).setOnClickListener(this.qHC.qMO);
                com.tencent.mm.plugin.sns.data.i.b((View)localObject1, this);
                break;
              }
              ((LinearLayout)localObject2).setVisibility(8);
              break;
            }
            localObject1 = (LinearLayout)this.qHg.findViewById(i.f.pMt);
            localObject4 = uU(i.g.pOZ);
            localObject7 = (MMImageView)((LinearLayout)localObject4).findViewById(i.f.pJY);
            if (!this.qHW)
            {
              ((LinearLayout)localObject1).removeView(this.qHZ);
              ((LinearLayout)localObject1).addView((View)localObject4, 3);
              if (((LinearLayout)localObject4).getLayoutParams() != null)
              {
                localObject1 = new LinearLayout.LayoutParams(((LinearLayout)localObject4).getLayoutParams());
                ((LinearLayout.LayoutParams)localObject1).setMargins(((LinearLayout.LayoutParams)localObject1).leftMargin, com.tencent.mm.bq.a.fromDPToPix(this, 12), ((LinearLayout.LayoutParams)localObject1).rightMargin, ((LinearLayout.LayoutParams)localObject1).bottomMargin);
                ((LinearLayout)localObject4).setLayoutParams((ViewGroup.LayoutParams)localObject1);
              }
            }
            else
            {
              i = 0;
              if (!localm.bks()) {
                break label7328;
              }
              if (localm.bjH().qmi == 2)
              {
                i = 1;
                ((LinearLayout)localObject4).setTag(localm);
                ((LinearLayout)localObject4).setTag(i.f.pKs, localObject7);
                ((LinearLayout)localObject4).setOnClickListener(this.qHI.qVK);
              }
              j = 0;
            }
            for (;;)
            {
              if (i != 0)
              {
                this.kwF.a((View)localObject4, this.qHI.qVu, this.qHI.qVc);
                if (!bmE()) {
                  break label7987;
                }
                localObject2 = av.Ix(((bhc)localObject5).uyu.mDo);
                localObject1 = ((bhc)localObject5).uyu.fuw;
                if (i == 0) {
                  break label9522;
                }
                localObject2 = ((bhc)localObject5).uyu.mCK;
              }
              for (;;)
              {
                ((LinearLayout)localObject4).findViewById(i.f.state).setVisibility(8);
                if (!((bhc)localObject5).uyu.tKd.isEmpty())
                {
                  ((MMImageView)localObject7).setVisibility(0);
                  localObject8 = (amn)((bhc)localObject5).uyu.tKd.get(0);
                  if (((bhc)localObject5).uyu.tKc == 15)
                  {
                    ((ImageView)((LinearLayout)localObject4).findViewById(i.f.state)).setImageResource(i.e.baQ);
                    ((ImageView)((LinearLayout)localObject4).findViewById(i.f.state)).setVisibility(0);
                    com.tencent.mm.plugin.sns.model.ae.bhm().b((amn)localObject8, (View)localObject7, i.i.dlh, hashCode(), an.bQu().zO(((bhc)localObject5).orU));
                    com.tencent.mm.plugin.sns.data.i.b((View)localObject7, this);
                    if (((bhc)localObject5).uyu.tKc != 15) {
                      break label9519;
                    }
                    localObject2 = "";
                    localObject1 = getString(i.j.pSo);
                  }
                }
                for (;;)
                {
                  if (!com.tencent.mm.sdk.platformtools.bg.mZ((String)localObject2))
                  {
                    ((LinearLayout)localObject4).findViewById(i.f.pKS).setVisibility(0);
                    ((TextView)((LinearLayout)localObject4).findViewById(i.f.pKS)).setText((CharSequence)localObject2);
                  }
                  for (;;)
                  {
                    localObject2 = (TextView)((LinearLayout)localObject4).findViewById(i.f.pNx);
                    if (com.tencent.mm.sdk.platformtools.bg.mZ((String)localObject1)) {
                      break label8271;
                    }
                    ((TextView)localObject2).setVisibility(0);
                    if (j == 0) {
                      break label8261;
                    }
                    ((TextView)localObject2).setText(com.tencent.mm.plugin.sns.data.i.a((String)localObject1, bUr(), (TextView)localObject2));
                    break;
                    localObject1 = new LinearLayout.LayoutParams(-1, -2);
                    break label6911;
                    if (((bhc)localObject5).uyu.tKc == 9)
                    {
                      if (((bhc)localObject5).uyu.tKd.size() <= 0) {
                        break label9525;
                      }
                      ((LinearLayout)localObject4).setTag(new r((bhc)localObject5, this.qHv));
                      ((LinearLayout)localObject4).setOnClickListener(this.qHC.qSv);
                      j = 0;
                      i = 0;
                      break label7000;
                    }
                    if (((bhc)localObject5).uyu.tKc == 10)
                    {
                      if (((bhc)localObject5).uyu.tKd.size() <= 0) {
                        break label9525;
                      }
                      ((LinearLayout)localObject4).setTag(new r((bhc)localObject5, this.qHv));
                      ((LinearLayout)localObject4).setOnClickListener(this.qHC.qSx);
                      j = 0;
                      i = 0;
                      break label7000;
                    }
                    if (((bhc)localObject5).uyu.tKc == 17)
                    {
                      if (((bhc)localObject5).uyu.tKd.size() <= 0) {
                        break label9525;
                      }
                      ((LinearLayout)localObject4).setTag(new r((bhc)localObject5, this.qHv));
                      ((LinearLayout)localObject4).setOnClickListener(this.qHC.qSy);
                      j = 0;
                      i = 0;
                      break label7000;
                    }
                    if (((bhc)localObject5).uyu.tKc == 22)
                    {
                      if (((bhc)localObject5).uyu.tKd.size() <= 0) {
                        break label9525;
                      }
                      ((LinearLayout)localObject4).setTag(new r((bhc)localObject5, this.qHv));
                      ((LinearLayout)localObject4).setOnClickListener(this.qHC.qSz);
                      j = 0;
                      i = 0;
                      break label7000;
                    }
                    if (((bhc)localObject5).uyu.tKc == 23)
                    {
                      if (((bhc)localObject5).uyu.tKd.size() <= 0) {
                        break label9525;
                      }
                      ((LinearLayout)localObject4).setTag(new r((bhc)localObject5, this.qHv));
                      ((LinearLayout)localObject4).setOnClickListener(this.qHC.qSA);
                      j = 0;
                      i = 0;
                      break label7000;
                    }
                    if (((bhc)localObject5).uyu.tKc == 14)
                    {
                      if (((bhc)localObject5).uyu.tKd.size() <= 0) {
                        break label9525;
                      }
                      ((LinearLayout)localObject4).setTag(new r((bhc)localObject5, this.qHv));
                      ((LinearLayout)localObject4).setOnClickListener(this.qHC.qSw);
                      j = 0;
                      i = 0;
                      break label7000;
                    }
                    if (((bhc)localObject5).uyu.tKc == 12)
                    {
                      if (((bhc)localObject5).uyu.tKd.size() <= 0) {
                        break label9525;
                      }
                      ((LinearLayout)localObject4).setTag(new r((bhc)localObject5, this.qHv));
                      ((LinearLayout)localObject4).setOnClickListener(this.qHC.qSE);
                      j = 0;
                      i = 0;
                      break label7000;
                    }
                    if (((bhc)localObject5).uyu.tKc == 13)
                    {
                      if (((bhc)localObject5).uyu.tKd.size() <= 0) {
                        break label9525;
                      }
                      ((LinearLayout)localObject4).setTag(new r((bhc)localObject5, this.qHv));
                      ((LinearLayout)localObject4).setOnClickListener(this.qHC.qSF);
                      j = 0;
                      i = 0;
                      break label7000;
                    }
                    if (((bhc)localObject5).uyu.tKc == 15)
                    {
                      if (((bhc)localObject5).uyu.tKd.size() <= 0) {
                        break label9525;
                      }
                      ((LinearLayout)localObject4).setTag(new r((bhc)localObject5, this.qHv));
                      ((LinearLayout)localObject4).setOnClickListener(this.qHI.qVA);
                      j = 0;
                      i = 0;
                      break label7000;
                    }
                    ((LinearLayout)localObject4).setTag(new r((bhc)localObject5, this.qHv));
                    ((LinearLayout)localObject4).setOnClickListener(this.qHC.qMO);
                    if ((((bhc)localObject5).haU & 0x1) <= 0) {
                      break label9525;
                    }
                    j = 1;
                    i = 0;
                    break label7000;
                    this.kwF.a((View)localObject4, this.qHI.qVr, this.qHI.qVc);
                    break label7027;
                    localObject2 = "";
                    break label7046;
                    if (((bhc)localObject5).uyu.tKc == 5)
                    {
                      localObject2 = av.Ix(((amn)localObject8).mDo);
                      localObject1 = ((amn)localObject8).fuw;
                      ((LinearLayout)localObject4).findViewById(i.f.state).setVisibility(0);
                      com.tencent.mm.plugin.sns.model.ae.bhm().b((amn)localObject8, (View)localObject7, i.i.dlh, hashCode(), an.vfa);
                      break label7193;
                    }
                    if (((bhc)localObject5).uyu.tKc == 18)
                    {
                      ((LinearLayout)localObject4).findViewById(i.f.state).setVisibility(0);
                      ((ImageView)((LinearLayout)localObject4).findViewById(i.f.state)).setImageResource(i.e.bet);
                      ((MMImageView)localObject7).setVisibility(0);
                      com.tencent.mm.plugin.sns.model.ae.bhm().b((amn)localObject8, (View)localObject7, i.i.dlh, hashCode(), an.vfa);
                      break label7193;
                    }
                    com.tencent.mm.plugin.sns.model.ae.bhm().b((amn)localObject8, (View)localObject7, hashCode(), an.vfa);
                    break label7193;
                    if (((bhc)localObject5).uyu.tKc == 18)
                    {
                      ((ImageView)((LinearLayout)localObject4).findViewById(i.f.state)).setVisibility(0);
                      ((ImageView)((LinearLayout)localObject4).findViewById(i.f.state)).setImageResource(i.e.bet);
                      ((MMImageView)localObject7).setVisibility(0);
                      com.tencent.mm.plugin.sns.model.ae.bhm().b((View)localObject7, -1, i.i.dlh, hashCode());
                      break label7193;
                    }
                    ((MMImageView)localObject7).setVisibility(0);
                    com.tencent.mm.plugin.sns.model.ae.bhm().b((View)localObject7, -1, i.i.dlk, hashCode());
                    break label7193;
                    ((LinearLayout)localObject4).findViewById(i.f.pKS).setVisibility(8);
                  }
                  ((TextView)localObject2).setText((CharSequence)localObject1);
                  break;
                  ((TextView)localObject2).setVisibility(8);
                  break;
                  ((TextView)localObject4).setVisibility(0);
                  if (com.tencent.mm.sdk.platformtools.bg.mZ((String)localObject1)) {
                    break label2499;
                  }
                  ((TextView)localObject4).setTextColor(-11048043);
                  ((TextView)localObject4).setClickable(true);
                  ((TextView)localObject4).setText((CharSequence)localObject1);
                  break label2520;
                  ((TextView)localObject4).setVisibility(8);
                  break label2520;
                  if (((bhc)localObject5).uys == null)
                  {
                    localObject1 = null;
                    if (((bhc)localObject5).uys != null) {
                      break label8400;
                    }
                  }
                  for (localObject2 = null;; localObject2 = ((bhc)localObject5).uys.nmP)
                  {
                    ((TextView)localObject4).setTag(localm.bkg());
                    if ((!com.tencent.mm.sdk.platformtools.bg.mZ((String)localObject1)) || (!com.tencent.mm.sdk.platformtools.bg.mZ((String)localObject2))) {
                      break label8413;
                    }
                    ((TextView)localObject4).setVisibility(8);
                    break;
                    localObject1 = ((bhc)localObject5).uys.huL;
                    break label8340;
                  }
                  ((TextView)localObject4).setVisibility(0);
                  if (!com.tencent.mm.sdk.platformtools.bg.mZ((String)localObject2))
                  {
                    ((TextView)localObject4).setTextColor(-11048043);
                    ((TextView)localObject4).setClickable(true);
                    if ((localm.field_snsId == 0L) && (!com.tencent.mm.sdk.platformtools.bg.mZ((String)localObject1)))
                    {
                      ((TextView)localObject4).setText((String)localObject1 + "·" + (String)localObject2);
                      break label2520;
                    }
                    ((TextView)localObject4).setText((CharSequence)localObject2);
                    break label2520;
                  }
                  ((TextView)localObject4).setText((CharSequence)localObject1);
                  ((TextView)localObject4).setClickable(false);
                  ((TextView)localObject4).setTextColor(-9211021);
                  break label2520;
                  ((TextView)localObject4).setVisibility(8);
                  break label2714;
                  if (((com.tencent.mm.plugin.sns.storage.a)localObject6).qlj != com.tencent.mm.plugin.sns.storage.a.qkW) {
                    break label2714;
                  }
                  if (!com.tencent.mm.sdk.platformtools.bg.mZ(((com.tencent.mm.plugin.sns.storage.a)localObject6).qlk))
                  {
                    localObject1 = "";
                    localObject8 = ((com.tencent.mm.plugin.sns.storage.a)localObject6).qlm.iterator();
                    if (((Iterator)localObject8).hasNext())
                    {
                      localObject9 = (String)((Iterator)localObject8).next();
                      localObject2 = this.qHw.SK((String)localObject9);
                      if (localObject2 != null)
                      {
                        localObject2 = ((com.tencent.mm.l.a)localObject2).vq();
                        if (!com.tencent.mm.sdk.platformtools.bg.mZ((String)localObject2)) {
                          localObject2 = (String)localObject1 + (String)localObject2;
                        }
                      }
                      for (;;)
                      {
                        localObject1 = localObject2;
                        if (((com.tencent.mm.plugin.sns.storage.a)localObject6).qlm.getLast() == localObject9) {
                          break;
                        }
                        localObject1 = (String)localObject2 + ",";
                        break;
                        localObject2 = (String)localObject1 + (String)localObject9;
                        continue;
                        localObject2 = (String)localObject1 + (String)localObject9;
                      }
                    }
                    localObject2 = String.format(((com.tencent.mm.plugin.sns.storage.a)localObject6).qlk, new Object[] { localObject1 });
                    ((TextView)localObject4).getTextSize();
                    localObject8 = new com.tencent.mm.pluginsdk.ui.d.i(com.tencent.mm.pluginsdk.ui.d.h.d(this, (CharSequence)localObject2, 1));
                    ((com.tencent.mm.pluginsdk.ui.d.i)localObject8).f(null, (CharSequence)localObject2);
                    localObject2 = ((TextView)localObject4).getPaint();
                    if (com.tencent.mm.bq.a.X(this, (int)Layout.getDesiredWidth((CharSequence)localObject8, 0, ((com.tencent.mm.pluginsdk.ui.d.i)localObject8).length(), (TextPaint)localObject2)) > this.qHH)
                    {
                      if (((String)localObject1).length() <= 1) {
                        break label2714;
                      }
                      localObject1 = ((String)localObject1).substring(0, ((String)localObject1).length() - 2);
                      localObject8 = String.format(((com.tencent.mm.plugin.sns.storage.a)localObject6).qlk, new Object[] { (String)localObject1 + "..." });
                      ((TextView)localObject4).getTextSize();
                      localObject9 = new com.tencent.mm.pluginsdk.ui.d.i(com.tencent.mm.pluginsdk.ui.d.h.d(this, (CharSequence)localObject8, 1));
                      ((com.tencent.mm.pluginsdk.ui.d.i)localObject9).f(null, (CharSequence)localObject8);
                      i = com.tencent.mm.bq.a.X(this, (int)Layout.getDesiredWidth((CharSequence)localObject9, 0, ((com.tencent.mm.pluginsdk.ui.d.i)localObject9).length(), (TextPaint)localObject2));
                      ((TextView)localObject4).setText((CharSequence)localObject9, TextView.BufferType.SPANNABLE);
                      ((TextView)localObject4).setVisibility(0);
                      if (i > this.qHH) {
                        break label2713;
                      }
                      break label2714;
                    }
                    ((TextView)localObject4).setText((CharSequence)localObject8, TextView.BufferType.SPANNABLE);
                    ((TextView)localObject4).setVisibility(0);
                    break label2714;
                  }
                  ((TextView)localObject4).setVisibility(8);
                  break label2714;
                  ((TextView)localObject7).setVisibility(8);
                  break label2839;
                  ((TextView)localObject1).setVisibility(8);
                  break label3026;
                  ((TextView)localObject1).setVisibility(8);
                  break label3112;
                  if (((bdk)localObject4).uvo.size() <= 0) {
                    ((TextView)localObject3).setVisibility(8);
                  }
                  for (;;)
                  {
                    if ((localObject4 == null) || (this.gCs == null) || (!this.gCs.equals(((bdk)localObject4).twR)) || (((((bdk)localObject4).ujv != 3) || (((bdk)localObject4).uvt == null)) && ((((bdk)localObject4).ujv != 5) || (((bdk)localObject4).uij == null)))) {
                      break label9501;
                    }
                    this.qHg.findViewById(i.f.pIB).setVisibility(0);
                    this.qHg.findViewById(i.f.pIB).setTag(Integer.valueOf(localm.quQ));
                    this.qHg.findViewById(i.f.pIB).setOnClickListener(new View.OnClickListener()
                    {
                      public final void onClick(View paramAnonymousView)
                      {
                        GMTrace.i(8493968916480L, 63285);
                        try
                        {
                          int i = ((Integer)paramAnonymousView.getTag()).intValue();
                          paramAnonymousView = new Intent();
                          paramAnonymousView.putExtra("sns_label_sns_info", i);
                          com.tencent.mm.plugin.sns.c.a.ifM.x(paramAnonymousView, SnsCommentDetailUI.this);
                          GMTrace.o(8493968916480L, 63285);
                          return;
                        }
                        catch (Exception paramAnonymousView)
                        {
                          GMTrace.o(8493968916480L, 63285);
                        }
                      }
                    });
                    break;
                    if (this.gCs.equals(((bdk)localObject4).twR))
                    {
                      ((TextView)localObject3).setVisibility(0);
                      localObject5 = ((bdk)localObject4).uvo.iterator();
                      i = 0;
                      localObject1 = "";
                      if (((Iterator)localObject5).hasNext())
                      {
                        localObject6 = (bcz)((Iterator)localObject5).next();
                        if (i == 0)
                        {
                          i = 1;
                          localObject1 = (String)localObject1 + "  ";
                          if (((bcz)localObject6).ufQ == null) {
                            break label9319;
                          }
                          localObject2 = new StringBuilder().append((String)localObject1);
                          localObject1 = ((bcz)localObject6).ufQ;
                        }
                        for (;;)
                        {
                          localObject1 = (String)localObject1;
                          break;
                          localObject1 = (String)localObject1 + ",  ";
                          break label9249;
                          localObject7 = this.qHw.SL(((bcz)localObject6).twR);
                          localObject2 = new StringBuilder().append((String)localObject1);
                          if (localObject7 == null) {
                            localObject1 = ((bcz)localObject6).twR;
                          } else {
                            localObject1 = ((com.tencent.mm.l.a)localObject7).vq();
                          }
                        }
                      }
                      ((TextView)localObject3).setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, getString(i.j.pUb, new Object[] { localObject1 }), ((TextView)localObject3).getTextSize()));
                    }
                    else
                    {
                      ((TextView)localObject3).setVisibility(8);
                      localObject1 = ((bdk)localObject4).uvo.iterator();
                      if (((Iterator)localObject1).hasNext())
                      {
                        localObject2 = (bcz)((Iterator)localObject1).next();
                        if (!this.gCs.equals(((bcz)localObject2).twR)) {
                          break label9039;
                        }
                        ((TextView)localObject3).setVisibility(0);
                        localObject1 = getString(i.j.pUc);
                        ((TextView)localObject3).setVisibility(0);
                        ((TextView)localObject3).setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, (CharSequence)localObject1, ((TextView)localObject3).getTextSize()));
                      }
                    }
                  }
                  this.qHg.findViewById(i.f.pIB).setVisibility(8);
                  break label3146;
                }
              }
              j = 0;
              i = 0;
            }
          }
        }
      }
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8406056304640L, 62630);
    int i = i.g.pOI;
    GMTrace.o(8406056304640L, 62630);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(8407666917376L, 62642);
    w.i("MicroMsg.SnsCommentDetailUI", "onAcvityResult requestCode:" + paramInt1);
    if (paramInt1 == 15)
    {
      if ((this.qHI != null) && (this.qHI.qVc != null)) {
        this.qHI.qVc.onActivityResult(paramInt1, paramInt2, paramIntent);
      }
      GMTrace.o(8407666917376L, 62642);
      return;
    }
    if (paramInt1 == 16)
    {
      w.i("MicroMsg.SnsCommentDetailUI", "REQUEST_CODE_FOR_FULLSCREEN");
      paramIntent = new gf();
      paramIntent.fCr.scene = 1;
      com.tencent.mm.sdk.b.a.uLm.m(paramIntent);
      GMTrace.o(8407666917376L, 62642);
      return;
    }
    if (paramInt2 != -1)
    {
      GMTrace.o(8407666917376L, 62642);
      return;
    }
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(8407666917376L, 62642);
      return;
      if (paramInt2 == -1)
      {
        paramIntent = managedQuery(paramIntent.getData(), null, null, null, null);
        if (paramIntent.moveToFirst())
        {
          paramIntent = paramIntent.getString(paramIntent.getColumnIndexOrThrow("_id"));
          startActivity(new Intent("android.intent.action.EDIT", Uri.parse("content://com.android.contacts/contacts/" + paramIntent)));
        }
      }
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(8407130046464L, 62638);
    super.onConfigurationChanged(paramConfiguration);
    paramConfiguration = com.tencent.mm.plugin.sns.storage.h.Hz(this.fMT);
    bdk localbdk = ai.m(paramConfiguration);
    e(localbdk.uvi, localbdk.uvl.isEmpty());
    if (this.qHj != null) {
      this.qHj.a(paramConfiguration, this.qHI);
    }
    if (this.qHZ != null)
    {
      this.qHE = com.tencent.mm.plugin.sns.model.ae.bhw();
      this.qHZ.uR(this.qHE);
    }
    GMTrace.o(8407130046464L, 62638);
  }
  
  /* Error */
  public void onCreate(android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: ldc2_w 2847
    //   3: ldc_w 2849
    //   6: invokestatic 229	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: invokestatic 2854	com/tencent/mm/pluginsdk/e:g	(Lcom/tencent/mm/ui/MMActivity;)V
    //   13: aload_0
    //   14: aload_1
    //   15: invokespecial 2856	com/tencent/mm/ui/MMActivity:onCreate	(Landroid/os/Bundle;)V
    //   18: invokestatic 2860	com/tencent/mm/plugin/sns/model/ae:bhf	()Lcom/tencent/mm/plugin/sns/model/al$a;
    //   21: iconst_5
    //   22: ldc_w 2862
    //   25: aload_0
    //   26: invokevirtual 2865	com/tencent/mm/plugin/sns/model/al$a:a	(ILjava/lang/String;Lcom/tencent/mm/plugin/sns/b/h$a;)V
    //   29: aload_0
    //   30: aload_0
    //   31: ldc_w 2867
    //   34: invokevirtual 2868	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   37: checkcast 2870	android/text/ClipboardManager
    //   40: putfield 1158	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:lWu	Landroid/text/ClipboardManager;
    //   43: aload_0
    //   44: invokestatic 2876	java/lang/System:currentTimeMillis	()J
    //   47: putfield 243	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:qHe	J
    //   50: aload_0
    //   51: new 1570	com/tencent/mm/ui/tools/l
    //   54: dup
    //   55: aload_0
    //   56: invokespecial 2877	com/tencent/mm/ui/tools/l:<init>	(Landroid/content/Context;)V
    //   59: putfield 401	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:kwF	Lcom/tencent/mm/ui/tools/l;
    //   62: aload_0
    //   63: new 850	com/tencent/mm/plugin/sns/ui/bg
    //   66: dup
    //   67: aload_0
    //   68: new 38	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$2
    //   71: dup
    //   72: aload_0
    //   73: invokespecial 2878	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$2:<init>	(Lcom/tencent/mm/plugin/sns/ui/SnsCommentDetailUI;)V
    //   76: iconst_1
    //   77: aload_0
    //   78: getfield 288	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:qHM	Lcom/tencent/mm/plugin/sns/model/af;
    //   81: invokespecial 2881	com/tencent/mm/plugin/sns/ui/bg:<init>	(Landroid/content/Context;Lcom/tencent/mm/plugin/sns/ui/bg$a;ILcom/tencent/mm/plugin/sns/model/ad;)V
    //   84: putfield 1138	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:qHC	Lcom/tencent/mm/plugin/sns/ui/bg;
    //   87: aload_0
    //   88: new 62	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$3
    //   91: dup
    //   92: aload_0
    //   93: aload_0
    //   94: aload_0
    //   95: getfield 288	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:qHM	Lcom/tencent/mm/plugin/sns/model/af;
    //   98: invokespecial 2884	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$3:<init>	(Lcom/tencent/mm/plugin/sns/ui/SnsCommentDetailUI;Landroid/app/Activity;Lcom/tencent/mm/plugin/sns/model/ad;)V
    //   101: putfield 1269	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:qHI	Lcom/tencent/mm/plugin/sns/ui/b/b;
    //   104: aload_0
    //   105: getstatic 2887	com/tencent/mm/plugin/sns/i$f:pNv	I
    //   108: invokevirtual 1337	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:findViewById	(I)Landroid/view/View;
    //   111: checkcast 2889	android/widget/FrameLayout
    //   114: astore_1
    //   115: aload_0
    //   116: new 2891	com/tencent/mm/plugin/sns/f/b
    //   119: dup
    //   120: aload_0
    //   121: aload_0
    //   122: getfield 1269	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:qHI	Lcom/tencent/mm/plugin/sns/ui/b/b;
    //   125: aload_1
    //   126: invokespecial 2894	com/tencent/mm/plugin/sns/f/b:<init>	(Landroid/content/Context;Lcom/tencent/mm/plugin/sns/ui/b/b;Landroid/widget/FrameLayout;)V
    //   129: putfield 2896	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:qxW	Lcom/tencent/mm/plugin/sns/f/b;
    //   132: aload_0
    //   133: new 2898	com/tencent/mm/plugin/sns/ui/c
    //   136: dup
    //   137: aload_0
    //   138: aload_0
    //   139: getfield 1269	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:qHI	Lcom/tencent/mm/plugin/sns/ui/b/b;
    //   142: aload_1
    //   143: aload_0
    //   144: getfield 2896	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:qxW	Lcom/tencent/mm/plugin/sns/f/b;
    //   147: invokespecial 2901	com/tencent/mm/plugin/sns/ui/c:<init>	(Landroid/content/Context;Lcom/tencent/mm/plugin/sns/ui/b/b;Landroid/widget/FrameLayout;Lcom/tencent/mm/plugin/sns/f/b;)V
    //   150: putfield 1180	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:qxV	Lcom/tencent/mm/plugin/sns/ui/c;
    //   153: aload_0
    //   154: getfield 1269	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:qHI	Lcom/tencent/mm/plugin/sns/ui/b/b;
    //   157: invokevirtual 2904	com/tencent/mm/plugin/sns/ui/b/b:aIu	()V
    //   160: aload_0
    //   161: aload_0
    //   162: invokevirtual 1505	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:getIntent	()Landroid/content/Intent;
    //   165: ldc_w 2906
    //   168: invokevirtual 2909	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   171: ldc_w 267
    //   174: invokestatic 1750	com/tencent/mm/sdk/platformtools/bg:ap	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   177: putfield 685	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:fMT	Ljava/lang/String;
    //   180: aload_0
    //   181: getfield 685	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:fMT	Ljava/lang/String;
    //   184: invokestatic 734	com/tencent/mm/sdk/platformtools/bg:mZ	(Ljava/lang/String;)Z
    //   187: ifeq +24 -> 211
    //   190: aload_0
    //   191: ldc_w 2911
    //   194: aload_0
    //   195: invokevirtual 1505	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:getIntent	()Landroid/content/Intent;
    //   198: ldc_w 2906
    //   201: lconst_0
    //   202: invokevirtual 1519	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   205: invokestatic 2915	com/tencent/mm/plugin/sns/storage/u:V	(Ljava/lang/String;J)Ljava/lang/String;
    //   208: putfield 685	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:fMT	Ljava/lang/String;
    //   211: aload_0
    //   212: aload_0
    //   213: invokevirtual 1505	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:getIntent	()Landroid/content/Intent;
    //   216: ldc_w 2917
    //   219: invokevirtual 2909	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   222: ldc_w 267
    //   225: invokestatic 1750	com/tencent/mm/sdk/platformtools/bg:ap	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   228: putfield 628	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:qHv	Ljava/lang/String;
    //   231: aload_0
    //   232: getfield 628	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:qHv	Ljava/lang/String;
    //   235: invokestatic 734	com/tencent/mm/sdk/platformtools/bg:mZ	(Ljava/lang/String;)Z
    //   238: ifeq +32 -> 270
    //   241: aload_0
    //   242: invokevirtual 1505	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:getIntent	()Landroid/content/Intent;
    //   245: ldc_w 2917
    //   248: iconst_m1
    //   249: invokevirtual 2921	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   252: istore_2
    //   253: iload_2
    //   254: iconst_m1
    //   255: if_icmpeq +15 -> 270
    //   258: aload_0
    //   259: ldc_w 2911
    //   262: iload_2
    //   263: i2l
    //   264: invokestatic 2915	com/tencent/mm/plugin/sns/storage/u:V	(Ljava/lang/String;J)Ljava/lang/String;
    //   267: putfield 628	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:qHv	Ljava/lang/String;
    //   270: invokestatic 2876	java/lang/System:currentTimeMillis	()J
    //   273: lstore_3
    //   274: aload_0
    //   275: invokevirtual 1505	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:getIntent	()Landroid/content/Intent;
    //   278: ldc_w 2923
    //   281: invokevirtual 2927	android/content/Intent:getByteArrayExtra	(Ljava/lang/String;)[B
    //   284: astore_1
    //   285: aload_1
    //   286: ifnull +184 -> 470
    //   289: new 440	com/tencent/mm/protocal/c/bhc
    //   292: dup
    //   293: invokespecial 2928	com/tencent/mm/protocal/c/bhc:<init>	()V
    //   296: astore 6
    //   298: aload 6
    //   300: aload_1
    //   301: invokevirtual 2932	com/tencent/mm/protocal/c/bhc:aC	([B)Lcom/tencent/mm/bl/a;
    //   304: pop
    //   305: invokestatic 2936	com/tencent/mm/plugin/sns/model/ae:bhp	()Lcom/tencent/mm/plugin/sns/storage/n;
    //   308: new 2938	java/math/BigInteger
    //   311: dup
    //   312: aload 6
    //   314: getfield 2532	com/tencent/mm/protocal/c/bhc:nas	Ljava/lang/String;
    //   317: invokespecial 2939	java/math/BigInteger:<init>	(Ljava/lang/String;)V
    //   320: invokevirtual 2942	java/math/BigInteger:longValue	()J
    //   323: invokevirtual 2948	com/tencent/mm/plugin/sns/storage/n:dP	(J)Lcom/tencent/mm/plugin/sns/storage/m;
    //   326: ifnonnull +640 -> 966
    //   329: ldc_w 937
    //   332: ldc_w 2950
    //   335: invokestatic 1324	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   338: new 434	com/tencent/mm/plugin/sns/storage/m
    //   341: dup
    //   342: invokespecial 2951	com/tencent/mm/plugin/sns/storage/m:<init>	()V
    //   345: astore_1
    //   346: aload_1
    //   347: new 2938	java/math/BigInteger
    //   350: dup
    //   351: aload 6
    //   353: getfield 2532	com/tencent/mm/protocal/c/bhc:nas	Ljava/lang/String;
    //   356: invokespecial 2939	java/math/BigInteger:<init>	(Ljava/lang/String;)V
    //   359: invokevirtual 2942	java/math/BigInteger:longValue	()J
    //   362: putfield 1817	com/tencent/mm/plugin/sns/storage/m:field_snsId	J
    //   365: aload_1
    //   366: aload 6
    //   368: invokevirtual 2955	com/tencent/mm/protocal/c/bhc:toByteArray	()[B
    //   371: putfield 2959	com/tencent/mm/plugin/sns/storage/m:field_content	[B
    //   374: aload_1
    //   375: aload 6
    //   377: getfield 2606	com/tencent/mm/protocal/c/bhc:orU	I
    //   380: putfield 2962	com/tencent/mm/plugin/sns/storage/m:field_createTime	I
    //   383: aload_1
    //   384: aload 6
    //   386: getfield 2301	com/tencent/mm/protocal/c/bhc:jWW	Ljava/lang/String;
    //   389: putfield 1065	com/tencent/mm/plugin/sns/storage/m:field_userName	Ljava/lang/String;
    //   392: aload_1
    //   393: aload 6
    //   395: getfield 444	com/tencent/mm/protocal/c/bhc:uyu	Lcom/tencent/mm/protocal/c/nn;
    //   398: getfield 449	com/tencent/mm/protocal/c/nn:tKc	I
    //   401: putfield 2965	com/tencent/mm/plugin/sns/storage/m:field_type	I
    //   404: aload_1
    //   405: invokevirtual 2968	com/tencent/mm/plugin/sns/storage/m:bkd	()V
    //   408: new 642	com/tencent/mm/protocal/c/bdk
    //   411: dup
    //   412: invokespecial 2969	com/tencent/mm/protocal/c/bdk:<init>	()V
    //   415: astore 6
    //   417: aload 6
    //   419: new 2971	com/tencent/mm/protocal/c/axs
    //   422: dup
    //   423: invokespecial 2972	com/tencent/mm/protocal/c/axs:<init>	()V
    //   426: putfield 2976	com/tencent/mm/protocal/c/bdk:uve	Lcom/tencent/mm/protocal/c/axs;
    //   429: aload_1
    //   430: aload 6
    //   432: invokevirtual 2977	com/tencent/mm/protocal/c/bdk:toByteArray	()[B
    //   435: putfield 2980	com/tencent/mm/plugin/sns/storage/m:field_attrBuf	[B
    //   438: invokestatic 2936	com/tencent/mm/plugin/sns/model/ae:bhp	()Lcom/tencent/mm/plugin/sns/storage/n;
    //   441: aload_1
    //   442: invokevirtual 2983	com/tencent/mm/plugin/sns/storage/n:b	(Lcom/tencent/mm/sdk/e/c;)Z
    //   445: pop
    //   446: ldc_w 2985
    //   449: ldc_w 2987
    //   452: iconst_1
    //   453: anewarray 941	java/lang/Object
    //   456: dup
    //   457: iconst_0
    //   458: invokestatic 2876	java/lang/System:currentTimeMillis	()J
    //   461: lload_3
    //   462: lsub
    //   463: invokestatic 1822	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   466: aastore
    //   467: invokestatic 1735	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   470: aload_0
    //   471: iconst_1
    //   472: invokespecial 432	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:hZ	(Z)Lcom/tencent/mm/plugin/sns/storage/m;
    //   475: astore_1
    //   476: ldc_w 937
    //   479: new 602	java/lang/StringBuilder
    //   482: dup
    //   483: ldc_w 2989
    //   486: invokespecial 1313	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   489: aload_0
    //   490: getfield 685	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:fMT	Ljava/lang/String;
    //   493: invokevirtual 611	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   496: ldc_w 2991
    //   499: invokevirtual 611	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   502: aload_0
    //   503: getfield 628	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:qHv	Ljava/lang/String;
    //   506: invokevirtual 611	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   509: invokevirtual 615	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   512: invokestatic 1324	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   515: aload_1
    //   516: ifnull +29 -> 545
    //   519: ldc_w 937
    //   522: ldc_w 2993
    //   525: iconst_1
    //   526: anewarray 941	java/lang/Object
    //   529: dup
    //   530: iconst_0
    //   531: aload_1
    //   532: getfield 1065	com/tencent/mm/plugin/sns/storage/m:field_userName	Ljava/lang/String;
    //   535: ldc_w 267
    //   538: invokestatic 1750	com/tencent/mm/sdk/platformtools/bg:ap	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   541: aastore
    //   542: invokestatic 1735	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   545: aload_0
    //   546: getfield 685	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:fMT	Ljava/lang/String;
    //   549: invokestatic 691	com/tencent/mm/plugin/sns/storage/u:HW	(Ljava/lang/String;)Z
    //   552: ifeq +56 -> 608
    //   555: aload_0
    //   556: getfield 685	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:fMT	Ljava/lang/String;
    //   559: invokestatic 2996	com/tencent/mm/plugin/sns/storage/u:FN	(Ljava/lang/String;)Z
    //   562: ifeq +448 -> 1010
    //   565: aload_1
    //   566: ifnull +412 -> 978
    //   569: aload_1
    //   570: getfield 1065	com/tencent/mm/plugin/sns/storage/m:field_userName	Ljava/lang/String;
    //   573: invokestatic 3001	com/tencent/mm/x/o:fl	(Ljava/lang/String;)Z
    //   576: ifne +32 -> 608
    //   579: invokestatic 1712	com/tencent/mm/kernel/h:xA	()Lcom/tencent/mm/kernel/h;
    //   582: pop
    //   583: invokestatic 3005	com/tencent/mm/kernel/h:xy	()Lcom/tencent/mm/kernel/b;
    //   586: getfield 3011	com/tencent/mm/kernel/b:gQO	Lcom/tencent/mm/ac/n;
    //   589: new 3013	com/tencent/mm/plugin/sns/model/p
    //   592: dup
    //   593: aload_0
    //   594: getfield 685	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:fMT	Ljava/lang/String;
    //   597: invokestatic 3017	com/tencent/mm/plugin/sns/storage/u:HU	(Ljava/lang/String;)J
    //   600: invokespecial 3019	com/tencent/mm/plugin/sns/model/p:<init>	(J)V
    //   603: iconst_0
    //   604: invokevirtual 3024	com/tencent/mm/ac/n:a	(Lcom/tencent/mm/ac/k;I)Z
    //   607: pop
    //   608: invokestatic 1712	com/tencent/mm/kernel/h:xA	()Lcom/tencent/mm/kernel/h;
    //   611: pop
    //   612: invokestatic 3005	com/tencent/mm/kernel/h:xy	()Lcom/tencent/mm/kernel/b;
    //   615: getfield 3011	com/tencent/mm/kernel/b:gQO	Lcom/tencent/mm/ac/n;
    //   618: sipush 210
    //   621: aload_0
    //   622: invokevirtual 3027	com/tencent/mm/ac/n:a	(ILcom/tencent/mm/ac/e;)V
    //   625: invokestatic 1712	com/tencent/mm/kernel/h:xA	()Lcom/tencent/mm/kernel/h;
    //   628: pop
    //   629: invokestatic 3005	com/tencent/mm/kernel/h:xy	()Lcom/tencent/mm/kernel/b;
    //   632: getfield 3011	com/tencent/mm/kernel/b:gQO	Lcom/tencent/mm/ac/n;
    //   635: sipush 218
    //   638: aload_0
    //   639: invokevirtual 3027	com/tencent/mm/ac/n:a	(ILcom/tencent/mm/ac/e;)V
    //   642: invokestatic 1712	com/tencent/mm/kernel/h:xA	()Lcom/tencent/mm/kernel/h;
    //   645: pop
    //   646: invokestatic 3005	com/tencent/mm/kernel/h:xy	()Lcom/tencent/mm/kernel/b;
    //   649: getfield 3011	com/tencent/mm/kernel/b:gQO	Lcom/tencent/mm/ac/n;
    //   652: sipush 213
    //   655: aload_0
    //   656: invokevirtual 3027	com/tencent/mm/ac/n:a	(ILcom/tencent/mm/ac/e;)V
    //   659: invokestatic 1712	com/tencent/mm/kernel/h:xA	()Lcom/tencent/mm/kernel/h;
    //   662: pop
    //   663: invokestatic 3005	com/tencent/mm/kernel/h:xy	()Lcom/tencent/mm/kernel/b;
    //   666: getfield 3011	com/tencent/mm/kernel/b:gQO	Lcom/tencent/mm/ac/n;
    //   669: sipush 682
    //   672: aload_0
    //   673: invokevirtual 3027	com/tencent/mm/ac/n:a	(ILcom/tencent/mm/ac/e;)V
    //   676: invokestatic 1712	com/tencent/mm/kernel/h:xA	()Lcom/tencent/mm/kernel/h;
    //   679: pop
    //   680: invokestatic 3005	com/tencent/mm/kernel/h:xy	()Lcom/tencent/mm/kernel/b;
    //   683: getfield 3011	com/tencent/mm/kernel/b:gQO	Lcom/tencent/mm/ac/n;
    //   686: sipush 214
    //   689: aload_0
    //   690: invokevirtual 3027	com/tencent/mm/ac/n:a	(ILcom/tencent/mm/ac/e;)V
    //   693: invokestatic 1712	com/tencent/mm/kernel/h:xA	()Lcom/tencent/mm/kernel/h;
    //   696: pop
    //   697: invokestatic 3005	com/tencent/mm/kernel/h:xy	()Lcom/tencent/mm/kernel/b;
    //   700: getfield 3011	com/tencent/mm/kernel/b:gQO	Lcom/tencent/mm/ac/n;
    //   703: sipush 683
    //   706: aload_0
    //   707: invokevirtual 3027	com/tencent/mm/ac/n:a	(ILcom/tencent/mm/ac/e;)V
    //   710: aload_0
    //   711: invokestatic 3030	com/tencent/mm/plugin/sns/model/ae:bhd	()Lcom/tencent/mm/storage/ar;
    //   714: putfield 389	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:qHw	Lcom/tencent/mm/storage/ar;
    //   717: aload_0
    //   718: new 3032	com/tencent/mm/plugin/sns/ui/ao
    //   721: dup
    //   722: aload_0
    //   723: invokespecial 3035	com/tencent/mm/plugin/sns/ui/ao:<init>	(Landroid/app/Activity;)V
    //   726: putfield 1173	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:qxP	Lcom/tencent/mm/plugin/sns/ui/ao;
    //   729: aload_0
    //   730: new 460	com/tencent/mm/plugin/sns/ui/ar
    //   733: dup
    //   734: aload_0
    //   735: getfield 546	com/tencent/mm/ui/MMActivity:vov	Lcom/tencent/mm/ui/p;
    //   738: getfield 552	com/tencent/mm/ui/p:voR	Landroid/support/v7/app/ActionBarActivity;
    //   741: invokespecial 3036	com/tencent/mm/plugin/sns/ui/ar:<init>	(Landroid/content/Context;)V
    //   744: putfield 1280	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:qHu	Lcom/tencent/mm/plugin/sns/ui/ar;
    //   747: aload_0
    //   748: new 3038	com/tencent/mm/plugin/sns/ui/k
    //   751: dup
    //   752: aload_0
    //   753: iconst_1
    //   754: aload_0
    //   755: getfield 288	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:qHM	Lcom/tencent/mm/plugin/sns/model/af;
    //   758: invokespecial 3041	com/tencent/mm/plugin/sns/ui/k:<init>	(Landroid/app/Activity;ILcom/tencent/mm/plugin/sns/model/ad;)V
    //   761: putfield 395	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:qHz	Lcom/tencent/mm/plugin/sns/ui/k;
    //   764: aload_1
    //   765: ifnull +14 -> 779
    //   768: aload_0
    //   769: aload_1
    //   770: invokevirtual 438	com/tencent/mm/plugin/sns/storage/m:bjL	()Lcom/tencent/mm/protocal/c/bhc;
    //   773: invokestatic 1408	com/tencent/mm/plugin/sns/ui/av:d	(Lcom/tencent/mm/protocal/c/bhc;)I
    //   776: putfield 970	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:kxh	I
    //   779: aload_1
    //   780: ifnull +32 -> 812
    //   783: aload_1
    //   784: bipush 32
    //   786: invokevirtual 698	com/tencent/mm/plugin/sns/storage/m:uF	(I)Z
    //   789: ifeq +23 -> 812
    //   792: aload_0
    //   793: new 2432	com/tencent/mm/plugin/sns/a/b/g
    //   796: dup
    //   797: iconst_2
    //   798: invokespecial 3043	com/tencent/mm/plugin/sns/a/b/g:<init>	(I)V
    //   801: putfield 345	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:qyU	Lcom/tencent/mm/plugin/sns/a/b/g;
    //   804: aload_1
    //   805: invokevirtual 438	com/tencent/mm/plugin/sns/storage/m:bjL	()Lcom/tencent/mm/protocal/c/bhc;
    //   808: invokestatic 1408	com/tencent/mm/plugin/sns/ui/av:d	(Lcom/tencent/mm/protocal/c/bhc;)I
    //   811: pop
    //   812: aload_0
    //   813: invokevirtual 3045	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:MH	()V
    //   816: aload_1
    //   817: ifnull +57 -> 874
    //   820: aload_1
    //   821: bipush 32
    //   823: invokevirtual 698	com/tencent/mm/plugin/sns/storage/m:uF	(I)Z
    //   826: ifeq +48 -> 874
    //   829: aload_1
    //   830: invokestatic 706	com/tencent/mm/plugin/sns/model/ai:m	(Lcom/tencent/mm/plugin/sns/storage/m;)Lcom/tencent/mm/protocal/c/bdk;
    //   833: astore 6
    //   835: aload_0
    //   836: getfield 345	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:qyU	Lcom/tencent/mm/plugin/sns/a/b/g;
    //   839: iconst_0
    //   840: aload_1
    //   841: invokevirtual 747	com/tencent/mm/plugin/sns/storage/m:bkg	()Ljava/lang/String;
    //   844: aload_1
    //   845: invokevirtual 3048	com/tencent/mm/plugin/sns/storage/m:bkp	()Ljava/lang/String;
    //   848: aload_1
    //   849: invokevirtual 3051	com/tencent/mm/plugin/sns/storage/m:bkc	()Z
    //   852: aload_0
    //   853: getfield 365	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:qHg	Landroid/view/View;
    //   856: aload_1
    //   857: getfield 1817	com/tencent/mm/plugin/sns/storage/m:field_snsId	J
    //   860: aload_0
    //   861: getfield 338	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:qIc	Lcom/tencent/mm/plugin/sns/ui/bf;
    //   864: aload 6
    //   866: aload_0
    //   867: getfield 970	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:kxh	I
    //   870: iconst_2
    //   871: invokevirtual 3054	com/tencent/mm/plugin/sns/a/b/g:a	(ILjava/lang/String;Ljava/lang/String;ZLandroid/view/View;JLcom/tencent/mm/plugin/sns/ui/bf;Lcom/tencent/mm/protocal/c/bdk;II)V
    //   874: aload_0
    //   875: getfield 365	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:qHg	Landroid/view/View;
    //   878: ifnull +71 -> 949
    //   881: aload_0
    //   882: getfield 365	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:qHg	Landroid/view/View;
    //   885: getstatic 2340	com/tencent/mm/plugin/sns/i$f:image	I
    //   888: invokevirtual 1540	android/view/View:findViewById	(I)Landroid/view/View;
    //   891: checkcast 2342	com/tencent/mm/plugin/sight/decode/a/a
    //   894: astore 6
    //   896: aload_1
    //   897: invokevirtual 438	com/tencent/mm/plugin/sns/storage/m:bjL	()Lcom/tencent/mm/protocal/c/bhc;
    //   900: getfield 444	com/tencent/mm/protocal/c/bhc:uyu	Lcom/tencent/mm/protocal/c/nn;
    //   903: ifnull +260 -> 1163
    //   906: aload_1
    //   907: invokevirtual 438	com/tencent/mm/plugin/sns/storage/m:bjL	()Lcom/tencent/mm/protocal/c/bhc;
    //   910: getfield 444	com/tencent/mm/protocal/c/bhc:uyu	Lcom/tencent/mm/protocal/c/nn;
    //   913: getfield 449	com/tencent/mm/protocal/c/nn:tKc	I
    //   916: bipush 15
    //   918: if_icmpne +245 -> 1163
    //   921: aload 6
    //   923: instanceof 3056
    //   926: ifeq +237 -> 1163
    //   929: aload 6
    //   931: checkcast 3056	com/tencent/mm/plugin/sight/decode/ui/SightPlayImageView
    //   934: getfield 3060	com/tencent/mm/plugin/sight/decode/ui/SightPlayImageView:pCn	Lcom/tencent/mm/plugin/sight/decode/a/b;
    //   937: invokevirtual 3065	com/tencent/mm/plugin/sight/decode/a/b:beD	()Z
    //   940: istore 5
    //   942: aload_1
    //   943: iconst_1
    //   944: iload 5
    //   946: invokestatic 3070	com/tencent/mm/plugin/sns/a/b/j:a	(Lcom/tencent/mm/plugin/sns/storage/m;ZZ)V
    //   949: aload_0
    //   950: getfield 802	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:qHk	Landroid/widget/ListView;
    //   953: ifnonnull +90 -> 1043
    //   956: ldc2_w 2847
    //   959: ldc_w 2849
    //   962: invokestatic 234	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   965: return
    //   966: ldc_w 937
    //   969: ldc_w 3072
    //   972: invokestatic 1324	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   975: goto -505 -> 470
    //   978: invokestatic 1712	com/tencent/mm/kernel/h:xA	()Lcom/tencent/mm/kernel/h;
    //   981: pop
    //   982: invokestatic 3005	com/tencent/mm/kernel/h:xy	()Lcom/tencent/mm/kernel/b;
    //   985: getfield 3011	com/tencent/mm/kernel/b:gQO	Lcom/tencent/mm/ac/n;
    //   988: new 3013	com/tencent/mm/plugin/sns/model/p
    //   991: dup
    //   992: aload_0
    //   993: getfield 685	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:fMT	Ljava/lang/String;
    //   996: invokestatic 3017	com/tencent/mm/plugin/sns/storage/u:HU	(Ljava/lang/String;)J
    //   999: invokespecial 3019	com/tencent/mm/plugin/sns/model/p:<init>	(J)V
    //   1002: iconst_0
    //   1003: invokevirtual 3024	com/tencent/mm/ac/n:a	(Lcom/tencent/mm/ac/k;I)Z
    //   1006: pop
    //   1007: goto -399 -> 608
    //   1010: invokestatic 1712	com/tencent/mm/kernel/h:xA	()Lcom/tencent/mm/kernel/h;
    //   1013: pop
    //   1014: invokestatic 3005	com/tencent/mm/kernel/h:xy	()Lcom/tencent/mm/kernel/b;
    //   1017: getfield 3011	com/tencent/mm/kernel/b:gQO	Lcom/tencent/mm/ac/n;
    //   1020: new 3074	com/tencent/mm/plugin/sns/model/l
    //   1023: dup
    //   1024: aload_0
    //   1025: getfield 685	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:fMT	Ljava/lang/String;
    //   1028: invokestatic 3017	com/tencent/mm/plugin/sns/storage/u:HU	(Ljava/lang/String;)J
    //   1031: iconst_0
    //   1032: invokespecial 3076	com/tencent/mm/plugin/sns/model/l:<init>	(JI)V
    //   1035: iconst_0
    //   1036: invokevirtual 3024	com/tencent/mm/ac/n:a	(Lcom/tencent/mm/ac/k;I)Z
    //   1039: pop
    //   1040: goto -432 -> 608
    //   1043: aload_0
    //   1044: getfield 802	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:qHk	Landroid/widget/ListView;
    //   1047: new 84	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$4
    //   1050: dup
    //   1051: aload_0
    //   1052: invokespecial 3077	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$4:<init>	(Lcom/tencent/mm/plugin/sns/ui/SnsCommentDetailUI;)V
    //   1055: invokevirtual 3078	android/widget/ListView:setOnTouchListener	(Landroid/view/View$OnTouchListener;)V
    //   1058: getstatic 2793	com/tencent/mm/sdk/b/a:uLm	Lcom/tencent/mm/sdk/b/a;
    //   1061: aload_0
    //   1062: getfield 320	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:iSb	Lcom/tencent/mm/sdk/b/c;
    //   1065: invokevirtual 3081	com/tencent/mm/sdk/b/a:b	(Lcom/tencent/mm/sdk/b/c;)Z
    //   1068: pop
    //   1069: getstatic 2793	com/tencent/mm/sdk/b/a:uLm	Lcom/tencent/mm/sdk/b/a;
    //   1072: aload_0
    //   1073: getfield 293	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:qHN	Lcom/tencent/mm/sdk/b/c;
    //   1076: invokevirtual 3081	com/tencent/mm/sdk/b/a:b	(Lcom/tencent/mm/sdk/b/c;)Z
    //   1079: pop
    //   1080: getstatic 2793	com/tencent/mm/sdk/b/a:uLm	Lcom/tencent/mm/sdk/b/a;
    //   1083: aload_0
    //   1084: getfield 296	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:qHO	Lcom/tencent/mm/sdk/b/c;
    //   1087: invokevirtual 3081	com/tencent/mm/sdk/b/a:b	(Lcom/tencent/mm/sdk/b/c;)Z
    //   1090: pop
    //   1091: getstatic 2793	com/tencent/mm/sdk/b/a:uLm	Lcom/tencent/mm/sdk/b/a;
    //   1094: aload_0
    //   1095: getfield 299	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:qHP	Lcom/tencent/mm/sdk/b/c;
    //   1098: invokevirtual 3081	com/tencent/mm/sdk/b/a:b	(Lcom/tencent/mm/sdk/b/c;)Z
    //   1101: pop
    //   1102: getstatic 2793	com/tencent/mm/sdk/b/a:uLm	Lcom/tencent/mm/sdk/b/a;
    //   1105: aload_0
    //   1106: getfield 302	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:qHQ	Lcom/tencent/mm/sdk/b/c;
    //   1109: invokevirtual 3081	com/tencent/mm/sdk/b/a:b	(Lcom/tencent/mm/sdk/b/c;)Z
    //   1112: pop
    //   1113: getstatic 2793	com/tencent/mm/sdk/b/a:uLm	Lcom/tencent/mm/sdk/b/a;
    //   1116: aload_0
    //   1117: getfield 317	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:qHU	Lcom/tencent/mm/sdk/b/c;
    //   1120: invokevirtual 3081	com/tencent/mm/sdk/b/a:b	(Lcom/tencent/mm/sdk/b/c;)Z
    //   1123: pop
    //   1124: getstatic 2793	com/tencent/mm/sdk/b/a:uLm	Lcom/tencent/mm/sdk/b/a;
    //   1127: aload_0
    //   1128: getfield 323	com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI:qHV	Lcom/tencent/mm/sdk/b/c;
    //   1131: invokevirtual 3081	com/tencent/mm/sdk/b/a:b	(Lcom/tencent/mm/sdk/b/c;)Z
    //   1134: pop
    //   1135: aload_0
    //   1136: invokestatic 3083	com/tencent/mm/pluginsdk/e:h	(Lcom/tencent/mm/ui/MMActivity;)V
    //   1139: ldc2_w 2847
    //   1142: ldc_w 2849
    //   1145: invokestatic 234	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1148: return
    //   1149: astore_1
    //   1150: goto -680 -> 470
    //   1153: astore 6
    //   1155: goto -717 -> 438
    //   1158: astore 7
    //   1160: goto -786 -> 374
    //   1163: iconst_0
    //   1164: istore 5
    //   1166: goto -224 -> 942
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1169	0	this	SnsCommentDetailUI
    //   0	1169	1	paramBundle	android.os.Bundle
    //   252	11	2	i	int
    //   273	189	3	l	long
    //   940	225	5	bool	boolean
    //   296	634	6	localObject	Object
    //   1153	1	6	localIOException	java.io.IOException
    //   1158	1	7	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   298	305	1149	java/io/IOException
    //   429	438	1153	java/io/IOException
    //   365	374	1158	java/lang/Exception
  }
  
  public void onDestroy()
  {
    GMTrace.i(8405653651456L, 62627);
    com.tencent.mm.plugin.sns.model.ae.bhf().a(this, 5);
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xy().gQO.b(210, this);
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xy().gQO.b(218, this);
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xy().gQO.b(213, this);
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xy().gQO.b(214, this);
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xy().gQO.b(683, this);
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xy().gQO.b(682, this);
    com.tencent.mm.plugin.sns.model.ae.bhm().I(this);
    com.tencent.mm.sdk.b.a.uLm.c(this.iSb);
    if (this.qHz != null) {
      this.qHz.activity = null;
    }
    ab.blP();
    if (this.qxN != null) {
      this.qxN.aLQ();
    }
    com.tencent.mm.plugin.sns.storage.m localm = hZ(false);
    Object localObject;
    if ((this.qyU != null) && (localm != null) && (localm.uF(32)))
    {
      this.qyU.q(0, localm.bkg(), localm.bkp());
      localObject = localm.bjJ();
      if (localObject != null) {
        break label446;
      }
      localObject = "";
      if (!localm.bir()) {
        break label454;
      }
      com.tencent.mm.plugin.sns.model.ae.bhj().i(14652, new Object[] { f.a(localm.field_snsId, new Object[] { com.tencent.mm.plugin.sns.data.i.jdMethod_do(localm.field_snsId), localObject, Long.valueOf(this.qHe), Long.valueOf(System.currentTimeMillis()) }) });
    }
    for (;;)
    {
      com.tencent.mm.modelsns.b localb = com.tencent.mm.modelsns.b.gN(732);
      localb.lh(com.tencent.mm.plugin.sns.data.i.jdMethod_do(localm.field_snsId)).lh((String)localObject).lh(this.qHe).lh(System.currentTimeMillis());
      localb.LJ();
      this.qHI.aqA();
      com.tencent.mm.sdk.b.a.uLm.c(this.qHN);
      com.tencent.mm.sdk.b.a.uLm.c(this.qHO);
      com.tencent.mm.sdk.b.a.uLm.c(this.qHP);
      com.tencent.mm.sdk.b.a.uLm.c(this.qHQ);
      com.tencent.mm.sdk.b.a.uLm.c(this.qHU);
      com.tencent.mm.sdk.b.a.uLm.c(this.qHV);
      super.onDestroy();
      GMTrace.o(8405653651456L, 62627);
      return;
      label446:
      localObject = ((com.tencent.mm.plugin.sns.storage.a)localObject).qhb;
      break;
      label454:
      com.tencent.mm.plugin.sns.model.ae.bhj().i(12012, new Object[] { f.a(localm.field_snsId, new Object[] { com.tencent.mm.plugin.sns.data.i.jdMethod_do(localm.field_snsId), localObject, Long.valueOf(this.qHe), Long.valueOf(System.currentTimeMillis()) }) });
    }
  }
  
  public void onPause()
  {
    GMTrace.i(8405922086912L, 62629);
    com.tencent.mm.plugin.sns.model.ae.bhk().b(this);
    super.onPause();
    this.qxN.nEl.onPause();
    new rb().fPb.type = 1;
    if (this.qyU != null) {
      this.qyU.khj = com.tencent.mm.sdk.platformtools.bg.Pq();
    }
    GMTrace.o(8405922086912L, 62629);
  }
  
  public void onResume()
  {
    GMTrace.i(8405787869184L, 62628);
    com.tencent.mm.plugin.sns.model.ae.bhk().a(this);
    Object localObject;
    if (this.qxN != null)
    {
      localObject = this.qxN;
      if (u.HW(this.fMT)) {
        break label144;
      }
      if (((SnsCommentFooter)localObject).qIK != null) {
        ((SnsCommentFooter)localObject).qIK.setEnabled(false);
      }
      if (((SnsCommentFooter)localObject).qIJ != null) {
        ((SnsCommentFooter)localObject).qIJ.setEnabled(false);
      }
    }
    for (;;)
    {
      localObject = new rb();
      ((rb)localObject).fPb.fPc = 0;
      ((rb)localObject).fPb.fPd = 1;
      ((rb)localObject).fPb.fPe = 0;
      ((rb)localObject).fPb.type = 0;
      com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
      if (this.qyU != null) {
        this.qyU.onResume();
      }
      super.onResume();
      GMTrace.o(8405787869184L, 62628);
      return;
      label144:
      if (((SnsCommentFooter)localObject).qIK != null) {
        ((SnsCommentFooter)localObject).qIK.setEnabled(true);
      }
      if (((SnsCommentFooter)localObject).qIJ != null) {
        ((SnsCommentFooter)localObject).qIJ.setEnabled(true);
      }
    }
  }
  
  final class a
    extends com.tencent.mm.pluginsdk.ui.d.m
  {
    a()
    {
      GMTrace.i(8386460516352L, 62484);
      GMTrace.o(8386460516352L, 62484);
    }
    
    public final void onClick(View paramView)
    {
      GMTrace.i(8386594734080L, 62485);
      SnsCommentDetailUI.i(SnsCommentDetailUI.this).qSt.onClick(paramView);
      GMTrace.o(8386594734080L, 62485);
    }
    
    public final void updateDrawState(TextPaint paramTextPaint)
    {
      GMTrace.i(8386728951808L, 62486);
      int i = SnsCommentDetailUI.this.getResources().getColor(i.c.aQm);
      if (this.nSV)
      {
        paramTextPaint.bgColor = i;
        GMTrace.o(8386728951808L, 62486);
        return;
      }
      paramTextPaint.bgColor = 0;
      GMTrace.o(8386728951808L, 62486);
    }
  }
  
  final class b
    extends BaseAdapter
  {
    Activity activity;
    String fxL;
    public LinkedList<bcz> qIB;
    LinkedList<bcz> qIC;
    
    public b(LinkedList<bcz> paramLinkedList, Activity paramActivity, String paramString)
    {
      GMTrace.i(8628455079936L, 64287);
      this.qIB = paramLinkedList;
      this.qIC = paramActivity;
      this.activity = paramString;
      String str;
      this.fxL = str;
      GMTrace.o(8628455079936L, 64287);
    }
    
    public final int getCount()
    {
      int i = 0;
      GMTrace.i(8628589297664L, 64288);
      if (this.qIC.size() > 0)
      {
        if (this.qIB == null) {}
        for (;;)
        {
          GMTrace.o(8628589297664L, 64288);
          return i + 1;
          i = this.qIB.size();
        }
      }
      if (this.qIB == null)
      {
        GMTrace.o(8628589297664L, 64288);
        return 0;
      }
      i = this.qIB.size();
      GMTrace.o(8628589297664L, 64288);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(8628723515392L, 64289);
      GMTrace.o(8628723515392L, 64289);
      return null;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(8628857733120L, 64290);
      GMTrace.o(8628857733120L, 64290);
      return 0L;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(8628991950848L, 64291);
      int j = paramInt;
      if (this.qIC.size() > 0)
      {
        if (paramInt == 0)
        {
          paramView = SnsCommentDetailUI.E(SnsCommentDetailUI.this);
          GMTrace.o(8628991950848L, 64291);
          return paramView;
        }
        j = paramInt - 1;
      }
      bcz localbcz = (bcz)this.qIB.get(j);
      View localView;
      if ((paramView == null) || (!(paramView.getTag() instanceof a)))
      {
        localView = v.fa(this.activity).inflate(i.g.pOK, null);
        localView.setOnTouchListener(SnsCommentDetailUI.F(SnsCommentDetailUI.this));
        paramViewGroup = new a();
        paramViewGroup.iiL = ((ImageView)localView.findViewById(i.f.pIk));
        paramViewGroup.iiL.setOnClickListener(SnsCommentDetailUI.G(SnsCommentDetailUI.this));
        paramViewGroup.oAJ = ((TextView)localView.findViewById(i.f.pIt));
        paramViewGroup.oAJ.setOnTouchListener(new ab());
        paramViewGroup.oAJ.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(8371293913088L, 62371);
            w.i("MicroMsg.SnsCommentDetailUI", "onClick nickTv");
            GMTrace.o(8371293913088L, 62371);
          }
        });
        paramViewGroup.lvy = ((TextView)localView.findViewById(i.f.pIw));
        paramViewGroup.inT = ((TextView)localView.findViewById(i.f.pIn));
        paramViewGroup.qIE = ((SnsTranslateResultView)localView.findViewById(i.f.pNo));
        paramViewGroup.qIE.setVisibility(8);
        if (SnsCommentDetailUI.y(SnsCommentDetailUI.this) != 11) {
          break label1553;
        }
        localView.findViewById(i.f.pJq).setBackgroundResource(i.e.pGM);
      }
      label296:
      label311:
      label373:
      label432:
      label466:
      label557:
      label813:
      label890:
      label984:
      label1173:
      label1179:
      label1190:
      label1224:
      label1251:
      label1277:
      label1283:
      label1454:
      label1464:
      label1476:
      label1487:
      label1499:
      label1535:
      label1553:
      for (;;)
      {
        paramViewGroup.qIG = localbcz;
        paramViewGroup.userName = localbcz.twR;
        int k;
        int m;
        com.tencent.mm.plugin.sns.storage.m localm;
        Object localObject2;
        Object localObject1;
        Object localObject3;
        int i;
        if (SnsCommentDetailUI.y(SnsCommentDetailUI.this) == 11)
        {
          k = 3;
          if (SnsCommentDetailUI.y(SnsCommentDetailUI.this) != 11) {
            break label1173;
          }
          m = 3;
          com.tencent.mm.kernel.h.xA();
          paramView = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yL().SJ(paramViewGroup.userName);
          if ((j != 0) || (!this.qIC.isEmpty())) {
            break label1190;
          }
          if (SnsCommentDetailUI.y(SnsCommentDetailUI.this) != 11) {
            break label1179;
          }
          localView.setBackgroundResource(i.e.pGN);
          if (j != 0) {
            break label1224;
          }
          localView.findViewById(i.f.pLS).setVisibility(0);
          localView.findViewById(i.f.pLT).setVisibility(8);
          if (SnsCommentDetailUI.y(SnsCommentDetailUI.this) == 11) {
            ((ImageView)localView.findViewById(i.f.pLS)).setImageResource(i.i.pQq);
          }
          a.b.b(paramViewGroup.iiL, localbcz.twR, true);
          paramViewGroup.iiL.setTag(localbcz.twR);
          if (paramView == null) {
            break label1251;
          }
          paramView = paramView.vq();
          localm = com.tencent.mm.plugin.sns.storage.h.Hz(SnsCommentDetailUI.n(SnsCommentDetailUI.this));
          paramViewGroup.inT.setText(localbcz.ovi + " ");
          localObject2 = paramViewGroup.inT.getText().toString();
          if (localm == null) {
            break label1277;
          }
          com.tencent.mm.kernel.h.xA();
          localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yL().SJ(localm.field_userName);
          if (localbcz.uuJ != 1) {
            break label1283;
          }
          if (localObject1 == null) {
            break label1535;
          }
          localObject3 = ((x)localObject1).vq();
          paramInt = SnsCommentDetailUI.this.getString(i.j.pRJ).length();
          localObject1 = SnsCommentDetailUI.this.getString(i.j.pRJ) + (String)localObject3 + SnsCommentDetailUI.this.getString(i.j.pRH) + (String)localObject2;
          i = 0;
          localObject2 = localObject3;
          localObject3 = null;
        }
        for (;;)
        {
          paramViewGroup.oAJ.setText(paramView, TextView.BufferType.SPANNABLE);
          com.tencent.mm.pluginsdk.ui.d.h.d(paramViewGroup.oAJ, k);
          Object localObject4 = new com.tencent.mm.pluginsdk.ui.d.i(paramViewGroup.oAJ.getText());
          ((com.tencent.mm.pluginsdk.ui.d.i)localObject4).a(new com.tencent.mm.pluginsdk.ui.d.m(localbcz.twR, SnsCommentDetailUI.I(SnsCommentDetailUI.this), k), paramView, 0, 33);
          paramViewGroup.oAJ.setText((CharSequence)localObject4, TextView.BufferType.SPANNABLE);
          paramViewGroup.lvy.setText(az.l(this.activity, localbcz.orU * 1000L));
          localObject1 = new com.tencent.mm.pluginsdk.ui.d.i((String)localObject1);
          long l;
          if (localObject2 != null)
          {
            ((com.tencent.mm.pluginsdk.ui.d.i)localObject1).a(new com.tencent.mm.pluginsdk.ui.d.m(localm.field_userName, SnsCommentDetailUI.I(SnsCommentDetailUI.this), m), (CharSequence)localObject2, paramInt, 33);
            paramViewGroup.inT.setText((CharSequence)localObject1, TextView.BufferType.SPANNABLE);
            paramViewGroup.inT.setVisibility(0);
            com.tencent.mm.pluginsdk.ui.d.h.d(paramViewGroup.inT, 2);
            SnsCommentDetailUI.J(SnsCommentDetailUI.this).a(localView, SnsCommentDetailUI.x(SnsCommentDetailUI.this).qVp, SnsCommentDetailUI.x(SnsCommentDetailUI.this).qVc);
            if (localbcz.uuE == 0) {
              break label1454;
            }
            l = localbcz.uuE;
            localObject1 = com.tencent.mm.plugin.sns.model.ao.du(SnsCommentDetailUI.n(SnsCommentDetailUI.this), String.valueOf(l));
            if ((com.tencent.mm.plugin.sns.model.ao.bQ((String)localObject1, 4)) && (paramViewGroup.qIE != null))
            {
              localObject1 = com.tencent.mm.plugin.sns.model.ao.GJ((String)localObject1);
              if (localObject1 == null) {
                break label1487;
              }
              paramViewGroup.qIE.setVisibility(0);
              if (!((ao.b)localObject1).hie) {
                break label1476;
              }
              if (((ao.b)localObject1).hkX) {
                break label1464;
              }
              paramViewGroup.qIE.a((ao.b)localObject1, 2, ((ao.b)localObject1).result, ((ao.b)localObject1).hpO, ((ao.b)localObject1).qeS);
            }
            localView.setClickable(true);
            w.d("MicroMsg.SnsCommentDetailUI", "position " + localbcz.twR + " self " + SnsCommentDetailUI.K(SnsCommentDetailUI.this) + " commentid " + localbcz.uuE + " snsid " + SnsCommentDetailUI.n(SnsCommentDetailUI.this));
            if (!SnsCommentDetailUI.K(SnsCommentDetailUI.this).equals(localbcz.twR)) {
              break label1499;
            }
          }
          for (paramViewGroup.qIF = localbcz;; paramViewGroup.qIF = new Object[] { Integer.valueOf(j), localbcz, localbcz.twR, paramView })
          {
            paramView = new m(SnsCommentDetailUI.n(SnsCommentDetailUI.this), localbcz, localbcz.twR, localbcz.ovi, paramViewGroup.inT, 2);
            paramView.tag = paramViewGroup;
            localView.setTag(paramView);
            localView.setOnClickListener(SnsCommentDetailUI.L(SnsCommentDetailUI.this));
            GMTrace.o(8628991950848L, 64291);
            return localView;
            paramViewGroup = (a)paramView.getTag();
            localView = paramView;
            break;
            k = 2;
            break label296;
            m = 2;
            break label311;
            localView.setBackgroundResource(i.e.pHx);
            break label373;
            if (SnsCommentDetailUI.y(SnsCommentDetailUI.this) == 11)
            {
              localView.setBackgroundResource(i.e.pHz);
              break label373;
            }
            localView.setBackgroundResource(i.e.pHy);
            break label373;
            localView.findViewById(i.f.pLS).setVisibility(4);
            localView.findViewById(i.f.pLT).setVisibility(0);
            break label432;
            if (localbcz.ufQ != null)
            {
              paramView = localbcz.ufQ;
              break label466;
            }
            paramView = localbcz.twR;
            break label466;
            localObject1 = null;
            break label557;
            if (com.tencent.mm.sdk.platformtools.bg.mZ(localbcz.uuY)) {
              break label1535;
            }
            localObject1 = SnsCommentDetailUI.H(SnsCommentDetailUI.this).SL(localbcz.uuY);
            if (localObject1 == null) {}
            for (localObject1 = localbcz.uuY;; localObject1 = ((x)localObject1).vq())
            {
              i = SnsCommentDetailUI.this.getString(i.j.pTz).length();
              localObject4 = SnsCommentDetailUI.this.getString(i.j.pTz) + (String)localObject1 + SnsCommentDetailUI.this.getString(i.j.pRH) + (String)localObject2;
              paramInt = 0;
              localObject2 = null;
              localObject3 = localObject1;
              localObject1 = localObject4;
              break;
            }
            if (localObject3 == null) {
              break label813;
            }
            ((com.tencent.mm.pluginsdk.ui.d.i)localObject1).a(new com.tencent.mm.pluginsdk.ui.d.m(localbcz.uuY, SnsCommentDetailUI.I(SnsCommentDetailUI.this), m), (CharSequence)localObject3, i, 33);
            break label813;
            l = localbcz.uuH;
            break label890;
            paramViewGroup.qIE.setVisibility(8);
            break label984;
            paramViewGroup.qIE.vi(2);
            break label984;
            paramViewGroup.qIE.setVisibility(8);
            break label984;
          }
          localObject1 = localObject2;
          paramInt = 0;
          i = 0;
          localObject2 = null;
          localObject3 = null;
        }
      }
    }
    
    final class a
    {
      ImageView iiL;
      TextView inT;
      TextView lvy;
      TextView oAJ;
      SnsTranslateResultView qIE;
      Object qIF;
      bcz qIG;
      String userName;
      
      a()
      {
        GMTrace.i(8323512401920L, 62015);
        GMTrace.o(8323512401920L, 62015);
      }
    }
  }
  
  final class c
    implements Runnable
  {
    int CH;
    int kyV;
    private int offset;
    private int qIH;
    private int qII;
    
    c()
    {
      GMTrace.i(8600806227968L, 64081);
      this.qIH = -1;
      this.qII = 10;
      this.offset = 0;
      this.CH = -1;
      GMTrace.o(8600806227968L, 64081);
    }
    
    public final void run()
    {
      GMTrace.i(8600940445696L, 64082);
      this.qII = 10;
      SnsCommentDetailUI.a(SnsCommentDetailUI.this);
      this.qIH = SnsCommentDetailUI.b(SnsCommentDetailUI.this).getTop();
      int i = this.qIH - this.kyV;
      w.i("MicroMsg.SnsCommentDetailUI", "list.bottom: %d, listOriginalBottom: %d, footerTop: %d, commentFooter.getTop: %d, topSelection: %d", new Object[] { Integer.valueOf(SnsCommentDetailUI.c(SnsCommentDetailUI.this).getBottom()), Integer.valueOf(SnsCommentDetailUI.d(SnsCommentDetailUI.this)), Integer.valueOf(this.qIH), Integer.valueOf(SnsCommentDetailUI.b(SnsCommentDetailUI.this).getTop()), Integer.valueOf(i) });
      if (i == this.offset)
      {
        SnsCommentDetailUI.c(SnsCommentDetailUI.this).setSelectionFromTop(SnsCommentDetailUI.c(SnsCommentDetailUI.this).getHeaderViewsCount() + this.CH, i);
        this.qII = 0;
        this.offset = 0;
        GMTrace.o(8600940445696L, 64082);
        return;
      }
      int j = this.qII;
      this.qII = (j - 1);
      if (j > 0)
      {
        new com.tencent.mm.sdk.platformtools.ae().postDelayed(this, 100L);
        this.offset = i;
        GMTrace.o(8600940445696L, 64082);
        return;
      }
      this.offset = 0;
      this.qII = 0;
      GMTrace.o(8600940445696L, 64082);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */