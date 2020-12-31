package PageAcceuil;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;

import requette.req1;
import requette.req2;
import requette.req3;
import requette.req5;
import PageMenu.Etudiant;
import PageMenu.Salle;
import PageMenu.Matiere;
import PageMenu.Professeurs;
import PageMenu.Notes;
import GESTION.ges_salle;
import GESTION.ges_matiere;
import GESTION.ges_etudiant;
import GESTION.ges_prof;
import GESTION.ges_resultat;
//import Affichage.req1;
import frame.Fen_salle;
import frame.Fen_ajout_Etudiant;
import frame.Fen_ajout_Professeurs;
import frame.Fen_ajout_matiere;
import frame.Jlabel;
import frame.fen_Resultats;
import frame.fen_users;



public class index_accueil extends JFrame implements ActionListener{
    
	private JMenuItem enr,cr,prf,nvrlt,qt,appr,lisE,crep,Act_P,lisAP,lisCEP,lisEl,lisCrs,lisProf,lisAct,
	private JMenuBar menu;
	private JMenu Fich,aff,app,admin,hlp;
	private JMenuItem nv,st,cont;
	private JPanel img,img2,dpimg;
	private JToolBar menubar ;
	private JButton req;

      private JButton b = new JButton("   Liste des etudiants          ");
	  private JButton b1 = new JButton("  Liste des matieres          ");
	  private JButton b2 = new  JButton("  Liste des professeurs");
	  private JButton b3 = new JButton("  Liste des salles      ");
	  private JButton b4 = new JButton("  Les resultats         ");
	  private JButton b6 = new JButton("Liste salles /matieres   "); 
	  private JButton b7 = new JButton("     requete01            ");
	  private JButton b8 = new JButton("     requete02            ");
	  private JButton b9 = new JButton("     requete03            ");
	  private JButton b10 = new JButton("    requete04            ");
	  private JButton b11 = new JButton("    requete05            ");
	  private JButton b12 = new JButton("    requete06            ");
	  private JButton b13 = new JButton("    requete07            ");
	  private JButton b002 = new JButton("    professeurs         ");
	  private JButton b003 = new JButton("    salles              ");
	  private JButton b004= new JButton("     matieres               ");
	  private JButton b005= new JButton("     Resultat            ");
	  
	  private JTabbedPane onglet=new JTabbedPane(); 
	  
	private JPanel re=new JPanel();
	private JPanel re2=new JPanel();
	private JPanel re1=new JPanel();
	private JPanel re3=new JPanel();
	
	
	 private String requete01 = "SELECT COLUMN_NAME as 'NOM de colonne', DATA_TYPE as 'TYPE', CHARACTER_MAXIMUM_LENGTH as 'TAILLE' FROM information_schema.COLUMNS WHERE table_name = 'etudiants'";
	public <split, split1> Menu_accueil()
	{ 
		JSplitPane split;
		JSplitPane split1;
		
		 Container c=getContentPane();
		 JLabel ne =  new JLabel();
		 ne.setIcon(new ImageIcon(""));
		 
		 
		 // JLabel nea =  new JLabel();
		  ne.setPreferredSize(new java.awt.Dimension(800,400));
		
		   
		
		 
		
		this.setTitle("Acceuil");
		  this.setSize(900,700);
	      this.setLocation(250,50);
	     
	    b.addActionListener(this);   b.setIcon(new ImageIcon("C:\\Users\\badiane\\Desktop\\img\\list.png"));
	    b1.addActionListener(this); b1.setIcon(new ImageIcon("C:\\Users\\badiane\\Desktop\\img\\list.png"));
	    b2.addActionListener(this); b2.setIcon(new ImageIcon("C:\\Users\\badiane\\Desktop\\img\\list.png"));
	    b3.addActionListener(this); b3.setIcon(new ImageIcon("C:\\Users\\badiane\\Desktop\\img\\list.png"));
	    b4.addActionListener(this); b4.setIcon(new ImageIcon("C:\\Users\\badiane\\Desktop\\img\\list.png"));
	    b5.addActionListener(this); b5.setIcon(new ImageIcon("C:\\Users\\badiane\\Desktop\\img\\list.png"));
	    b6.addActionListener(this); b6.setIcon(new ImageIcon("C:\\Users\\badiane\\Desktop\\img\\list.png"));
	  
	      JLabel txt=new JLabel("BIENVENUE");
	      
	    JMenuBar menu=new JMenuBar();
	    setJMenuBar(menu);
	    //menus
	   JMenu Fich=new JMenu("archive");
	    menu.add(Fich);
	    
	    
	    Fich.setIcon(new ImageIcon("C:\\Users\\badiane\\Desktop\\img\\fichier1.png"));
	   Fich.setMnemonic('a');
	   img=new JPanel(); img.add(ne); //img.add(nea); 
	  
	    
	    
	   // b.setBounds(10, 22,100, 20);
	    
	    JLabel fondimg=new JLabel();
	    fondimg.setIcon(new ImageIcon("C:\\Users\\badiane\\Desktop\\img\\Originals\\ecole.jpg"));
	    //
	    fondimg.setSize(900, 800);
	 
	    //ONGLET
	   // re.setSize(10,900);
	    re.setBounds(5, 20,218, 800);
	    onglet.setSize(400, 830);
		 onglet.setBorder(null);
		onglet.setBackground(Color.white);
		 re.setLayout(new BorderLayout());
		 
	     re1.add(b,BorderLayout.WEST ); b.setBackground(Color.white);  b.setPreferredSize(new Dimension(200,24)); 
		 re1.add(b1,BorderLayout.WEST); b1.setBackground(Color.white); b1.setPreferredSize(new Dimension(200,25));
		 re1.add(b2,BorderLayout.WEST); b2.setBackground(Color.white); b2.setPreferredSize(new Dimension(200,25));
		 re1.add(b3,BorderLayout.WEST); b3.setBackground(Color.white);  b3.setPreferredSize(new Dimension(200,25));
		 re1.add(b4,BorderLayout.WEST); b4.setBackground(Color.white);  b4.setPreferredSize(new Dimension(200,25));
		 re1.add(b5,BorderLayout.WEST); b5.setBackground(Color.white);  b5.setPreferredSize(new Dimension(200,25));
		 re1.add(b6,BorderLayout.WEST); b6.setBackground(Color.white);  b6.setPreferredSize(new Dimension(200,25));
		
		 onglet.add("affichage",re1);   re.add(onglet); 
		 re2.add(b7,BorderLayout.WEST ); b7.setBackground(Color.white); b7.addActionListener(this);
		 re2.add(b8,BorderLayout.WEST ); b8.setBackground(Color.white); b8.addActionListener(this);
		 re2.add(b9,BorderLayout.WEST ); b9.setBackground(Color.white); b9.addActionListener(this);
		 re2.add(b10,BorderLayout.WEST ); b10.setBackground(Color.white);b10.addActionListener(this);
		 re2.add(b11,BorderLayout.WEST ); b11.setBackground(Color.white);
		 re2.add(b12,BorderLayout.WEST ); b12.setBackground(Color.white);
		 re2.add(b13,BorderLayout.WEST ); b13.setBackground(Color.white);
		 re2.add(b14,BorderLayout.WEST ); b14.setBackground(Color.white);
		 re2.add(b15,BorderLayout.WEST ); b15.setBackground(Color.white);
		 re2.add(b16,BorderLayout.WEST ); b16.setBackground(Color.white);
		 re2.add(b17,BorderLayout.WEST ); b17.setBackground(Color.white);
		 re2.add(b18,BorderLayout.WEST ); b18.setBackground(Color.white);
		 re2.add(b19,BorderLayout.WEST ); b19.setBackground(Color.white);
		 re2.add(b20,BorderLayout.WEST ); b20.setBackground(Color.white);
		 re2.add(b21,BorderLayout.WEST ); b21.setBackground(Color.white);
		 re2.add(b22,BorderLayout.WEST ); b22.setBackground(Color.white);
		 re2.setBackground(Color.white);
		 //gestion tables
		 re3.add(b001,BorderLayout.WEST ); b001.setBackground(Color.white); b001.setPreferredSize(new Dimension(150,25));  b001.addActionListener(this);
		 re3.add(b002,BorderLayout.WEST); b002.setBackground(Color.white);  b002.setPreferredSize(new Dimension(150,25));  b002.addActionListener(this);
		 re3.add(b003,BorderLayout.WEST); b003.setBackground(Color.white);  b003.setPreferredSize(new Dimension(150,25));  b003.addActionListener(this);
		 re3.add(b004,BorderLayout.WEST); b004.setBackground(Color.white);  b004.setPreferredSize(new Dimension(150,25));  b004.addActionListener(this);
		 re3.add(b005,BorderLayout.WEST); b005.setBackground(Color.white);  b005.setPreferredSize(new Dimension(150,25));  b005.addActionListener(this);
		 re3.add(b006,BorderLayout.WEST); b006.setBackground(Color.white);  b006.setPreferredSize(new Dimension(150,25));  b006.addActionListener(this);
		 re3.add(b007,BorderLayout.WEST); b007.setBackground(Color.white);  b007.setPreferredSize(new Dimension(150,25));  b007.addActionListener(this);
	      onglet.add("Gestion",re3);
	      re3.setBackground(Color.white);
		 /*re3.add(c2,BorderLayout.WEST);
		 re3.add(c3,BorderLayout.WEST);
		 re3.add(c4,BorderLayout.WEST);
		 re3.add(c5,BorderLayout.WEST);
		 re3.add(c7,BorderLayout.WEST);
		 re3.add(c,BorderLayout.WEST);
		 re3.add(c8,BorderLayout.WEST);
		 re3.add(c9,BorderLayout.WEST);
		 re3.add(c10,BorderLayout.WEST);
		 re3.add(c11,BorderLayout.WEST);
		 re3.add(c12,BorderLayout.WEST);
		 re3.add(c13,BorderLayout.WEST);
		 re3.add(c14,BorderLayout.WEST);
		 re3.add(c15,BorderLayout.WEST);*/
		 
		 onglet.add("requ�te",re2);  
		 
		
		
		   re1.setBackground(Color.white);
			split = new javax.swing.JSplitPane(javax.swing.JSplitPane.VERTICAL_SPLIT, new javax.swing.JScrollPane(null), null);
		    split.setDividerLocation(100);
		    split.setDividerSize(2);
		    split1 = new javax.swing.JSplitPane(javax.swing.JSplitPane.HORIZONTAL_SPLIT, re, split);
		    split1.setDividerLocation(220);
		    split1.setDividerSize(2);
		  
		
		
		 

		 
	    img.setBounds(210,100,1400,625);
	    img.setBackground(Color.white);
	    
	     img.setLayout(new BorderLayout());
	     
	   // img.add(new JLabel("hello"));
	      
	      
	    JButton im2=new JButton("wellcom");
	   // img.add(dpimg);
	    img2=new JPanel(); 
	    img2.setLayout(null);
	    im2.setBounds(240,30, 200, 40);
	    im2.setIcon(new ImageIcon("C:\\Users\\mohakalil\\Desktop\\img\\bvv.gif"));
	    img2.setBounds(210,2,1400,90); 
	    img2.setBackground(Color.WHITE);	
	    img2.add(im2);
	   
	    
	    //MENU BARE
	    
	    menubar=new JToolBar();
	    menubar.setBounds(5, 2, 1400,19);
	    //button requ�te
	    req=new JButton("Ex�cuter la Requ�te");
	    menubar.add(req);	    
	    
	    //sous menu(-
	    
	   JMenu nv=new JMenu("Nouveau");
	    Fich.add(nv);
	    nv.setMnemonic('N');
	    
	   //JLabel image = new JLabel(new ImageIcon("images/ulg.jpg"));
	    
	    JMenuItem enr=new JMenuItem("Nouveau Etudiant");  enr.setIcon(new ImageIcon("C:\\Users\\badiane\\Desktop\\img\\elv.png"));
	    nv.add(enr);
	   enr.setMnemonic('e');
	   
	    enr.setBounds(0,0,0,20);
	    JMenuItem cr=new JMenuItem("Nouveau matiere"); cr.setIcon(new ImageIcon("C:\\Users\\badiane\\Desktop\\img\\crss.png"));
	    nv.add(cr);
	    cr.setMnemonic('c');
	  
	    JMenuItem prf=new JMenuItem("Nouveau Professeurs"); prf.setMnemonic('p');
	    prf.setIcon(new ImageIcon("C:\\Users\\badiane\\Desktop\\img\\profs.gif"));
	     nv.add(prf);
	    
	     JMenuItem act=new JMenuItem("Nouveau Activites");
	     act.setMnemonic('v');
	     nv.add(act); act.setIcon(new ImageIcon("C:\\Users\\badiane\\Desktop\\img\\activity.png"));
	     
	     JMenuItem nvrlt=new JMenuItem("Nouveau resultats des eleves"); nvrlt.setIcon(new ImageIcon("C:\\Users\\badiane\\Desktop\\img\\rsl.jpg"));
	     nv.add(nvrlt);  nvrlt.setMnemonic('r');
	     
	     JMenuItem crep=new JMenuItem("Nouveau salles occuper/matieres ");
	     
	     nv.add(crep);
	     
	     
	     //affichage des onglets et requ�tes
	     
	    
	     //image de font
	     
	  //  cr.addActionListener(this);
	     
	  
	    
	    JPanel i=new JPanel(); 
	    i.setLayout(null);
	    
	    //enr1=new JButton("Enregistrement");
	   // enr1.setBounds(300,150,100,30);
	 qt=new JMenuItem("Quitter");
	 qt.setMnemonic('q');
	    Fich.add(qt);
	   qt.setIcon(new ImageIcon("C:\\Users\\badiane\\Desktop\\img\\quit.png"));
	  qt.addActionListener(new ActionListener()
	  {
            @Override
		public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
	}
		  
	  });
	    
	    
	   JMenu aff=new JMenu("Consultation");
	    menu.add(aff); aff.setMnemonic('c');
	    aff.setIcon(new ImageIcon("C:\\Users\\badiane\\Desktop\\img\\consulter.png"));
	    
	    
	    JMenu admin=new JMenu("admin");
	    admin.setIcon(new ImageIcon("C:\\Users\\badiane\\Desktop\\img\\admin.png"));
	    menu.add(admin); admin.setMnemonic('d');
	    
	    JMenu NU=new JMenu("Nouveau");
	    admin.add(NU);
	    NU.setMnemonic('n');
	    
	    JMenuItem us=new JMenuItem("User");
	    NU.add(us); us.setMnemonic('u');
	    us.setIcon(new ImageIcon("C:\\Users\\badiane\\Desktop\\img\\users3.png"));
	    
	    JMenu lUS=new JMenu("les Users");
	    admin.add(lUS);
	   
	    JMenuItem luse=new JMenuItem("liste des Utilisateurs"); luse.setIcon(new ImageIcon("C:\\Users\\badiane\\Desktop\\img\\list.png"));
	    lUS.add(luse);
	     
	    
	    JMenu app=new JMenu("apropos"); app.addActionListener(this);
	    app.setIcon(new ImageIcon("C:\\Users\\badiane\\Desktop\\img\\moha1.jpg"));
		 menu.add(app); app.setMnemonic('p');
		 
		 JMenuItem app1=new JMenuItem("App"); app1.addActionListener(this);
		 app.add(app1);  app1.setMnemonic('a');
		 
		 
	    JMenu hlp=new JMenu("aide"); hlp.setMnemonic('h');
	   hlp.setIcon(new ImageIcon("C:\\Users\\badiane\\Desktop\\img\\help1.png"));
	    menu.add(hlp);
  JMenu st=new JMenu ("Structure de table");
	    aff.add(st);
	    
	    lisEl=new JMenuItem("Liste Etudiant"); lisEl.setIcon(new ImageIcon("C:\\Users\\badiane\\Desktop\\img\\list.png"));
		 st.add(lisEl);
		 
	    
	    lisE=new JMenuItem("Liste Resultats"); lisE.setIcon(new ImageIcon("C:\\Users\\badiane\\Desktop\\img\\list.png"));
		 st.add(lisE);
		 
		
		lisAP=new JMenuItem("Liste salles"); lisAP.setIcon(new ImageIcon("C:\\Users\\badiane\\Desktop\\img\\list.png"));
		st.add(lisAP);		
		
		lisCEP=new JMenuItem("Liste des matieres enseigner/profs"); lisCEP.setIcon(new ImageIcon("C:\\Users\\badiane\\Desktop\\img\\list.png"));
		st.add(lisCEP);
		
		lisCrs=new JMenuItem("Liste des matieres");  lisCrs.setIcon(new ImageIcon("C:\\Users\\badiane\\Desktop\\img\\list.png"));
		st.add(lisCrs);
		 
		lisProf=new JMenuItem("Liste des Professeurs");  lisProf.setIcon(new ImageIcon("C:\\Users\\badiane\\Desktop\\img\\list.png"));
		st.add(lisProf);
		
		lisAct=new JMenuItem("Liste des salles occuper/matiere");     lisAct.setIcon(new ImageIcon("C:\\Users\\badiane\\Desktop\\img\\list.png"));
		st.add(lisAct); 
	    
	    i.add(re); 
	    img.add(fondimg); 
	    i.add(menubar);
	    i.add(img); i.add(img2); 
	    
	    add(i); 
	    
	    //ajouts des fenetres et ses evenements
	   app1.addActionListener(new ActionListener()
	   {

		@Override
		public void actionPerformed(ActionEvent a) {
		
			Jlabel lb=new Jlabel();
			lb.setVisible(true);
			
		}}
	   );
	    
	    lisEl.addActionListener(new ActionListener()
	    {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				listEtudiant el=new listEtudiant();
				el.setVisible(true);
				el.setResizable(false);
			}
	    	
	    	
	    	
	    });
	    
	    us.addActionListener(new ActionListener()
	    {@Override
		  public void actionPerformed(ActionEvent arg0) {
				fen_users user=new fen_users();
				user.setVisible(true);
				user.setResizable(true);
				
			} });
	    
	    
	    crep.addActionListener(new ActionListener()
	    {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				fen_salle ch=new fen_salle();
				ch.setVisible(true);
				ch.setResizable(true);
				
			}
	    	
	    });
	    
	   nvrlt.addActionListener(new ActionListener()
	    {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				fen_Resultats w=new fen_Resultats();
				w.setVisible(true);
				w.setResizable(true);
				
			}
	    	
	    	
	    });
	    
	    
	    
	    luse.addActionListener(new ActionListener()
		   {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				listusers use=new listusers();
				use.setVisible(true);
			}
			   
		   });
		   
	    
	    
	    lisE.addActionListener(new ActionListener()
	    {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				listresults  el=new listresults();
				el.setVisible(true);
				
			}	
	    });

		   
   });
	    
	   
	   lisCEP.addActionListener(new ActionListener()
	   {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			listsalle chr=new listsalle();
			chr.setVisible(true);
			
			
		  } });
	   
	   
	   lisProf.addActionListener(new ActionListener()
	   {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			listprofesseurs pr=new listprofesseurs();
			pr.setVisible(true);
			
		}});
	   
	   
	   lisCrs.addActionListener(new ActionListener()
	   {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			listmatieres crs=new listmatieres();
			crs.setVisible(true);
			
			
		}});
	
	   });
	   
	   
	   
	   
	   
	   
	   
	    prf.addActionListener(new ActionListener()
	    {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Fen_ajout_Professeurs pr=new Fen_ajout_Professeurs();
				pr.setVisible(true);
				pr.setResizable(false);
				
			}
	    	
	    	
	    });
	    
	  cr.addActionListener(new ActionListener()
	   {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			Fen_ajout_matieres f=new Fen_ajout_matieres();
			f.setVisible(true);
			f.setResizable(false);
			
			
		}
		   
	   });
		   
	   
	   enr.addActionListener(new ActionListener()
	   {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			Fen_ajout_Et�ve fe=new Fen_ajout_Et�ve();
			fe.setVisible(true);
			fe.setResizable(false);
			
		}
		   
		   
	   });}
	
	
//affichage onglets et requ�tes

@Override
public void actionPerformed(ActionEvent e) {
	
	
	if(e.getSource()==b)
	{
		listEtudiant el=new listEtudiant();
		el.setVisible(true);
	}

	if(e.getSource()==b1)
	{
		listmatieres cr=new listmatieres();
				cr.setVisible(true);
				cr.setResizable(true);
	}
	
	if(e.getSource()==b2)
	{ 
		listprofesseurs pr=new listprofesseurs();
		pr.setVisible(true);
		
	}
	
	if(e.getSource()==b4)
	{
		listresults re=new listresults();
		re.setVisible(true);
		re.setResizable(false);
	}
	
	if(e.getSource()==b6)
	{
		listsalle ch=new listsalle();
		ch.setVisible(true);
		ch.setResizable(false);
	}

	if(e.getSource()==b8)
	  {  
		/
		if(JOptionPane.showConfirmDialog(this, "Voulez vous affichez les r�sultats de tous les Etudiants",null, JOptionPane.OK_OPTION)==JOptionPane.OK_OPTION)
		{ req2 r2=new req2();
	   r2.setVisible(true);  }
		
		else if(JOptionPane.OK_CANCEL_OPTION==JOptionPane.NO_OPTION){ 
			
} }

  if(e.getSource()==b001)
  {  
	   ges_etudiant ge=new ges_etudiant();
	   ge.setVisible(true);  
	}
  
  if(e.getSource()==b002)
  {  
	   ges_prof gp=new ges_prof();
	   gp.setVisible(true);  
	   gp.setResizable(false);
	}
  
  if(e.getSource()==b003)
  {  
	   ges_salle gch=new ges_salle();
	   gch.setVisible(true);  
	   gch.setResizable(false);
	}
  
  if(e.getSource()==b004)
  {  
	   ges_matiere gcrs=new ges_matiere();
	   gcrs.setVisible(true);  
	   gcrs.setResizable(false);
	}

  if(e.getSource()==b005)
  {  
	   ges_resultat grst=new ges_resultat();
	   grst.setVisible(true);  
	   grst.setResizable(false);
	}
  
	  }

  

public static void main(String[] args)
 {
	
		Menu_accueil x=new Menu_accueil();
		x.setVisible(true);
		
		x.setResizable(false);
		

	}

	
}
