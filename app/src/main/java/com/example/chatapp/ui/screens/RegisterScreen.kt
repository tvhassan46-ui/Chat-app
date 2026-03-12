package com.example.chatapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.visualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun RegisterScreen() {
    val emailState = remember { TextFieldValue() }
    val passwordState = remember { TextFieldValue() }
    val nameState = remember { TextFieldValue() }

    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Register", style = MaterialTheme.typography.h4)
        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = emailState,
            onValueChange = { emailState = it },
            label = { Text("Email") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = passwordState,
            onValueChange = { passwordState = it },
            label = { Text("Password") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = nameState,
            onValueChange = { nameState = it },
            label = { Text("Name") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { /* Handle registration logic */ }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Register")
        }
    }
}