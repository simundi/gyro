from django.conf.urls.defaults import *

urlpatterns = patterns('evaluation.views',
   (r'^(?P<application_id>\d+)$', 'evaluate')
)
