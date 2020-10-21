
package tictactoc;

public class TicTacToc extends javax.swing.JFrame {


    public TicTacToc() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }
    String obecnySymbol = "X";
    //tablica zapisująca wyniki dla poszczególnych pól 
    String[][] plansza = new String[3][3];
    
    int licznikRuchow = 0;
    
           
            
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jButton4.setPreferredSize(new java.awt.Dimension(200, 200));

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(638, 658));
        setResizable(false);
        setSize(new java.awt.Dimension(660, 660));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setBackground(new java.awt.Color(36, 37, 42));
        jPanel2.setEnabled(false);

        jButton1.setBackground(new java.awt.Color(228, 233, 237));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(228, 233, 237));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(228, 233, 237));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(228, 233, 237));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(228, 233, 237));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(228, 233, 237));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(228, 233, 237));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(228, 233, 237));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(228, 233, 237));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);

        jMenu1.setText("File");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, 0));
        jMenuItem2.setText("Restart");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        
        // wyświetlenie obecnego symbolu na przycisku
        jButton13.setText(obecnySymbol);
        // zapis obecnego symbolu do tabeli
        plansza[0][0] = obecnySymbol;
        // sprawdza czy gracz wygrał
        sprawdzWygrana();
        // blokuje wciśnięty przycisk, aby rywal nie mógł wybrać tego samego 
        jButton13.setEnabled(false);
        // zmiana obecnego symbolu dla rywala
        obecnySymbol = "X".equals(obecnySymbol) ? "O" : "X";
        
        
            
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        
        // wyświetlenie obecnego symbolu na przycisku
        jButton12.setText(obecnySymbol);
        // zapis obecnego symbolu do tabeli
        plansza[0][1] = obecnySymbol;
        // sprawdza czy gracz wygrał
        sprawdzWygrana();
        // blokuje wciśnięty przycisk, aby rywal nie mógł wybrać tego samego 
        jButton12.setEnabled(false);
        // zmiana obecnego symbolu dla rywala
        obecnySymbol = "X".equals(obecnySymbol) ? "O" : "X";
        // wyłączenie wciśnieętego przyciusku, zapobiega wybraniu tego samego pola przez rywalowa
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        // wyświetlenie obecnego symbolu na przycisku
        jButton2.setText(obecnySymbol);
        // zapis obecnego symbolu do tabeli
        plansza[1][0] = obecnySymbol;
        // sprawdza czy gracz wygrał
        sprawdzWygrana();
        // blokuje wciśnięty przycisk, aby rywal nie mógł wybrać tego samego 
        jButton2.setEnabled(false);
        // zmiana obecnego symbolu dla rywala
        obecnySymbol = "X".equals(obecnySymbol) ? "O" : "X";
        // wyłączenie wciśnieętego przyciusku, zapobiega wybraniu tego samego pola przez rywalowa
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        // wyświetlenie obecnego symbolu na przycisku
        jButton8.setText(obecnySymbol);
        // zapis obecnego symbolu do tabeli
        plansza[1][1] = obecnySymbol;
        // sprawdza czy gracz wygrał
        sprawdzWygrana();
        // blokuje wciśnięty przycisk, aby rywal nie mógł wybrać tego samego 
        jButton8.setEnabled(false);
        // zmiana obecnego symbolu dla rywala
        obecnySymbol = "X".equals(obecnySymbol) ? "O" : "X";
        // wyłączenie wciśnieętego przyciusku, zapobiega wybraniu tego samego pola przez rywalowa
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // wyświetlenie obecnego symbolu na przycisku
        jButton1.setText(obecnySymbol);
        // zapis obecnego symbolu do tabeli
        plansza[2][0] = obecnySymbol;
        // sprawdza czy gracz wygrał
        sprawdzWygrana();
        // blokuje wciśnięty przycisk, aby rywal nie mógł wybrać tego samego 
        jButton1.setEnabled(false);
        // zmiana obecnego symbolu dla rywala
        obecnySymbol = "X".equals(obecnySymbol) ? "O" : "X";
        // wyłączenie wciśnieętego przyciusku, zapobiega wybraniu tego samego pola przez rywalowa
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        // wyświetlenie obecnego symbolu na przycisku
        jButton9.setText(obecnySymbol);
        // zapis obecnego symbolu do tabeli
        plansza[2][1] = obecnySymbol;
        // sprawdza czy gracz wygrał
        sprawdzWygrana();
        // blokuje wciśnięty przycisk, aby rywal nie mógł wybrać tego samego 
        jButton9.setEnabled(false);
        // zmiana obecnego symbolu dla rywala
        obecnySymbol = "X".equals(obecnySymbol) ? "O" : "X";
        // wyłączenie wciśnieętego przyciusku, zapobiega wybraniu tego samego pola przez rywalowa
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        // wyświetlenie obecnego symbolu na przycisku
        jButton10.setText(obecnySymbol);
        // zapis obecnego symbolu do tabeli
        plansza[2][2] = obecnySymbol;
        // sprawdza czy gracz wygrał
        sprawdzWygrana();
        // blokuje wciśnięty przycisk, aby rywal nie mógł wybrać tego samego 
        jButton10.setEnabled(false);
        // zmiana obecnego symbolu dla rywala
        obecnySymbol = "X".equals(obecnySymbol) ? "O" : "X";
        // wyłączenie wciśnieętego przyciusku, zapobiega wybraniu tego samego pola przez rywalowa

    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        // wyświetlenie obecnego symbolu na przycisku
        jButton5.setText(obecnySymbol);
        // zapis obecnego symbolu do tabeli
        plansza[1][2] = obecnySymbol;
        // sprawdza czy gracz wygrał
        sprawdzWygrana();
        // blokuje wciśnięty przycisk, aby rywal nie mógł wybrać tego samego 
        jButton5.setEnabled(false);
        // zmiana obecnego symbolu dla rywala
        obecnySymbol = "X".equals(obecnySymbol) ? "O" : "X";
        // wyłączenie wciśnieętego przyciusku, zapobiega wybraniu tego samego pola przez rywalowa
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // wyświetlenie obecnego symbolu na przycisku
        jButton14.setText(obecnySymbol);
        // zapis obecnego symbolu do tabeli
        plansza[0][2] = obecnySymbol;
        // sprawdza czy gracz wygrał
        sprawdzWygrana();
        // blokuje wciśnięty przycisk, aby rywal nie mógł wybrać tego samego 
        jButton14.setEnabled(false);
        // zmiana obecnego symbolu dla rywala
        obecnySymbol = "X".equals(obecnySymbol) ? "O" : "X";
        // wyłączenie wciśnieętego przyciusku, zapobiega wybraniu tego samego pola przez rywalowa
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       Restart();
    }//GEN-LAST:event_jMenuItem2ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() 
            {
            public void run() {
                new TicTacToc().setVisible(true); 
            }

        });
    }
    
    
    public void Restart()
    {
        // odblokowanie klawiszy
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        jButton10.setEnabled(true);
        jButton12.setEnabled(true);
        jButton13.setEnabled(true);
        jButton14.setEnabled(true);
        // rest napisów na klawiszach
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        jButton10.setText("");
        jButton12.setText("");
        jButton13.setText("");
        jButton14.setText("");
        // kasowanie tabeli z wynikami
        for(int i=0; i<3;i++)
        { for(int j=0; j<3; j++)
           plansza[i][j] = " ";
        }
    }

    public void disable()
    {
  
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        jButton10.setEnabled(false);
        jButton12.setEnabled(false);
        jButton13.setEnabled(false);
        jButton14.setEnabled(false);
 
    }
    
    public void sprawdzWygrana()
    {
        boolean wygranaWiesze = sprawdzWiersze(plansza, obecnySymbol);
        boolean wygranaKolumny = sprawdzKolumny(plansza, obecnySymbol);
        boolean wygranaSkos1 = sprawdzSkos1(plansza, obecnySymbol);
        boolean wygranaSkos2 = sprawdzSkos2(plansza, obecnySymbol);
        
        if(wygranaWiesze || wygranaKolumny || wygranaSkos1 || wygranaSkos2)
        {
            System.out.println("Gratulacje wygranej: " + obecnySymbol);
            disable();
        }
    }
    
    
    
       public static boolean sprawdzWiersze(String[][] plansza, String symbol)
    {
        

        for(int wiersz = 0; wiersz<3; wiersz++) // sprawdzenie poszczególnych wierszy
        {
            boolean wygrana = true; // przed wejściem do pętli chcemy otrzymać true - jeśli pętla zmieni to ok :)
            for(int kolumna = 0; kolumna<3; kolumna++) // sprawdzenie poszczególnych kolumn w danym wierszu
            {
                if(plansza[wiersz][kolumna]!=symbol) // jeśli w danej kolumnie wiersza symbol jest inny niż ma gracz wygrana to nie ma sensu sprawdzać reszty
                {
                    wygrana = false; // zwraca false
                    break; // przerywa sprawdzanie wiersza
                }
            }
            if(wygrana) // jeśli wykonanie wewnetrznej pętli zwróci wygraną nie ma sensu wykonywać dalszych pętli dlatego zracamy true
                return true;
        }
        return false; // jeśli ani jedno podwóje przejście po pętlach nie da ani jednego dobrego rezultatu zwracamy false

    }

    public static boolean sprawdzKolumny(String[][] plansza, String symbol)
    {
  
        for(int kolumna = 0; kolumna<3; kolumna++)
        {
            boolean wygrana = true;
            for(int wiersz = 0; wiersz<3; wiersz++)
            {
                if(plansza[wiersz][kolumna]!=symbol)
                {
                    wygrana = false;
                    break;
                }
            }
            if(wygrana)
                return true;
        }
        return false;
    }

    public static boolean sprawdzSkos1(String[][] plansza, String symbol)
    {
        for(int i = 0; i<3; i++)
        {
            if(plansza[i][i]!=symbol) // jeśli symbol będzie inny niż obecny symbol wejdziemy do wnętrze i zwrócimy false
                return false;
        }
        return true;
    }

    public static boolean sprawdzSkos2(String[][] plansza, String symbol)
    {
        if(plansza[2][0]==symbol && plansza[1][1]==symbol && plansza[0][2]==symbol)
            return true;
        else
            return false;
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
