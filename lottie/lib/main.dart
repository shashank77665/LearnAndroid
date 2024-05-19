import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

void main(){
  runApp(MaterialApp(
    title: 'Lottie Animation',
    home: HomePage(),
    debugShowCheckedModeBanner: false,
  ));
}

class HomePage extends StatelessWidget {
  const HomePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Home Page'),
        backgroundColor: Colors.lightBlue.shade50,
      ),
      body: Center(
        child: Container(
          width: 200,
          height: 200,
          child: Column(
            children: [
              TextField(
                decoration: InputDecoration(border: OutlineInputBorder()),
              ),
              TextField(
                decoration: InputDecoration(border: OutlineInputBorder()),
              ),
              Row(
                children: [
                  ElevatedButton(onPressed: () {}, child: Text('Submit')),
                  ElevatedButton(onPressed: () {}, child: Text('Reset'))
                ],
              )
            ],
          ),
        ),
      ),
    );
  }
}
