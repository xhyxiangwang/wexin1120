package com.tencent.mm.plugin.sns.ui;

import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnDragListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.Exif.a;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.g.a.pt;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.plugin.report.service.f;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.storage.r;
import com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.tools.l;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.akv;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.KeyboardLinearLayout;
import com.tencent.mm.ui.KeyboardLinearLayout.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ab;
import com.tencent.mm.ui.j.a.a;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.ui.tools.a.c;
import com.tencent.mm.ui.tools.a.c.a;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.x.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@com.tencent.mm.ui.base.a(17)
public class En_c4f742e5
  extends MMActivity
  implements LocationWidget.a
{
  private String desc;
  private SnsAdClick fKQ;
  private boolean qAA;
  private boolean qAB;
  private String qAC;
  private FrameLayout qAD;
  private long qAE;
  private SnsEditText qAi;
  private LinearLayout qAj;
  private AtContactWidget qAk;
  private LocationWidget qAl;
  private RangeWidget qAm;
  private SnsUploadSayFooter qAn;
  private KeyboardLinearLayout qAo;
  private boolean qAp;
  private int qAq;
  private boolean qAr;
  private long qAs;
  private z qAt;
  private String qAu;
  private String qAv;
  private ArrayList<String> qAw;
  private int qAx;
  private int qAy;
  private boolean qAz;
  private SnsUploadConfigView qxE;
  
  public En_c4f742e5()
  {
    GMTrace.i(8754082873344L, 65223);
    this.qAp = false;
    this.qAq = 0;
    this.qAr = false;
    this.qAs = 0L;
    this.qAt = null;
    this.qAu = "";
    this.qAv = "";
    this.qAx = 0;
    this.qAy = 0;
    this.qAz = false;
    this.qAA = false;
    this.qAB = false;
    this.fKQ = null;
    this.qAC = null;
    this.qAD = null;
    this.qAE = 0L;
    GMTrace.o(8754082873344L, 65223);
  }
  
  public final void blx()
  {
    GMTrace.i(8754753961984L, 65228);
    if (this.qAt.blb())
    {
      kS(true);
      GMTrace.o(8754753961984L, 65228);
      return;
    }
    kS(false);
    GMTrace.o(8754753961984L, 65228);
  }
  
  public final ArrayList<Exif.a> bly()
  {
    GMTrace.i(8755559268352L, 65234);
    if ((this.qAt instanceof ah))
    {
      ah localah = (ah)this.qAt;
      Object localObject1 = localah.qDU.qEf;
      ArrayList localArrayList = new ArrayList();
      localObject1 = ((ArrayList)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (String)((Iterator)localObject1).next();
        localObject2 = (Exif.a)localah.qDW.get(localObject2);
        if (localObject2 != null) {
          localArrayList.add(localObject2);
        }
      }
      GMTrace.o(8755559268352L, 65234);
      return localArrayList;
    }
    GMTrace.o(8755559268352L, 65234);
    return null;
  }
  
  public final boolean blz()
  {
    GMTrace.i(8755693486080L, 65235);
    boolean bool = this.qAp;
    GMTrace.o(8755693486080L, 65235);
    return bool;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8755425050624L, 65233);
    int i = i.g.pPM;
    GMTrace.o(8755425050624L, 65233);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(8755290832896L, 65232);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (this.qAi != null) {
      this.qAi.clearFocus();
    }
    if (paramInt2 != -1)
    {
      GMTrace.o(8755290832896L, 65232);
      return;
    }
    if (this.qAt.a(paramInt1, paramIntent)) {
      blx();
    }
    switch (paramInt1)
    {
    case 7: 
    case 9: 
    default: 
    case 5: 
      do
      {
        GMTrace.o(8755290832896L, 65232);
        return;
        if (paramIntent == null)
        {
          GMTrace.o(8755290832896L, 65232);
          return;
        }
        this.qAm.a(paramInt1, paramInt2, paramIntent, this.qAk);
        paramInt2 = paramIntent.getIntExtra("Ktag_range_index", 0);
      } while (paramInt2 < 2);
      this.qAu = paramIntent.getStringExtra("Klabel_name_list");
      this.qAv = paramIntent.getStringExtra("Kother_user_name_list");
      if (bg.mZ(this.qAu)) {
        break;
      }
    }
    for (paramIntent = Arrays.asList(this.qAu.split(","));; paramIntent = null)
    {
      if (!bg.mZ(this.qAv)) {}
      for (Object localObject1 = Arrays.asList(this.qAv.split(","));; localObject1 = null)
      {
        this.qAw = new ArrayList();
        this.qAx = 0;
        HashSet localHashSet;
        label274:
        Object localObject2;
        if ((paramIntent != null) && (paramIntent.size() > 0))
        {
          Iterator localIterator = paramIntent.iterator();
          localHashSet = new HashSet();
          if (localIterator.hasNext())
          {
            localObject2 = (String)localIterator.next();
            localObject2 = com.tencent.mm.plugin.label.a.a.aIM().At(com.tencent.mm.plugin.label.a.a.aIM().Aq((String)localObject2));
            if ((localObject2 == null) || (((List)localObject2).size() == 0)) {
              w.e("MicroMsg.SnsUploadUI", "dz: getContactNamesFromLabelsAndOtherUserName,namelist get bu label is null");
            }
          }
          else
          {
            this.qAw = new ArrayList(localHashSet);
          }
        }
        else
        {
          if (paramIntent == null) {
            break label470;
          }
          paramIntent = paramIntent.iterator();
          paramInt1 = 0;
          label365:
          if (!paramIntent.hasNext()) {
            break label465;
          }
          if (bg.mZ((String)paramIntent.next())) {
            break label701;
          }
          paramInt1 += 1;
        }
        label465:
        label470:
        label701:
        for (;;)
        {
          break label365;
          localObject2 = ((List)localObject2).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            String str = (String)((Iterator)localObject2).next();
            localHashSet.add(str);
            this.qAx += 1;
            w.d("MicroMsg.SnsUploadUI", "dz:name : %s", new Object[] { str });
          }
          break label274;
          this.qAx = paramInt1;
          this.qAy = 0;
          if ((localObject1 != null) && (((List)localObject1).size() > 0))
          {
            paramIntent = ((List)localObject1).iterator();
            while (paramIntent.hasNext())
            {
              localObject1 = (String)paramIntent.next();
              if (!this.qAw.contains(localObject1))
              {
                this.qAw.add(localObject1);
                this.qAy += 1;
              }
            }
          }
          if (paramInt2 == 2)
          {
            this.qAz = false;
            GMTrace.o(8755290832896L, 65232);
            return;
          }
          this.qAz = true;
          GMTrace.o(8755290832896L, 65232);
          return;
          if (paramIntent == null)
          {
            GMTrace.o(8755290832896L, 65232);
            return;
          }
          this.qAk.T(paramIntent);
          GMTrace.o(8755290832896L, 65232);
          return;
          if (paramIntent == null)
          {
            GMTrace.o(8755290832896L, 65232);
            return;
          }
          boolean bool = paramIntent.getBooleanExtra("bind_facebook_succ", false);
          paramIntent = this.qxE;
          if (bool)
          {
            paramIntent.qRL = true;
            paramIntent.ic(true);
          }
          GMTrace.o(8755290832896L, 65232);
          return;
          if (paramIntent == null)
          {
            GMTrace.o(8755290832896L, 65232);
            return;
          }
          this.qAl.T(paramIntent);
          break;
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    boolean bool2 = true;
    GMTrace.i(8754485526528L, 65226);
    com.tencent.mm.pluginsdk.e.g(this);
    super.onCreate(paramBundle);
    rV("");
    getIntent().getExtras().setClassLoader(getClass().getClassLoader());
    this.qAr = getIntent().getBooleanExtra("KSnsPostManu", false);
    this.qAs = getIntent().getLongExtra("KTouchCameraTime", 0L);
    this.qAq = getIntent().getIntExtra("Ksnsupload_type", 0);
    this.fKQ = ((SnsAdClick)getIntent().getParcelableExtra("KsnsAdTag"));
    this.qAp = getIntent().getBooleanExtra("Kis_take_photo", false);
    this.qAA = getIntent().getBooleanExtra("need_result", false);
    this.qAB = getIntent().getBooleanExtra("K_go_to_SnsTimeLineUI", false);
    this.qAC = getIntent().getStringExtra("Ksnsupload_canvas_info");
    this.qAi = ((SnsEditText)findViewById(i.f.pMa));
    this.qAi.setTextSize(1, ab.dZ(this.vov.voR) * this.qAi.getTextSize() / com.tencent.mm.bq.a.getDensity(this.vov.voR));
    Object localObject2;
    if (!bg.mZ(getIntent().getStringExtra("Kdescription")))
    {
      this.qAi.setText(getIntent().getStringExtra("Kdescription"));
      if (this.qAq == 8)
      {
        localObject1 = getIntent().getStringExtra("Kdescription");
        this.qAi.setText((CharSequence)localObject1);
        this.qAi.setEnabled(false);
      }
      this.qAo = ((KeyboardLinearLayout)findViewById(i.f.cse));
      this.qAn = ((SnsUploadSayFooter)findViewById(i.f.csr));
      localObject1 = this.qAn;
      localObject2 = this.qAi;
      ((SnsUploadSayFooter)localObject1).qOh = ((MMEditText)localObject2);
      ((MMEditText)localObject2).setOnClickListener(new SnsUploadSayFooter.1((SnsUploadSayFooter)localObject1));
      ((MMEditText)localObject2).setOnEditorActionListener(new SnsUploadSayFooter.2((SnsUploadSayFooter)localObject1));
      this.qAn.setVisibility(8);
      this.qAD = ((FrameLayout)findViewById(i.f.pKT));
      this.qAD.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(20058571014144L, 149448);
          DisplayMetrics localDisplayMetrics = new DisplayMetrics();
          En_c4f742e5.this.getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
          com.tencent.mm.plugin.sns.model.ae.bhe();
          r.da(localDisplayMetrics.widthPixels, localDisplayMetrics.heightPixels);
          GMTrace.o(20058571014144L, 149448);
        }
      });
      this.qAi.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(20058839449600L, 149450);
          En_c4f742e5.i(En_c4f742e5.this);
          GMTrace.o(20058839449600L, 149450);
        }
      });
      this.qAi.setOnLongClickListener(new View.OnLongClickListener()
      {
        public final boolean onLongClick(View paramAnonymousView)
        {
          GMTrace.i(20059107885056L, 149452);
          En_c4f742e5.i(En_c4f742e5.this);
          GMTrace.o(20059107885056L, 149452);
          return false;
        }
      });
      localObject1 = (WrapScollview)findViewById(i.f.pLa);
      ((WrapScollview)localObject1).iiK = this.qAi;
      ((WrapScollview)localObject1).qTz = false;
      this.qxE = ((SnsUploadConfigView)findViewById(i.f.pJr));
      localObject1 = this.qxE;
      ((SnsUploadConfigView)localObject1).qRQ.tDN = -1000.0F;
      ((SnsUploadConfigView)localObject1).qRQ.tDM = -1000.0F;
      if (!((SnsUploadConfigView)localObject1).qNx)
      {
        com.tencent.mm.kernel.h.xA();
        i = bg.e((Integer)com.tencent.mm.kernel.h.xz().xi().get(68404, null));
        if ((i & 0x2) == 0) {
          break label1231;
        }
        bool1 = true;
        label540:
        ((SnsUploadConfigView)localObject1).qRL = bool1;
        if ((i & 0x8) == 0) {
          break label1236;
        }
        bool1 = true;
        label555:
        ((SnsUploadConfigView)localObject1).qRM = bool1;
        if (!com.tencent.mm.ao.b.Jt()) {
          ((SnsUploadConfigView)localObject1).qRM = false;
        }
        if (!m.Ae()) {
          ((SnsUploadConfigView)localObject1).qRL = false;
        }
      }
      ((SnsUploadConfigView)localObject1).ic(false);
      ((SnsUploadConfigView)localObject1).bnP();
      ((SnsUploadConfigView)localObject1).bnQ();
      if (((SnsUploadConfigView)localObject1).qRM) {
        ((SnsUploadConfigView)localObject1).qRR.a((a.a)localObject1);
      }
      if (this.qAq != 0)
      {
        localObject1 = this.qxE;
        ((SnsUploadConfigView)localObject1).qRH.setVisibility(8);
        ((SnsUploadConfigView)localObject1).qRI.setVisibility(8);
        ((SnsUploadConfigView)localObject1).qRJ.setVisibility(8);
      }
      if (this.qAq == 9) {
        this.qxE.qRJ.setVisibility(0);
      }
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(15965869834240L, 118955);
          if (En_c4f742e5.j(En_c4f742e5.this) == 9)
          {
            En_c4f742e5.this.setResult(0, new Intent());
            En_c4f742e5.this.finish();
          }
          for (;;)
          {
            GMTrace.o(15965869834240L, 118955);
            return true;
            com.tencent.mm.ui.base.h.a(En_c4f742e5.this, i.j.pUj, 0, i.j.dur, i.j.duP, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(20061926457344L, 149473);
                if (En_c4f742e5.h(En_c4f742e5.this) != null) {
                  En_c4f742e5.h(En_c4f742e5.this).gL(10);
                }
                En_c4f742e5.this.setResult(0, new Intent());
                En_c4f742e5.this.finish();
                GMTrace.o(20061926457344L, 149473);
              }
            }, null, i.c.aNn);
          }
        }
      });
      a(0, getString(i.j.dwY), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(20060986933248L, 149466);
          if (En_c4f742e5.this.isFinishing())
          {
            GMTrace.o(20060986933248L, 149466);
            return false;
          }
          if (System.currentTimeMillis() - En_c4f742e5.k(En_c4f742e5.this) < 500L)
          {
            GMTrace.o(20060986933248L, 149466);
            return false;
          }
          En_c4f742e5.a(En_c4f742e5.this, System.currentTimeMillis());
          f.ta(22);
          paramAnonymousMenuItem = c.d(En_c4f742e5.a(En_c4f742e5.this)).Dr(com.tencent.mm.k.b.ub());
          paramAnonymousMenuItem.wNo = true;
          paramAnonymousMenuItem.a(new c.a()
          {
            public final void abH()
            {
              GMTrace.i(20062329110528L, 149476);
              com.tencent.mm.ui.base.h.h(En_c4f742e5.this, i.j.pUl, i.j.pUm);
              GMTrace.o(20062329110528L, 149476);
            }
            
            public final void acg()
            {
              GMTrace.i(20062194892800L, 149475);
              GMTrace.o(20062194892800L, 149475);
            }
            
            public final void sy(String paramAnonymous2String)
            {
              GMTrace.i(20062060675072L, 149474);
              int i = En_c4f742e5.l(En_c4f742e5.this).bnS();
              com.tencent.mm.kernel.h.xA();
              com.tencent.mm.kernel.h.xz().xi().set(68404, Integer.valueOf(i));
              En_c4f742e5.a(En_c4f742e5.this, En_c4f742e5.a(En_c4f742e5.this).getText().toString());
              i = En_c4f742e5.a(En_c4f742e5.this).qJf;
              int j = En_c4f742e5.l(En_c4f742e5.this).bnR();
              int k = En_c4f742e5.l(En_c4f742e5.this).bnS();
              En_c4f742e5.m(En_c4f742e5.this);
              if (En_c4f742e5.n(En_c4f742e5.this)) {
                En_c4f742e5.this.setResult(-1, new Intent());
              }
              if ((En_c4f742e5.f(En_c4f742e5.this) instanceof ah))
              {
                paramAnonymous2String = (ah)En_c4f742e5.f(En_c4f742e5.this);
                localObject = En_c4f742e5.o(En_c4f742e5.this);
                akv localakv = new akv();
                localakv.tDN = ((LocationWidget)localObject).qCy;
                localakv.tDM = ((LocationWidget)localObject).oiQ;
                localakv.aFP = ((LocationWidget)localObject).aFP;
                localakv.qCz = ((LocationWidget)localObject).qCz;
                paramAnonymous2String.qEa = localakv;
              }
              if ((En_c4f742e5.f(En_c4f742e5.this) instanceof ae)) {
                En_c4f742e5.a(En_c4f742e5.this).setText("");
              }
              paramAnonymous2String = new PInt();
              En_c4f742e5.f(En_c4f742e5.this).a(j, k, En_c4f742e5.l(En_c4f742e5.this).qRR.wPt, En_c4f742e5.p(En_c4f742e5.this), En_c4f742e5.q(En_c4f742e5.this).bkP(), En_c4f742e5.o(En_c4f742e5.this).blN(), i, En_c4f742e5.r(En_c4f742e5.this), En_c4f742e5.s(En_c4f742e5.this), paramAnonymous2String, En_c4f742e5.t(En_c4f742e5.this), En_c4f742e5.u(En_c4f742e5.this), En_c4f742e5.v(En_c4f742e5.this));
              Object localObject = g.paX;
              long l1 = En_c4f742e5.w(En_c4f742e5.this);
              long l2 = bg.Po();
              if (En_c4f742e5.x(En_c4f742e5.this))
              {
                i = 0;
                ((g)localObject).i(13303, new Object[] { Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(paramAnonymous2String.value) });
                l1 = En_c4f742e5.w(En_c4f742e5.this);
                l2 = bg.Po();
                if (!En_c4f742e5.x(En_c4f742e5.this)) {
                  break label784;
                }
                i = 0;
                label526:
                w.d("MicroMsg.SnsUploadUI", "reprot timelinePostAction(13303), %d, %d, %d, %d", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(paramAnonymous2String.value) });
                g.paX.z(10910, "1");
                if (!bg.mZ(En_c4f742e5.y(En_c4f742e5.this)))
                {
                  if (!En_c4f742e5.r(En_c4f742e5.this)) {
                    break label789;
                  }
                  g.paX.i(11455, new Object[] { "", En_c4f742e5.y(En_c4f742e5.this), Integer.valueOf(-1), Integer.valueOf(-1) });
                }
              }
              for (;;)
              {
                if (En_c4f742e5.h(En_c4f742e5.this) != null) {
                  En_c4f742e5.h(En_c4f742e5.this).gL(9);
                }
                if (En_c4f742e5.z(En_c4f742e5.this))
                {
                  paramAnonymous2String = new Intent(En_c4f742e5.this, En_424b8e16.class);
                  paramAnonymous2String.putExtra("sns_resume_state", false);
                  paramAnonymous2String.putExtra("sns_timeline_NeedFirstLoadint", true);
                  paramAnonymous2String.addFlags(67108864);
                  En_c4f742e5.this.startActivity(paramAnonymous2String);
                }
                paramAnonymous2String = new pt();
                com.tencent.mm.sdk.b.a.uLm.m(paramAnonymous2String);
                GMTrace.o(20062060675072L, 149474);
                return;
                i = 1;
                break;
                label784:
                i = 1;
                break label526;
                label789:
                g.paX.i(11455, new Object[] { En_c4f742e5.y(En_c4f742e5.this), "", Integer.valueOf(-1), Integer.valueOf(-1) });
              }
            }
          });
          GMTrace.o(20060986933248L, 149466);
          return false;
        }
      }, p.b.vpB);
      findViewById(i.f.pND).setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(20058705231872L, 149449);
          w.d("MicroMsg.SnsUploadUI", "upload_content onTouch");
          if (En_c4f742e5.b(En_c4f742e5.this))
          {
            GMTrace.o(20058705231872L, 149449);
            return true;
          }
          GMTrace.o(20058705231872L, 149449);
          return false;
        }
      });
      this.qAk = ((AtContactWidget)findViewById(i.f.pJe));
      this.qAk.qxE = this.qxE;
      this.qAl = ((LocationWidget)findViewById(i.f.pKx));
      this.qAl.qCA = this;
      switch (this.qAq)
      {
      default: 
        label860:
        this.qAm.qxE = this.qxE;
        aKl();
        w.d("MicroMsg.SnsUploadUI", "share type %d, isManuSnsPost:%b", new Object[] { Integer.valueOf(this.qAq), Boolean.valueOf(this.qAr) });
        switch (this.qAq)
        {
        }
        break;
      }
    }
    for (;;)
    {
      this.qAt.D(paramBundle);
      if (!(this.qAt instanceof a)) {
        break label1758;
      }
      paramBundle = findViewById(i.f.pLZ);
      localObject2 = findViewById(i.f.pMg);
      localObject1 = (DynamicGridView)findViewById(i.f.pMU);
      ((DynamicGridView)localObject1).setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(20060718497792L, 149464);
          boolean bool = En_c4f742e5.b(En_c4f742e5.this);
          GMTrace.o(20060718497792L, 149464);
          return bool;
        }
      });
      paramBundle = ((a)this.qAt).a(paramBundle, findViewById(i.f.pJv), (DynamicGridView)localObject1, (View)localObject2);
      ((DynamicGridView)localObject1).setVisibility(0);
      localObject1 = (RelativeLayout.LayoutParams)this.qAl.getLayoutParams();
      ((RelativeLayout.LayoutParams)localObject1).addRule(3, i.f.pMU);
      this.qAl.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      label1105:
      if ((this.qAt instanceof aa))
      {
        localObject1 = (LinearLayout.LayoutParams)paramBundle.getLayoutParams();
        ((LinearLayout.LayoutParams)localObject1).width = -1;
        paramBundle.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      }
      blx();
      this.qAo.vmY = new KeyboardLinearLayout.a()
      {
        public final void ou(int paramAnonymousInt)
        {
          GMTrace.i(20061658021888L, 149471);
          if (paramAnonymousInt == -3)
          {
            w.d("MicroMsg.SnsUploadUI", "KEYBOARD_STATE_SHOW");
            new com.tencent.mm.sdk.platformtools.ae().postDelayed(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(20058973667328L, 149451);
                SnsUploadSayFooter localSnsUploadSayFooter = En_c4f742e5.c(En_c4f742e5.this);
                localSnsUploadSayFooter.setVisibility(0);
                if (localSnsUploadSayFooter.nEi != null) {
                  localSnsUploadSayFooter.nEi.setImageResource(i.e.pHG);
                }
                En_c4f742e5.c(En_c4f742e5.this).postInvalidate();
                En_c4f742e5.d(En_c4f742e5.this).postInvalidate();
                GMTrace.o(20058973667328L, 149451);
              }
            }, 100L);
            GMTrace.o(20061658021888L, 149471);
            return;
          }
          new com.tencent.mm.sdk.platformtools.ae().postDelayed(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(20055215570944L, 149423);
              SnsUploadSayFooter localSnsUploadSayFooter = En_c4f742e5.c(En_c4f742e5.this);
              if (!localSnsUploadSayFooter.bnT()) {
                localSnsUploadSayFooter.setVisibility(8);
              }
              En_c4f742e5.c(En_c4f742e5.this).postInvalidate();
              En_c4f742e5.e(En_c4f742e5.this).postInvalidate();
              GMTrace.o(20055215570944L, 149423);
            }
          }, 200L);
          w.d("MicroMsg.SnsUploadUI", "KEYBOARD_STATE_HIDE");
          GMTrace.o(20061658021888L, 149471);
        }
      };
      if (this.qAq == 0)
      {
        if ((this.qAt instanceof ah)) {
          break label1825;
        }
        w.e("MicroMsg.SnsUploadUI", "!(widget instanceof PicWidget)");
      }
      label1180:
      com.tencent.mm.pluginsdk.e.h(this);
      GMTrace.o(8754485526528L, 65226);
      return;
      if ((this.qAi == null) || (paramBundle == null)) {
        break;
      }
      localObject1 = paramBundle.getString("contentdesc");
      if (localObject1 == null) {
        break;
      }
      this.qAi.setText((CharSequence)localObject1);
      break;
      label1231:
      bool1 = false;
      break label540;
      label1236:
      bool1 = false;
      break label555;
      this.qAm = ((RangeWidget)findViewById(i.f.pKL));
      findViewById(i.f.pKM).setVisibility(8);
      break label860;
      this.qAm = ((RangeWidget)findViewById(i.f.pKL));
      findViewById(i.f.pKM).setVisibility(8);
      break label860;
      this.qAm = ((RangeWidget)findViewById(i.f.pKL));
      findViewById(i.f.pKM).setVisibility(8);
      this.qAk.setVisibility(8);
      break label860;
      this.qAt = new ah(this);
      this.qAi.addTextChangedListener(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          GMTrace.i(8319620087808L, 61986);
          GMTrace.o(8319620087808L, 61986);
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(8319351652352L, 61984);
          GMTrace.o(8319351652352L, 61984);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(8319485870080L, 61985);
          if (En_c4f742e5.a(En_c4f742e5.this).getText().toString().trim().length() > 10)
          {
            paramAnonymousCharSequence = En_c4f742e5.this.findViewById(i.f.pMg);
            if (paramAnonymousCharSequence != null) {
              paramAnonymousCharSequence.setVisibility(8);
            }
          }
          GMTrace.o(8319485870080L, 61985);
        }
      });
      continue;
      this.qAt = new ad(this);
      continue;
      this.qAt = new aa(this);
      this.qAm.qEM = true;
      continue;
      this.qAt = new ac(this);
      this.qAm.qEM = true;
      continue;
      this.qAt = new ai(this, 9);
      this.qAm.qEM = true;
      continue;
      this.qAt = new ai(this, 12);
      this.qAm.qEM = true;
      continue;
      this.qAt = new p(this);
      this.qAm.qEM = true;
      continue;
      this.qAt = new n(this);
      this.qAm.qEM = true;
      continue;
      this.qAt = new q(this);
      this.qAm.qEM = true;
      continue;
      this.qAt = new o(this);
      this.qAm.qEM = true;
      continue;
      this.qAt = new ai(this, 14);
      this.qAm.qEM = true;
      continue;
      this.qAt = new ai(this, 13);
      this.qAm.qEM = true;
    }
    com.tencent.mm.kernel.h.xA();
    Object localObject1 = bg.ap((String)com.tencent.mm.kernel.h.xz().xi().get(68408, ""), "");
    com.tencent.mm.kernel.h.xA();
    int i = bg.a((Integer)com.tencent.mm.kernel.h.xz().xi().get(7489, Integer.valueOf(0)), 0);
    if (!bg.mZ((String)localObject1)) {}
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.qAt = new ae(this, bool1);
      this.qAi.qJf = i;
      this.qAi.append((CharSequence)localObject1);
      this.qAi.addTextChangedListener(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          GMTrace.i(20059510538240L, 149455);
          GMTrace.o(20059510538240L, 149455);
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(20059242102784L, 149453);
          GMTrace.o(20059242102784L, 149453);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(20059376320512L, 149454);
          if (En_c4f742e5.a(En_c4f742e5.this).getText().toString().trim().length() > 0)
          {
            En_c4f742e5.this.kS(true);
            GMTrace.o(20059376320512L, 149454);
            return;
          }
          En_c4f742e5.this.kS(false);
          GMTrace.o(20059376320512L, 149454);
        }
      });
      break;
      this.qAt = new be(this);
      this.qAm.qEM = true;
      break;
      label1758:
      paramBundle = this.qAt.blc();
      this.qAj = ((LinearLayout)findViewById(i.f.pNL));
      this.qAj.setVisibility(0);
      this.qAj.setClipChildren(false);
      if (paramBundle != null)
      {
        this.qAj.addView(paramBundle);
        break label1105;
      }
      this.qAj.setVisibility(8);
      break label1105;
      label1825:
      if (Build.VERSION.SDK_INT < 11)
      {
        w.d("MicroMsg.SnsUploadUI", "sdk not support dragdrop event");
        break label1180;
      }
      new Runnable()
      {
        public final void run()
        {
          GMTrace.i(20063402852352L, 149484);
          View.OnDragListener local1 = new View.OnDragListener()
          {
            public final boolean onDrag(View paramAnonymous2View, DragEvent paramAnonymous2DragEvent)
            {
              GMTrace.i(20053604958208L, 149411);
              int i = paramAnonymous2DragEvent.getAction();
              boolean bool;
              switch (i)
              {
              default: 
                w.e("MicroMsg.SnsUploadUI", "Unknown action type received by OnDragListener.");
                bool = false;
              }
              for (;;)
              {
                GMTrace.o(20053604958208L, 149411);
                return bool;
                w.i("MicroMsg.SnsUploadUI", "ACTION: [%s]", new Object[] { Integer.valueOf(i) });
                bool = true;
                continue;
                w.i("MicroMsg.SnsUploadUI", "ACTION_DROP");
                paramAnonymous2View = paramAnonymous2DragEvent.getClipData();
                if (paramAnonymous2View != null)
                {
                  int j = paramAnonymous2View.getItemCount();
                  paramAnonymous2DragEvent = new ArrayList();
                  i = 0;
                  if (i < j)
                  {
                    Object localObject = paramAnonymous2View.getItemAt(i);
                    if (localObject == null) {
                      w.e("MicroMsg.SnsUploadUI", "item == null");
                    }
                    for (;;)
                    {
                      i += 1;
                      break;
                      if (((ClipData.Item)localObject).getIntent() != null)
                      {
                        En_c4f742e5.this.startActivity(((ClipData.Item)localObject).getIntent());
                      }
                      else if (((ClipData.Item)localObject).getUri() != null)
                      {
                        localObject = new l(En_c4f742e5.this.vov.voR, ((ClipData.Item)localObject).getUri());
                        if ((((l)localObject).fileType != 0) && (((l)localObject).filePath != null)) {}
                        switch (((l)localObject).fileType)
                        {
                        default: 
                          break;
                        case 3: 
                          paramAnonymous2DragEvent.add(((l)localObject).filePath);
                          continue;
                          w.e("MicroMsg.SnsUploadUI", "get file path failed");
                        }
                      }
                    }
                  }
                  if (paramAnonymous2DragEvent.size() < 0)
                  {
                    w.e("MicroMsg.SnsUploadUI", "no image file available");
                    GMTrace.o(20053604958208L, 149411);
                    return true;
                  }
                  ((ah)En_c4f742e5.f(En_c4f742e5.this)).c(paramAnonymous2DragEvent, 0, false);
                  bool = true;
                }
                else
                {
                  bool = true;
                }
              }
            }
          };
          if (En_c4f742e5.g(En_c4f742e5.this) != null) {
            En_c4f742e5.g(En_c4f742e5.this).setOnDragListener(local1);
          }
          GMTrace.o(20063402852352L, 149484);
        }
      }.run();
      break label1180;
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(8755156615168L, 65231);
    super.onDestroy();
    if (this.qAt != null) {
      this.qAt.bld();
    }
    if (this.qAl != null) {
      this.qAl.stop();
    }
    if (this.qAn != null)
    {
      SnsUploadSayFooter localSnsUploadSayFooter = this.qAn;
      if (localSnsUploadSayFooter.nEl != null)
      {
        localSnsUploadSayFooter.nEl.oM();
        localSnsUploadSayFooter.nEl.destroy();
      }
    }
    GMTrace.o(8755156615168L, 65231);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(8754619744256L, 65227);
    if (paramKeyEvent.getKeyCode() == 4)
    {
      paramKeyEvent = this.qAn;
      if ((paramKeyEvent.bnT()) || (paramKeyEvent.getVisibility() == 0)) {}
      for (paramInt = 1; paramInt != 0; paramInt = 0)
      {
        this.qAn.bnU();
        GMTrace.o(8754619744256L, 65227);
        return true;
      }
      if (this.qAq == 9)
      {
        setResult(0, new Intent());
        finish();
        GMTrace.o(8754619744256L, 65227);
        return true;
      }
      com.tencent.mm.ui.base.h.a(this, i.j.pUj, 0, i.j.dur, i.j.duP, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(20060315844608L, 149461);
          if (En_c4f742e5.h(En_c4f742e5.this) != null) {
            En_c4f742e5.h(En_c4f742e5.this).gL(10);
          }
          En_c4f742e5.this.setResult(0, new Intent());
          En_c4f742e5.this.finish();
          GMTrace.o(20060315844608L, 149461);
        }
      }, null, i.c.aNn);
      GMTrace.o(8754619744256L, 65227);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(8754619744256L, 65227);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(8754888179712L, 65229);
    if (this.qAq == 9)
    {
      String str = this.qAi.getText().toString().trim();
      com.tencent.mm.kernel.h.xA();
      com.tencent.mm.kernel.h.xz().xi().set(68408, str);
      if (bg.mZ(str)) {
        break label100;
      }
      com.tencent.mm.kernel.h.xA();
      com.tencent.mm.kernel.h.xz().xi().set(7489, Integer.valueOf(this.qAi.qJf));
    }
    for (;;)
    {
      super.aKl();
      super.onPause();
      GMTrace.o(8754888179712L, 65229);
      return;
      label100:
      com.tencent.mm.kernel.h.xA();
      com.tencent.mm.kernel.h.xz().xi().set(7489, Integer.valueOf(0));
    }
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(8755827703808L, 65236);
    w.i("MicroMsg.SnsUploadUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(8755827703808L, 65236);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        this.qAl.blJ();
        GMTrace.o(8755827703808L, 65236);
        return;
      }
      com.tencent.mm.ui.base.h.a(this, getString(i.j.etS), getString(i.j.etW), getString(i.j.ejv), getString(i.j.duP), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(15994458210304L, 119168);
          En_c4f742e5.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          paramAnonymousDialogInterface.dismiss();
          GMTrace.o(15994458210304L, 119168);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(20060584280064L, 149463);
          paramAnonymousDialogInterface.dismiss();
          GMTrace.o(20060584280064L, 149463);
        }
      });
    }
  }
  
  protected void onResume()
  {
    GMTrace.i(8755022397440L, 65230);
    super.onResume();
    this.qAn.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20060852715520L, 149465);
        j.g(En_c4f742e5.this);
        GMTrace.o(20060852715520L, 149465);
      }
    });
    if ((this.qAt != null) && ((this.qAt instanceof ad)))
    {
      ad localad = (ad)this.qAt;
      if ((localad.qCM != null) && (!bg.mZ(localad.fML))) {
        localad.qCM.an(localad.fML, false);
      }
    }
    GMTrace.o(8755022397440L, 65230);
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    GMTrace.i(8754217091072L, 65224);
    if (this.qAi != null) {
      paramBundle.putString("contentdesc", this.qAi.getText().toString());
    }
    paramBundle.getString("contentdesc");
    this.qAt.E(paramBundle);
    super.onSaveInstanceState(paramBundle);
    GMTrace.o(8754217091072L, 65224);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/En_c4f742e5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */