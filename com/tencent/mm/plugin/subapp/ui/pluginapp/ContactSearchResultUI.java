package com.tencent.mm.plugin.subapp.ui.pluginapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.n;
import com.tencent.mm.ae.d.b;
import com.tencent.mm.ae.d.b.c;
import com.tencent.mm.ae.m;
import com.tencent.mm.ae.m.a;
import com.tencent.mm.ae.m.a.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.protocal.c.axt;
import com.tencent.mm.protocal.c.ayl;
import com.tencent.mm.protocal.c.ayn;
import com.tencent.mm.protocal.c.bep;
import com.tencent.mm.protocal.c.ob;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.x.ap;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ContactSearchResultUI
  extends MMActivity
{
  private static ae hay;
  private LinkedList<ayl> hdL;
  private ListView rcQ;
  private b rcR;
  private Map<String, c> rcS;
  
  static
  {
    GMTrace.i(5783978770432L, 43094);
    hay = new ae(Looper.getMainLooper());
    GMTrace.o(5783978770432L, 43094);
  }
  
  public ContactSearchResultUI()
  {
    GMTrace.i(5782770810880L, 43085);
    this.hdL = new LinkedList();
    GMTrace.o(5782770810880L, 43085);
  }
  
  protected final void MH()
  {
    GMTrace.i(5783039246336L, 43087);
    oC(R.l.cRs);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5793508229120L, 43165);
        ContactSearchResultUI.this.finish();
        GMTrace.o(5793508229120L, 43165);
        return true;
      }
    });
    this.rcS = new HashMap();
    this.rcQ = ((ListView)findViewById(R.h.crz));
    Object localObject = (TextView)findViewById(R.h.empty);
    this.rcQ.setEmptyView((View)localObject);
    localObject = getIntent().getByteArrayExtra("result");
    final int i = getIntent().getIntExtra("add_more_friend_search_scene", 0);
    if (localObject != null) {}
    try
    {
      localObject = (ayn)new ayn().aC((byte[])localObject);
      if (localObject != null) {
        this.hdL = ((ayn)localObject).tVi;
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.ContactSearchResultUI", localIOException, "", new Object[0]);
      }
      this.rcR = new b(this);
      this.rcQ.setAdapter(this.rcR);
      this.rcQ.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(5775657271296L, 43032);
          paramAnonymousInt -= ContactSearchResultUI.a(ContactSearchResultUI.this).getHeaderViewsCount();
          if ((paramAnonymousInt < 0) || (paramAnonymousInt >= ContactSearchResultUI.a(ContactSearchResultUI.this).getCount()))
          {
            GMTrace.o(5775657271296L, 43032);
            return;
          }
          paramAnonymousAdapterView = (ayl)ContactSearchResultUI.a(ContactSearchResultUI.this).getItemAtPosition(paramAnonymousInt);
          paramAnonymousView = paramAnonymousAdapterView.tKE.usj;
          ap.AS();
          com.tencent.mm.storage.x localx = com.tencent.mm.x.c.yL().SL(paramAnonymousView);
          if (com.tencent.mm.l.a.eE(localx.field_type))
          {
            paramAnonymousAdapterView = new Intent();
            paramAnonymousAdapterView.putExtra("Contact_User", paramAnonymousView);
            paramAnonymousAdapterView.putExtra("Contact_Scene", 3);
            if ((paramAnonymousView != null) && (paramAnonymousView.length() > 0))
            {
              if (localx.bPH())
              {
                g.paX.z(10298, paramAnonymousView + ",35");
                paramAnonymousAdapterView.putExtra("Contact_Scene", 35);
              }
              com.tencent.mm.bi.d.b(ContactSearchResultUI.this, "profile", ".ui.ContactInfoUI", paramAnonymousAdapterView);
            }
            GMTrace.o(5775657271296L, 43032);
            return;
          }
          if ((paramAnonymousAdapterView.ufg & 0x8) > 0) {
            g.paX.z(10298, paramAnonymousAdapterView.tKE.usj + ",35");
          }
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("Contact_User", paramAnonymousAdapterView.tKE.usj);
          paramAnonymousView.putExtra("Contact_Alias", paramAnonymousAdapterView.huO);
          paramAnonymousView.putExtra("Contact_Nick", paramAnonymousAdapterView.ucE.usj);
          paramAnonymousView.putExtra("Contact_Signature", paramAnonymousAdapterView.huM);
          paramAnonymousView.putExtra("Contact_RegionCode", RegionCodeDecoder.ae(paramAnonymousAdapterView.huS, paramAnonymousAdapterView.huK, paramAnonymousAdapterView.huL));
          paramAnonymousView.putExtra("Contact_Sex", paramAnonymousAdapterView.huJ);
          paramAnonymousView.putExtra("Contact_VUser_Info", paramAnonymousAdapterView.ufh);
          paramAnonymousView.putExtra("Contact_VUser_Info_Flag", paramAnonymousAdapterView.ufg);
          paramAnonymousView.putExtra("Contact_KWeibo_flag", paramAnonymousAdapterView.ufk);
          paramAnonymousView.putExtra("Contact_KWeibo", paramAnonymousAdapterView.ufi);
          paramAnonymousView.putExtra("Contact_KWeiboNick", paramAnonymousAdapterView.ufj);
          paramAnonymousView.putExtra("Contact_KSnsIFlag", paramAnonymousAdapterView.ufm.huU);
          paramAnonymousView.putExtra("Contact_KSnsBgId", paramAnonymousAdapterView.ufm.huW);
          paramAnonymousView.putExtra("Contact_KSnsBgUrl", paramAnonymousAdapterView.ufm.huV);
          paramAnonymousView.putExtra("Contact_Scene", 35);
          if (i != 0) {
            paramAnonymousView.putExtra("add_more_friend_search_scene", i);
          }
          if (paramAnonymousAdapterView.ufn != null) {}
          try
          {
            paramAnonymousView.putExtra("Contact_customInfo", paramAnonymousAdapterView.ufn.toByteArray());
            if ((paramAnonymousAdapterView.ufg & 0x8) > 0) {
              g.paX.z(10298, paramAnonymousAdapterView.tKE.usj + ",35");
            }
            com.tencent.mm.bi.d.b(ContactSearchResultUI.this, "profile", ".ui.ContactInfoUI", paramAnonymousView);
            GMTrace.o(5775657271296L, 43032);
            return;
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              w.printErrStackTrace("MicroMsg.ContactSearchResultUI", localIOException, "", new Object[0]);
            }
          }
        }
      });
      this.rcQ.setOnScrollListener(new com.tencent.mm.ui.applet.a());
      GMTrace.o(5783039246336L, 43087);
    }
    if ((this.hdL == null) || (this.hdL.size() == 0))
    {
      GMTrace.o(5783039246336L, 43087);
      return;
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5783173464064L, 43088);
    int i = R.i.cRs;
    GMTrace.o(5783173464064L, 43088);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5782905028608L, 43086);
    super.onCreate(paramBundle);
    MH();
    GMTrace.o(5782905028608L, 43086);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(5783307681792L, 43089);
    n.Dv().cancel();
    if (this.rcS != null) {
      this.rcS.clear();
    }
    super.onDestroy();
    GMTrace.o(5783307681792L, 43089);
  }
  
  private static abstract class a
    implements Runnable
  {
    public String iconUrl;
    public String username;
    
    public a()
    {
      GMTrace.i(5776059924480L, 43035);
      GMTrace.o(5776059924480L, 43035);
    }
    
    public final void dG(String paramString1, String paramString2)
    {
      GMTrace.i(5776194142208L, 43036);
      this.username = paramString1;
      this.iconUrl = paramString2;
      GMTrace.o(5776194142208L, 43036);
    }
  }
  
  private final class b
    extends BaseAdapter
  {
    private Context mContext;
    
    public b(Context paramContext)
    {
      GMTrace.i(5784381423616L, 43097);
      this.mContext = paramContext;
      GMTrace.o(5784381423616L, 43097);
    }
    
    private ayl vz(int paramInt)
    {
      GMTrace.i(5784649859072L, 43099);
      if (ContactSearchResultUI.b(ContactSearchResultUI.this) == null)
      {
        GMTrace.o(5784649859072L, 43099);
        return null;
      }
      ayl localayl = (ayl)ContactSearchResultUI.b(ContactSearchResultUI.this).get(paramInt);
      GMTrace.o(5784649859072L, 43099);
      return localayl;
    }
    
    public final int getCount()
    {
      GMTrace.i(5784515641344L, 43098);
      if (ContactSearchResultUI.b(ContactSearchResultUI.this) == null)
      {
        GMTrace.o(5784515641344L, 43098);
        return 0;
      }
      int i = ContactSearchResultUI.b(ContactSearchResultUI.this).size();
      GMTrace.o(5784515641344L, 43098);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(5784784076800L, 43100);
      GMTrace.o(5784784076800L, 43100);
      return 0L;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      int i = 8;
      GMTrace.i(5784918294528L, 43101);
      View localView;
      if (paramView == null)
      {
        localView = View.inflate(this.mContext, R.i.dfi, null);
        paramViewGroup = new ContactSearchResultUI.d();
        paramViewGroup.iiL = ((ImageView)localView.findViewById(R.h.bjo));
        paramViewGroup.kjm = ((TextView)localView.findViewById(R.h.cgq));
        paramViewGroup.kjn = localView.findViewById(R.h.cDU);
        paramViewGroup.kjo = ((TextView)localView.findViewById(R.h.bQq));
        paramViewGroup.kjr = localView.findViewById(R.h.bmu);
        localView.setTag(paramViewGroup);
      }
      ayl localayl;
      for (;;)
      {
        localayl = vz(paramInt);
        if (localayl != null) {
          break;
        }
        w.e("MicroMsg.ContactSearchResultAdapter", "shouldnot be empty");
        GMTrace.o(5784918294528L, 43101);
        return localView;
        paramViewGroup = (ContactSearchResultUI.d)paramView.getTag();
        localView = paramView;
      }
      paramViewGroup.username = localayl.tKE.usj;
      paramViewGroup.iconUrl = localayl.tHj;
      paramViewGroup.iiL.setTag(paramViewGroup.username);
      paramViewGroup.ahZ();
      String str = localayl.tKE.usj;
      Object localObject1 = (ContactSearchResultUI.c)ContactSearchResultUI.c(ContactSearchResultUI.this).get(str);
      paramView = (View)localObject1;
      Object localObject2;
      boolean bool;
      if (localObject1 == null)
      {
        localObject1 = new ContactSearchResultUI.c();
        ContactSearchResultUI.c(ContactSearchResultUI.this).put(str, localObject1);
        paramView = localayl.ufn;
        if (paramView != null)
        {
          localObject2 = new com.tencent.mm.ae.d();
          ((com.tencent.mm.ae.d)localObject2).field_username = str;
          ((com.tencent.mm.ae.d)localObject2).field_brandFlag = paramView.huX;
          ((com.tencent.mm.ae.d)localObject2).field_brandIconURL = paramView.hva;
          ((com.tencent.mm.ae.d)localObject2).field_brandInfo = paramView.huZ;
          ((com.tencent.mm.ae.d)localObject2).field_extInfo = paramView.huY;
          paramView = null;
          if (((com.tencent.mm.ae.d)localObject2).bn(false) != null) {
            paramView = ((com.tencent.mm.ae.d)localObject2).bn(false).EY();
          }
          if (paramView != null)
          {
            if ((!((com.tencent.mm.ae.d)localObject2).bn(false).Fa()) || (bg.mZ(paramView.hoX))) {
              break label558;
            }
            bool = true;
          }
        }
      }
      for (;;)
      {
        ((ContactSearchResultUI.c)localObject1).kjk = bool;
        if (localayl.ufg != 0)
        {
          bool = true;
          label385:
          ((ContactSearchResultUI.c)localObject1).kjj = bool;
          paramView = (View)localObject1;
          localObject1 = paramViewGroup.kjn;
          if (!paramView.kjj) {
            break label570;
          }
          paramInt = 0;
          ((View)localObject1).setVisibility(paramInt);
          localObject1 = paramViewGroup.kjr;
          paramInt = i;
          if (paramView.kjk) {
            paramInt = 0;
          }
          ((View)localObject1).setVisibility(paramInt);
          w.v("MicroMsg.ContactSearchResultAdapter", "verifyFlay : %d", new Object[] { Integer.valueOf(localayl.ufg) });
          paramView = bg.mY(localayl.huM);
        }
        try
        {
          paramViewGroup.kjo.setText(h.b(this.mContext, paramView, paramViewGroup.kjo.getTextSize()));
          try
          {
            localObject1 = paramViewGroup.kjm;
            localObject2 = this.mContext;
            if (bg.mZ(localayl.ucE.usj)) {
              break label590;
            }
            paramView = localayl.ucE.usj;
            ((TextView)localObject1).setText(h.b((Context)localObject2, paramView, paramViewGroup.kjm.getTextSize()));
          }
          catch (Exception paramView)
          {
            for (;;)
            {
              paramViewGroup.kjm.setText("");
            }
          }
          GMTrace.o(5784918294528L, 43101);
          return localView;
          label558:
          bool = false;
          continue;
          bool = false;
          break label385;
          label570:
          paramInt = 8;
        }
        catch (Exception paramView)
        {
          for (;;)
          {
            paramViewGroup.kjo.setText("");
            continue;
            label590:
            if (!bg.mZ(localayl.huO)) {
              paramView = localayl.huO;
            } else {
              paramView = bg.mY(localayl.tKE.usj);
            }
          }
        }
      }
    }
  }
  
  private static final class c
  {
    protected boolean kjj;
    protected boolean kjk;
    
    public c()
    {
      GMTrace.i(5775254618112L, 43029);
      GMTrace.o(5775254618112L, 43029);
    }
  }
  
  private static final class d
    implements m.a.a, Runnable
  {
    public String iconUrl;
    public ImageView iiL;
    public TextView kjm;
    public View kjn;
    public TextView kjo;
    public View kjr;
    public ContactSearchResultUI.a rcV;
    public String username;
    
    public d()
    {
      GMTrace.i(5792568705024L, 43158);
      this.rcV = new ContactSearchResultUI.a()
      {
        public final void run()
        {
          GMTrace.i(5782099722240L, 43080);
          if ((bg.mZ(this.username)) || (bg.mZ(ContactSearchResultUI.d.this.username)) || (!this.username.equals(ContactSearchResultUI.d.this.username)))
          {
            GMTrace.o(5782099722240L, 43080);
            return;
          }
          Bitmap localBitmap = m.d(this.username, this.iconUrl, 0);
          if ((localBitmap != null) && (!localBitmap.isRecycled())) {
            ContactSearchResultUI.d.this.ahZ();
          }
          GMTrace.o(5782099722240L, 43080);
        }
      };
      com.tencent.mm.ae.x.FM().a(this);
      GMTrace.o(5792568705024L, 43158);
    }
    
    public final void ahZ()
    {
      GMTrace.i(5792702922752L, 43159);
      if (this.iiL == null)
      {
        GMTrace.o(5792702922752L, 43159);
        return;
      }
      ap.xC().C(this);
      GMTrace.o(5792702922752L, 43159);
    }
    
    public final void iL(String paramString)
    {
      GMTrace.i(5792971358208L, 43161);
      if ((paramString != null) && (paramString.equals(this.username)))
      {
        this.rcV.dG(this.username, this.iconUrl);
        ap.xC().h(this.rcV, 200L);
      }
      GMTrace.o(5792971358208L, 43161);
    }
    
    public final void run()
    {
      GMTrace.i(5792837140480L, 43160);
      final Bitmap localBitmap = m.iJ(this.username);
      if (localBitmap != null)
      {
        ContactSearchResultUI.bpP().post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(5781831286784L, 43078);
            if ((ContactSearchResultUI.d.this.iiL != null) && (ContactSearchResultUI.d.this.iiL.getTag() != null) && (ContactSearchResultUI.d.this.username != null) && (ContactSearchResultUI.d.this.username.equals(ContactSearchResultUI.d.this.iiL.getTag()))) {
              ContactSearchResultUI.d.this.iiL.setImageBitmap(localBitmap);
            }
            GMTrace.o(5781831286784L, 43078);
          }
        });
        GMTrace.o(5792837140480L, 43160);
        return;
      }
      ContactSearchResultUI.bpP().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(5780757544960L, 43070);
          if (ContactSearchResultUI.d.this.iiL != null)
          {
            ContactSearchResultUI.d.this.iiL.setImageResource(R.g.aWK);
            ContactSearchResultUI.d.this.rcV.dG(ContactSearchResultUI.d.this.username, ContactSearchResultUI.d.this.iconUrl);
            ap.xC().h(ContactSearchResultUI.d.this.rcV, 200L);
          }
          GMTrace.o(5780757544960L, 43070);
        }
      });
      GMTrace.o(5792837140480L, 43160);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */