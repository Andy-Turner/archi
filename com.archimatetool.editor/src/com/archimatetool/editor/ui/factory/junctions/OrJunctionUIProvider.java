/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package com.archimatetool.editor.ui.factory.junctions;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import com.archimatetool.editor.diagram.editparts.junctions.OrJunctionEditPart;
import com.archimatetool.editor.ui.IArchimateImages;
import com.archimatetool.model.IArchimatePackage;



/**
 * Or Junction UI Provider
 * 
 * @author Phillip Beauvoir
 */
public class OrJunctionUIProvider extends JunctionUIProvider {

    @Override
    public EClass providerFor() {
        return IArchimatePackage.eINSTANCE.getOrJunction();
    }
    
    @Override
    public EditPart createEditPart() {
        return new OrJunctionEditPart();
    }

    @Override
    public String getDefaultName() {
        return Messages.OrJunctionUIProvider_0;
    }

    @Override
    public Image getImage() {
        return IArchimateImages.ImageFactory.getImage(IArchimateImages.ICON_JUNCTION_OR_16);
    }

    @Override
    public ImageDescriptor getImageDescriptor() {
        return IArchimateImages.ImageFactory.getImageDescriptor(IArchimateImages.ICON_JUNCTION_OR_16);
    }
}
