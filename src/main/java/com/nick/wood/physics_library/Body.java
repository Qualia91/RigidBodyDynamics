package com.nick.wood.physics_library;

import com.nick.wood.maths.objects.QuaternionD;
import com.nick.wood.maths.objects.vector.Vecd;

import java.util.UUID;

public interface Body {
	UUID getUuid();

	Vecd getOrigin();

	QuaternionD getRotation();
}