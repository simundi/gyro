from django.http import HttpResponse


def evaluate(request,application_id):
    return HttpResponse('Evaluatig App %s ' % application_id)


  
    





