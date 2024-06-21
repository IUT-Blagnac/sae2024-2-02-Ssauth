#include <stdio.h>
#include <time.h>
#include "efficacite37.h" // Inclusion de l'en-tête

int main() {
    struct timespec start, end;
    long duration;
    double duration_ms;

    // Obtenir le temps de début en nanosecondes
    clock_gettime(CLOCK_MONOTONIC, &start);

    // Boucle d'exécution de la fonction RLE 10 fois
    for(int i = 0; i < 10; i++) {
        RLE("abc", 65);
    }

    // Obtenir le temps de fin en nanosecondes
    clock_gettime(CLOCK_MONOTONIC, &end);

    // Calcul de la durée en nanosecondes
    duration = (end.tv_sec - start.tv_sec) * 1000000000L + (end.tv_nsec - start.tv_nsec);

    // Calcul de la durée moyenne en millisecondes
    duration_ms = duration / (1000000.0 * 10);

    // Afficher les durées
    printf("Durée d'exécution en nanosecondes: %ld\n", duration);
    printf("Durée d'exécution moyenne en millisecondes: %f\n", duration_ms);

    return 0;
}
