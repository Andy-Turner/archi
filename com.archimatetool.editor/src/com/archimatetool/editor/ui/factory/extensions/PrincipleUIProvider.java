/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package com.archimatetool.editor.ui.factory.extensions;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;

import com.archimatetool.editor.diagram.editparts.extensions.PrincipleEditPart;
import com.archimatetool.editor.ui.ColorFactory;
import com.archimatetool.editor.ui.IArchimateImages;
import com.archimatetool.editor.ui.factory.AbstractArchimateElementUIProvider;
import com.archimatetool.model.IArchimatePackage;



/**
 * Principle UI Provider
 * 
 * @author Phillip Beauvoir
 */
public class PrincipleUIProvider extends AbstractArchimateElementUIProvider {

    public EClass providerFor() {
        return IArchimatePackage.eINSTANCE.getPrinciple();
    }
    
    @Override
    public EditPart createEditPart() {
        return new PrincipleEditPart();
    }

    @Override
    public String getDefaultName() {
        return Messages.PrincipleUIProvider_0;
    }

    @Override
    public Image getImage() {
        return getImageWithUserFillColor(IArchimateImages.ICON_PRINCIPLE_FILLED_16);
    }

    @Override
    public ImageDescriptor getImageDescriptor() {
        return getImageDescriptorWithUserFillColor(IArchimateImages.ICON_PRINCIPLE_FILLED_16);
    }

    @Override
    public Color getDefaultColor() {
        return ColorFactory.get(204, 204, 255);
    }
}
