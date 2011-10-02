#from google.appengine.ext import db
from django.db import models

class Evaluation(models.Model):
      author = models.TextField()
      content = models.TextField()
      liked = models.TextField()
      date = models.DateTimeField(auto_now_add=True)
      def __unicode__(self):
          return self.content


class Application(models.Model):
      name = models.TextField()
      url = models.TextField()
      date = models.DateTimeField(auto_now_add=True)

      def __unicode__(self):
          return self.name
