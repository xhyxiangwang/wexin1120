package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bi.d;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.compatible.util.Exif.a;
import com.tencent.mm.modelgeo.Addr;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.modelgeo.c;
import com.tencent.mm.modelstat.n;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.pluginsdk.h.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.akc;
import com.tencent.mm.protocal.c.akv;
import com.tencent.mm.protocal.c.axt;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LocationWidget
  extends LinearLayout
{
  float aFP;
  private int gbQ;
  private String gbX;
  private float hwV;
  private float hwW;
  private boolean hxf;
  private b.a nkp;
  private String nmP;
  private com.tencent.mm.modelgeo.b npK;
  private c oiK;
  float oiQ;
  private a.a ojd;
  private akc ojs;
  private Activity owr;
  a qCA;
  private boolean qCB;
  private b qCC;
  private View qCo;
  private View qCp;
  private int[] qCq;
  private ImageView[] qCr;
  private int qCs;
  private TextView qCt;
  private byte[] qCu;
  private String qCv;
  private String qCw;
  private int qCx;
  float qCy;
  int qCz;
  private ImageView qxB;
  private TextView qyz;
  private int score;
  
  public LocationWidget(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8679592034304L, 64668);
    this.qCq = new int[] { i.f.pKV, i.f.pKW, i.f.pKX, i.f.pKY, i.f.pKZ };
    this.qCr = new ImageView[5];
    this.hwV = -1000.0F;
    this.hwW = -1000.0F;
    this.qCx = 0;
    this.ojs = null;
    this.gbQ = 0;
    this.qCy = 0.0F;
    this.oiQ = 0.0F;
    this.aFP = 0.0F;
    this.qCz = -1;
    this.hxf = true;
    this.oiK = c.Io();
    this.qCA = null;
    this.qCB = false;
    this.nkp = new b.a()
    {
      public final void b(Addr paramAnonymousAddr)
      {
        GMTrace.i(17140946042880L, 127710);
        w.i("MicroMsg.LocationWidget", "get info %s", new Object[] { paramAnonymousAddr.toString() });
        if (!LocationWidget.e(LocationWidget.this))
        {
          GMTrace.o(17140946042880L, 127710);
          return;
        }
        LocationWidget.f(LocationWidget.this);
        if (!bg.mZ(LocationWidget.g(LocationWidget.this)))
        {
          GMTrace.o(17140946042880L, 127710);
          return;
        }
        LocationWidget.a(LocationWidget.this, paramAnonymousAddr.hwM);
        LocationWidget.f(LocationWidget.this);
        GMTrace.o(17140946042880L, 127710);
      }
    };
    this.ojd = new a.a()
    {
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        GMTrace.i(17148864888832L, 127769);
        if (!paramAnonymousBoolean)
        {
          GMTrace.o(17148864888832L, 127769);
          return true;
        }
        w.d("MicroMsg.LocationWidget", "get location %f %f", new Object[] { Float.valueOf(paramAnonymousFloat2), Float.valueOf(paramAnonymousFloat1) });
        com.tencent.mm.modelstat.e locale = com.tencent.mm.modelstat.e.Mc();
        if (paramAnonymousInt == 0)
        {
          paramAnonymousBoolean = false;
          if (LocationWidget.h(LocationWidget.this) != null) {
            break label122;
          }
        }
        label122:
        for (boolean bool = false;; bool = LocationWidget.h(LocationWidget.this).hxf)
        {
          locale.a(2003, paramAnonymousBoolean, bool, paramAnonymousFloat1, paramAnonymousFloat2, (int)paramAnonymousDouble2);
          n.a(2003, paramAnonymousFloat1, paramAnonymousFloat2, 0);
          if (LocationWidget.e(LocationWidget.this)) {
            break label137;
          }
          GMTrace.o(17148864888832L, 127769);
          return false;
          paramAnonymousBoolean = true;
          break;
        }
        label137:
        if ((LocationWidget.i(LocationWidget.this) == -1000.0F) || (LocationWidget.j(LocationWidget.this) == -1000.0F))
        {
          LocationWidget.a(LocationWidget.this, paramAnonymousFloat2);
          LocationWidget.b(LocationWidget.this, paramAnonymousFloat1);
        }
        GMTrace.o(17148864888832L, 127769);
        return false;
      }
    };
    this.qCC = null;
    f((MMActivity)paramContext);
    GMTrace.o(8679592034304L, 64668);
  }
  
  public LocationWidget(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8679457816576L, 64667);
    this.qCq = new int[] { i.f.pKV, i.f.pKW, i.f.pKX, i.f.pKY, i.f.pKZ };
    this.qCr = new ImageView[5];
    this.hwV = -1000.0F;
    this.hwW = -1000.0F;
    this.qCx = 0;
    this.ojs = null;
    this.gbQ = 0;
    this.qCy = 0.0F;
    this.oiQ = 0.0F;
    this.aFP = 0.0F;
    this.qCz = -1;
    this.hxf = true;
    this.oiK = c.Io();
    this.qCA = null;
    this.qCB = false;
    this.nkp = new b.a()
    {
      public final void b(Addr paramAnonymousAddr)
      {
        GMTrace.i(17140946042880L, 127710);
        w.i("MicroMsg.LocationWidget", "get info %s", new Object[] { paramAnonymousAddr.toString() });
        if (!LocationWidget.e(LocationWidget.this))
        {
          GMTrace.o(17140946042880L, 127710);
          return;
        }
        LocationWidget.f(LocationWidget.this);
        if (!bg.mZ(LocationWidget.g(LocationWidget.this)))
        {
          GMTrace.o(17140946042880L, 127710);
          return;
        }
        LocationWidget.a(LocationWidget.this, paramAnonymousAddr.hwM);
        LocationWidget.f(LocationWidget.this);
        GMTrace.o(17140946042880L, 127710);
      }
    };
    this.ojd = new a.a()
    {
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        GMTrace.i(17148864888832L, 127769);
        if (!paramAnonymousBoolean)
        {
          GMTrace.o(17148864888832L, 127769);
          return true;
        }
        w.d("MicroMsg.LocationWidget", "get location %f %f", new Object[] { Float.valueOf(paramAnonymousFloat2), Float.valueOf(paramAnonymousFloat1) });
        com.tencent.mm.modelstat.e locale = com.tencent.mm.modelstat.e.Mc();
        if (paramAnonymousInt == 0)
        {
          paramAnonymousBoolean = false;
          if (LocationWidget.h(LocationWidget.this) != null) {
            break label122;
          }
        }
        label122:
        for (boolean bool = false;; bool = LocationWidget.h(LocationWidget.this).hxf)
        {
          locale.a(2003, paramAnonymousBoolean, bool, paramAnonymousFloat1, paramAnonymousFloat2, (int)paramAnonymousDouble2);
          n.a(2003, paramAnonymousFloat1, paramAnonymousFloat2, 0);
          if (LocationWidget.e(LocationWidget.this)) {
            break label137;
          }
          GMTrace.o(17148864888832L, 127769);
          return false;
          paramAnonymousBoolean = true;
          break;
        }
        label137:
        if ((LocationWidget.i(LocationWidget.this) == -1000.0F) || (LocationWidget.j(LocationWidget.this) == -1000.0F))
        {
          LocationWidget.a(LocationWidget.this, paramAnonymousFloat2);
          LocationWidget.b(LocationWidget.this, paramAnonymousFloat1);
        }
        GMTrace.o(17148864888832L, 127769);
        return false;
      }
    };
    this.qCC = null;
    f((MMActivity)paramContext);
    GMTrace.o(8679457816576L, 64667);
  }
  
  private void Q(ArrayList<Exif.a> paramArrayList)
  {
    GMTrace.i(8679994687488L, 64671);
    if ((paramArrayList == null) || (paramArrayList.size() == 0))
    {
      GMTrace.o(8679994687488L, 64671);
      return;
    }
    com.tencent.mm.plugin.report.service.g.paX.z(11139, "1");
    Exif.a locala1;
    if ((Math.abs(-1000.0F - this.hwV) > 1.0E-6D) && (Math.abs(-1000.0F - this.hwW) > 1.0E-6D))
    {
      locala1 = (Exif.a)paramArrayList.get(paramArrayList.size() - 1);
      if (c(locala1.latitude, locala1.longitude, this.hwV, this.hwW)) {
        com.tencent.mm.plugin.report.service.g.paX.z(11139, "2");
      }
    }
    int i = 0;
    if (i < paramArrayList.size())
    {
      j = i + 1;
      label141:
      if (j >= paramArrayList.size()) {
        break label235;
      }
      locala1 = (Exif.a)paramArrayList.get(i);
      Exif.a locala2 = (Exif.a)paramArrayList.get(j);
      if (c(locala1.latitude, locala1.longitude, locala2.latitude, locala2.longitude)) {
        com.tencent.mm.plugin.report.service.g.paX.z(11139, "3");
      }
    }
    label235:
    for (int j = 0;; j = 1)
    {
      if (j != 0)
      {
        i += 1;
        break;
        j += 1;
        break label141;
      }
      GMTrace.o(8679994687488L, 64671);
      return;
    }
  }
  
  private void blI()
  {
    int i = 0;
    GMTrace.i(17133161414656L, 127652);
    w.i("MicroMsg.LocationWidget", "updateScoreItem scoreSwtich:%d, classifyId:%s, poiClassifyType:%d, showFlag:%d, isOverSea:%b", new Object[] { Integer.valueOf(this.qCs), this.qCw, Integer.valueOf(this.qCx), Integer.valueOf(this.gbQ), Boolean.valueOf(bg.bOb()) });
    if ((bg.bOb()) || (this.qCs == 0) || (bg.mZ(this.qCw)) || (this.qCx == 1) || ((this.gbQ & 0x1) == 0))
    {
      this.qCp.setVisibility(8);
      GMTrace.o(17133161414656L, 127652);
      return;
    }
    this.qCp.setVisibility(0);
    while (i < this.score)
    {
      this.qCr[i].setImageResource(i.i.pQO);
      i += 1;
    }
    i = this.score;
    while (i < 5)
    {
      this.qCr[i].setImageResource(i.i.pQN);
      i += 1;
    }
    GMTrace.o(17133161414656L, 127652);
  }
  
  private void blK()
  {
    GMTrace.i(8680531558400L, 64675);
    if ((this.qCt != null) && (this.qyz != null))
    {
      if (bg.mZ(this.nmP)) {
        break label94;
      }
      this.qCt.setText(this.nmP);
      this.qyz.setVisibility(8);
    }
    while ((!bg.mZ(this.nmP)) || (!bg.mZ(this.gbX)))
    {
      this.qxB.setImageResource(blM());
      GMTrace.o(8680531558400L, 64675);
      return;
      label94:
      if (!bg.mZ(this.gbX))
      {
        this.qCt.setText(this.gbX);
        this.qyz.setVisibility(8);
      }
      else
      {
        this.qCt.setText(i.j.pTa);
        this.qyz.setVisibility(8);
      }
    }
    this.qxB.setImageResource(blL());
    GMTrace.o(8680531558400L, 64675);
  }
  
  private void blO()
  {
    GMTrace.i(8681068429312L, 64679);
    if (this.qCA != null)
    {
      boolean bool = this.qCA.blz();
      Object localObject = this.qCA.bly();
      if ((localObject == null) || (((ArrayList)localObject).size() == 0))
      {
        GMTrace.o(8681068429312L, 64679);
        return;
      }
      localObject = ((ArrayList)localObject).iterator();
      if (((Iterator)localObject).hasNext())
      {
        Exif.a locala = (Exif.a)((Iterator)localObject).next();
        w.d("MicroMsg.LocationWidget", "snsreport lat lng %f, %f", new Object[] { Double.valueOf(locala.latitude), Double.valueOf(locala.longitude) });
        com.tencent.mm.plugin.report.service.g localg = com.tencent.mm.plugin.report.service.g.paX;
        int j = (int)(locala.latitude * 1000000.0D);
        int k = (int)(locala.longitude * 1000000.0D);
        if (bool) {}
        for (int i = 1;; i = 2)
        {
          localg.i(11345, new Object[] { Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(2) });
          break;
        }
      }
    }
    GMTrace.o(8681068429312L, 64679);
  }
  
  private static boolean c(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    GMTrace.i(8680128905216L, 64672);
    if (m.d(paramDouble1, paramDouble2, paramDouble3, paramDouble4) > 1000.0D)
    {
      GMTrace.o(8680128905216L, 64672);
      return true;
    }
    GMTrace.o(8680128905216L, 64672);
    return false;
  }
  
  private void f(MMActivity paramMMActivity)
  {
    GMTrace.i(8679726252032L, 64669);
    this.owr = paramMMActivity;
    View localView = View.inflate(paramMMActivity, getLayoutResource(), this);
    this.qCo = localView.findViewById(i.f.pKu);
    this.qCt = ((TextView)this.qCo.findViewById(i.f.bUR));
    this.qyz = ((TextView)this.qCo.findViewById(i.f.pKw));
    this.qxB = ((ImageView)this.qCo.findViewById(i.f.pKv));
    this.qCp = localView.findViewById(i.f.pKU);
    final int i = 0;
    while (i < 5)
    {
      this.qCr[i] = ((ImageView)this.qCp.findViewById(this.qCq[i]));
      this.qCr[i].setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8694221766656L, 64777);
          if (LocationWidget.a(LocationWidget.this) == i + 1) {
            LocationWidget.b(LocationWidget.this);
          }
          for (;;)
          {
            LocationWidget.c(LocationWidget.this);
            GMTrace.o(8694221766656L, 64777);
            return;
            LocationWidget.a(LocationWidget.this, i + 1);
          }
        }
      });
      i += 1;
    }
    this.npK = com.tencent.mm.modelgeo.b.Im();
    this.qCo.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(17141080260608L, 127711);
        boolean bool = a.a(LocationWidget.d(LocationWidget.this), "android.permission.ACCESS_COARSE_LOCATION", 64, "", "");
        w.i("MicroMsg.LocationWidget", "summerper checkPermission checkLocation[%b]", new Object[] { Boolean.valueOf(bool) });
        if (!bool)
        {
          GMTrace.o(17141080260608L, 127711);
          return;
        }
        LocationWidget.this.blJ();
        GMTrace.o(17141080260608L, 127711);
      }
    });
    this.qCw = paramMMActivity.getIntent().getStringExtra("kpoi_id");
    if (!bg.mZ(this.qCw))
    {
      this.hwV = paramMMActivity.getIntent().getFloatExtra("k_lat", -1000.0F);
      this.hwW = paramMMActivity.getIntent().getFloatExtra("k_lng", -1000.0F);
      this.nmP = paramMMActivity.getIntent().getStringExtra("kpoi_name");
      this.qCv = paramMMActivity.getIntent().getStringExtra("Kpoi_address");
      blK();
    }
    this.qCs = bg.getInt(com.tencent.mm.k.g.uz().getValue("SnsPostPOICommentSwitch"), 0);
    blI();
    GMTrace.o(8679726252032L, 64669);
  }
  
  public final boolean T(Intent paramIntent)
  {
    GMTrace.i(8680397340672L, 64674);
    if (paramIntent == null)
    {
      GMTrace.o(8680397340672L, 64674);
      return true;
    }
    this.qCx = paramIntent.getIntExtra("get_poi_classify_type", 0);
    this.gbQ = paramIntent.getIntExtra("get_poi_showflag", 0);
    w.d("MicroMsg.LocationWidget", "onactivity result ok poiClassifyType %d", new Object[] { Integer.valueOf(this.qCx) });
    this.nmP = bg.ap(paramIntent.getStringExtra("get_poi_name"), "");
    this.gbX = bg.ap(paramIntent.getStringExtra("get_city"), "");
    this.hwV = paramIntent.getFloatExtra("get_lat", -1000.0F);
    this.hwW = paramIntent.getFloatExtra("get_lng", -1000.0F);
    w.i("MicroMsg.LocationWidget", "check cur lat " + this.qCy + " " + this.oiQ);
    this.qCy = paramIntent.getFloatExtra("get_cur_lat", 0.0F);
    this.oiQ = paramIntent.getFloatExtra("get_cur_lng", 0.0F);
    this.qCz = paramIntent.getIntExtra("get_loctype", -1);
    this.aFP = paramIntent.getFloatExtra("get_accuracy", 0.0F);
    this.hxf = paramIntent.getBooleanExtra("get_is_mars", true);
    Object localObject = com.tencent.mm.modelstat.e.Mc();
    boolean bool;
    if (this.qCz == 0)
    {
      bool = false;
      ((com.tencent.mm.modelstat.e)localObject).a(2003, bool, this.hxf, this.hwW, this.hwV, (int)this.aFP);
      this.qCu = paramIntent.getByteArrayExtra("location_ctx");
      if (bg.mZ(this.nmP)) {
        break label608;
      }
      this.qCv = bg.ap(paramIntent.getStringExtra("get_poi_address"), "");
      this.qCw = bg.ap(paramIntent.getStringExtra("get_poi_classify_id"), "");
      this.ojs = new akc();
    }
    for (;;)
    {
      try
      {
        this.ojs = ((akc)this.ojs.aC(paramIntent.getByteArrayExtra("get_poi_item_buf")));
        if (!bg.mZ(this.qCw))
        {
          this.ojs = new akc();
          this.ojs.oic = this.qCw;
          this.ojs.jXP = this.qCx;
          this.ojs.fuw = this.nmP;
          this.ojs.oih.add(new axt().Qx(this.qCv));
        }
        w.d("MicroMsg.LocationWidget", "label %s poiname %s", new Object[] { this.qCv, this.nmP });
        blK();
        blI();
        this.qCC = new b();
        localObject = this.qCC;
        if (paramIntent != null)
        {
          ((b)localObject).index = paramIntent.getIntExtra("report_index", -1);
          ((b)localObject).oiT = paramIntent.getLongExtra("first_start_time", 0L);
          ((b)localObject).oiU = paramIntent.getLongExtra("lastSuccStamp", 0L);
          ((b)localObject).oiV = paramIntent.getLongExtra("firstSuccStamp", 0L);
          ((b)localObject).oiW = paramIntent.getIntExtra("reqLoadCnt", 0);
          ((b)localObject).nqO = paramIntent.getIntExtra("entry_time", 0);
          ((b)localObject).iKu = paramIntent.getStringExtra("search_id");
        }
        GMTrace.o(8680397340672L, 64674);
        return true;
        bool = true;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.LocationWidget", localException, "", new Object[0]);
        this.ojs = null;
        continue;
      }
      label608:
      if (!bg.mZ(this.gbX))
      {
        this.nmP = "";
        this.qCv = "";
        this.qCw = "";
        this.ojs = null;
      }
      else
      {
        this.hwV = -1000.0F;
        this.hwW = -1000.0F;
        this.nmP = "";
        this.qCv = "";
        this.gbX = "";
        this.qCw = "";
        this.ojs = null;
      }
    }
  }
  
  public final void blJ()
  {
    GMTrace.i(8679860469760L, 64670);
    Intent localIntent = new Intent();
    localIntent.putExtra("near_life_scene", 1);
    try
    {
      localIntent.putExtra("get_poi_item_buf", this.ojs.toByteArray());
      if (!bg.mZ(this.qCw))
      {
        localIntent.putExtra("get_poi_classify_id", this.qCw);
        localIntent.putExtra("get_lat", this.hwV);
        localIntent.putExtra("get_lng", this.hwW);
        if (this.qCA == null) {
          break label228;
        }
        Object localObject = this.qCA.bly();
        if (localObject == null) {
          break label228;
        }
        Q((ArrayList)localObject);
        ArrayList localArrayList = new ArrayList();
        localObject = ((ArrayList)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          Exif.a locala = (Exif.a)((Iterator)localObject).next();
          localArrayList.add(String.format("%f\n%f", new Object[] { Double.valueOf(locala.latitude), Double.valueOf(locala.longitude) }));
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.LocationWidget", localException, "", new Object[0]);
        continue;
        if (!bg.mZ(this.gbX)) {
          localIntent.putExtra("get_city", this.gbX);
        }
      }
      label228:
      d.b(getContext(), "nearlife", "com.tencent.mm.plugin.nearlife.ui.CheckInLifeUI", localIntent, 10);
      GMTrace.o(8679860469760L, 64670);
    }
  }
  
  protected int blL()
  {
    GMTrace.i(8680665776128L, 64676);
    int i = i.i.pQH;
    GMTrace.o(8680665776128L, 64676);
    return i;
  }
  
  protected int blM()
  {
    GMTrace.i(8680799993856L, 64677);
    int i = i.i.pQI;
    GMTrace.o(8680799993856L, 64677);
    return i;
  }
  
  public final akv blN()
  {
    GMTrace.i(8680934211584L, 64678);
    akv localakv = new akv();
    localakv.tDN = this.hwV;
    localakv.tDM = this.hwW;
    localakv.ufL = 0;
    localakv.score = this.score;
    if (this.qCu != null) {
      localakv.ufM = new com.tencent.mm.bl.b(this.qCu);
    }
    if (!bg.mZ(this.nmP))
    {
      localakv.qCv = this.qCv;
      localakv.nmP = this.nmP;
      localakv.ufI = this.qCw;
      localakv.huL = this.gbX;
      if ((this.qCx != 0) && (this.qCx == 1))
      {
        localakv.qCx = 2;
        w.d("MicroMsg.LocationWidget", "getlocation type %d", new Object[] { Integer.valueOf(localakv.qCx) });
      }
    }
    for (;;)
    {
      if (this.qCC != null)
      {
        String str = String.format("%f/%f", new Object[] { Float.valueOf(localakv.tDN), Float.valueOf(localakv.tDM) });
        StringBuffer localStringBuffer = new StringBuffer();
        localStringBuffer.append("index " + this.qCC.index);
        localStringBuffer.append("firstStartStamp " + this.qCC.oiT);
        localStringBuffer.append("lastSuccStamp " + this.qCC.oiV);
        localStringBuffer.append("firstSuccStamp " + this.qCC.oiU);
        localStringBuffer.append("reqLoadCnt " + this.qCC.oiW);
        localStringBuffer.append("classifyId " + this.qCw);
        localStringBuffer.append("entryTime " + this.qCC.nqO);
        localStringBuffer.append("searchId" + this.qCC.iKu);
        w.d("MicroMsg.LocationWidget", "report %s", new Object[] { localStringBuffer.toString() });
        com.tencent.mm.plugin.report.service.g.paX.i(11135, new Object[] { Integer.valueOf(5), Integer.valueOf(this.qCC.index + 1), Long.valueOf(this.qCC.oiT), Long.valueOf(this.qCC.oiV), Long.valueOf(System.currentTimeMillis()), Long.valueOf(this.qCC.oiU), Integer.valueOf(this.qCC.oiW), str, this.qCw, Integer.valueOf(this.qCC.nqO), this.qCC.iKu, p.te() });
      }
      blO();
      GMTrace.o(8680934211584L, 64678);
      return localakv;
      localakv.qCx = 1;
      break;
      if (!bg.mZ(this.gbX)) {
        localakv.huL = this.gbX;
      }
    }
  }
  
  protected int getLayoutResource()
  {
    GMTrace.i(8681202647040L, 64680);
    int i = i.g.pKx;
    GMTrace.o(8681202647040L, 64680);
    return i;
  }
  
  public final void stop()
  {
    GMTrace.i(8680263122944L, 64673);
    if (this.oiK != null) {
      this.oiK.c(this.ojd);
    }
    if (this.npK != null) {
      this.npK.a(this.nkp);
    }
    GMTrace.o(8680263122944L, 64673);
  }
  
  public static abstract interface a
  {
    public abstract ArrayList<Exif.a> bly();
    
    public abstract boolean blz();
  }
  
  final class b
  {
    String iKu;
    int index;
    int nqO;
    long oiT;
    long oiU;
    long oiV;
    int oiW;
    
    b()
    {
      GMTrace.i(8634494877696L, 64332);
      this.oiT = -1L;
      this.oiU = -1L;
      this.oiV = -1L;
      this.oiW = 0;
      this.nqO = 0;
      this.iKu = "";
      GMTrace.o(8634494877696L, 64332);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/LocationWidget.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */