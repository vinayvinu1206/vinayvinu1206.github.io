#include "sri.h"

static void resize(int width, int height)
{
    const float ar = (float) width / (float) height;

    glViewport(0, 0, width, height);
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();
    glFrustum(-ar, ar, -1.0, 1.0, 2.0, 100.0);

    glMatrixMode(GL_MODELVIEW);
    glLoadIdentity() ;
}

void keyboard(unsigned char key,int x,int y)
{
	static int k=0;
	k++;
	if(key=='k'||key=='K')
	{
		if(flagu==1)
		{
			//PlaySound(TEXT("p12.wav"),NULL,SND_FILENAME|SND_ASYNC);
			Electrification();
		}
	}
}

void Electrification()
{
	glutInitDisplayMode(GLUT_SINGLE|GLUT_RGB);
	//glClear(GL_COLOR_BUFFER_BIT);
	glutInitWindowSize(1366,726);
	glutInitWindowPosition(0,0);
	glutDestroyWindow(firstWindow);
	secondWindow=glutCreateWindow("Electrification");
	glutDisplayFunc(cart123);
	//cart123();
	glClearColor(0.878,1.00,1.00,1.0);
	glMatrixMode(GL_PROJECTION);
	glLoadIdentity();
	glOrtho(-20,25,-20,25,-2,25);
	glMatrixMode(GL_MODELVIEW);
	glPointSize(4);
	glutKeyboardFunc(keyboard);

}

void cart123()
{
	glClear(GL_COLOR_BUFFER_BIT|GL_DEPTH_BUFFER_BIT);
	circle();
}

void circle()
{
}
void rect(float l,float m,float n,float o,float p,float q,float r,float s)
{
	glBegin(GL_POLYGON);
	//glColor3f(0.0,0.0,0.0);
		glVertex2f(l,m);
		glVertex2f(n,o);
		glVertex2f(p,q);
		glVertex2f(r,s);
	glEnd();
}

/*
void Electricfieldlines()
{
	glutInitDisplayMode(GLUT_SINGLE|GLUT_RGB);
	//glClear(GL_COLOR_BUFFER_BIT);
	glutInitWindowSize(1366,726);
	glutInitWindowPosition(0,0);
	//glutDestroyWindow(secondWindow);
	third=glutCreateWindow("Electric field lines");
	//glutDestroyWindow(secondWindow);
	glutDisplayFunc(drawhouse123);
	initdrawhouse();
	glutKeyboardFunc(keyboard);
}

void currentelectricity()
{
	glutInitDisplayMode(GLUT_SINGLE|GLUT_RGB);
	//glClear(GL_COLOR_BUFFER_BIT);
	glutInitWindowSize(1366,726);
	glutInitWindowPosition(0,0);
	//glutDestroyWindow(firstWindow);
	secondWindow=glutCreateWindow("Current Electricity");
	glutDisplayFunc(building);
	initthirdWindow();
	glutKeyboardFunc(keyboard);

}

void superconductor()
{
	glutInitDisplayMode(GLUT_SINGLE|GLUT_RGB);
	glutInitWindowSize(1366,726);
	glutInitWindowPosition(0,0);
	secondWindow=glutCreateWindow("Super Conductivity");
	PlaySound(TEXT("message.wav"),NULL,SND_FILENAME|SND_ASYNC);
	glutDisplayFunc(rocket);
	initforthwindow();
	glutKeyboardFunc(keyboard);
}

void emwave()
{
	glutInitDisplayMode(GLUT_SINGLE|GLUT_RGB);
	glutInitWindowSize(1366,726);
	glutInitWindowPosition(0,0);
	secondWindow=glutCreateWindow("Electromagnetic wave");
	PlaySound(TEXT("message.wav"),NULL,SND_FILENAME|SND_ASYNC);
	glutDisplayFunc(rocket);
	initforthwindow();
	glutKeyboardFunc(keyboard);
}
*/


void mydisplay()
{

	glClearColor(0.0,0.0,0.0,1.0);
	glMatrixMode(GL_PROJECTION);
	glLoadIdentity();
	gluOrtho2D(0,100,0,100);

	glMatrixMode(GL_MODELVIEW);
	glPointSize(4);
	glClear(GL_COLOR_BUFFER_BIT|GL_DEPTH_BUFFER_BIT);
glColor3f(0.0,1.0,0.0);
	glRasterPos2f(40.0,5.0);
	for(n=0;n<strlen(str6);n++)
	glutBitmapCharacter(GLUT_BITMAP_HELVETICA_18,str6[n]);
	glutPostRedisplay();


glColor3f(1.0,1.0,0.0);
	glRasterPos2f(45.0,65.0);
	for(n=0;n<strlen(str1);n++)
	glutBitmapCharacter(GLUT_BITMAP_TIMES_ROMAN_24,str1[n]);
	glutPostRedisplay();



glColor3f(0.0,1.0,1.0);
	glRasterPos2f(5.0,15.0);
	for(n=0;n<strlen(str2);n++)
	glutBitmapCharacter(GLUT_BITMAP_TIMES_ROMAN_24,str2[n]);
	glutPostRedisplay();


glColor3f(1.0,1.0,0.0);
	glRasterPos2f(5.0,10.0);
	for(n=0;n<strlen(str3);n++)
	glutBitmapCharacter(GLUT_BITMAP_TIMES_ROMAN_24,str3[n]);
	glutPostRedisplay();


glColor3f(0.0,1.0,1.0);
	glRasterPos2f(80.0,15.0);
	for(n=0;n<strlen(str4);n++)
	glutBitmapCharacter(GLUT_BITMAP_TIMES_ROMAN_24,str4[n]);
	glutPostRedisplay();

glColor3f(1.0,1.0,0.0);
	glRasterPos2f(80.0,10.0);
	for(n=0;n<strlen(str5);n++)
	glutBitmapCharacter(GLUT_BITMAP_TIMES_ROMAN_24,str5[n]);
	glutPostRedisplay();
	glutSwapBuffers();
	glFlush();
}


int main(int argc,char **argv)
{
	int a;
	glutInit(&argc,argv);
	glutInitDisplayMode(GLUT_SINGLE|GLUT_RGB|GLUT_DEPTH);
	glutInitWindowSize(1366,726);
	glutInitWindowPosition(0,0);

	firstWindow=glutCreateWindow("ELEGNETRICA");
    glutReshapeFunc(resize);
	glutDisplayFunc(mydisplay);
	glutKeyboardFunc(keyboard);
	glEnable(GL_DEPTH_TEST);
	glutMainLoop();
	return 0;
}
