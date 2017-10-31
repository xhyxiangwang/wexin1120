package com.tencent.mm.plugin.game.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.u;
import com.tencent.mm.ac.u.a;
import com.tencent.mm.plugin.game.c.at;
import com.tencent.mm.plugin.game.c.au;
import com.tencent.mm.plugin.game.c.cm;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.x.ap;
import java.util.LinkedList;
import java.util.List;

public class GameDetailRankLikedUI
  extends MMActivity
{
  private static final String TAG;
  private Dialog jrO;
  private ListView mKa;
  private a mKb;
  
  static
  {
    GMTrace.i(12657805492224L, 94308);
    TAG = "MicroMsg" + GameDetailRankLikedUI.class.getSimpleName();
    GMTrace.o(12657805492224L, 94308);
  }
  
  public GameDetailRankLikedUI()
  {
    GMTrace.i(12656865968128L, 94301);
    GMTrace.o(12656865968128L, 94301);
  }
  
  protected final void MH()
  {
    GMTrace.i(12657268621312L, 94304);
    oC(R.l.ecY);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12686528086016L, 94522);
        GameDetailRankLikedUI.this.finish();
        GMTrace.o(12686528086016L, 94522);
        return true;
      }
    });
    this.mKa = ((ListView)findViewById(R.h.bMi));
    this.mKb = new a(this);
    this.mKa.setAdapter(this.mKb);
    this.jrO = com.tencent.mm.plugin.game.d.c.cD(this.vov.voR);
    this.jrO.show();
    GMTrace.o(12657268621312L, 94304);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12657134403584L, 94303);
    int i = R.i.cWl;
    GMTrace.o(12657134403584L, 94303);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12657000185856L, 94302);
    super.onCreate(paramBundle);
    MH();
    paramBundle = getIntent().getStringExtra("extra_appdi");
    if (bg.mZ(paramBundle))
    {
      finish();
      GMTrace.o(12657000185856L, 94302);
      return;
    }
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new at();
    ((b.a)localObject).hlY = new au();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/getuplist";
    ((b.a)localObject).hlW = 1331;
    localObject = ((b.a)localObject).DA();
    ((at)((b)localObject).hlU.hmc).mCH = paramBundle;
    u.a((b)localObject, new u.a()
    {
      public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, b paramAnonymousb, k paramAnonymousk)
      {
        GMTrace.i(12677669715968L, 94456);
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
        {
          w.e(GameDetailRankLikedUI.QG(), "CGI return is not OK. (%d, %d)(%s)", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
          GameDetailRankLikedUI.this.finish();
          GMTrace.o(12677669715968L, 94456);
          return 0;
        }
        paramAnonymousb = (au)paramAnonymousb.hlV.hmc;
        paramAnonymousString = GameDetailRankLikedUI.a(GameDetailRankLikedUI.this);
        paramAnonymousb = paramAnonymousb.mFl;
        if (paramAnonymousb != null)
        {
          paramAnonymousString.mKd.clear();
          paramAnonymousString.mKd.addAll(paramAnonymousb);
          paramAnonymousString.notifyDataSetChanged();
        }
        GameDetailRankLikedUI.b(GameDetailRankLikedUI.this).dismiss();
        GMTrace.o(12677669715968L, 94456);
        return 0;
      }
    });
    GMTrace.o(12657000185856L, 94302);
  }
  
  private static final class a
    extends BaseAdapter
  {
    private Context mContext;
    List<cm> mKd;
    
    public a(Context paramContext)
    {
      GMTrace.i(12773903826944L, 95173);
      this.mKd = new LinkedList();
      this.mContext = paramContext;
      GMTrace.o(12773903826944L, 95173);
    }
    
    private cm oF(int paramInt)
    {
      GMTrace.i(12774172262400L, 95175);
      cm localcm = (cm)this.mKd.get(paramInt);
      GMTrace.o(12774172262400L, 95175);
      return localcm;
    }
    
    public final int getCount()
    {
      GMTrace.i(12774038044672L, 95174);
      int i = this.mKd.size();
      GMTrace.o(12774038044672L, 95174);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(12774306480128L, 95176);
      long l = paramInt;
      GMTrace.o(12774306480128L, 95176);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(12774440697856L, 95177);
      cm localcm;
      if (paramView == null)
      {
        paramView = LayoutInflater.from(this.mContext).inflate(R.i.cWm, paramViewGroup, false);
        paramViewGroup = new a();
        paramViewGroup.hvo = ((ImageView)paramView.findViewById(R.h.bMf));
        paramViewGroup.jsp = ((TextView)paramView.findViewById(R.h.bMg));
        paramViewGroup.mKe = ((TextView)paramView.findViewById(R.h.bMh));
        paramView.setTag(paramViewGroup);
        localcm = oF(paramInt);
        a.b.a(paramViewGroup.hvo, localcm.mGB, 0.5F, false);
        ap.AS();
        Object localObject = com.tencent.mm.x.c.yL().SL(localcm.mGB);
        if (localObject == null) {
          break label199;
        }
        localObject = new SpannableString(h.b(this.mContext, ((x)localObject).vq(), paramViewGroup.jsp.getTextSize()));
        paramViewGroup.jsp.setText((CharSequence)localObject);
      }
      for (;;)
      {
        paramViewGroup.mKe.setText(localcm.mGC);
        GMTrace.o(12774440697856L, 95177);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
        break;
        label199:
        paramViewGroup.jsp.setText("");
      }
    }
    
    private static final class a
    {
      public ImageView hvo;
      public TextView jsp;
      public TextView mKe;
      
      public a()
      {
        GMTrace.i(12763569061888L, 95096);
        GMTrace.o(12763569061888L, 95096);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameDetailRankLikedUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */