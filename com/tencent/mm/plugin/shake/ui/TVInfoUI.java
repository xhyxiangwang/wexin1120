package com.tencent.mm.plugin.shake.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.bi.d;
import com.tencent.mm.g.a.bz;
import com.tencent.mm.g.a.bz.a;
import com.tencent.mm.g.a.bz.b;
import com.tencent.mm.g.a.gr;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.platformtools.j.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.shake.e.a.a;
import com.tencent.mm.plugin.shake.e.c.a;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.protocal.c.acw;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.d;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.p;
import com.tencent.mm.x.ap;
import java.util.LinkedList;

public class TVInfoUI
  extends MMPreference
  implements com.tencent.mm.ac.e, j.a
{
  private long fxK;
  private TextView iin;
  protected ProgressDialog ilL;
  protected f ilZ;
  private ImageView kwt;
  private String pAn;
  private TextView pAo;
  private c.a pAp;
  private com.tencent.mm.plugin.shake.e.b pAq;
  private boolean pgp;
  private boolean piN;
  
  public TVInfoUI()
  {
    GMTrace.i(6577205542912L, 49004);
    this.pAn = "";
    this.piN = false;
    this.pgp = false;
    this.ilL = null;
    GMTrace.o(6577205542912L, 49004);
  }
  
  private void a(final c.a parama)
  {
    GMTrace.i(6578413502464L, 49013);
    if (parama == null)
    {
      w.e("MicroMsg.TVInfoUI", "refreshViewByProduct(), pd == null");
      finish();
      GMTrace.o(6578413502464L, 49013);
      return;
    }
    this.iin.setText(parama.field_title);
    if (bg.mZ(parama.field_topic)) {
      this.pAo.setVisibility(8);
    }
    for (;;)
    {
      this.kwt = ((ImageView)findViewById(R.h.cCV));
      if (!bg.mZ(parama.field_playurl))
      {
        ImageView localImageView = (ImageView)findViewById(R.h.cCU);
        localImageView.setVisibility(0);
        localImageView.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6532913692672L, 48674);
            g.paX.i(10987, new Object[] { Integer.valueOf(2), parama.field_playstatid, "", "" });
            TVInfoUI.a(TVInfoUI.this, parama.field_playurl);
            GMTrace.o(6532913692672L, 48674);
          }
        });
        this.kwt.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6565662818304L, 48918);
            g.paX.i(10987, new Object[] { Integer.valueOf(2), parama.field_playstatid, "", "" });
            TVInfoUI.a(TVInfoUI.this, parama.field_playurl);
            GMTrace.o(6565662818304L, 48918);
          }
        });
      }
      a(0, R.g.baG, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(6533718999040L, 48680);
          TVInfoUI.a(TVInfoUI.this);
          GMTrace.o(6533718999040L, 48680);
          return true;
        }
      });
      if ((!bg.mZ(parama.field_id)) && (!this.piN) && (!getIntent().getBooleanExtra("key_TV_come_from_shake", false)))
      {
        int i = getIntent().getIntExtra("key_TV_getProductInfoScene", 0);
        w.d("MicroMsg.TVInfoUI", "GetTVInfo id[%s], scene[%s]", new Object[] { parama.field_id, Integer.valueOf(i) });
        ap.wT().a(new com.tencent.mm.plugin.shake.d.a.b(parama.field_id, i), 0);
        this.piN = true;
      }
      this.kwt.setVisibility(0);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(6588345614336L, 49087);
          TVInfoUI.this.finish();
          GMTrace.o(6588345614336L, 49087);
          return true;
        }
      });
      w.v("MicroMsg.TVInfoUI", "start postToMainThread initBodyView");
      com.tencent.mm.sdk.platformtools.af.u(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6534524305408L, 48686);
          TVInfoUI.a(TVInfoUI.this, parama);
          TVInfoUI.b(TVInfoUI.this, parama);
          GMTrace.o(6534524305408L, 48686);
        }
      });
      GMTrace.o(6578413502464L, 49013);
      return;
      this.pAo.setText(parama.field_topic);
    }
  }
  
  private void bbi()
  {
    GMTrace.i(6578547720192L, 49014);
    this.fxK = getIntent().getLongExtra("key_TVInfoUI_chatting_msgId", 0L);
    if ((this.fxK > 0L) && (ap.AV()))
    {
      ap.AS();
      au localau = com.tencent.mm.x.c.yN().cI(this.fxK);
      if (localau.field_msgId > 0L)
      {
        localau.cX(this.pAq.Pg());
        ap.AS();
        com.tencent.mm.x.c.yN().a(this.fxK, localau);
      }
    }
    GMTrace.o(6578547720192L, 49014);
  }
  
  protected final void MH()
  {
    GMTrace.i(6578279284736L, 49012);
    oC(R.l.eEa);
    this.ilZ = this.vOv;
    this.iin = ((TextView)findViewById(R.h.cCW));
    this.pAo = ((TextView)findViewById(R.h.cCX));
    String str2 = getIntent().getStringExtra("key_TV_xml");
    String str1 = str2;
    if (bg.mZ(str2))
    {
      byte[] arrayOfByte = getIntent().getByteArrayExtra("key_TV_xml_bytes");
      str1 = str2;
      if (arrayOfByte != null) {
        str1 = new String(arrayOfByte);
      }
    }
    w.d("MicroMsg.TVInfoUI", "tvinfo xml : %s", new Object[] { str1 });
    this.pAp = com.tencent.mm.plugin.shake.e.c.FG(str1);
    if (this.pAp == null)
    {
      w.e("MicroMsg.TVInfoUI", "initView(), tv == null");
      finish();
      GMTrace.o(6578279284736L, 49012);
      return;
    }
    a(this.pAp);
    GMTrace.o(6578279284736L, 49012);
  }
  
  public final int QD()
  {
    GMTrace.i(6577473978368L, 49006);
    int i = R.o.fiz;
    GMTrace.o(6577473978368L, 49006);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6578950373376L, 49017);
    if (paramk == null)
    {
      w.w("MicroMsg.TVInfoUI", "scene == null");
      GMTrace.o(6578950373376L, 49017);
      return;
    }
    if (paramk.getType() == 552)
    {
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        w.e("MicroMsg.TVInfoUI", "onSceneEnd() errType = [%s], errCode = [%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        Toast.makeText(this, R.l.eEb, 0).show();
        GMTrace.o(6578950373376L, 49017);
        return;
      }
      if (this.pAp == null)
      {
        w.w("MicroMsg.TVInfoUI", "onSceneEnd tv == null");
        GMTrace.o(6578950373376L, 49017);
        return;
      }
      paramString = (com.tencent.mm.plugin.shake.d.a.b)paramk;
      if ((paramString.gMC != null) && (paramString.gMC.hlV.hmc != null)) {}
      for (paramString = (acw)paramString.gMC.hlV.hmc; paramString == null; paramString = null)
      {
        w.w("MicroMsg.TVInfoUI", "onSceneEnd tvInfo == null");
        GMTrace.o(6578950373376L, 49017);
        return;
      }
      if (paramString.tBL != null)
      {
        w.d("MicroMsg.TVInfoUI", "onSceneEnd  tvInfo.DescriptionXML != null, res:" + paramString.tBL);
        paramString = com.tencent.mm.plugin.shake.e.c.FG(paramString.tBL);
        if ((this.pAp != null) && (this.pAp.field_xml != null) && (paramString != null) && (paramString.field_xml != null) && (!this.pAp.field_xml.equals(paramString.field_xml)))
        {
          this.pAp = paramString;
          a(this.pAp);
        }
      }
    }
    GMTrace.o(6578950373376L, 49017);
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(6578681937920L, 49015);
    w.d("MicroMsg.TVInfoUI", "onPreferenceTreeClick item: [%s]", new Object[] { paramPreference.iay });
    if ((this.pAp == null) || (this.pAp.plh == null))
    {
      w.e("MicroMsg.TVInfoUI", "tv == null || tv.actionlist == null");
      GMTrace.o(6578681937920L, 49015);
      return false;
    }
    for (;;)
    {
      Intent localIntent;
      try
      {
        int i = Integer.valueOf(paramPreference.iay).intValue();
        int j = i / 100;
        int k = i % 100;
        w.v("MicroMsg.TVInfoUI", "keyId=[%s], ii=[%s], jj=[%s]", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
        if ((j < 0) || (j >= this.pAp.plh.size()))
        {
          w.w("MicroMsg.TVInfoUI", "index out of bounds, ii=[%s], list Size=[%s]", new Object[] { Integer.valueOf(j), Integer.valueOf(this.pAp.plh.size()) });
          GMTrace.o(6578681937920L, 49015);
          return false;
        }
        paramf = (com.tencent.mm.plugin.shake.e.a)this.pAp.plh.get(j);
        if (paramf == null)
        {
          w.w("MicroMsg.TVInfoUI", "actionList == null");
          GMTrace.o(6578681937920L, 49015);
          return false;
        }
        if ((k < 0) || (k >= paramf.hNi.size()))
        {
          w.w("MicroMsg.TVInfoUI", "index out of bounds, jj=[%s], actions Size=[%s]", new Object[] { Integer.valueOf(k), Integer.valueOf(paramf.hNi.size()) });
          GMTrace.o(6578681937920L, 49015);
          return false;
        }
        paramf = (a.a)paramf.hNi.get(k);
        if (paramf == null)
        {
          w.w("MicroMsg.TVInfoUI", "action == null");
          GMTrace.o(6578681937920L, 49015);
          return false;
        }
        w.v("MicroMsg.TVInfoUI", "action type:" + paramf.type + ", target:" + paramf.pAz + ", targetDesc:" + paramf.pAB + ", targetDesc2:" + paramf.pAC);
        if (paramf.type == 3)
        {
          paramPreference = new Intent();
          paramPreference.putExtra("rawUrl", paramf.pAz);
          paramPreference.putExtra("show_bottom", false);
          paramPreference.putExtra("geta8key_scene", 10);
          paramPreference.putExtra("srcUsername", paramf.pAC);
          com.tencent.mm.plugin.shake.a.ifM.j(paramPreference, this);
          GMTrace.o(6578681937920L, 49015);
          return true;
        }
        if (paramf.type != 4) {
          break label666;
        }
        ap.AS();
        paramPreference = com.tencent.mm.x.c.yL().SL(paramf.pAz);
        if (paramPreference == null) {
          continue;
        }
        localIntent = new Intent();
        if ((com.tencent.mm.l.a.eE(paramPreference.field_type)) && (paramPreference.bPH()))
        {
          com.tencent.mm.ae.x.FE().in(paramf.pAz);
          if (paramf.pAB.equals("1"))
          {
            localIntent.putExtra("Chat_User", paramf.pAz);
            localIntent.putExtra("finish_direct", true);
            com.tencent.mm.plugin.shake.a.ifM.e(localIntent, this);
            continue;
          }
        }
        localIntent.putExtra("Contact_User", paramf.pAz);
      }
      catch (Exception paramf)
      {
        w.e("MicroMsg.TVInfoUI", "onPreferenceTreeClick, [%s]", new Object[] { paramf.getMessage() });
        w.printErrStackTrace("MicroMsg.TVInfoUI", paramf, "", new Object[0]);
        GMTrace.o(6578681937920L, 49015);
        return false;
      }
      localIntent.putExtra("force_get_contact", true);
      d.b(this, "profile", ".ui.ContactInfoUI", localIntent);
      continue;
      label666:
      if (paramf.type == 5)
      {
        paramPreference = new gr();
        paramPreference.fCS.actionCode = 11;
        paramPreference.fCS.result = paramf.pAz;
        paramPreference.fCS.context = this;
        paramPreference.fwM = null;
        com.tencent.mm.sdk.b.a.uLm.a(paramPreference, Looper.myLooper());
      }
      else if (paramf.type == 6)
      {
        paramPreference = new Intent();
        paramPreference.putExtra("key_product_id", paramf.pAz);
        paramPreference.putExtra("key_product_scene", 9);
        d.b(this, "product", ".ui.MallProductUI", paramPreference);
      }
    }
  }
  
  public final int ahR()
  {
    GMTrace.i(6577608196096L, 49007);
    int i = R.i.dhf;
    GMTrace.o(6577608196096L, 49007);
    return i;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6577339760640L, 49005);
    int i = R.i.dhe;
    GMTrace.o(6577339760640L, 49005);
    return i;
  }
  
  public final void k(final String paramString, final Bitmap paramBitmap)
  {
    GMTrace.i(6578816155648L, 49016);
    if (paramString != null)
    {
      if (paramBitmap == null) {}
      for (boolean bool = true;; bool = false)
      {
        w.d("MicroMsg.TVInfoUI", "onGetPictureFinish pic, url = [%s], bitmap is null ? [%B]", new Object[] { paramString, Boolean.valueOf(bool) });
        try
        {
          com.tencent.mm.sdk.platformtools.af.u(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(6540161449984L, 48728);
              if ((TVInfoUI.e(TVInfoUI.this) != null) && (TVInfoUI.e(TVInfoUI.this).equals(paramString)))
              {
                if ((TVInfoUI.f(TVInfoUI.this) != null) && (paramBitmap != null))
                {
                  TVInfoUI.f(TVInfoUI.this).setImageBitmap(paramBitmap);
                  TVInfoUI.g(TVInfoUI.this);
                }
                TVInfoUI.h(TVInfoUI.this);
              }
              f localf = TVInfoUI.this.ilZ;
              GMTrace.o(6540161449984L, 48728);
            }
          });
          GMTrace.o(6578816155648L, 49016);
          return;
        }
        catch (Exception paramString)
        {
          w.e("MicroMsg.TVInfoUI", "onGetPictureFinish : [%s]", new Object[] { paramString.getLocalizedMessage() });
          w.printErrStackTrace("MicroMsg.TVInfoUI", paramString, "", new Object[0]);
          GMTrace.o(6578816155648L, 49016);
          return;
        }
      }
    }
    w.e("MicroMsg.TVInfoUI", "onUpdate pic, url  is null ");
    GMTrace.o(6578816155648L, 49016);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6577742413824L, 49008);
    super.onCreate(paramBundle);
    j.b(this);
    MH();
    GMTrace.o(6577742413824L, 49008);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(6578145067008L, 49011);
    j.c(this);
    super.onDestroy();
    GMTrace.o(6578145067008L, 49011);
  }
  
  protected void onPause()
  {
    GMTrace.i(6578010849280L, 49010);
    ap.wT().b(552, this);
    super.onPause();
    GMTrace.o(6578010849280L, 49010);
  }
  
  protected void onResume()
  {
    GMTrace.i(6577876631552L, 49009);
    super.onResume();
    ap.wT().a(552, this);
    GMTrace.o(6577876631552L, 49009);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/shake/ui/TVInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */