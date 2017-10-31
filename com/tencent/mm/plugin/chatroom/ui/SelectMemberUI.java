package com.tencent.mm.plugin.chatroom.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.HandlerThread;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Display;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.k;
import com.tencent.mm.ae.m;
import com.tencent.mm.bi.d;
import com.tencent.mm.l.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.g;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.ui.base.MaskLayout.a;
import com.tencent.mm.ui.base.VerticalScrollBar.a;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.x.aa;
import com.tencent.mm.x.ag.a;
import com.tencent.mm.x.ag.c;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class SelectMemberUI
  extends MMActivity
  implements e
{
  private ListView EA;
  private com.tencent.mm.ui.base.q iXW;
  private View jJt;
  private com.tencent.mm.storage.q kDf;
  private String kEr;
  private View kGO;
  SelectMemberScrollBar kGX;
  private b kGY;
  private boolean kGZ;
  private String kGj;
  private MMEditText kGn;
  private boolean kHa;
  private int kjz;
  private String mTitle;
  
  public SelectMemberUI()
  {
    GMTrace.i(9147340816384L, 68153);
    GMTrace.o(9147340816384L, 68153);
  }
  
  protected static String a(com.tencent.mm.storage.q paramq, String paramString)
  {
    GMTrace.i(9148146122752L, 68159);
    if (paramq == null)
    {
      GMTrace.o(9148146122752L, 68159);
      return null;
    }
    paramq = paramq.fc(paramString);
    GMTrace.o(9148146122752L, 68159);
    return paramq;
  }
  
  protected final void MH()
  {
    GMTrace.i(9147877687296L, 68157);
    rV(bg.mY(this.mTitle));
    this.EA = ((ListView)findViewById(R.h.cbR));
    this.kGO = findViewById(R.h.cuL);
    this.jJt = findViewById(R.h.cuM);
    this.kGY = new b(this, this.kDf, this.kEr, this.kDf.field_roomowner);
    this.EA.setAdapter(this.kGY);
    this.kGX = ((SelectMemberScrollBar)findViewById(R.h.cbT));
    this.kGX.setVisibility(0);
    this.kGX.vMV = new VerticalScrollBar.a()
    {
      public final void tn(String paramAnonymousString)
      {
        GMTrace.i(9111638900736L, 67887);
        if ("↑".equals(paramAnonymousString))
        {
          SelectMemberUI.a(SelectMemberUI.this).setSelection(0);
          GMTrace.o(9111638900736L, 67887);
          return;
        }
        SelectMemberUI.b localb = SelectMemberUI.b(SelectMemberUI.this);
        if (localb.kHg.containsKey(paramAnonymousString)) {}
        for (int i = ((Integer)localb.kHg.get(paramAnonymousString)).intValue();; i = -1)
        {
          if (i != -1) {
            SelectMemberUI.a(SelectMemberUI.this).setSelection(i);
          }
          GMTrace.o(9111638900736L, 67887);
          return;
        }
      }
    };
    this.kGn = ((MMEditText)findViewById(R.h.cuK));
    this.kGn.addTextChangedListener(new TextWatcher()
    {
      private aj kHc;
      
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(9158078234624L, 68233);
        GMTrace.o(9158078234624L, 68233);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(9157944016896L, 68232);
        GMTrace.o(9157944016896L, 68232);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(9157809799168L, 68231);
        this.kHc.MM();
        this.kHc.w(500L, 500L);
        GMTrace.o(9157809799168L, 68231);
      }
    });
    this.EA.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(9084258484224L, 67683);
        switch (SelectMemberUI.d(SelectMemberUI.this))
        {
        default: 
          w.w("MicroMsg.SelectMemberUI", "mFromScene is default");
          GMTrace.o(9084258484224L, 67683);
          return;
        case 1: 
          SelectMemberUI.a(SelectMemberUI.this, SelectMemberUI.b(SelectMemberUI.this).lV(paramAnonymousInt).jqN.field_username);
          GMTrace.o(9084258484224L, 67683);
          return;
        }
        SelectMemberUI.a(SelectMemberUI.this, paramAnonymousInt);
        GMTrace.o(9084258484224L, 67683);
      }
    });
    b localb = this.kGY;
    localb.kHb.jJt.setVisibility(0);
    ap.xC().C(new SelectMemberUI.b.1(localb));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9098217127936L, 67787);
        SelectMemberUI.this.setResult(0);
        SelectMemberUI.this.finish();
        GMTrace.o(9098217127936L, 67787);
        return true;
      }
    });
    GMTrace.o(9147877687296L, 68157);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(9148011905024L, 68158);
    if ((this.iXW != null) && (this.iXW.isShowing())) {
      this.iXW.dismiss();
    }
    if (paramk.getType() == 990)
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        w.i("MicroMsg.SelectMemberUI", "dz[onSceneEnd transfer successfully],owner_username:%s", new Object[] { ((com.tencent.mm.plugin.chatroom.d.n)paramk).username });
        t.makeText(this, R.l.eBX, 1).show();
        paramString = new Intent();
        paramString.putExtra("RoomInfo_Id", this.kEr);
        paramString.putExtra("Chat_User", this.kEr);
        paramString.putExtra("Is_Chatroom", true);
        paramString.setFlags(67108864);
        d.b(this.vov.voR, "chatroom", ".ui.ChatroomInfoUI", paramString);
        finish();
        GMTrace.o(9148011905024L, 68158);
        return;
      }
      t.makeText(this, R.l.eBW, 1).show();
      w.w("MicroMsg.SelectMemberUI", "dz[onSceneEnd transfer failed: %d %d %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    }
    GMTrace.o(9148011905024L, 68158);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9148280340480L, 68160);
    int i = R.i.dfz;
    GMTrace.o(9148280340480L, 68160);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9147475034112L, 68154);
    super.onCreate(paramBundle);
    w.i("MicroMsg.SelectMemberUI", "[onCreate]");
    this.kEr = getIntent().getStringExtra("RoomInfo_Id");
    w.i("MicroMsg.SelectMemberUI", "[getIntentParams] roomId:%s", new Object[] { this.kEr });
    ap.AS();
    this.kDf = c.yU().gn(this.kEr);
    this.kGj = getIntent().getStringExtra("Block_list");
    this.kjz = getIntent().getIntExtra("frome_scene", 0);
    this.mTitle = getIntent().getStringExtra("title");
    this.kGZ = getIntent().getBooleanExtra("quit_room", false);
    this.kHa = getIntent().getBooleanExtra("is_show_owner", true);
    MH();
    if (this.kjz == 2) {
      ap.wT().a(990, this);
    }
    GMTrace.o(9147475034112L, 68154);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(9147743469568L, 68156);
    super.onDestroy();
    if (this.kjz == 2) {
      ap.wT().b(990, this);
    }
    if ((this.iXW != null) && (this.iXW.isShowing())) {
      this.iXW.dismiss();
    }
    GMTrace.o(9147743469568L, 68156);
  }
  
  public final class a
  {
    public x jqN;
    public int type;
    
    public a(x paramx)
    {
      GMTrace.i(9157541363712L, 68229);
      this.type = 1;
      this.jqN = paramx;
      GMTrace.o(9157541363712L, 68229);
    }
  }
  
  public final class b
    extends BaseAdapter
  {
    List<SelectMemberUI.a> fGw;
    private com.tencent.mm.storage.q kDf;
    private String kEr;
    private c kFM;
    public String kGt;
    String kGv;
    List<SelectMemberUI.a> kGw;
    public final String kHe;
    volatile boolean kHf;
    HashMap<String, Integer> kHg;
    private Context mContext;
    
    public b(Context paramContext, com.tencent.mm.storage.q paramq, String paramString1, String paramString2)
    {
      GMTrace.i(9115933868032L, 67919);
      this.kHe = new String(Character.toChars(91));
      this.kGv = null;
      this.kGw = new ArrayList(0);
      this.fGw = new ArrayList();
      this.kHf = false;
      this.kHg = new HashMap();
      this.kDf = paramq;
      this.kEr = paramString1;
      this.kGv = paramString2;
      this.mContext = paramContext;
      this.kFM = ap.AS();
      GMTrace.o(9115933868032L, 67919);
    }
    
    private String c(x paramx)
    {
      GMTrace.i(9116739174400L, 67925);
      if (!bg.mZ(paramx.field_conRemark)) {}
      for (Object localObject2 = paramx.field_conRemark;; localObject2 = SelectMemberUI.a(this.kDf, paramx.field_username))
      {
        Object localObject1 = localObject2;
        if (bg.mZ((String)localObject2)) {
          localObject1 = paramx.vp();
        }
        localObject2 = localObject1;
        if (!a.eE(paramx.field_type))
        {
          ap.AS();
          paramx = c.yM().BV(paramx.field_username);
          localObject2 = localObject1;
          if (paramx != null)
          {
            localObject2 = localObject1;
            if (!bg.mZ(paramx.field_conRemark)) {
              localObject2 = paramx.field_conRemark;
            }
          }
        }
        GMTrace.o(9116739174400L, 67925);
        return (String)localObject2;
      }
    }
    
    public final int getCount()
    {
      GMTrace.i(9116202303488L, 67921);
      if ((this.fGw == null) || (this.kHf))
      {
        GMTrace.o(9116202303488L, 67921);
        return 0;
      }
      int i = this.fGw.size();
      GMTrace.o(9116202303488L, 67921);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(9116470738944L, 67923);
      long l = paramInt;
      GMTrace.o(9116470738944L, 67923);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(9116604956672L, 67924);
      label218:
      String str;
      if (paramView == null)
      {
        paramView = View.inflate(this.mContext, R.i.dfy, null);
        paramViewGroup = new SelectMemberUI.c();
        paramViewGroup.kGJ = ((MaskLayout)paramView.findViewById(R.h.cuO));
        paramViewGroup.kjm = ((TextView)paramView.findViewById(R.h.cuQ));
        Object localObject = (WindowManager)this.mContext.getSystemService("window");
        paramViewGroup.kjm.setMaxWidth(((WindowManager)localObject).getDefaultDisplay().getWidth() * 2 / 3);
        paramViewGroup.kGK = ((TextView)paramView.findViewById(R.h.cuP));
        paramViewGroup.kGK.setMaxWidth(((WindowManager)localObject).getDefaultDisplay().getWidth() * 2 / 3);
        paramView.setTag(paramViewGroup);
        x localx = lV(paramInt).jqN;
        a.b.a((ImageView)paramViewGroup.kGJ.view, localx.field_username);
        if (localx.field_verifyFlag == 0) {
          break label352;
        }
        if (ag.a.hft == null) {
          break label342;
        }
        localObject = ag.a.hft.fh(localx.field_verifyFlag);
        if (localObject == null) {
          break label332;
        }
        localObject = m.iI((String)localObject);
        paramViewGroup.kGJ.d((Bitmap)localObject, MaskLayout.a.vKr);
        str = c(localx);
        localObject = "";
        if (a.eE(localx.field_type)) {
          localObject = localx.gcf;
        }
        if (bg.mZ((String)localObject)) {
          break label362;
        }
        paramViewGroup.kGK.setVisibility(0);
        paramViewGroup.kGK.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.mContext, (CharSequence)localObject, paramViewGroup.kGK.getTextSize()));
      }
      for (;;)
      {
        paramViewGroup.kjm.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.mContext, str, paramViewGroup.kjm.getTextSize()));
        GMTrace.o(9116604956672L, 67924);
        return paramView;
        paramViewGroup = (SelectMemberUI.c)paramView.getTag();
        break;
        label332:
        paramViewGroup.kGJ.bXE();
        break label218;
        label342:
        paramViewGroup.kGJ.bXE();
        break label218;
        label352:
        paramViewGroup.kGJ.bXE();
        break label218;
        label362:
        paramViewGroup.kGK.setVisibility(8);
        paramViewGroup.kGK.setText("");
      }
    }
    
    public final SelectMemberUI.a lV(int paramInt)
    {
      GMTrace.i(9116336521216L, 67922);
      SelectMemberUI.a locala = (SelectMemberUI.a)this.fGw.get(paramInt);
      GMTrace.o(9116336521216L, 67922);
      return locala;
    }
    
    public final void uD(String paramString)
    {
      GMTrace.i(16644474667008L, 124011);
      w.i("MicroMsg.SelectMemberAdapter", "[setMemberListBySearch]");
      ArrayList localArrayList = new ArrayList();
      if (!bg.mZ(paramString))
      {
        Iterator localIterator = this.kGw.iterator();
        while (localIterator.hasNext())
        {
          SelectMemberUI.a locala = (SelectMemberUI.a)localIterator.next();
          if ((locala != null) && (locala.jqN != null) && (locala.type == 1))
          {
            Object localObject = locala.jqN;
            if ((((com.tencent.mm.g.b.af)localObject).field_conRemark != null) && (((com.tencent.mm.g.b.af)localObject).field_conRemark.contains(paramString)))
            {
              localArrayList.add(locala);
            }
            else if ((!bg.mZ(SeeRoomMemberUI.a(this.kDf, ((com.tencent.mm.g.b.af)localObject).field_username))) && (SeeRoomMemberUI.a(this.kDf, ((com.tencent.mm.g.b.af)localObject).field_username).contains(paramString)))
            {
              localArrayList.add(locala);
            }
            else if ((((x)localObject).vp() != null) && (((x)localObject).vp().contains(paramString)))
            {
              localArrayList.add(locala);
            }
            else if ((((x)localObject).qW() != null) && (((x)localObject).qW().contains(paramString)))
            {
              localArrayList.add(locala);
            }
            else if ((((x)localObject).qV() != null) && (((x)localObject).qV().contains(paramString)))
            {
              localArrayList.add(locala);
            }
            else if ((((com.tencent.mm.g.b.af)localObject).field_username != null) && (((com.tencent.mm.g.b.af)localObject).field_username.contains(paramString)))
            {
              localArrayList.add(locala);
            }
            else if (!a.eE(((com.tencent.mm.g.b.af)localObject).field_type))
            {
              ap.AS();
              localObject = c.yM().BV(((com.tencent.mm.g.b.af)localObject).field_username);
              if ((localObject != null) && (((bb)localObject).field_conRemark != null) && (((bb)localObject).field_conRemark.contains(paramString))) {
                localArrayList.add(locala);
              }
            }
          }
        }
        this.fGw = localArrayList;
        GMTrace.o(16644474667008L, 124011);
        return;
      }
      this.fGw = this.kGw;
      GMTrace.o(16644474667008L, 124011);
    }
  }
  
  private static final class c
  {
    public MaskLayout kGJ;
    public TextView kGK;
    public TextView kjm;
    
    public c()
    {
      GMTrace.i(9089761411072L, 67724);
      GMTrace.o(9089761411072L, 67724);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/chatroom/ui/SelectMemberUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */