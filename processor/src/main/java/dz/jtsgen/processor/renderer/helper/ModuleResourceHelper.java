/*
 * Copyright (c) 2017 Dragan Zuvic
 *
 * This file is part of jtsgen.
 *
 * jtsgen is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * jtsgen is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with jtsgen.  If not, see http://www.gnu.org/licenses/
 *
 */

package dz.jtsgen.processor.renderer.helper;


import dz.jtsgen.processor.renderer.module.TSModule;

import javax.annotation.processing.ProcessingEnvironment;
import javax.tools.FileObject;
import javax.tools.StandardLocation;
import java.io.IOException;

public final class ModuleResourceHelper {

    public static FileObject createResource(ProcessingEnvironment env, TSModule moduleName, String fileName) throws IOException {
        return env
                .getFiler()
                .createResource(StandardLocation.SOURCE_OUTPUT, "jtsgen." + moduleName.getModuleDirectoryName().toLowerCase(), fileName);
    }
}
