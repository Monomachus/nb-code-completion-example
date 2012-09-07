/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.countries;

import java.net.URL;
import javax.swing.Action;
import org.netbeans.spi.editor.completion.CompletionDocumentation;

/**
 *
 * @author Monomachus
 */
public class CountriesCompletionDocumentation implements CompletionDocumentation {

    private CountriesCompletionItem item;

    public CountriesCompletionDocumentation(CountriesCompletionItem item) {
        this.item = item;
    }

    @Override
    public String getText() {
        return "Information about " + item.getText();
    }

    @Override
    public URL getURL() {
        return null;
    }

    @Override
    public CompletionDocumentation resolveLink(String string) {
        return null;
    }

    @Override
    public Action getGotoSourceAction() {
        return null;
    }
    
}
