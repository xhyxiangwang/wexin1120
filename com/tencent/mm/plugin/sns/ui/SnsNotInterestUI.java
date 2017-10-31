package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.k;
import com.tencent.mm.g.a.gb;
import com.tencent.mm.g.b.af;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceTitleCategory;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.p.b;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class SnsNotInterestUI
  extends MMPreference
  implements e
{
  private static final String[] qLI;
  private static final int[] qLJ;
  private static final int[] qLN;
  private com.tencent.mm.ui.base.q iXW;
  private f jqf;
  private String oEr;
  private HashMap<String, Boolean> qLK;
  private HashMap<Integer, Boolean> qLL;
  private HashMap<String, Integer> qLM;
  private TextView qLO;
  private EditText qLP;
  private ListView qLQ;
  private LinearLayout qLR;
  private int qLS;
  private int qLT;
  private long qLU;
  private boolean qLV;
  private boolean qLW;
  com.tencent.mm.plugin.sns.model.q qLX;
  
  static
  {
    GMTrace.i(8499069190144L, 63323);
    qLI = new String[] { "sns_expose_reason_not_fav", "sns_expose_reason_too_freq", "sns_expose_reason_too_many_same_content", "sns_expose_reason_marketing", "sns_expose_reason_content_sexy", "sns_expose_reason_rumour", "sns_expose_reason_other" };
    qLJ = new int[] { 1, 2, 4, 8, 16, 32, 64 };
    qLN = new int[] { i.j.pSf, i.j.pSj, i.j.pSk, i.j.pSe, i.j.pSd, i.j.pSh, i.j.pSg };
    GMTrace.o(8499069190144L, 63323);
  }
  
  public SnsNotInterestUI()
  {
    GMTrace.i(8497592795136L, 63312);
    this.qLK = new HashMap(qLI.length);
    this.qLL = new HashMap(qLJ.length);
    this.qLM = new HashMap(qLJ.length);
    this.oEr = null;
    this.qLV = false;
    this.qLW = false;
    this.iXW = null;
    this.qLX = null;
    GMTrace.o(8497592795136L, 63312);
  }
  
  private void bnp()
  {
    int k = 0;
    GMTrace.i(8497861230592L, 63314);
    Object localObject1 = qLI;
    int j = localObject1.length;
    int i = 0;
    while (i < j)
    {
      Object localObject2 = localObject1[i];
      this.qLK.put(localObject2, Boolean.valueOf(false));
      i += 1;
    }
    localObject1 = qLJ;
    int m = localObject1.length;
    i = 0;
    for (;;)
    {
      j = k;
      if (i >= m) {
        break;
      }
      j = localObject1[i];
      this.qLL.put(Integer.valueOf(j), Boolean.valueOf(false));
      i += 1;
    }
    while (j < qLJ.length)
    {
      this.qLM.put(qLI[j], Integer.valueOf(qLJ[j]));
      j += 1;
    }
    GMTrace.o(8497861230592L, 63314);
  }
  
  protected final void MH()
  {
    GMTrace.i(8498129666048L, 63316);
    super.MH();
    oC(i.j.pSn);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(8371965001728L, 62376);
        SnsNotInterestUI.this.finish();
        GMTrace.o(8371965001728L, 62376);
        return true;
      }
    });
    this.qLO = ((TextView)findViewById(i.f.pMc));
    this.qLP = ((EditText)findViewById(i.f.pMd));
    this.qLQ = ((ListView)findViewById(16908298));
    this.qLR = ((LinearLayout)findViewById(i.f.pJM));
    this.qLR.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8479070748672L, 63174);
        SnsNotInterestUI.a(SnsNotInterestUI.this).requestFocus();
        SnsNotInterestUI.this.aKl();
        GMTrace.o(8479070748672L, 63174);
      }
    });
    this.qLP.setVisibility(8);
    this.qLO.setVisibility(8);
    this.jqf = this.vOv;
    if (this.jqf == null) {
      w.e("MicroMsg.SnsNotInterestUI", "initPref error, PreferenceScreen is null!");
    }
    for (;;)
    {
      a(0, getString(i.j.pQW), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(8704019660800L, 64850);
          SnsNotInterestUI.b(SnsNotInterestUI.this);
          GMTrace.o(8704019660800L, 64850);
          return true;
        }
      }, p.b.vpB);
      W(0, false);
      GMTrace.o(8498129666048L, 63316);
      return;
      Object localObject;
      if (this.jqf.UM("sns_expose_desc") == null)
      {
        localObject = new PreferenceTitleCategory(this);
        ((Preference)localObject).setTitle(i.j.pSb);
        ((Preference)localObject).setKey("sns_expose_desc");
        this.jqf.a((Preference)localObject);
      }
      int i = 0;
      while (i < qLI.length)
      {
        localObject = qLI[i];
        int j = qLN[i];
        if (this.jqf.UM((String)localObject) == null)
        {
          Preference localPreference = new Preference(this);
          localPreference.setTitle(j);
          localPreference.setKey((String)localObject);
          localPreference.setLayoutResource(i.g.dap);
          localPreference.setWidgetLayoutResource(i.g.pOd);
          this.jqf.a(localPreference);
        }
        i += 1;
      }
    }
  }
  
  public final int QD()
  {
    GMTrace.i(8498398101504L, 63318);
    GMTrace.o(8498398101504L, 63318);
    return -1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8498666536960L, 63320);
    w.d("MicroMsg.SnsNotInterestUI", "onSceneEnd, errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramk.getType() == 218)
    {
      this.iXW.dismiss();
      this.iXW = null;
      if (((com.tencent.mm.plugin.sns.model.q)paramk).type == 9)
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          this.qLV = true;
          Toast.makeText(this, i.j.pSm, 1).show();
          finish();
          GMTrace.o(8498666536960L, 63320);
          return;
        }
        this.qLV = false;
        Toast.makeText(this, i.j.pSc, 1).show();
      }
    }
    GMTrace.o(8498666536960L, 63320);
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(8498532319232L, 63319);
    if (paramPreference == null)
    {
      GMTrace.o(8498532319232L, 63319);
      return false;
    }
    String str = paramPreference.iay;
    if (this.qLK.containsKey(str))
    {
      boolean bool = ((Boolean)this.qLK.get(str)).booleanValue();
      label85:
      int i;
      if (bool)
      {
        paramPreference.setWidgetLayoutResource(i.g.pOd);
        paramf.notifyDataSetChanged();
        if (bool) {
          break label283;
        }
        bool = true;
        this.qLK.put(str, Boolean.valueOf(bool));
        i = ((Integer)this.qLM.get(str)).intValue();
        this.qLL.put(Integer.valueOf(i), Boolean.valueOf(bool));
        w.d("MicroMsg.SnsNotInterestUI", "click: %s, notInterestType: %d, isCheck: %b", new Object[] { str, Integer.valueOf(i), Boolean.valueOf(bool) });
        paramf = this.qLK.values().iterator();
        while (paramf.hasNext()) {
          if (((Boolean)paramf.next()).booleanValue())
          {
            i = 1;
            label204:
            if (i == 0) {
              break label294;
            }
            W(0, true);
            label214:
            if ((!bool) || (!str.equals("sns_expose_reason_other"))) {
              break label303;
            }
            this.qLP.setVisibility(0);
            this.qLO.setVisibility(0);
            this.qLP.requestFocus();
            this.qLW = true;
            aKp();
          }
        }
      }
      for (;;)
      {
        GMTrace.o(8498532319232L, 63319);
        return true;
        paramPreference.setWidgetLayoutResource(i.g.pOc);
        break;
        label283:
        bool = false;
        break label85;
        i = 0;
        break label204;
        label294:
        W(0, false);
        break label214;
        label303:
        if (!((Boolean)this.qLK.get("sns_expose_reason_other")).booleanValue())
        {
          this.qLP.setVisibility(8);
          this.qLO.setVisibility(8);
          this.qLQ.requestFocus();
          this.qLW = false;
          aKl();
        }
        else
        {
          this.qLQ.requestFocus();
          aKl();
        }
      }
    }
    GMTrace.o(8498532319232L, 63319);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8498263883776L, 63317);
    int i = i.g.pON;
    GMTrace.o(8498263883776L, 63317);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8497727012864L, 63313);
    super.onCreate(paramBundle);
    this.qLS = getIntent().getIntExtra("sns_info_not_interest_scene", 0);
    this.qLU = getIntent().getLongExtra("sns_info_svr_id", 0L);
    if (this.qLU != 0L)
    {
      paramBundle = ae.bhp().dP(this.qLU).field_userName;
      if (paramBundle != null)
      {
        com.tencent.mm.kernel.h.xA();
        paramBundle = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yL().SK(paramBundle);
        if (paramBundle.gbM != 2) {
          break label147;
        }
        qLN[1] = i.j.pSi;
      }
    }
    for (;;)
    {
      com.tencent.mm.kernel.h.xA();
      com.tencent.mm.kernel.h.xy().gQO.a(218, this);
      bnp();
      MH();
      GMTrace.o(8497727012864L, 63313);
      return;
      label147:
      if (paramBundle.gbM == 1) {
        qLN[1] = i.j.pSj;
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(8497995448320L, 63315);
    super.onDestroy();
    bnp();
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xy().gQO.b(218, this);
    gb localgb = new gb();
    localgb.fCi.fCj = this.qLV;
    localgb.fCi.fCk = this.qLU;
    a.uLm.m(localgb);
    GMTrace.o(8497995448320L, 63315);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsNotInterestUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */